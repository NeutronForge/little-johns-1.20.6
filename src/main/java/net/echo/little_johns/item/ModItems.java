package net.echo.little_johns.item;

import net.echo.little_johns.LittleJohns;
import net.echo.little_johns.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BORROWED_SCREWS = registerItem("borrowed_screws",
            new Item(new Item.Settings()));




    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.BORROWED_SCREWS);
    }
    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE);

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
    }
    private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL);
        entries.add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE);

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
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LittleJohns.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LittleJohns.LOGGER.info("Registering mod items for " + LittleJohns.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksItemGroup);
    }
}
