package net.creeperio.foodmod.datagen.language;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.block.ModBlocks;
import net.creeperio.foodmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider_ro_ro extends LanguageProvider {

    public ModLanguageProvider_ro_ro(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        //BLOCKS//BLOCKS//BLOCKS//BLOCKS//BLOCKS//
        this.add(ModBlocks.LEBRON_ORE.get(), "Minereu de LeBron James");
        this.add(ModBlocks.DEEPSLATE_LEBRON_ORE.get(), "Ardeziu de Minereu de LeBron James");
        this.add(ModBlocks.LEBRON_BLOCK.get(), "Block de LeBron James");

        //VARIATIONS
        this.add(ModBlocks.LEBRON_STAIRS.get(), "Scări de LeBron James");
        this.add(ModBlocks.LEBRON_SLAB.get(), "Dală de LeBron James");
        this.add(ModBlocks.LEBRON_BUTTON.get(), "Buton de LeBron James");
        this.add(ModBlocks.LEBRON_PRESSURE_PLATE.get(), "Placă de Presiune de LeBron James");
        this.add(ModBlocks.LEBRON_FENCE.get(), "Gard de LeBron James");
        this.add(ModBlocks.LEBRON_FENCE_GATE.get(), "Poartă de LeBron James");
        this.add(ModBlocks.LEBRON_WALL.get(), "Perete de LeBron James");
        this.add(ModBlocks.LEBRON_DOOR.get(), "Ușă de LeBron James");
        this.add(ModBlocks.LEBRON_TRAPDOOR.get(), "Trapă de LeBron James");

        //ITEMS//ITEMS//ITEMS//ITEMS//ITEMS//
        this.add(ModItems.LEBRON.get(), "LeBron James");
        this.add(ModItems.LEBRON_JAMES_MY_SUNSHINE.get(), "Lebron James, Raza mea de soare");
        this.add(ModItems.SUPER_LEBRON.get(), "Super Lingou de LeBron James");
        this.add(ModItems.OP_LEBRON.get(), "Lingou Supraalimentat de LeBron James");

        //LEBRON MEAT RELATED
        this.add(ModItems.RAW_LEBRON.get(), "Carne de LeBron James Crudă");
        this.add(ModItems.COOKED_LEBRON.get(), "Carne de LeBron James Gătită");
        this.add(ModItems.BURNT_LEBRON.get(), "Carne de LeBron James Arsă");
        this.add(ModItems.EXTRABURNT_LEBRON.get(), "O, Doamne! Ce, Ai făcut?");
        this.add(ModItems.ASH.get(), "Cenușă");

        //MISC FOOD
        this.add(ModItems.TAPE.get(), "Banda adezivă care ține modul ăsta împreună");

        //CUSTOM
        this.add(ModItems.HONEY_DIPPED_LEBRON.get(), "LeBron James Înmuiat intr-o Sticlă de Miere");
        this.add(ModItems.FLINT_AND_STEEL_AND_LEBRON.get(), "Cremene și Amnar și Esență de LeBron James");

        //MISC
        this.add(ModItems.BASKET_BALL.get(), "Mingie de Basket");
        this.add(ModItems.LEBRON_ESSENCE.get(), "Esență de LeBron James");

        //REGULAR, SUPER AND OP TOOLS
        this.add(ModItems.LEBRON_PICKAXE.get(), "Târnăcop LeBron James");
        this.add(ModItems.LEBRON_SWORD.get(), "Sabie LeBron James");
        this.add(ModItems.LEBRON_AXE.get(), "Topor LeBron James");
        this.add(ModItems.LEBRON_SHOVEL.get(), "Lopată LeBron James");
        this.add(ModItems.LEBRON_HOE.get(), "Sapă LeBron James");
        this.add(ModItems.SUPER_LEBRON_PICKAXE.get(), "Super Târnăcop LeBron James");
        this.add(ModItems.SUPER_LEBRON_SWORD.get(), "Super Sabie LeBron James");
        this.add(ModItems.SUPER_LEBRON_AXE.get(), "Super Topor LeBron James");
        this.add(ModItems.SUPER_LEBRON_SHOVEL.get(), "Super Lopată LeBron James");
        this.add(ModItems.SUPER_LEBRON_HOE.get(), "Super Sapă LeBron James");
        this.add(ModItems.OP_LEBRON_PICKAXE.get(), "Târnăcop Supraalimentat de LeBron James");
        this.add(ModItems.OP_LEBRON_SWORD.get(), "Sabie Supraalimentată de LeBron James");
        this.add(ModItems.OP_LEBRON_AXE.get(), "Topor Supraalimentat de LeBron James");
        this.add(ModItems.OP_LEBRON_SHOVEL.get(), "Lopată Supraalimentată de LeBron James");
        this.add(ModItems.OP_LEBRON_HOE.get(), "Sapă Supraalimentată de LeBron James");

        //DISCS
        this.add(ModItems.LEBRON_MUSIC_DISC.get(), "Discul de Muzică LeBron James");
        this.add("item." + FoodMod.MODID + "." + ModItems.LEBRON_MUSIC_DISC.get() + ".desc", "Creeper96 - James");
        //^^^ thought this was clever

        //these are descriptions from the creative tabs
        this.add("creativetab.lebron_items", "Obiecte LeBron James");
        this.add("creativetab.lebron_blocks", "Block-uri LeBron James");

        //these are descriptions from the custom classes
        this.add("tooltip.honey_dipped_lebron", "Are o șansă mare de a dărui jucătorului efectul de Săritură Înaltă");
        this.add("tooltip.flint_and_steel_and_lebron", "Folosește asta pentru a aprinde focuri care au Esența lui LeBron James în ele");
        this.add("tooltip.extraburnt_lebron", "NU mânca asta (Fiindcă este în flăcări ai putea folosi acest obiect intr-un furnal pentru a prăji ceva)");

        //these are subtitles from sounds.json
        this.add("sounds.morefood.lebron_block_break", "Spargerea unui Block de LeBron James");
        this.add("sounds.morefood.lebron_block_step", "Călcarea pe un Block de LeBron James");
        this.add("sounds.morefood.lebron_block_place", "Plasarea unui Block de LeBron James");
        this.add("sounds.morefood.lebron_block_hit", "Lovirea unui Block de LeBron James");
        this.add("sounds.morefood.lebron_block_fall", "Căderea pe un Block de LeBron James");
    }
    //things you can do: Block, Item, ItemStack, Enchantment, MobEffect, and EntityType
}