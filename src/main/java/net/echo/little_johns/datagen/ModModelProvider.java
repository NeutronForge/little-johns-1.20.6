package net.echo.little_johns.datagen;

import net.echo.little_johns.block.ModBlocks;
import net.echo.little_johns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BORROWED_SCREWS, Models.GENERATED);

        itemModelGenerator.register(ModItems.MORSMORDRE_CRAZY_DONKEY_MUSIC_DISC, Models.GENERATED);


    }
}
