package net.echo.little_johns;

import net.echo.little_johns.block.ModBlocks;
import net.echo.little_johns.client.gui.screen.ingame.TableSawScreen;
import net.echo.little_johns.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class LittleJohnsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        // BLOCK CUTOUT RENDER LAYER
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_CHERRY_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_AZALEA_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_TABLE_SAW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_TABLE_SAW, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_CHANDELIER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_CHANDELIER, RenderLayer.getCutout());

        // NATURAL BLOCK COLOR PROVIDERS
        // GRASS
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return GrassColors.getDefaultColor();
            }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.ECO_FRIENDLY_GRASS_VENEERS);



        // FOLIAGE
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getSpruceColor();
            }
            return FoliageColors.getSpruceColor();
        }, ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getBirchColor();
            }
            return FoliageColors.getBirchColor();
        }, ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getMangroveColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS);


        // NATURAL ITEM COLOR PROVIDERS
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.ECO_FRIENDLY_GRASS_VENEERS);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getSpruceColor(), ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getBirchColor(), ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getMangroveColor(), ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS);


        // SCREEN HANDLERS
        HandledScreens.register(ModScreenHandlers.TABLE_SAW_SCREEN_HANDLER, TableSawScreen::new);

    }
}
