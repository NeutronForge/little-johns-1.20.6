package net.echo.little_johns;

import net.echo.little_johns.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.RunArgs;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;

public class LittleJohnsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


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

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS, ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getSpruceColor(), ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getBirchColor(), ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getMangroveColor(), ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS);



    }
}
