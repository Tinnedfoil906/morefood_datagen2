package net.creeperio.foodmod.entity;

import net.creeperio.foodmod.FoodMod;
import net.creeperio.foodmod.entity.custom.LebronEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FoodMod.MODID);

    public static final RegistryObject<EntityType<LebronEntity>> LEBRON =
            ENTITY_TYPES.register("lebron", () -> EntityType.Builder.of(LebronEntity::new, MobCategory.MONSTER)
                    .sized(1F, 1.9F)
                    .build("lebron")
            );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
