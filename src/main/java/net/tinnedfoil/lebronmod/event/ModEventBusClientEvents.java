package net.tinnedfoil.lebronmod.event;

import net.tinnedfoil.lebronmod.LebronMod;
import net.tinnedfoil.lebronmod.entity.client.LebronModel;
import net.tinnedfoil.lebronmod.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LebronMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.LEBRON_LAYER, LebronModel::createBodyLayer);
    }
}
