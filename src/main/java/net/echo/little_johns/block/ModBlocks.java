package net.echo.little_johns.block;

import net.echo.little_johns.LittleJohns;
import net.echo.little_johns.block.custom.*;
import net.echo.little_johns.block.custom.EcoFriendlyWoodVeneersBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    // TABLE SAWS
    public static final Block OAK_TABLE_SAW = registerBlock("oak_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).nonOpaque()));
    public static final Block SPRUCE_TABLE_SAW = registerBlock("spruce_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).nonOpaque()));
    public static final Block BIRCH_TABLE_SAW = registerBlock("birch_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD).nonOpaque()));
    public static final Block JUNGLE_TABLE_SAW = registerBlock("jungle_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).nonOpaque()));
    public static final Block ACACIA_TABLE_SAW = registerBlock("acacia_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD).nonOpaque()));
    public static final Block DARK_OAK_TABLE_SAW = registerBlock("dark_oak_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD).nonOpaque()));
    public static final Block MANGROVE_TABLE_SAW = registerBlock("mangrove_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD).nonOpaque()));
    public static final Block CHERRY_TABLE_SAW = registerBlock("cherry_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).nonOpaque()));
    public static final Block BAMBOO_TABLE_SAW = registerBlock("bamboo_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).nonOpaque()));
    public static final Block CRIMSON_TABLE_SAW = registerBlock("crimson_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).nonOpaque()));
    public static final Block WARPED_TABLE_SAW = registerBlock("warped_table_saw",
            new TableSawBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE).nonOpaque()));


    // GALVANIZED SQUARE STEEL
    public static final Block GALVANIZED_SQUARE_STEEL_BLOCK = registerBlock("galvanized_square_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block GALVANIZED_SQUARE_STEEL_BEAM = registerBlock("galvanized_square_steel_beam",
            new BeamBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).nonOpaque().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block GALVANIZED_SQUARE_STEEL = registerBlock("galvanized_square_steel",
            new GalvanizedSquareSteelBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block GALVANIZED_SQUARE_STEEL_GRATE = registerBlock("galvanized_square_steel_grate",
            new GalvanizedSquareSteelBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));


    // WOOD FRAMEWORK
    public static final Block OAK_WOOD_FRAMEWORK = registerBlock("oak_wood_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).nonOpaque()));
    public static final Block SPRUCE_WOOD_FRAMEWORK = registerBlock("spruce_wood_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).nonOpaque()));
    public static final Block BIRCH_WOOD_FRAMEWORK = registerBlock("birch_wood_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD).nonOpaque()));
    public static final Block JUNGLE_WOOD_FRAMEWORK = registerBlock("jungle_wood_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).nonOpaque()));
    public static final Block ACACIA_WOOD_FRAMEWORK = registerBlock("acacia_wood_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD).nonOpaque()));
    public static final Block DARK_OAK_WOOD_FRAMEWORK = registerBlock("dark_oak_wood_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD).nonOpaque()));
    public static final Block MANGROVE_WOOD_FRAMEWORK = registerBlock("mangrove_wood_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD).nonOpaque()));
    public static final Block CHERRY_WOOD_FRAMEWORK = registerBlock("cherry_wood_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).nonOpaque()));
    public static final Block BAMBOO_FRAMEWORK = registerBlock("bamboo_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).nonOpaque()));
    public static final Block CRIMSON_HYPHAE_FRAMEWORK = registerBlock("crimson_hyphae_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).nonOpaque()));
    public static final Block WARPED_HYPHAE_FRAMEWORK = registerBlock("warped_hyphae_framework",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE).nonOpaque()));


    // WOOD PLANK VENEERS
    public static final Block ECO_FRIENDLY_OAK_PLANK_VENEERS = registerBlock("eco_friendly_oak_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_SPRUCE_PLANK_VENEERS = registerBlock("eco_friendly_spruce_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_BIRCH_PLANK_VENEERS = registerBlock("eco_friendly_birch_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_JUNGLE_PLANK_VENEERS = registerBlock("eco_friendly_jungle_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_ACACIA_PLANK_VENEERS = registerBlock("eco_friendly_acacia_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS = registerBlock("eco_friendly_dark_oak_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_MANGROVE_PLANK_VENEERS = registerBlock("eco_friendly_mangrove_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_CHERRY_PLANK_VENEERS = registerBlock("eco_friendly_cherry_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_BAMBOO_PLANK_VENEERS = registerBlock("eco_friendly_bamboo_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_CRIMSON_PLANK_VENEERS = registerBlock("eco_friendly_crimson_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_WARPED_PLANK_VENEERS = registerBlock("eco_friendly_warped_plank_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).nonOpaque()));


    // WOOD LOG VENEERS
    public static final Block ECO_FRIENDLY_OAK_WOOD_VENEERS = registerBlock("eco_friendly_oak_wood_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).nonOpaque()));
    public static final Block ECO_FRIENDLY_SPRUCE_WOOD_VENEERS = registerBlock("eco_friendly_spruce_wood_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).nonOpaque()));
    public static final Block ECO_FRIENDLY_BIRCH_WOOD_VENEERS = registerBlock("eco_friendly_birch_wood_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD).nonOpaque()));
    public static final Block ECO_FRIENDLY_JUNGLE_WOOD_VENEERS = registerBlock("eco_friendly_jungle_wood_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).nonOpaque()));
    public static final Block ECO_FRIENDLY_ACACIA_WOOD_VENEERS = registerBlock("eco_friendly_acacia_wood_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD).nonOpaque()));
    public static final Block ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS = registerBlock("eco_friendly_dark_oak_wood_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD).nonOpaque()));
    public static final Block ECO_FRIENDLY_MANGROVE_WOOD_VENEERS = registerBlock("eco_friendly_mangrove_wood_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD).nonOpaque()));
    public static final Block ECO_FRIENDLY_CHERRY_WOOD_VENEERS = registerBlock("eco_friendly_cherry_wood_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).nonOpaque()));
    public static final Block ECO_FRIENDLY_BAMBOO_VENEERS = registerBlock("eco_friendly_bamboo_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).nonOpaque()));
    public static final Block ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS = registerBlock("eco_friendly_crimson_hyphae_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).nonOpaque()));
    public static final Block ECO_FRIENDLY_WARPED_HYPHAE_VENEERS = registerBlock("eco_friendly_warped_hyphae_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE).nonOpaque()));


    // LEAF VENEERS
    public static final Block ECO_FRIENDLY_OAK_LEAF_VENEERS = registerBlock("eco_friendly_oak_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_SPRUCE_LEAF_VENEERS = registerBlock("eco_friendly_spruce_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_BIRCH_LEAF_VENEERS = registerBlock("eco_friendly_birch_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_JUNGLE_LEAF_VENEERS = registerBlock("eco_friendly_jungle_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_ACACIA_LEAF_VENEERS = registerBlock("eco_friendly_acacia_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS = registerBlock("eco_friendly_dark_oak_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_MANGROVE_LEAF_VENEERS = registerBlock("eco_friendly_mangrove_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_CHERRY_LEAF_VENEERS = registerBlock("eco_friendly_cherry_leaf_veneers",
            new EcoFriendlyCherryLeafVeneersBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_AZALEA_LEAF_VENEERS = registerBlock("eco_friendly_azalea_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS = registerBlock("eco_friendly_flowering_azalea_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_BAMBOO_LEAF_VENEERS = registerBlock("eco_friendly_bamboo_leaf_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).nonOpaque()));
    public static final Block ECO_FRIENDLY_NETHER_WART_VENEERS = registerBlock("eco_friendly_nether_wart_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK).nonOpaque()));
    public static final Block ECO_FRIENDLY_WARPED_WART_VENEERS = registerBlock("eco_friendly_warped_wart_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).nonOpaque()));


    // OTHER VENEERS
    public static final Block ECO_FRIENDLY_MOSS_VENEERS = registerBlock("eco_friendly_moss_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).nonOpaque()));
    public static final Block ECO_FRIENDLY_GRASS_VENEERS = registerBlock("eco_friendly_grass_veneers",
            new EcoFriendlyWoodVeneersBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).nonOpaque()));


    // LAYER BLOCKS




    // ----------------- //
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LittleJohns.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(LittleJohns.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LittleJohns.LOGGER.info("Registering ModBlocks for " + LittleJohns.MOD_ID);
    }
}
