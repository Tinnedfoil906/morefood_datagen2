package net.creeperio.foodmod.datagen;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.block.ModBlocks;
import net.creeperio.foodmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FoodMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
        //        .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

        //Mineable Tags
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LEBRON_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEBRON_ORE.get())

                .add(ModBlocks.LEBRON_BLOCK.get())

                .add(ModBlocks.LEBRON_STAIRS.get())
                .add(ModBlocks.LEBRON_SLAB.get())

                .add(ModBlocks.LEBRON_FENCE.get())
                .add(ModBlocks.LEBRON_FENCE_GATE.get())
                .add(ModBlocks.LEBRON_WALL.get())

                .add(ModBlocks.LEBRON_DOOR.get())
                .add(ModBlocks.LEBRON_TRAPDOOR.get())

                .add(ModBlocks.LEBRON_PRESSURE_PLATE.get());
                //all buttons take the same amount of time to break and always drop... tf mojang?

        //Needs Tags

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEBRON_ORE.get())
                .add(ModBlocks.DEEPSLATE_LEBRON_ORE.get())

                .add(ModBlocks.LEBRON_BLOCK.get())

                .add(ModBlocks.LEBRON_STAIRS.get())
                .add(ModBlocks.LEBRON_SLAB.get())

                .add(ModBlocks.LEBRON_FENCE.get())
                .add(ModBlocks.LEBRON_FENCE_GATE.get())
                .add(ModBlocks.LEBRON_WALL.get())

                .add(ModBlocks.LEBRON_DOOR.get())
                .add(ModBlocks.LEBRON_TRAPDOOR.get())

                .add(ModBlocks.LEBRON_PRESSURE_PLATE.get());


        //Block Tags
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.LEBRON_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.LEBRON_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.LEBRON_WALL.get());

    }
}
