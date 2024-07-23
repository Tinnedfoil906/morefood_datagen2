package net.creeperio.foodmod.datagen;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.block.ModBlocks;
import net.creeperio.foodmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FoodMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.LEBRON);
        simpleItem(ModItems.LEBRON_JAMES_MY_SUNSHINE);
        simpleItem(ModItems.SUPER_LEBRON);
        simpleItem(ModItems.OP_LEBRON);

        simpleItem(ModItems.LEBRON_ESSENCE);

        simpleItem(ModItems.RAW_LEBRON);
        simpleItem(ModItems.COOKED_LEBRON);
        simpleItem(ModItems.BURNT_LEBRON);
        onFireItem(ModItems.EXTRABURNT_LEBRON); //has the fire item
        simpleItem(ModItems.ASH);

        simpleItem(ModItems.TAPE);

        simpleItem(ModItems.LEBRON_MUSIC_DISC);
        simpleItem(ModItems.LEBRON_MUSIC_DISC_REMIX);
        simpleItem(ModItems.LEBRON_MUSIC_DISC_SUNSHINE);

        simpleItem(ModItems.FLINT_AND_STEEL_AND_LEBRON);
        simpleItem(ModItems.HONEY_DIPPED_LEBRON);
        simpleItem(ModItems.HONEY_DIPPED_LEBRON);

        simpleBlockItem(ModBlocks.LEBRON_DOOR);

        evenSimplerBlockItem(ModBlocks.LEBRON_STAIRS);
        evenSimplerBlockItem(ModBlocks.LEBRON_SLAB);
        evenSimplerBlockItem(ModBlocks.LEBRON_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.LEBRON_FENCE_GATE);

        fenceItem(ModBlocks.LEBRON_FENCE, ModBlocks.LEBRON_BLOCK);
        buttonItem(ModBlocks.LEBRON_BUTTON, ModBlocks.LEBRON_BLOCK);
        wallItem(ModBlocks.LEBRON_WALL, ModBlocks.LEBRON_BLOCK);

        trapdoorItem(ModBlocks.LEBRON_TRAPDOOR);

        //TOOLS
        handheldItem(ModItems.LEBRON_PICKAXE);
        handheldItem(ModItems.LEBRON_SWORD);
        handheldItem(ModItems.LEBRON_AXE);
        handheldItem(ModItems.LEBRON_SHOVEL);
        handheldItem(ModItems.LEBRON_HOE);

        handheldItem(ModItems.SUPER_LEBRON_PICKAXE);
        handheldItem(ModItems.SUPER_LEBRON_SWORD);
        handheldItem(ModItems.SUPER_LEBRON_AXE);
        handheldItem(ModItems.SUPER_LEBRON_SHOVEL);
        handheldItem(ModItems.SUPER_LEBRON_HOE);

        handheldItem(ModItems.OP_LEBRON_PICKAXE);
        handheldItem(ModItems.OP_LEBRON_SWORD);
        handheldItem(ModItems.OP_LEBRON_AXE);
        handheldItem(ModItems.OP_LEBRON_SHOVEL);
        handheldItem(ModItems.OP_LEBRON_HOE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(FoodMod.MODID,"item/" + item.getId().getPath()));
    }

    // Like simpleItem but the item is on layer 1 instead of 0
    // 2 fire textures being added behind and above it
    // This is simple, but I'm still really fucking proud of it
    private ItemModelBuilder onFireItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation("minecraft:block/fire_0"))
                .texture("layer1", new ResourceLocation(FoodMod.MODID,"item/" + item.getId().getPath()))
                .texture("layer2", new ResourceLocation("minecraft:block/fire_1"));
    }

    // no clue what is happening down here, if it works it works
    // |
    // V
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(FoodMod.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        String blockPath = ForgeRegistries.BLOCKS.getKey(block.get()).getPath();
        String baseBlockPath = ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath();

        this.withExistingParent(blockPath, mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(FoodMod.MODID, "block/" + baseBlockPath));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        String blockPath = ForgeRegistries.BLOCKS.getKey(block.get()).getPath();
        String baseBlockPath = ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath();

        this.withExistingParent(blockPath, mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(FoodMod.MODID, "block/" + baseBlockPath));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        String blockPath = ForgeRegistries.BLOCKS.getKey(block.get()).getPath();
        String baseBlockPath = ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath();

        this.withExistingParent(blockPath, mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(FoodMod.MODID, "block/" + baseBlockPath));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FoodMod.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(FoodMod.MODID,"item/" + item.getId().getPath()));
    }
}