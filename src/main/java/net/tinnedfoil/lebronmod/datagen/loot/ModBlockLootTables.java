package net.tinnedfoil.lebronmod.datagen.loot;

import net.tinnedfoil.lebronmod.block.ModBlocks;
import net.tinnedfoil.lebronmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.LEBRON_BLOCK.get());

        this.dropSelf(ModBlocks.ASH_BLOCK.get());

        this.dropSelf(ModBlocks.LEBRON_STAIRS.get());
        this.dropSelf(ModBlocks.LEBRON_BUTTON.get());
        this.dropSelf(ModBlocks.LEBRON_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LEBRON_TRAPDOOR.get());
        this.dropSelf(ModBlocks.LEBRON_FENCE.get());
        this.dropSelf(ModBlocks.LEBRON_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LEBRON_WALL.get());

        this.add(ModBlocks.LEBRON_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LEBRON_SLAB.get()));

        this.add(ModBlocks.LEBRON_DOOR.get(),
                block -> createDoorTable(ModBlocks.LEBRON_DOOR.get()));

        this.add(ModBlocks.LEBRON_ORE.get(),
                block -> createOreDrop(ModBlocks.LEBRON_ORE.get(), ModItems.LEBRON.get()));

        this.add(ModBlocks.DEEPSLATE_LEBRON_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_LEBRON_ORE.get(), ModItems.LEBRON.get()));

    }

    protected LootTable.Builder createCustomOreDrop1(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
