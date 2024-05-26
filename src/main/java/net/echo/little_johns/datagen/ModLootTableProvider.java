package net.echo.little_johns.datagen;

import net.echo.little_johns.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM);
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE, (Block block) -> this.multifaceGrowthDrops((Block)block, WITHOUT_SILK_TOUCH));

                addDrop(ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS);

                addDrop(ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS);
                addDrop(ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS);

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
