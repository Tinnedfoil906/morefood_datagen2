package net.creeperio.foodmod.item;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.item.custom.ExtraBurntLebronJames;
import net.creeperio.foodmod.item.custom.FlintAndSteelAndLebron;
import net.creeperio.foodmod.item.custom.HoneyDippedLebron;
import net.creeperio.foodmod.item.obsolete.CustomSwordItem;
import net.creeperio.foodmod.sound.ModSounds;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.UUID;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MODID);

    //New
    public static final RegistryObject<Item> LEBRON = ITEMS.register("lebron",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEBRON_JAMES_MY_SUNSHINE = ITEMS.register("lebron_james_my_sunshine",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUPER_LEBRON = ITEMS.register("super_lebron",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OP_LEBRON = ITEMS.register("op_lebron",
            () -> new Item(new Item.Properties()));

    //Important
    public static final RegistryObject<Item> LEBRON_ESSENCE = ITEMS.register("lebron_essence",
            () -> new Item(new Item.Properties()));

    //Extends
    public static final RegistryObject<Item> HONEY_DIPPED_LEBRON = ITEMS.register("honey_dipped_lebron",
            () -> new HoneyDippedLebron(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(Foods.HONEY_BOTTLE).stacksTo(16)));
    //crafting this makes it so the bottle remain, which shouldn't happen, Too Bad!
    //also it doesn't give you jump boost like promised
    public static final RegistryObject<Item> FLINT_AND_STEEL_AND_LEBRON = ITEMS.register("flint_and_steel_and_lebron",
            () -> new FlintAndSteelAndLebron(new Item.Properties().durability(64)));
    //make the fire of this look like lebron and light lebron portals

    //Food Items
    //add raw lebron sometime, it'll probably be lebron but a bit pink to differentiate
    public static final RegistryObject<Item> RAW_LEBRON = ITEMS.register("raw_lebron" +
                    "_i_hope_that_doesnt_sound_too_weird_out_of_context_holy_fuck_i_sure_hope_no_one_has_advanced_tooltips_on",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_LEBRON)));
    public static final RegistryObject<Item> COOKED_LEBRON = ITEMS.register("cooked_lebron",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_LEBRON)));
    public static final RegistryObject<Item> BURNT_LEBRON = ITEMS.register("burnt_lebron",
            () -> new Item(new Item.Properties().food(ModFoods.BURNT_LEBRON)));
    public static final RegistryObject<Item> EXTRABURNT_LEBRON = ITEMS.register("extraburnt_lebron",
            () -> new ExtraBurntLebronJames(new Item.Properties().food(ModFoods.EXTRABURNT_LEBRON),200)); //lava is 20000, stick is 100

    public static final RegistryObject<Item> TAPE = ITEMS.register("tape",
            () -> new Item(new Item.Properties().food(ModFoods.TAPE)));

    //Discs
    public static final RegistryObject<Item> LEBRON_MUSIC_DISC = ITEMS.register("lebron_music_disc",
            () -> new RecordItem(6, ModSounds.LEBRON_SONG, new Item.Properties()
                    .stacksTo(1), 740
            ));
    public static final RegistryObject<Item> LEBRON_MUSIC_DISC_REMIX = ITEMS.register("lebron_music_disc_remix",
            () -> new RecordItem(6, ModSounds.LEBRON_SONG_REMIX, new Item.Properties()
                    .stacksTo(1), 960
            ));
    public static final RegistryObject<Item> LEBRON_MUSIC_DISC_SUNSHINE = ITEMS.register("lebron_music_disc_sunshine",
            () -> new RecordItem(6, ModSounds.LEBRON_SONG_SUNSHINE, new Item.Properties()
                    .stacksTo(1), 1580
            ));

    //Tools

    // all this is a mess help
    /*
    public static final RegistryObject<Item> LEBRON_PICKAXE = ITEMS.register("lebron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEBRON_TIER, new Item.Properties()));

    public static final RegistryObject<Item> LEBRON_SWORD = ITEMS.register("lebron_sword",
            () -> new CustomSwordItem(ModToolTiers.LEBRON_TIER, 6, -2, new Item.Properties()));
            //() -> new SwordItem(ModToolTiers.LEBRON_SWORD_TIER, new Item.Properties()));
    //1.6F speed for every pick
    //6 is the iron attack / 7 is the diamond attack

    // make this iron tier as in the attack, but more durability
    //check the pick speed in ModToolTiers to make it the same for every tool

    public static final RegistryObject<Item> LEBRON_AXE = ITEMS.register("lebron_axe",
            () -> new AxeItem(ModToolTiers.LEBRON_TIER, new Item.Properties()));
    //0.9 speed for iron / 1 speed for diamond
    //9 damage for iron and diamond

    // make this like iron tier but faster and with more durability

    public static final RegistryObject<Item> LEBRON_SHOVEL = ITEMS.register("lebron_shovel",
            () -> new ShovelItem(ModToolTiers.LEBRON_TIER, new Item.Properties()));
    // again, iron but faster and more durability

    public static final RegistryObject<Item> LEBRON_HOE = ITEMS.register("lebron_hoe",
            () -> new HoeItem(ModToolTiers.LEBRON_TIER, new Item.Properties()));
    // more durability and... what even is the difference between hoes not counting durability?
    */

    public static final RegistryObject<Item> LEBRON_SWORD = ITEMS.register("lebron_sword",
            () -> new SwordItem(ModToolTiers.LEBRON_TIER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.LEBRON_TIER,
                    3, -1.9F)))
    );
    public static final RegistryObject<Item> LEBRON_SHOVEL = ITEMS.register("lebron_shovel",
            () -> new ShovelItem(ModToolTiers.LEBRON_TIER, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.LEBRON_TIER,
                    1.5F, -2.5F)))
    );
    public static final RegistryObject<Item> LEBRON_PICKAXE = ITEMS.register("lebron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEBRON_TIER, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.LEBRON_TIER,
                    1.0F, -2.3F)))
    );
    public static final RegistryObject<Item> LEBRON_AXE = ITEMS.register("lebron_axe",
            () -> new AxeItem(ModToolTiers.LEBRON_TIER, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.LEBRON_TIER,
                    6.0F, -2.6F)))
    );
    public static final RegistryObject<Item> LEBRON_HOE = ITEMS.register("lebron_hoe",
            () -> new HoeItem(ModToolTiers.LEBRON_TIER, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.LEBRON_TIER,
                    -2.0F, -0.5F)))
    );
    /////////////////////////////////////////////////////////super
    public static final RegistryObject<Item> SUPER_LEBRON_SWORD = ITEMS.register("super_lebron_sword",
            () -> new SwordItem(ModToolTiers.SUPER_LEBRON_TIER, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.SUPER_LEBRON_TIER,
                    12, -0.6F)))
    );
    public static final RegistryObject<Item> SUPER_LEBRON_SHOVEL = ITEMS.register("super_lebron_shovel",
            () -> new ShovelItem(ModToolTiers.SUPER_LEBRON_TIER, new Item.Properties().fireResistant().attributes(ShovelItem.createAttributes(ModToolTiers.SUPER_LEBRON_TIER,
                    6F, -0.75F)))
    );
    public static final RegistryObject<Item> SUPER_LEBRON_PICKAXE = ITEMS.register("super_lebron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SUPER_LEBRON_TIER, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolTiers.SUPER_LEBRON_TIER,
                    4.0F, -0.7F)))
    );
    public static final RegistryObject<Item> SUPER_LEBRON_AXE = ITEMS.register("super_lebron_axe",
            () -> new AxeItem(ModToolTiers.SUPER_LEBRON_TIER, new Item.Properties().fireResistant().attributes(AxeItem.createAttributes(ModToolTiers.SUPER_LEBRON_TIER,
                    20.0F, -0.75F)))
    );
    public static final RegistryObject<Item> SUPER_LEBRON_HOE = ITEMS.register("super_lebron_hoe",
            () -> new HoeItem(ModToolTiers.SUPER_LEBRON_TIER, new Item.Properties().fireResistant().attributes(HoeItem.createAttributes(ModToolTiers.SUPER_LEBRON_TIER,
                    -16.0F, 0.0F)))
    );
    /////////////////////////////////////////////////////////op
    public static final RegistryObject<Item> OP_LEBRON_SWORD = ITEMS.register("op_lebron_sword",
            () -> new SwordItem(ModToolTiers.OP_LEBRON_TIER, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(ModToolTiers.OP_LEBRON_TIER,
                    24, -0.3F)))
    );
    public static final RegistryObject<Item> OP_LEBRON_SHOVEL = ITEMS.register("op_lebron_shovel",
            () -> new ShovelItem(ModToolTiers.OP_LEBRON_TIER, new Item.Properties().fireResistant().attributes(ShovelItem.createAttributes(ModToolTiers.OP_LEBRON_TIER,
                    12F, -0.375F)))
    );
    public static final RegistryObject<Item> OP_LEBRON_PICKAXE = ITEMS.register("op_lebron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OP_LEBRON_TIER, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(ModToolTiers.OP_LEBRON_TIER,
                    8.0F, -0.35F)))
    );
    public static final RegistryObject<Item> OP_LEBRON_AXE = ITEMS.register("op_lebron_axe",
            () -> new AxeItem(ModToolTiers.OP_LEBRON_TIER, new Item.Properties().fireResistant().attributes(AxeItem.createAttributes(ModToolTiers.OP_LEBRON_TIER,
                    40.0F, -0.375F)))
    );
    public static final RegistryObject<Item> OP_LEBRON_HOE = ITEMS.register("op_lebron_hoe",
            () -> new HoeItem(ModToolTiers.OP_LEBRON_TIER, new Item.Properties().fireResistant().attributes(HoeItem.createAttributes(ModToolTiers.OP_LEBRON_TIER,
                    -32.0F, 0.0F)))
    );

    //Misc
    public static final RegistryObject<Item> ASH = ITEMS.register("ash",
            () -> new Item(new Item.Properties().stacksTo(69)));

    public static final RegistryObject<Item> BASKET_BALL = ITEMS.register("basket_ball",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
