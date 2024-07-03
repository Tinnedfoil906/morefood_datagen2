package net.creeperio.foodmod.util;

import net.creeperio.foodmod.FoodMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        //public static final TagKey<Block> NEEDS_LEBRON_TOOL = BlockTags.create(new ResourceLocation(FoodMod.MODID, "needs_lebron_tool"));

        //public static final TagKey<Block> INCORRECT_LEBRON_PICK = BlockTags.create(new ResourceLocation(FoodMod.MODID, "incorrect_lebron_pick"));
        //public static final TagKey<Block> INCORRECT_LEBRON_SWORD = BlockTags.create(new ResourceLocation(FoodMod.MODID, "incorrect_lebron_sword"));
        //public static final TagKey<Block> INCORRECT_LEBRON_AXE = BlockTags.create(new ResourceLocation(FoodMod.MODID, "incorrect_lebron_axe"));
        //public static final TagKey<Block> INCORRECT_LEBRON_SHOVEL = BlockTags.create(new ResourceLocation(FoodMod.MODID, "incorrect_lebron_shovel"));
        //public static final TagKey<Block> INCORRECT_LEBRON_HOE = BlockTags.create(new ResourceLocation(FoodMod.MODID, "incorrect_lebron_hoe"));

        //public static final TagKey<Block> INCORRECT_LEBRON_TOOL = tag("incorrect_lebron_tool");
        //shit above is broke ^^

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(FoodMod.MODID, name));
        }
    }

    public static class Items
    {
        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(FoodMod.MODID, name));
        }
    }
}
