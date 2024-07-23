package net.creeperio.foodmod.datagen;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, FoodMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.LEBRON_MUSIC_DISC.get())
                .add(ModItems.LEBRON_MUSIC_DISC_REMIX.get())
                .add(ModItems.LEBRON_MUSIC_DISC_SUNSHINE.get());

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS);
                //.add(ModItems.LEBRON_MUSIC_DISC.get())
                //.add(ModItems.LEBRON_MUSIC_DISC_SUNSHINE.get());
    }
}
