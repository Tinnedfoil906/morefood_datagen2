package net.creeperio.foodmod.item.obsolete;

import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeTier;

public class ForgeTierManager {
    public static void registerCustomTier(ForgeTier customTier, Tiers superiorTier) {
        // Here you can implement custom logic to manage tier relationships
        // For example, you might register the custom tier with a mapping or list
        // and specify that it's better than the specified superiorTier
    }
    public static void registerTier(Tiers customTier, Tiers superiorTier) {
    }
}
