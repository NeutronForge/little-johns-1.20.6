package net.echo.little_johns.screen;

import net.echo.little_johns.LittleJohns;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {


    public static final ScreenHandlerType<TableSawScreenHandler> TABLE_SAW_SCREEN_HANDLER =
            ModScreenHandlers.register("table_saw", TableSawScreenHandler::new);



    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory) {
        return Registry.register(Registries.SCREEN_HANDLER, new Identifier(LittleJohns.MOD_ID, id), new ScreenHandlerType<T>(factory, FeatureFlags.VANILLA_FEATURES));
    }

    public static void registerScreenHandlers() {
        LittleJohns.LOGGER.info("Registering Screen Handlers for " + LittleJohns.MOD_ID);
    }
}
