package net.tinnedfoil.lebronmod.datagen.language;

import net.tinnedfoil.lebronmod.LebronMod;
import net.tinnedfoil.lebronmod.block.ModBlocks;
import net.tinnedfoil.lebronmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider_en_us extends LanguageProvider {

    public ModLanguageProvider_en_us(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        //BLOCKS//BLOCKS//BLOCKS//BLOCKS//BLOCKS//
        this.add(ModBlocks.LEBRON_ORE.get(), "LeBron James Ore");
        this.add(ModBlocks.DEEPSLATE_LEBRON_ORE.get(), "Deepslate LeBron James Ore");
        this.add(ModBlocks.LEBRON_BLOCK.get(), "Block of LeBron James");

        this.add(ModBlocks.ASH_BLOCK.get(), "Block of Ash");

        //VARIATIONS
        this.add(ModBlocks.LEBRON_STAIRS.get(), "LeBron James Stairs");
        this.add(ModBlocks.LEBRON_SLAB.get(), "LeBron James Slab");
        this.add(ModBlocks.LEBRON_BUTTON.get(), "LeBron James Button");
        this.add(ModBlocks.LEBRON_PRESSURE_PLATE.get(), "LeBron James Pressure Plate");
        this.add(ModBlocks.LEBRON_FENCE.get(), "LeBron James Fence");
        this.add(ModBlocks.LEBRON_FENCE_GATE.get(), "LeBron James Fence Gate");
        this.add(ModBlocks.LEBRON_WALL.get(), "LeBron James Wall");
        this.add(ModBlocks.LEBRON_DOOR.get(), "LeBron James Door");
        this.add(ModBlocks.LEBRON_TRAPDOOR.get(), "LeBron James Trapdoor");

        //ITEMS//ITEMS//ITEMS//ITEMS//ITEMS//
        this.add(ModItems.LEBRON.get(), "LeBron James");
        this.add(ModItems.LEBRON_JAMES_MY_SUNSHINE.get(), "Lebron James, My Sunshine");
        this.add(ModItems.SUPER_LEBRON.get(), "Super LeBron James Ingot");
        this.add(ModItems.OP_LEBRON.get(), "OP LeBron James Ingot");

        //LEBRON MEAT RELATED
        this.add(ModItems.RAW_LEBRON.get(), "Raw LeBron James");
        this.add(ModItems.COOKED_LEBRON.get(), "Cooked LeBron James");
        this.add(ModItems.BURNT_LEBRON.get(), "Burnt LeBron James");
        this.add(ModItems.EXTRABURNT_LEBRON.get(), "OH MY GOD WHAT HAVE YOU DONE");
        this.add(ModItems.ASH.get(), "Ash");

        //MISC FOOD
        this.add(ModItems.TAPE.get(), "The DuctTape that holds this mod together");

        //CUSTOM
        this.add(ModItems.HONEY_DIPPED_LEBRON.get(), "LeBron James Dipped In A Honey Bottle (wip)");
        this.add(ModItems.FLINT_AND_STEEL_AND_LEBRON.get(), "Flint And Steel And LeBron James Essence (wip)");

        //MISC
        this.add(ModItems.BASKET_BALL.get(), "Basket Ball");
        this.add(ModItems.LEBRON_ESSENCE.get(), "LeBron James Essence");

        //SPAWN EGG
        this.add(ModItems.LEBRON_SPAWN_EGG.get(), "LeBron James Spawn Egg");

        //REGULAR, SUPER AND OP TOOLS
        this.add(ModItems.LEBRON_PICKAXE.get(), "LeBron James Pickaxe");
        this.add(ModItems.LEBRON_SWORD.get(), "LeBron James Sword");
        this.add(ModItems.LEBRON_AXE.get(), "LeBron James Axe");
        this.add(ModItems.LEBRON_SHOVEL.get(), "LeBron James Shovel");
        this.add(ModItems.LEBRON_HOE.get(), "LeBron James Hoe");
        this.add(ModItems.SUPER_LEBRON_PICKAXE.get(), "Super LeBron James Pickaxe");
        this.add(ModItems.SUPER_LEBRON_SWORD.get(), "Super LeBron James Sword");
        this.add(ModItems.SUPER_LEBRON_AXE.get(), "Super LeBron James Axe");
        this.add(ModItems.SUPER_LEBRON_SHOVEL.get(), "Super LeBron James Shovel");
        this.add(ModItems.SUPER_LEBRON_HOE.get(), "Super LeBron James Hoe");
        this.add(ModItems.OP_LEBRON_PICKAXE.get(), "OP LeBron James Pickaxe");
        this.add(ModItems.OP_LEBRON_SWORD.get(), "OP LeBron James Sword");
        this.add(ModItems.OP_LEBRON_AXE.get(), "OP LeBron James Axe");
        this.add(ModItems.OP_LEBRON_SHOVEL.get(), "OP LeBron James Shovel");
        this.add(ModItems.OP_LEBRON_HOE.get(), "OP LeBron James Hoe");

        //DISCS
        this.add(ModItems.LEBRON_MUSIC_DISC.get(), "LeBron James Music Disc");
        this.add("item." + LebronMod.MODID + "." + ModItems.LEBRON_MUSIC_DISC.get() + ".desc", "TinnedFoil906 - James");
        this.add(ModItems.LEBRON_MUSIC_DISC_REMIX.get(), "LeBron James Music Disc");
        this.add("item." + LebronMod.MODID + "." + ModItems.LEBRON_MUSIC_DISC_REMIX.get() + ".desc", "TinnedFoil906 - James II");
        this.add(ModItems.LEBRON_MUSIC_DISC_SUNSHINE.get(), "LeBron James Music Disc");
        this.add("item." + LebronMod.MODID + "." + ModItems.LEBRON_MUSIC_DISC_SUNSHINE.get() + ".desc", "Christina Perri - You Are My Sunshine");
        //^^^ thought this was clever

        //these are descriptions from the creative tabs
        this.add("creativetab.lebron_items", "LeBron James Items");
        this.add("creativetab.lebron_blocks", "LeBron James Blocks");

        //these are descriptions from the custom classes
        this.add("tooltip.honey_dipped_lebron", "Has a high chance of giving the player Jump Boost");
        this.add("tooltip.flint_and_steel_and_lebron", "Use this to light fires that have LeBron James's essence within them");
        this.add("tooltip.extraburnt_lebron", "Do NOT eat this (Since it's literally on fire try using it as fuel)");

        //these are subtitles from sounds.json
        this.add("sounds.lebron.lebron_block_break", "LeBron James Block Break");
        this.add("sounds.lebron.lebron_block_step", "LeBron James Block Step");
        this.add("sounds.lebron.lebron_block_place", "LeBron James Block Place");
        this.add("sounds.lebron.lebron_block_hit", "LeBron James Block Hit");
        this.add("sounds.lebron.lebron_block_fall", "LeBron James Block Fall");
    }
    //things you can do: Block, Item, ItemStack, Enchantment, MobEffect, and EntityType
}