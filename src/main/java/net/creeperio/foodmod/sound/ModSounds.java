package net.creeperio.foodmod.sound;

import net.creeperio.foodmod.FoodMod;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds
{
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FoodMod.MODID);

    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_BREAK = reigsterSoundEvents("lebron_block_break");
    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_STEP = reigsterSoundEvents("lebron_block_step");
    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_FALL = reigsterSoundEvents("lebron_block_fall");
    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_PLACE = reigsterSoundEvents("lebron_block_place");
    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_HIT = reigsterSoundEvents("lebron_block_hit");

    public static final RegistryObject<SoundEvent> LEBRON_SONG = reigsterSoundEvents("lebron_song");

    public static final ForgeSoundType LEBRON_BLOCK_SOUNDS = new ForgeSoundType(1, 1,
            ModSounds.LEBRON_BLOCK_BREAK, ModSounds.LEBRON_BLOCK_STEP, ModSounds.LEBRON_BLOCK_PLACE, ModSounds.LEBRON_BLOCK_HIT, ModSounds.LEBRON_BLOCK_FALL);

    private static RegistryObject<SoundEvent> reigsterSoundEvents(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(FoodMod.MODID, name)));
    }

    public static void reigster(IEventBus eventBus)
    {
        SOUND_EVENTS.register(eventBus);
    }
}
