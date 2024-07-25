package net.tinnedfoil.lebronmod.sound;

import net.tinnedfoil.lebronmod.LebronMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds
{
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LebronMod.MODID);

    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_BREAK = reigsterSoundEvents("lebron_block_break");
    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_STEP = reigsterSoundEvents("lebron_block_step");
    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_FALL = reigsterSoundEvents("lebron_block_fall");
    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_PLACE = reigsterSoundEvents("lebron_block_place");
    public static final RegistryObject<SoundEvent> LEBRON_BLOCK_HIT = reigsterSoundEvents("lebron_block_hit");

    public static final RegistryObject<SoundEvent> LEBRON_SONG = reigsterSoundEvents("lebron_song");
    public static final RegistryObject<SoundEvent> LEBRON_SONG_REMIX = reigsterSoundEvents("lebron_song_remix");
    public static final RegistryObject<SoundEvent> LEBRON_SONG_SUNSHINE = reigsterSoundEvents("lebron_song_sunshine");

    public static final ForgeSoundType LEBRON_BLOCK_SOUNDS = new ForgeSoundType(1, 1,
            ModSounds.LEBRON_BLOCK_BREAK, ModSounds.LEBRON_BLOCK_STEP, ModSounds.LEBRON_BLOCK_PLACE, ModSounds.LEBRON_BLOCK_HIT, ModSounds.LEBRON_BLOCK_FALL);

    private static RegistryObject<SoundEvent> reigsterSoundEvents(String name)
    {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(LebronMod.MODID, name)));
    }

    public static void reigster(IEventBus eventBus)
    {
        SOUND_EVENTS.register(eventBus);
    }
}
