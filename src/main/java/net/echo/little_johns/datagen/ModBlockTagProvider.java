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
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE)

                .add(ModBlocks.CHANDELIER)
                .add(ModBlocks.WHITE_CHANDELIER)
                .add(ModBlocks.ORANGE_CHANDELIER)
                .add(ModBlocks.MAGENTA_CHANDELIER)
                .add(ModBlocks.LIGHT_BLUE_CHANDELIER)
                .add(ModBlocks.YELLOW_CHANDELIER)
                .add(ModBlocks.LIME_CHANDELIER)
                .add(ModBlocks.PINK_CHANDELIER)
                .add(ModBlocks.GRAY_CHANDELIER)
                .add(ModBlocks.LIGHT_GRAY_CHANDELIER)
                .add(ModBlocks.CYAN_CHANDELIER)
                .add(ModBlocks.PURPLE_CHANDELIER)
                .add(ModBlocks.BLUE_CHANDELIER)
                .add(ModBlocks.BROWN_CHANDELIER)
                .add(ModBlocks.GREEN_CHANDELIER)
                .add(ModBlocks.RED_CHANDELIER)
                .add(ModBlocks.BLACK_CHANDELIER)

                .add(ModBlocks.GRAND_CHAIN)
                .add(ModBlocks.COLOSSAL_CHAIN)
                .add(ModBlocks.GOLDEN_CHAIN)
                .add(ModBlocks.GOLDEN_GRAND_CHAIN)
                .add(ModBlocks.GOLDEN_COLOSSAL_CHAIN);


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
                .add(ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS)

                .add(ModBlocks.OAK_WOOD_FENCE)
                .add(ModBlocks.SPRUCE_WOOD_FENCE)
                .add(ModBlocks.BIRCH_WOOD_FENCE)
                .add(ModBlocks.JUNGLE_WOOD_FENCE)
                .add(ModBlocks.ACACIA_WOOD_FENCE)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE)
                .add(ModBlocks.MANGROVE_WOOD_FENCE)
                .add(ModBlocks.CHERRY_WOOD_FENCE)
                .add(ModBlocks.BAMBOO_STEM_FENCE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE)
                .add(ModBlocks.WARPED_HYPHAE_FENCE)
                
                .add(ModBlocks.OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.SPRUCE_WOOD_FENCE_GATE)
                .add(ModBlocks.BIRCH_WOOD_FENCE_GATE)
                .add(ModBlocks.JUNGLE_WOOD_FENCE_GATE)
                .add(ModBlocks.ACACIA_WOOD_FENCE_GATE)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.MANGROVE_WOOD_FENCE_GATE)
                .add(ModBlocks.CHERRY_WOOD_FENCE_GATE)
                .add(ModBlocks.BAMBOO_STEM_FENCE_GATE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE)
                .add(ModBlocks.WARPED_HYPHAE_FENCE_GATE)

                .add(ModBlocks.OAK_PLANK_WALL)
                .add(ModBlocks.SPRUCE_PLANK_WALL)
                .add(ModBlocks.BIRCH_PLANK_WALL)
                .add(ModBlocks.JUNGLE_PLANK_WALL)
                .add(ModBlocks.ACACIA_PLANK_WALL)
                .add(ModBlocks.DARK_OAK_PLANK_WALL)
                .add(ModBlocks.MANGROVE_PLANK_WALL)
                .add(ModBlocks.CHERRY_PLANK_WALL)
                .add(ModBlocks.BAMBOO_PLANK_WALL)
                .add(ModBlocks.CRIMSON_PLANK_WALL)
                .add(ModBlocks.WARPED_PLANK_WALL)
                
                .add(ModBlocks.OAK_WOOD_WALL)
                .add(ModBlocks.SPRUCE_WOOD_WALL)
                .add(ModBlocks.BIRCH_WOOD_WALL)
                .add(ModBlocks.JUNGLE_WOOD_WALL)
                .add(ModBlocks.ACACIA_WOOD_WALL)
                .add(ModBlocks.DARK_OAK_WOOD_WALL)
                .add(ModBlocks.MANGROVE_WOOD_WALL)
                .add(ModBlocks.CHERRY_WOOD_WALL)
                .add(ModBlocks.BAMBOO_STEM_WALL)
                .add(ModBlocks.CRIMSON_HYPHAE_WALL)
                .add(ModBlocks.WARPED_HYPHAE_WALL)
        
        
        
        


        ;

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
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE)
                .add(ModBlocks.COLOSSAL_CHAIN)
                .add(ModBlocks.GOLDEN_COLOSSAL_CHAIN);

        // REQUIRES IRON
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK);

        // REQUIRES DIAMOND
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        // CANLDE BLOCK TAG
        getOrCreateTagBuilder(BlockTags.CANDLES)
                .add(ModBlocks.CHANDELIER)
                .add(ModBlocks.WHITE_CHANDELIER)
                .add(ModBlocks.ORANGE_CHANDELIER)
                .add(ModBlocks.MAGENTA_CHANDELIER)
                .add(ModBlocks.LIGHT_BLUE_CHANDELIER)
                .add(ModBlocks.YELLOW_CHANDELIER)
                .add(ModBlocks.LIME_CHANDELIER)
                .add(ModBlocks.PINK_CHANDELIER)
                .add(ModBlocks.GRAY_CHANDELIER)
                .add(ModBlocks.LIGHT_GRAY_CHANDELIER)
                .add(ModBlocks.CYAN_CHANDELIER)
                .add(ModBlocks.PURPLE_CHANDELIER)
                .add(ModBlocks.BLUE_CHANDELIER)
                .add(ModBlocks.BROWN_CHANDELIER)
                .add(ModBlocks.GREEN_CHANDELIER)
                .add(ModBlocks.RED_CHANDELIER)
                .add(ModBlocks.BLACK_CHANDELIER);


        // WALL BLOCK TAG
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.OAK_PLANK_WALL)
                .add(ModBlocks.SPRUCE_PLANK_WALL)
                .add(ModBlocks.BIRCH_PLANK_WALL)
                .add(ModBlocks.JUNGLE_PLANK_WALL)
                .add(ModBlocks.ACACIA_PLANK_WALL)
                .add(ModBlocks.DARK_OAK_PLANK_WALL)
                .add(ModBlocks.MANGROVE_PLANK_WALL)
                .add(ModBlocks.CHERRY_PLANK_WALL)
                .add(ModBlocks.BAMBOO_PLANK_WALL)
                .add(ModBlocks.CRIMSON_PLANK_WALL)
                .add(ModBlocks.WARPED_PLANK_WALL)

                .add(ModBlocks.OAK_WOOD_WALL)
                .add(ModBlocks.SPRUCE_WOOD_WALL)
                .add(ModBlocks.BIRCH_WOOD_WALL)
                .add(ModBlocks.JUNGLE_WOOD_WALL)
                .add(ModBlocks.ACACIA_WOOD_WALL)
                .add(ModBlocks.DARK_OAK_WOOD_WALL)
                .add(ModBlocks.MANGROVE_WOOD_WALL)
                .add(ModBlocks.CHERRY_WOOD_WALL)
                .add(ModBlocks.BAMBOO_STEM_WALL)
                .add(ModBlocks.CRIMSON_HYPHAE_WALL)
                .add(ModBlocks.WARPED_HYPHAE_WALL);


        // FENCE BLOCK TAG
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.OAK_WOOD_FENCE)
                .add(ModBlocks.SPRUCE_WOOD_FENCE)
                .add(ModBlocks.BIRCH_WOOD_FENCE)
                .add(ModBlocks.JUNGLE_WOOD_FENCE)
                .add(ModBlocks.ACACIA_WOOD_FENCE)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE)
                .add(ModBlocks.MANGROVE_WOOD_FENCE)
                .add(ModBlocks.CHERRY_WOOD_FENCE)
                .add(ModBlocks.BAMBOO_STEM_FENCE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE)
                .add(ModBlocks.WARPED_HYPHAE_FENCE);


      // FENCE GATE BLOCK TAG
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.SPRUCE_WOOD_FENCE_GATE)
                .add(ModBlocks.BIRCH_WOOD_FENCE_GATE)
                .add(ModBlocks.JUNGLE_WOOD_FENCE_GATE)
                .add(ModBlocks.ACACIA_WOOD_FENCE_GATE)
                .add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE)
                .add(ModBlocks.MANGROVE_WOOD_FENCE_GATE)
                .add(ModBlocks.CHERRY_WOOD_FENCE_GATE)
                .add(ModBlocks.BAMBOO_STEM_FENCE_GATE)
                .add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE)
                .add(ModBlocks.WARPED_HYPHAE_FENCE_GATE);




    }

}
