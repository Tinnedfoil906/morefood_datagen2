package net.creeperio.foodmod.entity.client;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.entity.custom.LebronEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class LebronRenderer extends MobRenderer<LebronEntity, LebronModel<LebronEntity>> {
    public LebronRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new LebronModel<>(pContext.bakeLayer(ModModelLayers.LEBRON_LAYER)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(LebronEntity pEntity) {
        return new ResourceLocation(FoodMod.MODID, "textures/entity/lebron.png");
    }
}
