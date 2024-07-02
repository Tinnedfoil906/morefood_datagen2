package net.creeperio.foodmod.item;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.item.custom.ExtraBurntLebronJames;
import net.creeperio.foodmod.item.custom.FlintAndSteelAndLebron;
import net.creeperio.foodmod.item.custom.HoneyDippedLebron;
import net.creeperio.foodmod.sound.ModSounds;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item.Properties;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MODID);

    //TEST
    public static final RegistryObject<Item> LUCAS_FOOT = ITEMS.register("lucas_foot",
            () -> new Item(new Item.Properties()));

    //New
    public static final RegistryObject<Item> LEBRON = ITEMS.register("lebron",
            () -> new Item(new Item.Properties()));

    //Extends
    public static final RegistryObject<Item> HONEY_DIPPED_LEBRON = ITEMS.register("honey_dipped_lebron",
            () -> new HoneyDippedLebron(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(Foods.HONEY_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> FLINT_AND_STEEL_AND_LEBRON = ITEMS.register("flint_and_steel_and_lebron",
            () -> new FlintAndSteelAndLebron(new Item.Properties().durability(64)));

    //Food Items
    public static final RegistryObject<Item> COOKED_LEBRON = ITEMS.register("cooked_lebron",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_LEBRON)));
    public static final RegistryObject<Item> BURNT_LEBRON = ITEMS.register("burnt_lebron",
            () -> new Item(new Item.Properties().food(ModFoods.BURNT_LEBRON)));
    public static final RegistryObject<Item> EXTRABURNT_LEBRON = ITEMS.register("extraburnt_lebron",
            () -> new ExtraBurntLebronJames(new Item.Properties().food(ModFoods.EXTRABURNT_LEBRON),200)); //lava is 20000, stick is 100

    public static final RegistryObject<Item> TAPE = ITEMS.register("tape",
            () -> new Item(new Item.Properties().food(ModFoods.TAPE)));

    //Disc
    public static final RegistryObject<Item> LEBRON_MUSIC_DISC = ITEMS.register("lebron_music_disc",
            () -> new RecordItem(6, ModSounds.LEBRON_SONG, new Item.Properties()
                    .stacksTo(1), 740
            ));

    //Tools
    public static final RegistryObject<Item> LEBRON_PICKAXE = ITEMS.register("lebron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LEBRON_PICK_TIER, new Item.Properties()));
    public static final RegistryObject<Item> LEBRON_SWORD = ITEMS.register("lebron_sword",
            () -> new SwordItem(ModToolTiers.LEBRON_SWORD_TIER, new Item.Properties()));
    public static final RegistryObject<Item> LEBRON_AXE = ITEMS.register("lebron_axe",
            () -> new AxeItem(ModToolTiers.LEBRON_AXE_TIER, new Item.Properties()));
    public static final RegistryObject<Item> LEBRON_SHOVEL = ITEMS.register("lebron_shovel",
            () -> new ShovelItem(ModToolTiers.LEBRON_SHOVEL_TIER, new Item.Properties()));
    public static final RegistryObject<Item> LEBRON_HOE = ITEMS.register("lebron_hoe",
            () -> new HoeItem(ModToolTiers.LEBRON_HOE_TIER, new Item.Properties()));

    //Why
    public static final RegistryObject<Item> ASH = ITEMS.register("ash",
            () -> new Item(new Item.Properties().stacksTo(69)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
