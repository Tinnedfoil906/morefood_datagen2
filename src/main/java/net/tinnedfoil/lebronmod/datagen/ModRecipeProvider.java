package net.tinnedfoil.lebronmod.datagen;

import net.tinnedfoil.lebronmod.LebronMod;
import net.tinnedfoil.lebronmod.block.ModBlocks;
import net.tinnedfoil.lebronmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    //LISTS
    //do these have to be lists? it seems REALLY inefficient
    private static final List<ItemLike> LEBRON_ORE = List.of(
            ModBlocks.LEBRON_ORE.get()
    );
    private static final List<ItemLike> LEBRON_MEAT = List.of(
            ModItems.RAW_LEBRON.get() //change this to raw lebron once it's added
    );
    private static final List<ItemLike> COOKED_LEBRON = List.of(
            ModItems.COOKED_LEBRON.get()
    );
    private static final List<ItemLike> BURNT_LEBRON = List.of(
            ModItems.BURNT_LEBRON.get()
    );
    private static final List<ItemLike> EXTRABURNT_LEBRON = List.of(
            ModItems.EXTRABURNT_LEBRON.get()
    );

    // Adding some exception for multiple crafting recipes for one item would be a good idea
    // This is fine for now but it'll probably bite me in the ass later, Too Bad!

    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        //integers and floats for common values
        int oreSpeed = 200;
        int meatSpeed = 100;

        int badExp = 0;

        float oreExp = 0.25f;
        float meatExp = 0.75f;

        //SMELTING RECIPES // SMELTING RECIPES//
        //
        //
        //
        //RECIPES FROM SMELTING LEBRON ORES
        oreSmelting(pRecipeOutput, LEBRON_ORE, RecipeCategory.MISC, ModItems.LEBRON.get(), oreExp, oreSpeed, "lebron"); //idfk what the group is used for...
        oreBlasting(pRecipeOutput, LEBRON_ORE, RecipeCategory.MISC, ModItems.LEBRON.get(), oreExp, oreSpeed / 2, "lebron");

        //RECIPES FROM COOKING LEBRON MEAT
        oreSmelting(pRecipeOutput, LEBRON_MEAT, RecipeCategory.MISC, ModItems.COOKED_LEBRON.get(), meatExp, meatSpeed, "lebron");
        oreSmelting(pRecipeOutput, COOKED_LEBRON, RecipeCategory.MISC, ModItems.BURNT_LEBRON.get(), badExp, meatSpeed, "lebron");
        oreSmelting(pRecipeOutput, BURNT_LEBRON, RecipeCategory.MISC, ModItems.EXTRABURNT_LEBRON.get(), badExp, meatSpeed, "lebron");
        oreSmelting(pRecipeOutput, EXTRABURNT_LEBRON, RecipeCategory.MISC, ModItems.ASH.get(), badExp, meatSpeed, "lebron");
        //FIGURE OUT THE DAMN SMOKER AND CAMPFIRE ^^

        lebronSmithing(pRecipeOutput, ModItems.LEBRON_PICKAXE.get(), RecipeCategory.MISC, ModItems.SUPER_LEBRON_PICKAXE.get());
        lebronSmithing(pRecipeOutput, ModItems.LEBRON_SWORD.get(), RecipeCategory.MISC, ModItems.SUPER_LEBRON_SWORD.get());
        lebronSmithing(pRecipeOutput, ModItems.LEBRON_AXE.get(), RecipeCategory.MISC, ModItems.SUPER_LEBRON_AXE.get());
        lebronSmithing(pRecipeOutput, ModItems.LEBRON_SHOVEL.get(), RecipeCategory.MISC, ModItems.SUPER_LEBRON_SHOVEL.get());
        lebronSmithing(pRecipeOutput, ModItems.LEBRON_HOE.get(), RecipeCategory.MISC, ModItems.SUPER_LEBRON_HOE.get());

        superLebronSmithing(pRecipeOutput, ModItems.SUPER_LEBRON_PICKAXE.get(), RecipeCategory.MISC, ModItems.OP_LEBRON_PICKAXE.get());
        superLebronSmithing(pRecipeOutput, ModItems.SUPER_LEBRON_SWORD.get(), RecipeCategory.MISC, ModItems.OP_LEBRON_SWORD.get());
        superLebronSmithing(pRecipeOutput, ModItems.SUPER_LEBRON_AXE.get(), RecipeCategory.MISC, ModItems.OP_LEBRON_AXE.get());
        superLebronSmithing(pRecipeOutput, ModItems.SUPER_LEBRON_SHOVEL.get(), RecipeCategory.MISC, ModItems.OP_LEBRON_SHOVEL.get());
        superLebronSmithing(pRecipeOutput, ModItems.SUPER_LEBRON_HOE.get(), RecipeCategory.MISC, ModItems.OP_LEBRON_HOE.get());

        //CRAFTING RECIPES // CRAFTING RECIPES//
        //
        //
        //
        //RECIPE FOR LEBRON BLOCK
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEBRON_BLOCK.get())
                .pattern("&&&")
                .pattern("&&&")
                .pattern("&&&")
                .define('&', ModItems.LEBRON.get())
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);

        //RECIPE FOR LEBRON
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEBRON.get(), 9)
                .requires(ModBlocks.LEBRON_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.LEBRON_BLOCK.get()), has(ModBlocks.LEBRON_BLOCK.get()))
                .save(pRecipeOutput);

        //RECIPE FOR SUPER LEBORN NETHERITE WHATEVER IT IS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SUPER_LEBRON.get())
                .pattern("=O=")
                .pattern("&&&")
                .pattern("=O=")
                .define('&', ModItems.LEBRON.get())
                .define('=', Items.NETHERITE_INGOT)
                .define('O', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);

        //RECIPE FOR SUPER LEBORN NETHERITE WHATEVER IT IS again
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OP_LEBRON.get())
                .pattern("=O=")
                .pattern("&&&")
                .pattern("=O=")
                .define('&', ModItems.LEBRON.get())
                .define('=', ModItems.SUPER_LEBRON.get())
                .define('O', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.SUPER_LEBRON.get()), has(ModItems.SUPER_LEBRON.get()))
                .save(pRecipeOutput);

        //okay how tf do i make a crafting recipe for an axe/hoe
        //PICK
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_PICKAXE.get())
                .pattern("&&&")
                .pattern(" | ")
                .pattern(" | ")
                .define('&', ModItems.LEBRON.get())
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);
        //SWORD
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_SWORD.get())
                .pattern("&")
                .pattern("&")
                .pattern("|")
                .define('&', ModItems.LEBRON.get())
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);
        //SHOVEL
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_SHOVEL.get())
                .pattern("&")
                .pattern("|")
                .pattern("|")
                .define('&', ModItems.LEBRON.get())
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);
        //AXE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_AXE.get())
                .pattern("&&")
                .pattern("&|")
                .pattern(" |")
                .define('&', ModItems.LEBRON.get())
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);
        //HOE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_HOE.get())
                .pattern("&&")
                .pattern(" |")
                .pattern(" |")
                .define('&', ModItems.LEBRON.get())
                .define('|', Items.STICK)
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);

        //RECIPE FOR FLINT AND STEEL AND LEBRON
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FLINT_AND_STEEL_AND_LEBRON.get())
                .requires(Items.FLINT_AND_STEEL) //FLINT & STEEL
                .requires(ModItems.LEBRON_ESSENCE.get()) //CHANGE THIS TO THE LEBRON ESSENCE
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);

        //RECIPE FOR HONEY DIPPED LEBRON
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HONEY_DIPPED_LEBRON.get())
                .requires(Items.HONEY_BOTTLE)
                .requires(ModItems.LEBRON.get())
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);

        //BALLING
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BASKET_BALL.get())
                .pattern("#$#")
                .pattern("$O$")
                .pattern("#$#")
                .define('#', Items.LEATHER)
                .define('$', Items.STRING)
                .define('O', Items.SLIME_BALL)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
                .unlockedBy(getHasName(Items.SLIME_BALL), has(Items.SLIME_BALL))
                .save(pRecipeOutput);

        //LEBRON JAHAMES ESSENCE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_ESSENCE.get())
                .pattern("&&&")
                .pattern("&O&")
                .pattern("&&&")
                .define('O', ModItems.BASKET_BALL.get())
                .define('&', ModItems.LEBRON.get())
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);

        //RECIPE FOR ESSENCE from sunshine
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEBRON_ESSENCE.get(), 12)
                .requires(ModItems.LEBRON_JAMES_MY_SUNSHINE.get())
                .unlockedBy(getHasName(ModItems.LEBRON_JAMES_MY_SUNSHINE.get()), has(ModItems.LEBRON_JAMES_MY_SUNSHINE.get()))
                .save(pRecipeOutput, LebronMod.MODID + ":" + ModItems.LEBRON_ESSENCE.get() + "_from_sunshine");

        //DISC SUNSHINE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_MUSIC_DISC_SUNSHINE.get())
                .pattern("O&O")
                .define('O', ModItems.LEBRON_ESSENCE.get())
                .define('&', ModItems.LEBRON_JAMES_MY_SUNSHINE.get())
                .unlockedBy(getHasName(ModItems.LEBRON_JAMES_MY_SUNSHINE.get()), has(ModItems.LEBRON_JAMES_MY_SUNSHINE.get()))
                .save(pRecipeOutput);
        //DISC BLOOD DONORS
        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_MUSIC_DISC_BD.get())
                .pattern("^O^")
                .define('^', Items.REDSTONE)
                .define('O', ModItems.LEBRON_MUSIC_DISC.get())
                .unlockedBy(getHasName(ModItems.LEBRON_MUSIC_DISC.get()), has(ModItems.LEBRON_MUSIC_DISC.get()))
                .save(pRecipeOutput, FoodMod.MODID + ":" + ModItems.LEBRON_MUSIC_DISC_BD.get() + "_from_i");

        //BD DISC but from JAMES II
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEBRON_MUSIC_DISC_BD.get())
                .pattern("^O^")
                .define('^', Items.REDSTONE)
                .define('O', ModItems.LEBRON_MUSIC_DISC_REMIX.get())
                .unlockedBy(getHasName(ModItems.LEBRON_MUSIC_DISC_REMIX.get()), has(ModItems.LEBRON_MUSIC_DISC_REMIX.get()))
                .save(pRecipeOutput, FoodMod.MODID + ":" + ModItems.LEBRON_MUSIC_DISC_BD.get() + "_from_ii");*/

        //ASH BLOCK
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ASH_BLOCK.get())
                .pattern("^^^")
                .pattern("^^^")
                .pattern("^^^")
                .define('^', ModItems.ASH.get())
                .unlockedBy(getHasName(ModItems.ASH.get()), has(ModItems.ASH.get()))
                .save(pRecipeOutput);

        //ASH
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ASH.get(), 9)
                .requires(ModBlocks.ASH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ASH_BLOCK.get()), has(ModBlocks.ASH_BLOCK.get()))
                .save(pRecipeOutput);
    }

    //Hardcoded MEH
    protected static void lebronSmithing(
            RecipeOutput pRecipeOutput,
            ItemLike pIngredients,
            RecipeCategory pCategory,
            ItemLike pResult
    ) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(pIngredients), Ingredient.of(ModItems.SUPER_LEBRON.get()), pCategory, (Item) pResult)
                .unlocks("has_super_lebron_ingot", has(ModItems.SUPER_LEBRON.get()))
                .save(pRecipeOutput, LebronMod.MODID + ":" + getItemName(pResult) + "_smithing");
    }

    protected static void superLebronSmithing(
            RecipeOutput pRecipeOutput,
            ItemLike pIngredients,
            RecipeCategory pCategory,
            ItemLike pResult
    ) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(pIngredients), Ingredient.of(ModItems.OP_LEBRON.get()), pCategory, (Item) pResult)
                .unlocks("has_op_lebron_ingot", has(ModItems.OP_LEBRON.get()))
                .save(pRecipeOutput, LebronMod.MODID + ":" + getItemName(pResult) + "_smithing");
    }

    private static <T extends AbstractCookingRecipe> void oreCooking(
            RecipeOutput pRecipeOutput,
            RecipeSerializer<T> pSerializer,
            AbstractCookingRecipe.Factory<T> pRecipeFactory,
            List<ItemLike> pIngredients,
            RecipeCategory pCategory,
            ItemLike pResult,
            float pExperience,
            int pCookingTime,
            String pGroup,
            String pSuffix
    ) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer, pRecipeFactory)
                    .group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, LebronMod.MODID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }
    }

    protected static void oreSmelting(
            RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup
    ) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(
            RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup
    ) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }
}