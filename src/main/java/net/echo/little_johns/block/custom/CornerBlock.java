package net.echo.little_johns.block.custom;

import com.mojang.serialization.MapCodec;
import net.echo.little_johns.block.enums.CornerType;
import net.echo.little_johns.state.property.ModProperties;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.IntStream;

public class CornerBlock
        extends Block
        implements Waterloggable {
    public static final MapCodec<CornerBlock> CODEC = CornerBlock.createCodec(CornerBlock::new);

    public static final EnumProperty<CornerType> TYPE = ModProperties.CORNER_TYPE;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;


    protected static final VoxelShape NORTH_WEST_CORNER_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 8.0);
    protected static final VoxelShape NORTH_EAST_CORNER_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 8.0, 16.0, 8.0);
    protected static final VoxelShape SOUTH_WEST_CORNER_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 8.0, 16.0, 8.0);
    protected static final VoxelShape SOUTH_EAST_CORNER_SHAPE = Block.createCuboidShape(8.0, 0.0, 8.0, 8.0, 16.0, 8.0);

    public MapCodec<? extends CornerBlock> getCodec() {
        return CODEC;
    }


    private static VoxelShape[] composeShapes(VoxelShape base, VoxelShape northWest, VoxelShape northEast, VoxelShape southWest, VoxelShape southEast) {
        return (VoxelShape[]) IntStream.range(0, 16).mapToObj(i -> CornerBlock.composeShape(i, base, northWest, northEast, southWest, southEast)).toArray(VoxelShape[]::new);
    }

    private static VoxelShape composeShape(int i, VoxelShape base, VoxelShape northWest, VoxelShape northEast, VoxelShape southWest, VoxelShape southEast) {
        VoxelShape voxelShape = base;
        if ((i & 1) != 0) {
            voxelShape = VoxelShapes.union(voxelShape, northWest);
        }
        if ((i & 2) != 0) {
            voxelShape = VoxelShapes.union(voxelShape, northEast);
        }
        if ((i & 4) != 0) {
            voxelShape = VoxelShapes.union(voxelShape, southWest);
        }
        if ((i & 8) != 0) {
            voxelShape = VoxelShapes.union(voxelShape, southEast);
        }
        return voxelShape;
    }



    public CornerBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.getDefaultState().with(TYPE, CornerType.NORT_WEST)).with(WATERLOGGED, false));
    }


    @Override
    protected boolean hasSidedTransparency(BlockState state) {
        return state.get(TYPE) != CornerType.FULL;
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }


/*
    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        CornerType cornerType = state.get(TYPE);


        switch (cornerType) {
            case FULL -> { return VoxelShapes.fullCube(); }

            case NORT_WEST -> { return ; }
            case NORTH_EAST -> { return ; }
            case SOUTH_WEST -> { return ; }
            case SOUTH_EAST -> { return ; }

            case NORTH -> { return ; }
            case SOUTH -> { return ; }
            case WEST -> { return ; }
            case EAST -> { return ; }

            case NORTH_WEST_SOUTH_EAST -> { return ; }
            case NORTH_EAST_SOUTH_WEST -> { return ; }



        }




        switch (cornerType) {
            case DOUBLE: {
                return VoxelShapes.fullCube();
            }
            case TOP: {
                return TOP_SHAPE;
            }
        }
        return BOTTOM_SHAPE;
    }
*/


}
