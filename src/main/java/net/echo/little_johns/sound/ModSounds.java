package net.echo.little_johns.sound;

import net.echo.little_johns.LittleJohns;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent MORSMORDRE_CRAZY_DONKEY = registerSoundEvent("morsmordre_crazy_donkey");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(LittleJohns.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        LittleJohns.LOGGER.info("Registering Sounds for " + LittleJohns.MOD_ID);
    }
}
