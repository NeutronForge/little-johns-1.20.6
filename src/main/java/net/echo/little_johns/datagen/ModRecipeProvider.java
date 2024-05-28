package net.echo.little_johns.datagen;

import net.echo.little_johns.block.ModBlocks;
import net.echo.little_johns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
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

        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_NETHER_WART_VENEERS, 16, Blocks.NETHER_WART_BLOCK, "has_nether_wart_block", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_WARPED_WART_VENEERS, 16, Blocks.WARPED_WART_BLOCK, "has_warped_wart_block", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_MOSS_VENEERS, 16, Blocks.MOSS_BLOCK, "has_moss_block", exporter);
        offerEcoFriendlyWoodVeneersRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_GRASS_VENEERS, 16, Blocks.GRASS_BLOCK, "has_moss_block", exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS, 16)
                .input(Character.valueOf('B'), Items.BAMBOO)
                .input(Character.valueOf('L'), Items.STRING)
                .pattern("BLB")
                .pattern("LBL")
                .pattern("BLB")
                .criterion("has_bamboo", (AdvancementCriterion) VanillaRecipeProvider.conditionsFromItem(Items.BAMBOO)).offerTo(exporter);



        //offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BIOTITE, );


        /*
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('R', ModItems.RUBY)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_RUBY)));

         */
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

}
