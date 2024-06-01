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
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE);

        // AXE MINEABLE
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)

                .add(ModBlocks.OAK_TABLE_SAW)
                .add(ModBlocks.SPRUCE_TABLE_SAW)
                .add(ModBlocks.BIRCH_TABLE_SAW)
                .add(ModBlocks.JUNGLE_TABLE_SAW)
                .add(ModBlocks.ACACIA_TABLE_SAW)
                .add(ModBlocks.DARK_OAK_TABLE_SAW)
                .add(ModBlocks.MANGROVE_TABLE_SAW)
                .add(ModBlocks.CHERRY_TABLE_SAW)
                .add(ModBlocks.BAMBOO_TABLE_SAW)
                .add(ModBlocks.CRIMSON_TABLE_SAW)
                .add(ModBlocks.WARPED_TABLE_SAW)

                .add(ModBlocks.OAK_WOOD_FRAMEWORK)
                .add(ModBlocks.SPRUCE_WOOD_FRAMEWORK)
                .add(ModBlocks.BIRCH_WOOD_FRAMEWORK)
                .add(ModBlocks.JUNGLE_WOOD_FRAMEWORK)
                .add(ModBlocks.ACACIA_WOOD_FRAMEWORK)
                .add(ModBlocks.DARK_OAK_WOOD_FRAMEWORK)
                .add(ModBlocks.MANGROVE_WOOD_FRAMEWORK)
                .add(ModBlocks.CHERRY_WOOD_FRAMEWORK)
                .add(ModBlocks.BAMBOO_FRAMEWORK)
                .add(ModBlocks.CRIMSON_HYPHAE_FRAMEWORK)
                .add(ModBlocks.WARPED_HYPHAE_FRAMEWORK)

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

        // HOE MINEABLE
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_CHERRY_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_AZALEA_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS)

                .add(ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_NETHER_WART_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_WARPED_WART_VENEERS)
                .add(ModBlocks.ECO_FRIENDLY_MOSS_VENEERS);

        // SHOVEL MINEABLE
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.ECO_FRIENDLY_GRASS_VENEERS);

        // REQUIRES STONE
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE);

        // REQUIRES IRON
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK);

        // REQUIRES DIAMOND
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}
