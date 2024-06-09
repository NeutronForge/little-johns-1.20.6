package net.echo.little_johns.datagen;

import net.echo.little_johns.block.ModBlocks;
import net.echo.little_johns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {




        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK, 1)
                .input(Character.valueOf('G'), ModBlocks.GALVANIZED_SQUARE_STEEL)
                .input(Character.valueOf('B'), ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM)
                .input(Character.valueOf('S'), ModItems.BORROWED_SCREWS)
                .pattern("SGS")
                .pattern("GBG")
                .pattern("SGS")
                .criterion("has_iron_ingot", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM, 1)
                .input(Character.valueOf('#'), Items.IRON_INGOT)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .criterion("has_iron_ingot", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GALVANIZED_SQUARE_STEEL, 4)
                .input(Character.valueOf('#'), ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM)
                .input(Character.valueOf('S'), ModItems.BORROWED_SCREWS)
                .pattern("S#S")
                .pattern("#S#")
                .pattern("S#S")
                .criterion("has_iron_ingot", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE, 4)
                .input(Character.valueOf('#'), ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM)
                .input(Character.valueOf('S'), ModItems.BORROWED_SCREWS)
                .pattern("#S#")
                .pattern("S#S")
                .pattern("#S#")
                .criterion("has_iron_ingot", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BORROWED_SCREWS, 4)
                .input(Character.valueOf('I'), Items.IRON_INGOT)
                .input(Character.valueOf('N'), Items.IRON_NUGGET)
                .pattern("  ")
                .pattern(" I")
                .pattern("N ")
                .criterion("has_iron_ingot", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MORSMORDRE_CRAZY_DONKEY_MUSIC_DISC, 1)
                .input(Character.valueOf('B'), ModItems.BORROWED_SCREWS)
                .input(Character.valueOf('G'), ModBlocks.GALVANIZED_SQUARE_STEEL)
                .pattern("GGG")
                .pattern("GBG")
                .pattern("GGG")
                .criterion("has_iron_ingot", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);


        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.OAK_TABLE_SAW, 1, Blocks.OAK_LOG, Blocks.OAK_PLANKS, Items.IRON_INGOT, "has_oak_log", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.SPRUCE_TABLE_SAW, 1, Blocks.SPRUCE_LOG, Blocks.SPRUCE_PLANKS, Items.IRON_INGOT, "has_spruce_log", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.BIRCH_TABLE_SAW, 1, Blocks.BIRCH_LOG, Blocks.BIRCH_PLANKS, Items.IRON_INGOT, "has_birch_log", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.JUNGLE_TABLE_SAW, 1, Blocks.JUNGLE_LOG, Blocks.JUNGLE_PLANKS, Items.IRON_INGOT, "has_jungle_log", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.ACACIA_TABLE_SAW, 1, Blocks.ACACIA_LOG, Blocks.ACACIA_PLANKS, Items.IRON_INGOT, "has_acacia_log", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.DARK_OAK_TABLE_SAW, 1, Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_PLANKS, Items.IRON_INGOT, "has_dark_oak_log", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.MANGROVE_TABLE_SAW, 1, Blocks.MANGROVE_LOG, Blocks.MANGROVE_PLANKS, Items.IRON_INGOT, "has_mangrove_log", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.CHERRY_TABLE_SAW, 1, Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS, Items.IRON_INGOT, "has_cherry_log", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.BAMBOO_TABLE_SAW, 1, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_PLANKS, Items.IRON_INGOT, "has_bamboo_block", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.CRIMSON_TABLE_SAW, 1, Blocks.CRIMSON_STEM, Blocks.CRIMSON_PLANKS, Items.GOLD_INGOT, "has_crimson_stem", "has_iron_ingot", exporter);
        offerTableSawBlockRecipe(RecipeCategory.MISC, ModBlocks.WARPED_TABLE_SAW, 1, Blocks.WARPED_STEM, Blocks.WARPED_PLANKS, Items.GOLD_INGOT, "has_warped_stem", "has_iron_ingot", exporter);

        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.OAK_LOG, "has_oak_log", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.SPRUCE_LOG, "has_spruce_log", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.BIRCH_LOG, "has_birch_log", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.JUNGLE_LOG, "has_jungle_log", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.ACACIA_LOG, "has_acacia_log", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.DARK_OAK_LOG, "has_dark_oak_log", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.MANGROVE_LOG, "has_mangrove_log", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.CHERRY_LOG, "has_cherry_log", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.BAMBOO_BLOCK, "has_bamboo_block", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.CRIMSON_STEM, "has_crimson_stem", exporter);
        offerCrossRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_FRAMEWORK, 8, Block.getBlockFromItem(Items.STRING), Blocks.WARPED_STEM, "has_warped_stem", exporter);

        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS, 16, Blocks.OAK_PLANKS, "has_oak_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS, 16, Blocks.SPRUCE_PLANKS, "has_spruce_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS, 16, Blocks.BIRCH_PLANKS, "has_birch_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS, 16, Blocks.JUNGLE_PLANKS, "has_jungle_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS, 16, Blocks.ACACIA_PLANKS, "has_acacia_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS, 16, Blocks.DARK_OAK_PLANKS, "has_dark_oak_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS, 16, Blocks.MANGROVE_PLANKS, "has_mangrove_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS, 16, Blocks.CHERRY_PLANKS, "has_cherry_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS, 16, Blocks.BAMBOO_BLOCK, "has_bamboo_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS, 16, Blocks.CRIMSON_PLANKS, "has_crimson_planks", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS, 16, Blocks.WARPED_PLANKS, "has_warped_planks", exporter);

        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS, 16, Blocks.OAK_LOG, "has_oak_log", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS, 16, Blocks.SPRUCE_LOG, "has_spruce_log", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS, 16, Blocks.BIRCH_LOG, "has_birch_log", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS, 16, Blocks.JUNGLE_LOG, "has_jungle_log", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS, 16, Blocks.ACACIA_LOG, "has_acacia_log", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS, 16, Blocks.DARK_OAK_LOG, "has_dark_oak_log", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS, 16, Blocks.MANGROVE_LOG, "has_mangrove_log", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS, 16, Blocks.CHERRY_LOG, "has_cherry_log", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS, 16, Blocks.BAMBOO_BLOCK, "has_bamboo_block", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS, 16, Blocks.CRIMSON_STEM, "has_crimson_stem", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS, 16, Blocks.WARPED_STEM, "has_warped_stem", exporter);

        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS, 16, Blocks.OAK_LEAVES, "has_oak_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS, 16, Blocks.SPRUCE_LEAVES, "has_spruce_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS, 16, Blocks.BIRCH_LEAVES, "has_birch_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS, 16, Blocks.JUNGLE_LEAVES, "has_jungle_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS, 16, Blocks.ACACIA_LEAVES, "has_acacia_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS, 16, Blocks.DARK_OAK_LEAVES, "has_dark_oak_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS, 16, Blocks.MANGROVE_LEAVES, "has_mangrove_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_CHERRY_LEAF_VENEERS, 16, Blocks.CHERRY_LEAVES, "has_cherry_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_AZALEA_LEAF_VENEERS, 16, Blocks.AZALEA_LEAVES, "has_azalea_leaves", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS, 16, Blocks.FLOWERING_AZALEA_LEAVES, "has_flowering_azalea_leaves", exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS, 16)
                .input(Character.valueOf('B'), Items.BAMBOO)
                .input(Character.valueOf('L'), Items.STRING)
                .pattern("BLB")
                .pattern("LBL")
                .pattern("BLB")
                .criterion("has_bamboo", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.BAMBOO)).offerTo(exporter);

        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_NETHER_WART_VENEERS, 16, Blocks.NETHER_WART_BLOCK, "has_nether_wart_block", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_WARPED_WART_VENEERS, 16, Blocks.WARPED_WART_BLOCK, "has_warped_wart_block", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_MOSS_VENEERS, 16, Blocks.MOSS_BLOCK, "has_moss_block", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_GRASS_VENEERS, 16, Blocks.GRASS_BLOCK, "has_moss_block", exporter);

        
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_PLANK_WALL, Blocks.OAK_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_PLANK_WALL, Blocks.SPRUCE_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_PLANK_WALL, Blocks.BIRCH_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_PLANK_WALL, Blocks.JUNGLE_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_PLANK_WALL, Blocks.ACACIA_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_PLANK_WALL, Blocks.DARK_OAK_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_PLANK_WALL, Blocks.MANGROVE_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_PLANK_WALL, Blocks.CHERRY_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_PLANK_WALL, Blocks.BAMBOO_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_PLANK_WALL, Blocks.CRIMSON_PLANKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_PLANK_WALL, Blocks.WARPED_PLANKS);
        
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_WALL, Blocks.OAK_LOG);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_WALL, Blocks.SPRUCE_LOG);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_WALL, Blocks.BIRCH_LOG);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_WALL, Blocks.JUNGLE_LOG);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_WALL, Blocks.ACACIA_LOG);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_WALL, Blocks.DARK_OAK_LOG);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_WALL, Blocks.MANGROVE_LOG);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_WALL, Blocks.CHERRY_LOG);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_STEM_WALL, Blocks.BAMBOO_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_WALL, Blocks.CRIMSON_STEM);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_WALL, Blocks.WARPED_STEM);
        

        offerFenceRecipe(Blocks.OAK_LOG, ModBlocks.OAK_WOOD_FENCE, "has_oak_log", exporter);
        offerFenceRecipe(Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_WOOD_FENCE, "has_spruce_log", exporter);
        offerFenceRecipe(Blocks.BIRCH_LOG, ModBlocks.BIRCH_WOOD_FENCE, "has_birch_log", exporter);
        offerFenceRecipe(Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_WOOD_FENCE, "has_jungle_log", exporter);
        offerFenceRecipe(Blocks.ACACIA_LOG, ModBlocks.ACACIA_WOOD_FENCE, "has_acacia_log", exporter);
        offerFenceRecipe(Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_WOOD_FENCE, "has_dark_oak_log", exporter);
        offerFenceRecipe(Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_WOOD_FENCE, "has_mangrove_log", exporter);
        offerFenceRecipe(Blocks.CHERRY_LOG, ModBlocks.CHERRY_WOOD_FENCE, "has_cherry_log", exporter);
        offerFenceRecipe(Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_STEM_FENCE, "has_bamboo_block", exporter);
        offerFenceRecipe(Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_HYPHAE_FENCE, "has_crimson_stem", exporter);
        offerFenceRecipe(Blocks.WARPED_STEM, ModBlocks.WARPED_HYPHAE_FENCE, "has_warped_stem", exporter);
        
        offerFenceGateRecipe(Blocks.OAK_LOG, ModBlocks.OAK_WOOD_FENCE_GATE, "has_oak_log", exporter);
        offerFenceGateRecipe(Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_WOOD_FENCE_GATE, "has_spruce_log", exporter);
        offerFenceGateRecipe(Blocks.BIRCH_LOG, ModBlocks.BIRCH_WOOD_FENCE_GATE, "has_birch_log", exporter);
        offerFenceGateRecipe(Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_WOOD_FENCE_GATE, "has_jungle_log", exporter);
        offerFenceGateRecipe(Blocks.ACACIA_LOG, ModBlocks.ACACIA_WOOD_FENCE_GATE, "has_acacia_log", exporter);
        offerFenceGateRecipe(Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_WOOD_FENCE_GATE, "has_dark_oak_log", exporter);
        offerFenceGateRecipe(Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_WOOD_FENCE_GATE, "has_mangrove_log", exporter);
        offerFenceGateRecipe(Blocks.CHERRY_LOG, ModBlocks.CHERRY_WOOD_FENCE_GATE, "has_cherry_log", exporter);
        offerFenceGateRecipe(Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_STEM_FENCE_GATE, "has_bamboo_block", exporter);
        offerFenceGateRecipe(Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, "has_crimson_stem", exporter);
        offerFenceGateRecipe(Blocks.WARPED_STEM, ModBlocks.WARPED_HYPHAE_FENCE_GATE, "has_warped_stem", exporter);

        offerStairsRecipe(Blocks.OAK_LOG, ModBlocks.OAK_WOOD_STAIRS, "has_oak_log", exporter);
        offerStairsRecipe(Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_WOOD_STAIRS, "has_spruce_log", exporter);
        offerStairsRecipe(Blocks.BIRCH_LOG, ModBlocks.BIRCH_WOOD_STAIRS, "has_birch_log", exporter);
        offerStairsRecipe(Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_WOOD_STAIRS, "has_jungle_log", exporter);
        offerStairsRecipe(Blocks.ACACIA_LOG, ModBlocks.ACACIA_WOOD_STAIRS, "has_acacia_log", exporter);
        offerStairsRecipe(Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_WOOD_STAIRS, "has_dark_oak_log", exporter);
        offerStairsRecipe(Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_WOOD_STAIRS, "has_mangrove_log", exporter);
        offerStairsRecipe(Blocks.CHERRY_LOG, ModBlocks.CHERRY_WOOD_STAIRS, "has_cherry_log", exporter);
        offerStairsRecipe(Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_STEM_STAIRS, "has_bamboo_block", exporter);
        offerStairsRecipe(Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_HYPHAE_STAIRS, "has_crimson_stem", exporter);
        offerStairsRecipe(Blocks.WARPED_STEM, ModBlocks.WARPED_HYPHAE_STAIRS, "has_warped_stem", exporter);

        offerSlabRecipe(Blocks.OAK_LOG, ModBlocks.OAK_WOOD_SLAB, "has_oak_log", exporter);
        offerSlabRecipe(Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_WOOD_SLAB, "has_spruce_log", exporter);
        offerSlabRecipe(Blocks.BIRCH_LOG, ModBlocks.BIRCH_WOOD_SLAB, "has_birch_log", exporter);
        offerSlabRecipe(Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_WOOD_SLAB, "has_jungle_log", exporter);
        offerSlabRecipe(Blocks.ACACIA_LOG, ModBlocks.ACACIA_WOOD_SLAB, "has_acacia_log", exporter);
        offerSlabRecipe(Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_WOOD_SLAB, "has_dark_oak_log", exporter);
        offerSlabRecipe(Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_WOOD_SLAB, "has_mangrove_log", exporter);
        offerSlabRecipe(Blocks.CHERRY_LOG, ModBlocks.CHERRY_WOOD_SLAB, "has_cherry_log", exporter);
        offerSlabRecipe(Blocks.BAMBOO_BLOCK, ModBlocks.BAMBOO_STEM_SLAB, "has_bamboo_block", exporter);
        offerSlabRecipe(Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_HYPHAE_SLAB, "has_crimson_stem", exporter);
        offerSlabRecipe(Blocks.WARPED_STEM, ModBlocks.WARPED_HYPHAE_SLAB, "has_warped_stem", exporter);

        

        offerCuttingGroupRecipe(exporter, Blocks.OAK_LOG, Blocks.OAK_PLANKS,
                ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS,
                ModBlocks.OAK_WOOD_FRAMEWORK,
                ModBlocks.OAK_WOOD_STAIRS,
                ModBlocks.OAK_WOOD_SLAB,
                ModBlocks.OAK_WOOD_WALL,
                ModBlocks.OAK_WOOD_FENCE,
                ModBlocks.OAK_WOOD_FENCE_GATE,
                Blocks.OAK_PLANKS,
                ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS,
                Blocks.OAK_STAIRS,
                Blocks.OAK_SLAB,
                ModBlocks.OAK_PLANK_WALL,
                Blocks.OAK_FENCE,
                Blocks.OAK_FENCE_GATE,
                Blocks.OAK_DOOR,
                Blocks.OAK_TRAPDOOR);

        offerCuttingGroupRecipe(exporter, Blocks.SPRUCE_LOG, Blocks.SPRUCE_PLANKS,
                ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS,
                ModBlocks.SPRUCE_WOOD_FRAMEWORK,
                ModBlocks.SPRUCE_WOOD_STAIRS,
                ModBlocks.SPRUCE_WOOD_SLAB,
                ModBlocks.SPRUCE_WOOD_WALL,
                ModBlocks.SPRUCE_WOOD_FENCE,
                ModBlocks.SPRUCE_WOOD_FENCE_GATE,
                Blocks.SPRUCE_PLANKS,
                ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS,
                Blocks.SPRUCE_STAIRS,
                Blocks.SPRUCE_SLAB,
                ModBlocks.SPRUCE_PLANK_WALL,
                Blocks.SPRUCE_FENCE,
                Blocks.SPRUCE_FENCE_GATE,
                Blocks.SPRUCE_DOOR,
                Blocks.SPRUCE_TRAPDOOR);

        offerCuttingGroupRecipe(exporter, Blocks.BIRCH_LOG, Blocks.BIRCH_PLANKS,
                ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS,
                ModBlocks.BIRCH_WOOD_FRAMEWORK,
                ModBlocks.BIRCH_WOOD_STAIRS,
                ModBlocks.BIRCH_WOOD_SLAB,
                ModBlocks.BIRCH_WOOD_WALL,
                ModBlocks.BIRCH_WOOD_FENCE,
                ModBlocks.BIRCH_WOOD_FENCE_GATE,
                Blocks.BIRCH_PLANKS,
                ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS,
                Blocks.BIRCH_STAIRS,
                Blocks.BIRCH_SLAB,
                ModBlocks.BIRCH_PLANK_WALL,
                Blocks.BIRCH_FENCE,
                Blocks.BIRCH_FENCE_GATE,
                Blocks.BIRCH_DOOR,
                Blocks.BIRCH_TRAPDOOR);

        offerCuttingGroupRecipe(exporter, Blocks.JUNGLE_LOG, Blocks.JUNGLE_PLANKS,
                ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS,
                ModBlocks.JUNGLE_WOOD_FRAMEWORK,
                ModBlocks.JUNGLE_WOOD_STAIRS,
                ModBlocks.JUNGLE_WOOD_SLAB,
                ModBlocks.JUNGLE_WOOD_WALL,
                ModBlocks.JUNGLE_WOOD_FENCE,
                ModBlocks.JUNGLE_WOOD_FENCE_GATE,
                Blocks.JUNGLE_PLANKS,
                ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS,
                Blocks.JUNGLE_STAIRS,
                Blocks.JUNGLE_SLAB,
                ModBlocks.JUNGLE_PLANK_WALL,
                Blocks.JUNGLE_FENCE,
                Blocks.JUNGLE_FENCE_GATE,
                Blocks.JUNGLE_DOOR,
                Blocks.JUNGLE_TRAPDOOR);

        offerCuttingGroupRecipe(exporter, Blocks.ACACIA_LOG, Blocks.ACACIA_PLANKS,
                ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS,
                ModBlocks.ACACIA_WOOD_FRAMEWORK,
                ModBlocks.ACACIA_WOOD_STAIRS,
                ModBlocks.ACACIA_WOOD_SLAB,
                ModBlocks.ACACIA_WOOD_WALL,
                ModBlocks.ACACIA_WOOD_FENCE,
                ModBlocks.ACACIA_WOOD_FENCE_GATE,
                Blocks.ACACIA_PLANKS,
                ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS,
                Blocks.ACACIA_STAIRS,
                Blocks.ACACIA_SLAB,
                ModBlocks.ACACIA_PLANK_WALL,
                Blocks.ACACIA_FENCE,
                Blocks.ACACIA_FENCE_GATE,
                Blocks.ACACIA_DOOR,
                Blocks.ACACIA_TRAPDOOR);

        offerCuttingGroupRecipe(exporter, Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_PLANKS,
                ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS,
                ModBlocks.DARK_OAK_WOOD_FRAMEWORK,
                ModBlocks.DARK_OAK_WOOD_STAIRS,
                ModBlocks.DARK_OAK_WOOD_SLAB,
                ModBlocks.DARK_OAK_WOOD_WALL,
                ModBlocks.DARK_OAK_WOOD_FENCE,
                ModBlocks.DARK_OAK_WOOD_FENCE_GATE,
                Blocks.DARK_OAK_PLANKS,
                ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS,
                Blocks.DARK_OAK_STAIRS,
                Blocks.DARK_OAK_SLAB,
                ModBlocks.DARK_OAK_PLANK_WALL,
                Blocks.DARK_OAK_FENCE,
                Blocks.DARK_OAK_FENCE_GATE,
                Blocks.DARK_OAK_DOOR,
                Blocks.DARK_OAK_TRAPDOOR);
        
        offerCuttingGroupRecipe(exporter, Blocks.MANGROVE_LOG, Blocks.MANGROVE_PLANKS,
                ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS,
                ModBlocks.MANGROVE_WOOD_FRAMEWORK,
                ModBlocks.MANGROVE_WOOD_STAIRS,
                ModBlocks.MANGROVE_WOOD_SLAB,
                ModBlocks.MANGROVE_WOOD_WALL,
                ModBlocks.MANGROVE_WOOD_FENCE,
                ModBlocks.MANGROVE_WOOD_FENCE_GATE,
                Blocks.MANGROVE_PLANKS,
                ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS,
                Blocks.MANGROVE_STAIRS,
                Blocks.MANGROVE_SLAB,
                ModBlocks.MANGROVE_PLANK_WALL,
                Blocks.MANGROVE_FENCE,
                Blocks.MANGROVE_FENCE_GATE,
                Blocks.MANGROVE_DOOR,
                Blocks.MANGROVE_TRAPDOOR);
        
        offerCuttingGroupRecipe(exporter, Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS,
                ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS,
                ModBlocks.CHERRY_WOOD_FRAMEWORK,
                ModBlocks.CHERRY_WOOD_STAIRS,
                ModBlocks.CHERRY_WOOD_SLAB,
                ModBlocks.CHERRY_WOOD_WALL,
                ModBlocks.CHERRY_WOOD_FENCE,
                ModBlocks.CHERRY_WOOD_FENCE_GATE,
                Blocks.CHERRY_PLANKS,
                ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS,
                Blocks.CHERRY_STAIRS,
                Blocks.CHERRY_SLAB,
                ModBlocks.CHERRY_PLANK_WALL,
                Blocks.CHERRY_FENCE,
                Blocks.CHERRY_FENCE_GATE,
                Blocks.CHERRY_DOOR,
                Blocks.CHERRY_TRAPDOOR);
        
        offerCuttingGroupRecipe(exporter, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_PLANKS,
                ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS,
                ModBlocks.BAMBOO_FRAMEWORK,
                ModBlocks.BAMBOO_STEM_STAIRS,
                ModBlocks.BAMBOO_STEM_SLAB,
                ModBlocks.BAMBOO_STEM_WALL,
                ModBlocks.BAMBOO_STEM_FENCE,
                ModBlocks.BAMBOO_STEM_FENCE_GATE,
                Blocks.BAMBOO_PLANKS,
                ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS,
                Blocks.BAMBOO_STAIRS,
                Blocks.BAMBOO_SLAB,
                ModBlocks.BAMBOO_PLANK_WALL,
                Blocks.BAMBOO_FENCE,
                Blocks.BAMBOO_FENCE_GATE,
                Blocks.BAMBOO_DOOR,
                Blocks.BAMBOO_TRAPDOOR);

        offerCuttingGroupRecipe(exporter, Blocks.CRIMSON_STEM, Blocks.CRIMSON_PLANKS,
                ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS,
                ModBlocks.CRIMSON_HYPHAE_FRAMEWORK,
                ModBlocks.CRIMSON_HYPHAE_STAIRS,
                ModBlocks.CRIMSON_HYPHAE_SLAB,
                ModBlocks.CRIMSON_HYPHAE_WALL,
                ModBlocks.CRIMSON_HYPHAE_FENCE,
                ModBlocks.CRIMSON_HYPHAE_FENCE_GATE,
                Blocks.CRIMSON_PLANKS,
                ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS,
                Blocks.CRIMSON_STAIRS,
                Blocks.CRIMSON_SLAB,
                ModBlocks.CRIMSON_PLANK_WALL,
                Blocks.CRIMSON_FENCE,
                Blocks.CRIMSON_FENCE_GATE,
                Blocks.CRIMSON_DOOR,
                Blocks.CRIMSON_TRAPDOOR);
        
        offerCuttingGroupRecipe(exporter, Blocks.WARPED_STEM, Blocks.WARPED_PLANKS,
                ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS,
                ModBlocks.WARPED_HYPHAE_FRAMEWORK,
                ModBlocks.WARPED_HYPHAE_STAIRS,
                ModBlocks.WARPED_HYPHAE_SLAB,
                ModBlocks.WARPED_HYPHAE_WALL,
                ModBlocks.WARPED_HYPHAE_FENCE,
                ModBlocks.WARPED_HYPHAE_FENCE_GATE,
                Blocks.WARPED_PLANKS,
                ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS,
                Blocks.WARPED_STAIRS,
                Blocks.WARPED_SLAB,
                ModBlocks.WARPED_PLANK_WALL,
                Blocks.WARPED_FENCE,
                Blocks.WARPED_FENCE_GATE,
                Blocks.WARPED_DOOR,
                Blocks.WARPED_TRAPDOOR);

        

        offerChandelierRecipe(Items.CANDLE, ModBlocks.CHANDELIER, exporter);
        offerChandelierRecipe(Items.WHITE_CANDLE, ModBlocks.WHITE_CHANDELIER, exporter);
        offerChandelierRecipe(Items.LIGHT_GRAY_CANDLE, ModBlocks.LIGHT_GRAY_CHANDELIER, exporter);
        offerChandelierRecipe(Items.GRAY_CANDLE, ModBlocks.GRAY_CHANDELIER, exporter);
        offerChandelierRecipe(Items.BLACK_CANDLE, ModBlocks.BLACK_CHANDELIER, exporter);
        offerChandelierRecipe(Items.BROWN_CANDLE, ModBlocks.BROWN_CHANDELIER, exporter);
        offerChandelierRecipe(Items.RED_CANDLE, ModBlocks.RED_CHANDELIER, exporter);
        offerChandelierRecipe(Items.ORANGE_CANDLE, ModBlocks.ORANGE_CHANDELIER, exporter);
        offerChandelierRecipe(Items.YELLOW_CANDLE, ModBlocks.YELLOW_CHANDELIER, exporter);
        offerChandelierRecipe(Items.LIME_CANDLE, ModBlocks.LIME_CHANDELIER, exporter);
        offerChandelierRecipe(Items.GREEN_CANDLE, ModBlocks.GREEN_CHANDELIER, exporter);
        offerChandelierRecipe(Items.CYAN_CANDLE, ModBlocks.CYAN_CHANDELIER, exporter);
        offerChandelierRecipe(Items.LIGHT_BLUE_CANDLE, ModBlocks.LIGHT_BLUE_CHANDELIER, exporter);
        offerChandelierRecipe(Items.BLUE_CANDLE, ModBlocks.BLUE_CHANDELIER, exporter);
        offerChandelierRecipe(Items.PURPLE_CANDLE, ModBlocks.PURPLE_CHANDELIER, exporter);
        offerChandelierRecipe(Items.MAGENTA_CANDLE, ModBlocks.MAGENTA_CHANDELIER, exporter);
        offerChandelierRecipe(Items.PINK_CANDLE, ModBlocks.PINK_CHANDELIER, exporter);

        

        offerChainRecipe(Items.CHAIN, Items.IRON_NUGGET, ModBlocks.GRAND_CHAIN, 1, "has_chain", exporter);
        offerChainRecipe(ModBlocks.GRAND_CHAIN, Items.IRON_INGOT, ModBlocks.COLOSSAL_CHAIN, 1, "has_grand_chain", exporter);
        offerChainRecipe(Items.GOLD_INGOT, Items.GOLD_NUGGET, ModBlocks.GOLDEN_CHAIN, 1, "has_gold_ingot", exporter);
        offerChainRecipe(ModBlocks.GOLDEN_CHAIN, Items.GOLD_NUGGET, ModBlocks.GOLDEN_GRAND_CHAIN, 1, "has_golden_chain", exporter);
        offerChainRecipe(ModBlocks.GOLDEN_GRAND_CHAIN, Items.GOLD_INGOT, ModBlocks.GOLDEN_COLOSSAL_CHAIN, 1, "has_golden_grand_chain", exporter);

    }



    private void offerStairsRecipe(ItemConvertible input, ItemConvertible output, String criterion, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input(Character.valueOf('#'), input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(criterion, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }

    private void offerSlabRecipe(ItemConvertible input, ItemConvertible output, String criterion, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .input(Character.valueOf('#'), input)
                .pattern("   ")
                .pattern("   ")
                .pattern("###")
                .criterion(criterion, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }

    private void offerFenceRecipe(ItemConvertible inputWood, ItemConvertible output, String criterion, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .input(Character.valueOf('#'), Items.STICK)
                .input(Character.valueOf('@'), inputWood)
                .pattern("   ")
                .pattern("@#@")
                .pattern("@#@")
                .criterion(criterion, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(inputWood)).offerTo(exporter);
    }

    private void offerFenceGateRecipe(ItemConvertible inputWood, ItemConvertible output, String criterion, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .input(Character.valueOf('#'), Items.STICK)
                .input(Character.valueOf('@'), inputWood)
                .pattern("   ")
                .pattern("#@#")
                .pattern("#@#")
                .criterion(criterion, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(inputWood)).offerTo(exporter);
    }

    private void offerChandelierRecipe(ItemConvertible inputCandle, ItemConvertible output, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 1)
                .input(Character.valueOf('#'), Items.IRON_INGOT)
                .input(Character.valueOf('*'), Items.IRON_NUGGET)
                .input(Character.valueOf('@'), inputCandle)
                .pattern(" * ")
                .pattern("@#@")
                .pattern("#*#")
                .criterion("has_candle", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(inputCandle))
                .criterion("has_iron_ingot", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
    }


    private void offerCuttingGroupRecipe(RecipeExporter exporter, ItemConvertible inputLog, ItemConvertible inputPlanks,
                                         ItemConvertible outputLogVeneers,
                                         ItemConvertible outputFramework, 
                                         ItemConvertible outputLogStairs,
                                         ItemConvertible outputLogSlabs,
                                         ItemConvertible outputLogWalls,
                                         ItemConvertible outputLogFence,
                                         ItemConvertible outputLogFenceGate,
                                         ItemConvertible outputPlanks, 
                                         ItemConvertible outputPlankVeneers, 
                                         ItemConvertible outputStairs, 
                                         ItemConvertible outputSlabs, 
                                         ItemConvertible outputPlankWalls,
                                         ItemConvertible outputFence, 
                                         ItemConvertible outputFenceGate, 
                                         ItemConvertible outputDoor, 
                                         ItemConvertible outputTrapdoor) {
        // Input: LOG
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputLogVeneers, inputLog, 4); // Log Veneers
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputFramework, inputLog, 4); // Framework
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputLogStairs, inputLog, 1); // Log Stairs
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputLogSlabs, inputLog, 2); // Log Slabs
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputLogWalls, inputLog, 1); // Log Walls
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputLogFence, inputLog, 1); // Log Fence
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputLogFenceGate, inputLog, 1); // Log Fence Gate
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputPlanks, inputLog, 4); // Planks
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputPlankVeneers, inputLog, 16); // Plank Veneers
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputStairs, inputLog, 4); // Stairs
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputSlabs, inputLog, 8); // Slabs
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputPlankWalls, inputLog, 4); // Walls
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputFence, inputLog, 4); // Fence
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputFenceGate, inputLog, 4); // Fence Gates
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputDoor, inputLog, 2); // Door
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputTrapdoor, inputLog, 2); // Trapdoor
        // Input: PLANKS
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputPlankVeneers, inputPlanks, 4); // Plank Veneers
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputStairs, inputPlanks, 1); // Stairs
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputSlabs, inputPlanks, 2); // Slabs
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputPlankWalls, inputPlanks, 1); // Walls
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputFence, inputPlanks, 1); // Fence
        offerCuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, outputFenceGate, inputPlanks, 1); // Fence Gates
    }




    public static void offerCuttingRecipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input, int count) {
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(input), category, output, count).criterion(RecipeProvider.hasItem(input), (AdvancementCriterion)RecipeProvider.conditionsFromItem(input)).offerTo(exporter, RecipeProvider.convertBetween(output, input) + "_stonecutting");
    }

    private void offerChainRecipe(ItemConvertible inputMiddle, ItemConvertible inputTopBottom, ItemConvertible output, int amount, String criterion, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, amount)
                .input(Character.valueOf('@'), inputMiddle)
                .input(Character.valueOf('#'), inputTopBottom)
                .pattern("#")
                .pattern("@")
                .pattern("#")
                .criterion(criterion, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(inputMiddle)).offerTo(exporter);
    }

    private void offerEcoFriendlyWoodVeneersRecipe(RecipeCategory category, Block output, int count, Block input, String criterion, RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(category, (ItemConvertible) output, count)
                .input(Character.valueOf('#'), (ItemConvertible) input)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .criterion(criterion, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem((ItemConvertible) input)).offerTo(exporter);
    }

    private void offerCrossRecipe(RecipeCategory category, Block output, int count, Block inputCross, Block inputX, String criterion, RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(category, (ItemConvertible) output, count)
                .input(Character.valueOf('#'), (ItemConvertible) inputCross)
                .input(Character.valueOf('*'), (ItemConvertible) inputX)
                .pattern("#*#")
                .pattern("*#*")
                .pattern("#*#")
                .criterion(criterion, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem((ItemConvertible) inputX)).offerTo(exporter);
    }

    private void offerTableSawBlockRecipe(RecipeCategory category, Block output, int count, Block inputLog, Block inputPlanks, Item inputSaw, String criterion1, String criterion2, RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(category, (ItemConvertible) output, count)
                .input(Character.valueOf('#'), (ItemConvertible) inputLog)
                .input(Character.valueOf('*'), (ItemConvertible) inputPlanks)
                .input(Character.valueOf('@'), (ItemConvertible) inputSaw)
                .pattern("*@*")
                .pattern("# #")
                .pattern("# #")
                .criterion(criterion1, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem((ItemConvertible) inputLog))
                .criterion(criterion2, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem((ItemConvertible) inputSaw)).offerTo(exporter);
    }

    private void offerLayerRecipe(RecipeCategory category, Block output, int count, Block input, String criterion, RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(category, (ItemConvertible) output, count)
                .input(Character.valueOf('#'), (ItemConvertible) input)
                .pattern("   ")
                .pattern("   ")
                .pattern("###")
                .criterion(criterion, (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem((ItemConvertible) input)).offerTo(exporter);
    }




}
