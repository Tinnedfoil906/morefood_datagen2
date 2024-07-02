package net.creeperio.foodmod.datagen;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.block.ModBlocks;
import net.creeperio.foodmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    //LISTS
    //do these have to be lists? it seems REALLY inefficient
    private static final List<ItemLike> LEBRON_ORE = List.of(
            ModBlocks.LEBRON_ORE.get()
    );
    private static final List<ItemLike> LEBRON_MEAT = List.of(
            ModItems.LEBRON.get() //change this to raw lebron once it's added
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

        //CRAFTING RECIPES // CRAFTING RECIPES//
        //
        //
        //
        //RECIPE FOR LEBRON BLOCK
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEBRON_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.LEBRON.get())
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .save(pRecipeOutput);

        //RECIPE FOR LEBRON
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEBRON.get(), 9)
                .requires(ModBlocks.LEBRON_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.LEBRON_BLOCK.get()), has(ModBlocks.LEBRON_BLOCK.get()))
                .save(pRecipeOutput);

        //RECIPE FOR FLINT AND STEEL AND LEBRON
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FLINT_AND_STEEL_AND_LEBRON.get())
                .requires(ModItems.LEBRON.get()) //CHANGE THIS TO THE LEBRON ESSENCE
                .requires(Items.FLINT_AND_STEEL) //FLINT & STEEL
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .unlockedBy(getHasName(Items.FLINT_AND_STEEL), has(Items.FLINT_AND_STEEL))
                .save(pRecipeOutput);

        //RECIPE FOR HONEY DIPPED LEBRON
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HONEY_DIPPED_LEBRON.get())
                .requires(ModItems.LEBRON.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy(getHasName(ModItems.LEBRON.get()), has(ModItems.LEBRON.get()))
                .unlockedBy(getHasName(Items.HONEY_BOTTLE), has(Items.HONEY_BOTTLE))
                .save(pRecipeOutput);
    }

    //Hardcoded MEH
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
                    .save(pRecipeOutput, FoodMod.MODID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }
    }
}