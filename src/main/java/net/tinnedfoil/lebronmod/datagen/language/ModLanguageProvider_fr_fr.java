package net.tinnedfoil.lebronmod.datagen.language;

import net.tinnedfoil.lebronmod.LebronMod;
import net.tinnedfoil.lebronmod.block.ModBlocks;
import net.tinnedfoil.lebronmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider_fr_fr extends LanguageProvider {

    public ModLanguageProvider_fr_fr(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        //BLOCKS//BLOCKS//BLOCKS//BLOCKS//BLOCKS//
        this.add(ModBlocks.LEBRON_ORE.get(), "Le LeBron James Ore");
        this.add(ModBlocks.DEEPSLATE_LEBRON_ORE.get(), "Le Deepslate Le LeBron James Ore");
        this.add(ModBlocks.LEBRON_BLOCK.get(), "Le Block of Le LeBron James");

        //VARIATIONS
        this.add(ModBlocks.LEBRON_STAIRS.get(), "Le LeBron James Stairs");
        this.add(ModBlocks.LEBRON_SLAB.get(), "Le LeBron James Slab");
        this.add(ModBlocks.LEBRON_BUTTON.get(), "Le LeBron James Button");
        this.add(ModBlocks.LEBRON_PRESSURE_PLATE.get(), "Le LeBron James Pressure Plate");
        this.add(ModBlocks.LEBRON_FENCE.get(), "Le LeBron James Fence");
        this.add(ModBlocks.LEBRON_FENCE_GATE.get(), "Le LeBron James Fence Gate");
        this.add(ModBlocks.LEBRON_WALL.get(), "Le LeBron James Wall");
        this.add(ModBlocks.LEBRON_DOOR.get(), "Le LeBron James Door");
        this.add(ModBlocks.LEBRON_TRAPDOOR.get(), "Le LeBron James Trapdoor");

        //ITEMS//ITEMS//ITEMS//ITEMS//ITEMS//
        this.add(ModItems.LEBRON.get(), "Le LeBron James");
        this.add(ModItems.LEBRON_JAMES_MY_SUNSHINE.get(), "Le Lebron James, Le Sunshine");
        this.add(ModItems.SUPER_LEBRON.get(), "Le Super Le LeBron James Ingot");
        this.add(ModItems.OP_LEBRON.get(), "Le OP Le LeBron James Ingot");

        //LEBRON MEAT RELATED
        this.add(ModItems.RAW_LEBRON.get(), "Le Raw Le LeBron James");
        this.add(ModItems.COOKED_LEBRON.get(), "Le Cooked Le LeBron James");
        this.add(ModItems.BURNT_LEBRON.get(), "Le Burnt Le LeBron James");
        this.add(ModItems.EXTRABURNT_LEBRON.get(), "Le OH MY GOD WHAT HAVE YOU DONE");
        this.add(ModItems.ASH.get(), "Le Ash");

        //MISC FOOD
        this.add(ModItems.TAPE.get(), "Le DuctTape that holds Le mod together");

        //CUSTOM
        this.add(ModItems.HONEY_DIPPED_LEBRON.get(), "Le LeBron James Dipped In Le Honey Bottle");
        this.add(ModItems.FLINT_AND_STEEL_AND_LEBRON.get(), "Le Flint And Le Steel And Le LeBron James Essence");

        //MISC
        this.add(ModItems.BASKET_BALL.get(), "Le Basket Ball");
        this.add(ModItems.LEBRON_ESSENCE.get(), "Le LeBron James Essence");

        //REGULAR, SUPER AND OP TOOLS
        this.add(ModItems.LEBRON_PICKAXE.get(), "Le LeBron James Pickaxe");
        this.add(ModItems.LEBRON_SWORD.get(), "Le LeBron James Sword");
        this.add(ModItems.LEBRON_AXE.get(), "Le LeBron James Axe");
        this.add(ModItems.LEBRON_SHOVEL.get(), "Le LeBron James Shovel");
        this.add(ModItems.LEBRON_HOE.get(), "Le LeBron James Hoe");
        this.add(ModItems.SUPER_LEBRON_PICKAXE.get(), "Le Super Le LeBron James Pickaxe");
        this.add(ModItems.SUPER_LEBRON_SWORD.get(), "Le Super Le LeBron James Sword");
        this.add(ModItems.SUPER_LEBRON_AXE.get(), "Le Super Le LeBron James Axe");
        this.add(ModItems.SUPER_LEBRON_SHOVEL.get(), "Le Super Le LeBron James Shovel");
        this.add(ModItems.SUPER_LEBRON_HOE.get(), "Le Super Le LeBron James Hoe");
        this.add(ModItems.OP_LEBRON_PICKAXE.get(), "Le OP Le LeBron James Pickaxe");
        this.add(ModItems.OP_LEBRON_SWORD.get(), "Le OP Le LeBron James Sword");
        this.add(ModItems.OP_LEBRON_AXE.get(), "Le OP Le LeBron James Axe");
        this.add(ModItems.OP_LEBRON_SHOVEL.get(), "Le OP Le LeBron James Shovel");
        this.add(ModItems.OP_LEBRON_HOE.get(), "Le OP Le LeBron James Hoe");

        //DISCS
        this.add(ModItems.LEBRON_MUSIC_DISC.get(), "Le LeBron James Music Disc");
        this.add("item." + LebronMod.MODID + "." + ModItems.LEBRON_MUSIC_DISC.get() + ".desc", "Le TinnedFoil906 - Le James");
        //^^^ thought this was clever

        //these are descriptions from the creative tabs
        this.add("creativetab.lebron_items", "Le LeBron James Items");
        this.add("creativetab.lebron_blocks", "Le LeBron James Blocks");

        //these are descriptions from the custom classes
        this.add("tooltip.honey_dipped_lebron", "Has a high chance of giving the player Le Jump Boost");
        this.add("tooltip.flint_and_steel_and_lebron", "Use this to light Le fires that have Le LeBron James's essence within them");
        this.add("tooltip.extraburnt_lebron", "Do NOT eat this (Since it's literally on fire try using it as Le fuel)");

        //these are subtitles from sounds.json
        this.add("sounds.morefood.lebron_block_break", "Le LeBron James Block Break");
        this.add("sounds.morefood.lebron_block_step", "Le LeBron James Block Step");
        this.add("sounds.morefood.lebron_block_place", "Le LeBron James Block Place");
        this.add("sounds.morefood.lebron_block_hit", "Le LeBron James Block Hit");
        this.add("sounds.morefood.lebron_block_fall", "Le LeBron James Block Fall");
    }
    //things you can do: Block, Item, ItemStack, Enchantment, MobEffect, and EntityType
}