package net.creeperio.foodmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

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
    public static final ForgeTier LEBRON_TIER = new ForgeTier(
            905,
            7.0F,
            2.0F,
            14,
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
    //more uses, faster, same damage same enchantability

    public static final ForgeTier SUPER_LEBRON_TIER = new ForgeTier(
            8124,
            36.0F,
            16.0F,
            60,
            BlockTags.NEEDS_DIAMOND_TOOL,
            new Supplier<Ingredient>()
            {
                @Override
                public Ingredient get()
                {
                    return Ingredient.of(ModItems.SUPER_LEBRON.get());
                }
            },
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );
    //idc just make it op

    public static final ForgeTier OP_LEBRON_TIER = new ForgeTier(
            32496,
            144.0F,
            64.0F,
            240,
            BlockTags.NEEDS_DIAMOND_TOOL,
            new Supplier<Ingredient>()
            {
                @Override
                public Ingredient get()
                {
                    return Ingredient.of(ModItems.OP_LEBRON.get());
                }
            },
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );
    //idc just make it op again
}