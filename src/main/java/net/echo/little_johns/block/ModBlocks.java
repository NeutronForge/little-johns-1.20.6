package net.echo.little_johns.block;

import net.echo.little_johns.LittleJohns;
import net.echo.little_johns.block.custom.BeamBlock;
import net.echo.little_johns.block.custom.EcoFriendlyWoodVeneersBlock;
import net.echo.little_johns.block.custom.GalvanizedSquareSteelBlock;
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

    public static final Block GALVANIZED_SQUARE_STEEL_BEAM = registerBlock("galvanized_square_steel_beam",
            new BeamBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).nonOpaque().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block GALVANIZED_SQUARE_STEEL = registerBlock("galvanized_square_steel",
            new GalvanizedSquareSteelBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block GALVANIZED_SQUARE_STEEL_GRATE = registerBlock("galvanized_square_steel_grate",
            new GalvanizedSquareSteelBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));


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
