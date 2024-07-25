package net.tinnedfoil.lebronmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    public static final FoodProperties RAW_LEBRON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 300, 0), 0.5F).build();
    public static final FoodProperties COOKED_LEBRON = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(4).build();
    public static final FoodProperties BURNT_LEBRON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(MobEffects.POISON, 300, 0), 0.5F).build();
    public static final FoodProperties EXTRABURNT_LEBRON = new FoodProperties.Builder()
            .nutrition(0)
            .saturationModifier(0)
            .effect(new MobEffectInstance(MobEffects.HARM, 1, 1), 1).build();

    public static final FoodProperties TAPE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(.35F).build();
}
