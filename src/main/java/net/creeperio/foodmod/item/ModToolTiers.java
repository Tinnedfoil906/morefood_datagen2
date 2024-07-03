package net.creeperio.foodmod.item;

import net.creeperio.foodmod.block.ModBlocks;
import net.creeperio.foodmod.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

import java.util.List;
import java.util.function.Supplier;

/*public class ModToolTiers {
    public static final Tier LEBRON = new ForgeTier(
            1500, 5.0F, 4.0F, 25,
            ModTags.Blocks.NEEDS_LEBRON_TOOL, new Supplier<Ingredient>() {
        @Override
        public Ingredient get() {
            return Ingredient.of(ModItems.LEBRON.get());
        }
    }, ModTags.Blocks.NEEDS_LEBRON_TOOL
    );
}
*/
/*public class ModToolTiers {
    public static final Tier LEBRON =
            new ForgeTier(
            1500,
            5f,
            4f,
            25,
            ModTags.Blocks.NEEDS_LEBRON_TOOL,
            new Supplier<Ingredient>()
            {
                @Override
                public Ingredient get()
                {
                    return Ingredient.of(ModItems.LEBRON.get());
                }
            },
            //new ResourceLocation(FoodMod.MODID, "lebron"), List.of(Tiers.NETHERITE), List.of());
            new Supplier<Tiers>()
            {
                @Override
                public Tiers get()
                {
                    return Tiers.of(Tiers.NETHERITE);
                }
            }
            //FoodMod.MODID, "lebron"),
            //List.of(Tiers.NETHERITE), // This makes LEBRON better than NETHERITE
            //List.of()
            );

}*/

public class ModToolTiers {
    public static final ForgeTier LEBRON_PICK_TIER = new ForgeTier(
            2031,
            9.0F,
            4.0F,
            15,
            BlockTags.NEEDS_IRON_TOOL,
            new Supplier<Ingredient>()
            {
                @Override
                public Ingredient get()
                {
                    return Ingredient.of(ModItems.LEBRON.get());
                }
            },
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    // basically iron tier but faster and with more durability
    // (in between diamond and netherite durability and speed)

    //VVV might not need this if i figure out how to modify the ModItems itself
    public static final ForgeTier LEBRON_SWORD_TIER = new ForgeTier(
            2031,
            9.0F,
            8,
            15,
            BlockTags.NEEDS_IRON_TOOL,
            new Supplier<Ingredient>()
            {
                @Override
                public Ingredient get()
                {
                    return Ingredient.of(ModItems.LEBRON.get());
                }
            },
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    public static final ForgeTier LEBRON_AXE_TIER = new ForgeTier(
            2031,
            9.0F,
            4.0F,
            15,
            BlockTags.NEEDS_IRON_TOOL,
            new Supplier<Ingredient>()
            {
                @Override
                public Ingredient get()
                {
                    return Ingredient.of(ModItems.LEBRON.get());
                }
            },
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    public static final ForgeTier LEBRON_SHOVEL_TIER = new ForgeTier(
            2031,
            9.0F,
            4.0F,
            15,
            BlockTags.NEEDS_IRON_TOOL,
            new Supplier<Ingredient>()
            {
                @Override
                public Ingredient get()
                {
                    return Ingredient.of(ModItems.LEBRON.get());
                }
            },
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
    public static final ForgeTier LEBRON_HOE_TIER = new ForgeTier(
            2031,
            9.0F,
            4.0F,
            15,
            BlockTags.NEEDS_IRON_TOOL,
            new Supplier<Ingredient>()
            {
                @Override
                public Ingredient get()
                {
                    return Ingredient.of(ModItems.LEBRON.get());
                }
            },
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
}