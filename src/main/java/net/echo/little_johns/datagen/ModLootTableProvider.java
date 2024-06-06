package net.echo.little_johns.datagen;

import net.echo.little_johns.block.ModBlocks;
import net.echo.little_johns.block.custom.LayerBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.AlternativeEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.CHANDELIER);
        addDrop(ModBlocks.WHITE_CHANDELIER);
        addDrop(ModBlocks.LIGHT_GRAY_CHANDELIER);
        addDrop(ModBlocks.GRAY_CHANDELIER);
        addDrop(ModBlocks.BLACK_CHANDELIER);
        addDrop(ModBlocks.BROWN_CHANDELIER);
        addDrop(ModBlocks.RED_CHANDELIER);
        addDrop(ModBlocks.ORANGE_CHANDELIER);
        addDrop(ModBlocks.YELLOW_CHANDELIER);
        addDrop(ModBlocks.LIME_CHANDELIER);
        addDrop(ModBlocks.GREEN_CHANDELIER);
        addDrop(ModBlocks.CYAN_CHANDELIER);
        addDrop(ModBlocks.LIGHT_BLUE_CHANDELIER);
        addDrop(ModBlocks.BLUE_CHANDELIER);
        addDrop(ModBlocks.PURPLE_CHANDELIER);
        addDrop(ModBlocks.MAGENTA_CHANDELIER);
        addDrop(ModBlocks.PINK_CHANDELIER);


        addDrop(ModBlocks.OAK_TABLE_SAW);
        addDrop(ModBlocks.SPRUCE_TABLE_SAW);
        addDrop(ModBlocks.BIRCH_TABLE_SAW);
        addDrop(ModBlocks.JUNGLE_TABLE_SAW);
        addDrop(ModBlocks.ACACIA_TABLE_SAW);
        addDrop(ModBlocks.DARK_OAK_TABLE_SAW);
        addDrop(ModBlocks.MANGROVE_TABLE_SAW);
        addDrop(ModBlocks.CHERRY_TABLE_SAW);
        addDrop(ModBlocks.BAMBOO_TABLE_SAW);
        addDrop(ModBlocks.CRIMSON_TABLE_SAW);
        addDrop(ModBlocks.WARPED_TABLE_SAW);

        addDrop(ModBlocks.GRAND_CHAIN);
        addDrop(ModBlocks.COLOSSAL_CHAIN);
        addDrop(ModBlocks.GOLDEN_CHAIN);
        addDrop(ModBlocks.GOLDEN_GRAND_CHAIN);
        addDrop(ModBlocks.GOLDEN_COLOSSAL_CHAIN);

        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM);
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));

        addDrop(ModBlocks.OAK_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.SPRUCE_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.BIRCH_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.JUNGLE_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ACACIA_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.DARK_OAK_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.MANGROVE_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.CHERRY_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.BAMBOO_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.CRIMSON_HYPHAE_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.WARPED_HYPHAE_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));

        addDrop(ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));

        addDrop(ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));


        addDrop(ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_CHERRY_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_AZALEA_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));

        addDrop(ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH_OR_SHEARS));
        addDrop(ModBlocks.ECO_FRIENDLY_NETHER_WART_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_WARPED_WART_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_MOSS_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.ECO_FRIENDLY_GRASS_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SILK_TOUCH));





    }




    public LootTable.Builder multipleOreDrops(Block drop, Item item, float min, float max) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(min, max))))
                        .apply(ApplyBonusLootFunction
                                .oreDrops(Enchantments.FORTUNE))));
    }

}
