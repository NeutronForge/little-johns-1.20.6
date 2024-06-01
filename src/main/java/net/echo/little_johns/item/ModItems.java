package net.echo.little_johns.item;

import net.echo.little_johns.LittleJohns;
import net.echo.little_johns.block.ModBlocks;
import net.echo.little_johns.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item MORSMORDRE_CRAZY_DONKEY_MUSIC_DISC = registerItem("morsmordre_crazy_donkey_music_disc",
            new MusicDiscItem(15, ModSounds.MORSMORDRE_CRAZY_DONKEY, new Item.Settings().maxCount(1).rarity(Rarity.RARE), 218));

    public static final Item BORROWED_SCREWS = registerItem("borrowed_screws",
            new Item(new Item.Settings()));




    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.MORSMORDRE_CRAZY_DONKEY_MUSIC_DISC);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.BORROWED_SCREWS);
    }

    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries) {

        entries.add(ModBlocks.OAK_TABLE_SAW);
        entries.add(ModBlocks.SPRUCE_TABLE_SAW);
        entries.add(ModBlocks.BIRCH_TABLE_SAW);
        entries.add(ModBlocks.JUNGLE_TABLE_SAW);
        entries.add(ModBlocks.ACACIA_TABLE_SAW);
        entries.add(ModBlocks.DARK_OAK_TABLE_SAW);
        entries.add(ModBlocks.MANGROVE_TABLE_SAW);
        entries.add(ModBlocks.CHERRY_TABLE_SAW);
        entries.add(ModBlocks.BAMBOO_TABLE_SAW);
        entries.add(ModBlocks.CRIMSON_TABLE_SAW);
        entries.add(ModBlocks.WARPED_TABLE_SAW);

        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE);

        entries.add(ModBlocks.OAK_WOOD_FRAMEWORK);
        entries.add(ModBlocks.SPRUCE_WOOD_FRAMEWORK);
        entries.add(ModBlocks.BIRCH_WOOD_FRAMEWORK);
        entries.add(ModBlocks.JUNGLE_WOOD_FRAMEWORK);
        entries.add(ModBlocks.ACACIA_WOOD_FRAMEWORK);
        entries.add(ModBlocks.DARK_OAK_WOOD_FRAMEWORK);
        entries.add(ModBlocks.MANGROVE_WOOD_FRAMEWORK);
        entries.add(ModBlocks.CHERRY_WOOD_FRAMEWORK);
        entries.add(ModBlocks.BAMBOO_FRAMEWORK);
        entries.add(ModBlocks.CRIMSON_HYPHAE_FRAMEWORK);
        entries.add(ModBlocks.WARPED_HYPHAE_FRAMEWORK);

        entries.add(ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS);



        entries.add(ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CHERRY_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_AZALEA_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS);

        entries.add(ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_NETHER_WART_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_WARPED_WART_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_MOSS_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_GRASS_VENEERS);





    }
    private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE);

        entries.add(ModBlocks.OAK_WOOD_FRAMEWORK);
        entries.add(ModBlocks.SPRUCE_WOOD_FRAMEWORK);
        entries.add(ModBlocks.BIRCH_WOOD_FRAMEWORK);
        entries.add(ModBlocks.JUNGLE_WOOD_FRAMEWORK);
        entries.add(ModBlocks.ACACIA_WOOD_FRAMEWORK);
        entries.add(ModBlocks.DARK_OAK_WOOD_FRAMEWORK);
        entries.add(ModBlocks.MANGROVE_WOOD_FRAMEWORK);
        entries.add(ModBlocks.CHERRY_WOOD_FRAMEWORK);
        entries.add(ModBlocks.BAMBOO_FRAMEWORK);
        entries.add(ModBlocks.CRIMSON_HYPHAE_FRAMEWORK);
        entries.add(ModBlocks.WARPED_HYPHAE_FRAMEWORK);

        entries.add(ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS);

        entries.add(ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_CHERRY_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_AZALEA_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS);

        entries.add(ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_NETHER_WART_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_WARPED_WART_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_MOSS_VENEERS);
        entries.add(ModBlocks.ECO_FRIENDLY_GRASS_VENEERS);


    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LittleJohns.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LittleJohns.LOGGER.info("Registering mod items for " + LittleJohns.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksItemGroup);
    }
}
