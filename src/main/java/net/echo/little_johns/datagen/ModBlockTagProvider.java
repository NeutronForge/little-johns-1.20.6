package net.echo.little_johns.datagen;

import net.echo.little_johns.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {


        // PICKAXE MINEABLE
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE);

        // AXE MINEABLE
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS)

                .add(ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS);


        // REQUIRES STONE
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE);

        // REQUIRES IRON
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        // REQUIRES DIAMOND
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}
