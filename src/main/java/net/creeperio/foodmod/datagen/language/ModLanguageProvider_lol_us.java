package net.creeperio.foodmod.datagen.language;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.block.ModBlocks;
import net.creeperio.foodmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider_lol_us extends LanguageProvider {

    public ModLanguageProvider_lol_us(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        //BLOCKS//BLOCKS//BLOCKS//BLOCKS//BLOCKS//
        this.add(ModBlocks.LEBRON_ORE.get(), "Libron Rwock");
        this.add(ModBlocks.DEEPSLATE_LEBRON_ORE.get(), "Dipsl8 Libron Rwock");
        this.add(ModBlocks.LEBRON_BLOCK.get(), "An Entire Block Of Libron");

        //VARIATIONS
        this.add(ModBlocks.LEBRON_STAIRS.get(), "Libroen jem ster");
        this.add(ModBlocks.LEBRON_SLAB.get(), "Libroen jem sleb");
        this.add(ModBlocks.LEBRON_BUTTON.get(), "Libroen jem batan");
        this.add(ModBlocks.LEBRON_PRESSURE_PLATE.get(), "Libroen jem presur plet");
        this.add(ModBlocks.LEBRON_FENCE.get(), "Libroen jem fens");
        this.add(ModBlocks.LEBRON_FENCE_GATE.get(), "Libroen jem fens get");
        this.add(ModBlocks.LEBRON_WALL.get(), "Libroen jem well");
        this.add(ModBlocks.LEBRON_DOOR.get(), "Libroen jem dur");
        this.add(ModBlocks.LEBRON_TRAPDOOR.get(), "Libroen jem trapdur");

        //ITEMS//ITEMS//ITEMS//ITEMS//ITEMS//
        this.add(ModItems.LEBRON.get(), "Lybron Jweimz");
        this.add(ModItems.LEBRON_JAMES_MY_SUNSHINE.get(), "u r my sunshane, me onlee sunshen");
        this.add(ModItems.SUPER_LEBRON.get(), "Supah Lybron Jweimz Ingort");
        this.add(ModItems.OP_LEBRON.get(), "god Lybron Jweimz Ingort");

        //LEBRON MEAT RELATED
        this.add(ModItems.RAW_LEBRON.get(), "libron jam meat");
        this.add(ModItems.COOKED_LEBRON.get(), "cookd libron jam meat");
        this.add(ModItems.BURNT_LEBRON.get(), "burn libron jam meat");
        this.add(ModItems.EXTRABURNT_LEBRON.get(), "...why u do this");
        this.add(ModItems.ASH.get(), "Laybrown burnt to the point of turning to literal ash, now go think about what you've done");

        //MISC FOOD
        this.add(ModItems.TAPE.get(), "importent ducttape");

        //CUSTOM
        this.add(ModItems.HONEY_DIPPED_LEBRON.get(), "Libron Drenched In A Sweet Bwottle");
        this.add(ModItems.FLINT_AND_STEEL_AND_LEBRON.get(), "fleent end stil end librawn jwames esens");

        //MISC
        this.add(ModItems.BASKET_BALL.get(), "baskt boll");
        this.add(ModItems.LEBRON_ESSENCE.get(), "labron jahames esens");

        //REGULAR, SUPER AND OP TOOLS
        this.add(ModItems.LEBRON_PICKAXE.get(), "labrun jamz pick");
        this.add(ModItems.LEBRON_SWORD.get(), "labrun jamz swurd");
        this.add(ModItems.LEBRON_AXE.get(), "labrun jamz ax");
        this.add(ModItems.LEBRON_SHOVEL.get(), "labrun jamz shuvel");
        this.add(ModItems.LEBRON_HOE.get(), "labrun jamz how");
        this.add(ModItems.SUPER_LEBRON_PICKAXE.get(), "supah labrun jamz pick");
        this.add(ModItems.SUPER_LEBRON_SWORD.get(), "supah labrun jamz swurd");
        this.add(ModItems.SUPER_LEBRON_AXE.get(), "supah labrun jamz ax");
        this.add(ModItems.SUPER_LEBRON_SHOVEL.get(), "supah labrun jamz shuvel");
        this.add(ModItems.SUPER_LEBRON_HOE.get(), "supah labrun jamz how");
        this.add(ModItems.OP_LEBRON_PICKAXE.get(), "god labrun jamz pick");
        this.add(ModItems.OP_LEBRON_SWORD.get(), "god labrun jamz swurd");
        this.add(ModItems.OP_LEBRON_AXE.get(), "god labrun jamz ax");
        this.add(ModItems.OP_LEBRON_SHOVEL.get(), "god labrun jamz shuvel");
        this.add(ModItems.OP_LEBRON_HOE.get(), "god labrun jamz how");

        //DISCS
        this.add(ModItems.LEBRON_MUSIC_DISC.get(), "librown muzic dwisc :3");
        this.add("item." + FoodMod.MODID + "." + ModItems.LEBRON_MUSIC_DISC.get() + ".desc", "TinnedFoil906 (me :3) - librawn");
        //^^^ thought this was clever

        //these are descriptions from the creative tabs
        this.add("creativetab.lebron_items", "Libron Jaymz Itemz");
        this.add("creativetab.lebron_blocks", "Libron Jaymz Blockz");

        //these are descriptions from the custom classes
        this.add("tooltip.honey_dipped_lebron", "most likly givz u jumpy jump effwect");
        this.add("tooltip.flint_and_steel_and_lebron", "make things go burn but with leybraun esswence");
        this.add("tooltip.extraburnt_lebron", "DON twaste thiz, tast awful (u can uz as fwel)");

        //these are subtitles from sounds.json
        this.add("sounds.morefood.lebron_block_break", "lebron jem blok brek");
        this.add("sounds.morefood.lebron_block_step", "lebron jem blok step");
        this.add("sounds.morefood.lebron_block_place", "lebron jem blok pleis");
        this.add("sounds.morefood.lebron_block_hit", "lebron jem blok heet");
        this.add("sounds.morefood.lebron_block_fall", "lebron jem blok fell");
    }
    //things you can do: Block, Item, ItemStack, Enchantment, MobEffect, and EntityType
}