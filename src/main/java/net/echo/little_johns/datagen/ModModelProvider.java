package net.echo.little_johns.datagen;

import net.echo.little_johns.block.ModBlocks;
import net.echo.little_johns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool galvanizedSquareSteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK);
        galvanizedSquareSteelPool.stairs(ModBlocks.GALVANIZED_SQUARE_STEEL_STAIRS);
        galvanizedSquareSteelPool.slab(ModBlocks.GALVANIZED_SQUARE_STEEL_SLAB);


        // PLANK POOLS
        BlockStateModelGenerator.BlockTexturePool oakPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OAK_PLANKS);
        oakPlanksPool.wall(ModBlocks.OAK_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool sprucePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SPRUCE_PLANKS);
        sprucePlanksPool.wall(ModBlocks.SPRUCE_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool birchPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BIRCH_PLANKS);
        birchPlanksPool.wall(ModBlocks.BIRCH_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool junglePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.JUNGLE_PLANKS);
        junglePlanksPool.wall(ModBlocks.JUNGLE_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool acaciaPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ACACIA_PLANKS);
        acaciaPlanksPool.wall(ModBlocks.ACACIA_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool darkOakPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_OAK_PLANKS);
        darkOakPlanksPool.wall(ModBlocks.DARK_OAK_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool mangrovePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MANGROVE_PLANKS);
        mangrovePlanksPool.wall(ModBlocks.MANGROVE_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool cherryPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHERRY_PLANKS);
        cherryPlanksPool.wall(ModBlocks.CHERRY_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool bambooPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_PLANKS);
        bambooPlanksPool.wall(ModBlocks.BAMBOO_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool crimsonPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRIMSON_PLANKS);
        crimsonPlanksPool.wall(ModBlocks.CRIMSON_PLANK_WALL);

        BlockStateModelGenerator.BlockTexturePool warpedPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WARPED_PLANKS);
        warpedPlanksPool.wall(ModBlocks.WARPED_PLANK_WALL);


        // WOOD POOLS
        BlockStateModelGenerator.BlockTexturePool oakWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OAK_LOG);
        oakWoodPool.wall(ModBlocks.OAK_WOOD_WALL);
        oakWoodPool.fence(ModBlocks.OAK_WOOD_FENCE);
        oakWoodPool.fenceGate(ModBlocks.OAK_WOOD_FENCE_GATE);
        oakWoodPool.slab(ModBlocks.OAK_WOOD_SLAB);
        oakWoodPool.stairs(ModBlocks.OAK_WOOD_STAIRS);

        
        
        BlockStateModelGenerator.BlockTexturePool spruceWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SPRUCE_LOG);
        spruceWoodPool.wall(ModBlocks.SPRUCE_WOOD_WALL);
        spruceWoodPool.fence(ModBlocks.SPRUCE_WOOD_FENCE);
        spruceWoodPool.fenceGate(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
        spruceWoodPool.slab(ModBlocks.SPRUCE_WOOD_SLAB);
        spruceWoodPool.stairs(ModBlocks.SPRUCE_WOOD_STAIRS);

        
        
        BlockStateModelGenerator.BlockTexturePool birchWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BIRCH_LOG);
        birchWoodPool.wall(ModBlocks.BIRCH_WOOD_WALL);
        birchWoodPool.fence(ModBlocks.BIRCH_WOOD_FENCE);
        birchWoodPool.fenceGate(ModBlocks.BIRCH_WOOD_FENCE_GATE);
        birchWoodPool.slab(ModBlocks.BIRCH_WOOD_SLAB);
        birchWoodPool.stairs(ModBlocks.BIRCH_WOOD_STAIRS);
        
        
        BlockStateModelGenerator.BlockTexturePool jungleWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.JUNGLE_LOG);
        jungleWoodPool.wall(ModBlocks.JUNGLE_WOOD_WALL);
        jungleWoodPool.fence(ModBlocks.JUNGLE_WOOD_FENCE);
        jungleWoodPool.fenceGate(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
        jungleWoodPool.slab(ModBlocks.JUNGLE_WOOD_SLAB);
        jungleWoodPool.stairs(ModBlocks.JUNGLE_WOOD_STAIRS);
        
        
        BlockStateModelGenerator.BlockTexturePool acaciaWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ACACIA_LOG);
        acaciaWoodPool.wall(ModBlocks.ACACIA_WOOD_WALL);
        acaciaWoodPool.fence(ModBlocks.ACACIA_WOOD_FENCE);
        acaciaWoodPool.fenceGate(ModBlocks.ACACIA_WOOD_FENCE_GATE);
        acaciaWoodPool.slab(ModBlocks.ACACIA_WOOD_SLAB);
        acaciaWoodPool.stairs(ModBlocks.ACACIA_WOOD_STAIRS);
        
        
        BlockStateModelGenerator.BlockTexturePool darkOakWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_OAK_LOG);
        darkOakWoodPool.wall(ModBlocks.DARK_OAK_WOOD_WALL);
        darkOakWoodPool.fence(ModBlocks.DARK_OAK_WOOD_FENCE);
        darkOakWoodPool.fenceGate(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
        darkOakWoodPool.slab(ModBlocks.DARK_OAK_WOOD_SLAB);
        darkOakWoodPool.stairs(ModBlocks.DARK_OAK_WOOD_STAIRS);
        
        
        BlockStateModelGenerator.BlockTexturePool mangroveWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MANGROVE_LOG);
        mangroveWoodPool.wall(ModBlocks.MANGROVE_WOOD_WALL);
        mangroveWoodPool.fence(ModBlocks.MANGROVE_WOOD_FENCE);
        mangroveWoodPool.fenceGate(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
        mangroveWoodPool.slab(ModBlocks.MANGROVE_WOOD_SLAB);
        mangroveWoodPool.stairs(ModBlocks.MANGROVE_WOOD_STAIRS);
        
        
        BlockStateModelGenerator.BlockTexturePool cherryWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHERRY_LOG);
        cherryWoodPool.wall(ModBlocks.CHERRY_WOOD_WALL);
        cherryWoodPool.fence(ModBlocks.CHERRY_WOOD_FENCE);
        cherryWoodPool.fenceGate(ModBlocks.CHERRY_WOOD_FENCE_GATE);
        cherryWoodPool.slab(ModBlocks.CHERRY_WOOD_SLAB);
        cherryWoodPool.stairs(ModBlocks.CHERRY_WOOD_STAIRS);
        
        
        BlockStateModelGenerator.BlockTexturePool bambooPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_BLOCK);
        bambooPool.wall(ModBlocks.BAMBOO_STEM_WALL);
        bambooPool.fence(ModBlocks.BAMBOO_STEM_FENCE);
        bambooPool.fenceGate(ModBlocks.BAMBOO_STEM_FENCE_GATE);
        bambooPool.slab(ModBlocks.BAMBOO_STEM_SLAB);
        bambooPool.stairs(ModBlocks.BAMBOO_STEM_STAIRS);
        
        
        BlockStateModelGenerator.BlockTexturePool crimsonHyphaePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRIMSON_STEM);
        crimsonHyphaePool.wall(ModBlocks.CRIMSON_HYPHAE_WALL);
        crimsonHyphaePool.fence(ModBlocks.CRIMSON_HYPHAE_FENCE);
        crimsonHyphaePool.fenceGate(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE);
        crimsonHyphaePool.slab(ModBlocks.CRIMSON_HYPHAE_SLAB);
        crimsonHyphaePool.stairs(ModBlocks.CRIMSON_HYPHAE_STAIRS);
        
        
        BlockStateModelGenerator.BlockTexturePool warpedHyphaePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WARPED_STEM);
        warpedHyphaePool.wall(ModBlocks.WARPED_HYPHAE_WALL);
        warpedHyphaePool.fence(ModBlocks.WARPED_HYPHAE_FENCE);
        warpedHyphaePool.fenceGate(ModBlocks.WARPED_HYPHAE_FENCE_GATE);
        warpedHyphaePool.slab(ModBlocks.WARPED_HYPHAE_SLAB);
        warpedHyphaePool.stairs(ModBlocks.WARPED_HYPHAE_STAIRS);





    }




    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BORROWED_SCREWS, Models.GENERATED);

        itemModelGenerator.register(ModItems.MORSMORDRE_CRAZY_DONKEY_MUSIC_DISC, Models.GENERATED);


    }



}
