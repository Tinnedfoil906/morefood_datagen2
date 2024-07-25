package net.tinnedfoil.lebronmod.event;

import net.tinnedfoil.lebronmod.LebronMod;
import net.tinnedfoil.lebronmod.entity.ModEntities;
import net.tinnedfoil.lebronmod.entity.custom.LebronEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LebronMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.LEBRON.get(), LebronEntity.createAttributes().build());
    }
}
