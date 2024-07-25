package net.tinnedfoil.lebronmod.datagen;

import net.tinnedfoil.lebronmod.LebronMod;
import net.tinnedfoil.lebronmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, LebronMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.LEBRON_BLOCK);
        blockWithItem(ModBlocks.LEBRON_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_LEBRON_ORE);

        blockWithItem(ModBlocks.ASH_BLOCK);

        //NOT FULL BLOCKS
        stairsBlock(((StairBlock) ModBlocks.LEBRON_STAIRS.get()),
                blockTexture(ModBlocks.LEBRON_BLOCK.get()));

        slabBlock(((SlabBlock) ModBlocks.LEBRON_SLAB.get()),
                blockTexture(ModBlocks.LEBRON_BLOCK.get()),
                blockTexture(ModBlocks.LEBRON_BLOCK.get()));


        //FENCE RELATED
        fenceBlock(((FenceBlock) ModBlocks.LEBRON_FENCE.get()),
                blockTexture(ModBlocks.LEBRON_BLOCK.get()));

        fenceGateBlock(((FenceGateBlock) ModBlocks.LEBRON_FENCE_GATE.get()),
                blockTexture(ModBlocks.LEBRON_BLOCK.get()));

        wallBlock(((WallBlock) ModBlocks.LEBRON_WALL.get()),
                blockTexture(ModBlocks.LEBRON_BLOCK.get()));


        //REDSTONE INPUTS
        buttonBlock(((ButtonBlock) ModBlocks.LEBRON_BUTTON.get()),
                blockTexture(ModBlocks.LEBRON_BLOCK.get()));

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.LEBRON_PRESSURE_PLATE.get()),
                blockTexture(ModBlocks.LEBRON_BLOCK.get()));


        //REDSTONE OUTPUTS
        doorBlockWithRenderType(((DoorBlock) ModBlocks.LEBRON_DOOR.get()),
                modLoc("block/lebron_block"),
                //modLoc("block/lebron_door_bottom"),
                modLoc("block/lebron_transparent"),
                //modLoc("block/lebron_door_top"),
                "cutout");

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.LEBRON_TRAPDOOR.get()),
                //modLoc("block/lebron_trapdoor"),
                modLoc("block/lebron_transparent"),
                true,
                "cutout");

        //9:35
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
