package net.creeperio.foodmod.block;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.item.ModItems;
import net.creeperio.foodmod.sound.ModSounds;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FoodMod.MODID);


    public static final RegistryObject<Block> LEBRON_ORE = registerBlock("lebron_ore",
            () -> new DropExperienceBlock(UniformInt.of(10, 15),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));

    public static final RegistryObject<Block> DEEPSLATE_LEBRON_ORE = registerBlock("deepslate_lebron_ore",
            () -> new DropExperienceBlock(UniformInt.of(10, 15),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)
            ));

    public static final RegistryObject<Block> LEBRON_BLOCK = registerBlock("lebron_block",
            () -> new
                    Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .sound(ModSounds.LEBRON_BLOCK_SOUNDS)
    ));

//lebron_stairs//lebron_slab//lebron_button//lebron_pressure_plate//lebron_fence//lebron_fence_gate//lebron_wall//lebron_door//lebron_trapdoor//

    //LEBRON_BLOCK variants
    public static final RegistryObject<Block> LEBRON_STAIRS = registerBlock("lebron_stairs",
            () -> new StairBlock(ModBlocks.LEBRON_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                            .sound(ModSounds.LEBRON_BLOCK_SOUNDS)
            ));
    //same as lebron block cuz it basically is that

    public static final RegistryObject<Block> LEBRON_SLAB = registerBlock("lebron_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                            .sound(ModSounds.LEBRON_BLOCK_SOUNDS)
            ));
    //same as lebron block cuz it basically is that

    public static final RegistryObject<Block> LEBRON_FENCE = registerBlock("lebron_fence",
            () -> new FenceBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                            .sound(ModSounds.LEBRON_BLOCK_SOUNDS)
            ));
    //there arent fences of ores really so ig i'm sticking with the iron block for this


    public static final RegistryObject<Block> LEBRON_FENCE_GATE = registerBlock("lebron_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                            .sound(ModSounds.LEBRON_BLOCK_SOUNDS)
            ));
    //there arent fence gates of ores really so ig i'm sticking with the iron block for this

    public static final RegistryObject<Block> LEBRON_WALL = registerBlock("lebron_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                            .sound(ModSounds.LEBRON_BLOCK_SOUNDS)
            ));
    //there arent fences of ores really so ig i'm sticking with the iron block for this

    public static final RegistryObject<Block> LEBRON_DOOR = registerBlock("lebron_door",
            () -> new DoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_DOOR)
                            //.sound(ModSounds.LEBRON_BLOCK_SOUNDS)
                            .noOcclusion()
            ));

    public static final RegistryObject<Block> LEBRON_TRAPDOOR = registerBlock("lebron_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_TRAPDOOR)
                            //.sound(ModSounds.LEBRON_BLOCK_SOUNDS)
                            .noOcclusion()
            ));

    public static final RegistryObject<Block> LEBRON_BUTTON = registerBlock("lebron_button",
            () -> new ButtonBlock(BlockSetType.OAK, 30,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)
                    //.sound(ModSounds.LEBRON_BLOCK_SOUNDS)
            ));
    //all buttons are breakable with every tool even without any tool and always drop so uh...

    public static final RegistryObject<Block> LEBRON_PRESSURE_PLATE = registerBlock("lebron_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    //so oak holds on some values like it being pressable by the player AND items
                    //tf is the difference between this and the weighted one?? speaking as in the block class type
                    //idfk but the weighted one takes in different arguments
                    //GOD HELP
                    BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    //this makes it as hard to break as an iron pressure plate
                    //technically can just do an iron block... but this might have values for
                    //the weighted aspect..? or is that in the type of the pressure plate
                    //.sound(ModSounds.LEBRON_BLOCK_SOUNDS)
                    //doing the iron pressure plate for this

                    //figure out how to do sounds for buttons, pressure plates, doors and trapdoors
            ));
    //Help my brain is melting
    //brain not braining

    //WHY ARE THERE 45 WARNINGS ALL I DID WAS DOWNLOAD SOME LIBRARIES OR SOMETHING

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
