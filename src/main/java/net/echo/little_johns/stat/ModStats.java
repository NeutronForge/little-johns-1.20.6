package net.echo.little_johns.stat;

import net.echo.little_johns.LittleJohns;
import net.echo.little_johns.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.StatType;
import net.minecraft.stat.Stats;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModStats extends Stats {

    public static final Identifier INTERACT_WITH_TABLE_SAW = registerStat("interact_with_table_saw", StatFormatter.DEFAULT);


    private static Identifier registerStat(String id, StatFormatter formatter) {
        Identifier identifier = new Identifier(id);
        Registry.register(Registries.CUSTOM_STAT, id, identifier);
        CUSTOM.getOrCreateStat(identifier, formatter);
        return identifier;
    }

    private static <T> StatType<T> registerType(String id, Registry<T> registry) {
        MutableText text = Text.translatable("stat_type.minecraft." + id);
        return Registry.register(Registries.STAT_TYPE, id, new StatType<T>(registry, text));
    }


    public static void registerModStats() {
        LittleJohns.LOGGER.info("Registering mod stats for " + LittleJohns.MOD_ID);
    }
}
