package net.creeperio.foodmod.event;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.entity.ModEntities;
import net.creeperio.foodmod.entity.custom.LebronEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FoodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.LEBRON.get(), LebronEntity.createAttributes().build());
    }
}
