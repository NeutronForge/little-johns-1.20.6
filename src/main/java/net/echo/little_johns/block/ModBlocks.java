package net.echo.little_johns.block;

import net.echo.little_johns.LittleJohns;
import net.echo.little_johns.block.custom.*;
import net.echo.little_johns.block.custom.EcoFriendlyWoodVeneersBlock;
import net.echo.little_johns.sound.ModBlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
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
    public static final Block GALVANIZED_SQUARE_STEEL_STAIRS = registerBlock("galvanized_square_steel_stairs",
            new StairsBlock(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));
    public static final Block GALVANIZED_SQUARE_STEEL_SLAB = registerBlock("galvanized_square_steel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)));
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


    // FENCES
    public static final Block OAK_WOOD_FENCE = registerBlock("oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)));
    public static final Block BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD)));
    public static final Block JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));
    public static final Block ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD)));
    public static final Block DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));
    public static final Block MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD)));
    public static final Block CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block BAMBOO_STEM_FENCE = registerBlock("bamboo_stem_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)));

    // FENCE GATES
    public static final Block OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)));
    public static final Block BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD)));
    public static final Block JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));
    public static final Block ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD)));
    public static final Block DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));
    public static final Block MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate",
            new FenceGateBlock(WoodType.MANGROVE, FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD)));
    public static final Block CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block BAMBOO_STEM_FENCE_GATE = registerBlock("bamboo_stem_fence_gate",
            new FenceGateBlock(WoodType.BAMBOO, FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_HYPHAE_FENCE_GATE = registerBlock("crimson_hyphae_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block WARPED_HYPHAE_FENCE_GATE = registerBlock("warped_hyphae_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)));



    // WALLS
    public static final Block OAK_WOOD_WALL = registerBlock("oak_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)));
    public static final Block BIRCH_WOOD_WALL = registerBlock("birch_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD)));
    public static final Block JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));
    public static final Block ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD)));
    public static final Block DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));
    public static final Block MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD)));
    public static final Block CHERRY_WOOD_WALL = registerBlock("cherry_wood_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block BAMBOO_STEM_WALL = registerBlock("bamboo_stem_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_HYPHAE_WALL = registerBlock("crimson_hyphae_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block WARPED_HYPHAE_WALL = registerBlock("warped_hyphae_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)));


    public static final Block OAK_PLANK_WALL = registerBlock("oak_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_PLANK_WALL = registerBlock("spruce_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_PLANK_WALL = registerBlock("birch_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_PLANK_WALL = registerBlock("jungle_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_PLANK_WALL = registerBlock("acacia_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_PLANK_WALL = registerBlock("dark_oak_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_PLANK_WALL = registerBlock("mangrove_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_PLANK_WALL = registerBlock("cherry_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block BAMBOO_PLANK_WALL = registerBlock("bamboo_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_PLANK_WALL = registerBlock("crimson_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_PLANK_WALL = registerBlock("warped_plank_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));


    // SLABS
    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)));
    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD)));
    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));
    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD)));
    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));
    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD)));
    public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block BAMBOO_STEM_SLAB = registerBlock("bamboo_wood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)));

    // STAIRS
    public static final Block OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs",
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs",
            new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)));
    public static final Block BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs",
            new StairsBlock(Blocks.BIRCH_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD)));
    public static final Block JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs",
            new StairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));
    public static final Block ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs",
            new StairsBlock(Blocks.ACACIA_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD)));
    public static final Block DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs",
            new StairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));
    public static final Block MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs",
            new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MANGROVE_WOOD)));
    public static final Block CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs",
            new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block BAMBOO_STEM_STAIRS = registerBlock("bamboo_wood_stairs",
            new StairsBlock(Blocks.BAMBOO_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs",
            new StairsBlock(Blocks.CRIMSON_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs",
            new StairsBlock(Blocks.WARPED_HYPHAE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_HYPHAE)));






    // CHANDELIERS
    public static final Block CHANDELIER = registerBlock("chandelier", ModBlocks.createChandelierBlock(MapColor.PALE_YELLOW));
    public static final Block WHITE_CHANDELIER = registerBlock("white_chandelier", ModBlocks.createChandelierBlock(MapColor.WHITE_GRAY));
    public static final Block LIGHT_GRAY_CHANDELIER = registerBlock("light_gray_chandelier", ModBlocks.createChandelierBlock(MapColor.LIGHT_GRAY));
    public static final Block GRAY_CHANDELIER = registerBlock("gray_chandelier", ModBlocks.createChandelierBlock(MapColor.GRAY));
    public static final Block BLACK_CHANDELIER = registerBlock("black_chandelier", ModBlocks.createChandelierBlock(MapColor.BLACK));
    public static final Block BROWN_CHANDELIER = registerBlock("brown_chandelier", ModBlocks.createChandelierBlock(MapColor.BROWN));
    public static final Block RED_CHANDELIER = registerBlock("red_chandelier", ModBlocks.createChandelierBlock(MapColor.RED));
    public static final Block ORANGE_CHANDELIER = registerBlock("orange_chandelier", ModBlocks.createChandelierBlock(MapColor.ORANGE));
    public static final Block YELLOW_CHANDELIER = registerBlock("yellow_chandelier", ModBlocks.createChandelierBlock(MapColor.YELLOW));
    public static final Block LIME_CHANDELIER = registerBlock("lime_chandelier", ModBlocks.createChandelierBlock(MapColor.LIME));
    public static final Block GREEN_CHANDELIER = registerBlock("green_chandelier", ModBlocks.createChandelierBlock(MapColor.GREEN));
    public static final Block CYAN_CHANDELIER = registerBlock("cyan_chandelier", ModBlocks.createChandelierBlock(MapColor.CYAN));
    public static final Block LIGHT_BLUE_CHANDELIER = registerBlock("light_blue_chandelier", ModBlocks.createChandelierBlock(MapColor.LIGHT_BLUE));
    public static final Block BLUE_CHANDELIER = registerBlock("blue_chandelier", ModBlocks.createChandelierBlock(MapColor.BLUE));
    public static final Block PURPLE_CHANDELIER = registerBlock("purple_chandelier", ModBlocks.createChandelierBlock(MapColor.PURPLE));
    public static final Block MAGENTA_CHANDELIER = registerBlock("magenta_chandelier", ModBlocks.createChandelierBlock(MapColor.MAGENTA));
    public static final Block PINK_CHANDELIER = registerBlock("pink_chandelier", ModBlocks.createChandelierBlock(MapColor.PINK));



    // CHAINS
    public static final Block GRAND_CHAIN = registerBlock("grand_chain",
            new GrandChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(6.0f, 7.0f).nonOpaque().sounds(ModBlockSoundGroup.GRAND_CHAIN)));
    public static final Block COLOSSAL_CHAIN = registerBlock("colossal_chain",
            new ColossalChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(8.0f, 10.0f).nonOpaque().sounds(ModBlockSoundGroup.COLOSSAL_CHAIN)));

    public static final Block GOLDEN_CHAIN = registerBlock("golden_chain",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(5.f, 6.0f).nonOpaque()));
    public static final Block GOLDEN_GRAND_CHAIN = registerBlock("golden_grand_chain",
            new GrandChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(6.0f, 7.0f).nonOpaque().sounds(ModBlockSoundGroup.GRAND_CHAIN)));
    public static final Block GOLDEN_COLOSSAL_CHAIN = registerBlock("golden_colossal_chain",
            new ColossalChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(8.0f, 10.0f).nonOpaque().sounds(ModBlockSoundGroup.COLOSSAL_CHAIN)));





    private static Block createChandelierBlock(MapColor color) {
        return new ChandelierBlock(AbstractBlock.Settings.create().solid().requiresTool().mapColor(color).nonOpaque().strength(5.0f, 6.0f).sounds(BlockSoundGroup.CHAIN).luminance(ChandelierBlock.STATE_TO_LUMINANCE).pistonBehavior(PistonBehavior.DESTROY));
    }


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
