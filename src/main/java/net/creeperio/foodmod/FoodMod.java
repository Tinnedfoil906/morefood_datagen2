package net.creeperio.foodmod;

import com.mojang.logging.LogUtils;
import net.creeperio.foodmod.block.ModBlocks;
import net.creeperio.foodmod.entity.ModEntities;
import net.creeperio.foodmod.entity.client.LebronRenderer;
import net.creeperio.foodmod.item.*;
import net.creeperio.foodmod.sound.ModSounds;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FoodMod.MODID)
public class FoodMod
{
    // Define mod id in a common place for everything to reference
    //
    // Need to figure out how to change this to "lebron" without fucking up the entire mod oopsies
    public static final String MODID = "morefood";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public FoodMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        //WHY IS THIS MISSPELLED
        ModSounds.reigster(modEventBus);
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        //this being here or not being here doesn't change anything 😭
        //ForgeTierManager.registerCustomTier(ModToolTiers.LEBRON_PICK_TIER, Tiers.NETHERITE);
        //ForgeTierManager.registerTier(Tiers.NETHERITE, Tiers.DIAMOND);
        //ForgeTierManager.registerCustomTier(ModToolTiers.LEBRON_SWORD_TIER, Tiers.NETHERITE);
        //ForgeTierManager.registerCustomTier(ModToolTiers.LEBRON_AXE_TIER, Tiers.NETHERITE);
        //ForgeTierManager.registerCustomTier(ModToolTiers.LEBRON_SHOVEL_TIER, Tiers.NETHERITE);
        //ForgeTierManager.registerCustomTier(ModToolTiers.LEBRON_HOE_TIER, Tiers.NETHERITE);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.LEBRON.get(), LebronRenderer::new);
        }
    }
}
