package net.tinnedfoil.lebronmod.item;

import net.tinnedfoil.lebronmod.LebronMod;
import net.tinnedfoil.lebronmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LebronMod.MODID);

    //
    // COULD I INTEREST YOU IN EVERYTHING ALL OF THE TIME
    // A BIT OF EVERYTHING ALL OF THE TIME
    // APATHY'S A TRAGEDY AND BOREDOM IS A CRIME
    // ANYTHING AND EVERYTHING ALL OF THE TIME
    //
    // COULD I INTEREST YOU IN EVERYTHING ALL OF THE TIME
    // A LITTLE BIT OF EVERYTHING ALL OF THE TIME
    // APATHY'S A TRAGEDY AND BOREDOM IS A CRIME
    // ANYTHING AND EVERYTHING AND ANYTHING AND EVERYTHING AND ANYTHING AND EVERYTHING AND ALL OF THE TIME
    //
    //         "inside"
    // now streaming on netflix
    //

    //ITEMS
    public static final RegistryObject<CreativeModeTab> LEBRON_ITEMS =
            //ofc tab names are sorted alphabetically for some stupid reason 😭
            CREATIVE_MODE_TABS.register("a_lebron_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEBRON.get()))
                    .title(Component.translatable("creativetab.lebron_items"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        //foods
                        output.accept(ModItems.RAW_LEBRON.get());

                        output.accept(ModItems.COOKED_LEBRON.get());
                        output.accept(ModItems.BURNT_LEBRON.get());
                        //output.accept(ModItems.EXTRABURNT_LEBRON.get());
                        //output.accept(ModItems.ASH.get());

                        output.accept(ModItems.TAPE.get());

                        //utilities
                        output.accept(ModItems.FLINT_AND_STEEL_AND_LEBRON.get());
                        output.accept(ModItems.HONEY_DIPPED_LEBRON.get());

                        output.accept(ModItems.LEBRON_MUSIC_DISC.get());
                        output.accept(ModItems.LEBRON_MUSIC_DISC_REMIX.get());
                        output.accept(ModItems.LEBRON_MUSIC_DISC_SUNSHINE.get());
                        //output.accept(ModItems.LEBRON_MUSIC_DISC_BD.get());

                        output.accept(ModItems.BASKET_BALL.get());
                        output.accept(ModItems.LEBRON_ESSENCE.get());

                        output.accept(ModItems.LEBRON_JAMES_MY_SUNSHINE.get());

                        //ore n tool
                        output.accept(ModItems.LEBRON.get());
                        output.accept(ModItems.SUPER_LEBRON.get());
                        output.accept(ModItems.OP_LEBRON.get());

                        output.accept(ModItems.LEBRON_PICKAXE.get());
                        output.accept(ModItems.LEBRON_SWORD.get());
                        output.accept(ModItems.LEBRON_AXE.get());
                        output.accept(ModItems.LEBRON_SHOVEL.get());
                        output.accept(ModItems.LEBRON_HOE.get());

                        output.accept(ModItems.SUPER_LEBRON_PICKAXE.get());
                        output.accept(ModItems.SUPER_LEBRON_SWORD.get());
                        output.accept(ModItems.SUPER_LEBRON_AXE.get());
                        output.accept(ModItems.SUPER_LEBRON_SHOVEL.get());
                        output.accept(ModItems.SUPER_LEBRON_HOE.get());

                        output.accept(ModItems.OP_LEBRON_PICKAXE.get());
                        output.accept(ModItems.OP_LEBRON_SWORD.get());
                        output.accept(ModItems.OP_LEBRON_AXE.get());
                        output.accept(ModItems.OP_LEBRON_SHOVEL.get());
                        output.accept(ModItems.OP_LEBRON_HOE.get());

                        output.accept(ModItems.LEBRON_SPAWN_EGG.get());
                    })
                    .build());

    //BLOCKS
    public static final RegistryObject<CreativeModeTab> LEBRON_BLOCKS =
            //ofc tab names are sorted alphabetically for some stupid reason 😭
            CREATIVE_MODE_TABS.register("b_lebron_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LEBRON_BLOCK.get()))
                    .title(Component.translatable("creativetab.lebron_blocks"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        //full blocks
                        output.accept(ModBlocks.LEBRON_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_LEBRON_ORE.get());
                        output.accept(ModBlocks.LEBRON_BLOCK.get());

                        //misc blocks
                        output.accept(ModBlocks.LEBRON_STAIRS.get());
                        output.accept(ModBlocks.LEBRON_SLAB.get());

                        output.accept(ModBlocks.LEBRON_FENCE.get());
                        output.accept(ModBlocks.LEBRON_FENCE_GATE.get());
                        output.accept(ModBlocks.LEBRON_WALL.get());

                        output.accept(ModBlocks.LEBRON_DOOR.get());
                        output.accept(ModBlocks.LEBRON_TRAPDOOR.get());

                        output.accept(ModBlocks.LEBRON_BUTTON.get());
                        output.accept(ModBlocks.LEBRON_PRESSURE_PLATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
