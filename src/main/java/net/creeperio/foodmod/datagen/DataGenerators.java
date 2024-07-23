package net.creeperio.foodmod.datagen;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.datagen.language.ModLanguageProvider_en_us;
import net.creeperio.foodmod.datagen.language.ModLanguageProvider_fr_fr;
import net.creeperio.foodmod.datagen.language.ModLanguageProvider_lol_us;
import net.creeperio.foodmod.datagen.language.ModLanguageProvider_ro_ro;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = FoodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

        ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

        //worldgen YAYAY
        generator.addProvider(event.includeServer(), new ModWorldGenProvider(packOutput, lookupProvider));

        //this is how le speak
        generator.addProvider(event.includeServer(), new ModLanguageProvider_en_us(packOutput, FoodMod.MODID, "en_us"));
        generator.addProvider(event.includeServer(), new ModLanguageProvider_fr_fr(packOutput, FoodMod.MODID, "fr_fr"));
        generator.addProvider(event.includeServer(), new ModLanguageProvider_lol_us(packOutput, FoodMod.MODID, "lol_us"));
        generator.addProvider(event.includeServer(), new ModLanguageProvider_ro_ro(packOutput, FoodMod.MODID, "ro_ro"));
    }
}
