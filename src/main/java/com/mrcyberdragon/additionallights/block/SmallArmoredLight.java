package com.mrcyberdragon.additionallights.block;

import com.mrcyberdragon.additionallights.init.ModBlockEntities;
import com.mrh0.createaddition.blocks.connector.base.AbstractConnectorBlock;
import com.mrh0.createaddition.energy.NodeRotation;
import com.mrh0.createaddition.shapes.CAShapes;
import com.simibubi.create.foundation.utility.VoxelShaper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SmallArmoredLight extends AbstractConnectorBlock<SmallArmoredLightEntity> {

    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public static final VoxelShaper CONNECTOR_SHAPE = CAShapes.shape(4, 0, 4, 12, 5, 12).add(4.5, 4, 4.5, 11.5, 11, 11.5).forDirectional();
    public SmallArmoredLight(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext c) {
        return super.getStateForPlacement(c).setValue(POWERED, false);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, MODE, NodeRotation.ROTATION, VARIANT, POWERED);
    }

    @Override
    public Class<SmallArmoredLightEntity> getBlockEntityClass() {
        return SmallArmoredLightEntity.class;
    }

    @Override
    public BlockEntityType<? extends SmallArmoredLightEntity> getBlockEntityType() {
        return ModBlockEntities.SMALL_ARMORED_LIGHT.get();
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ModBlockEntities.SMALL_ARMORED_LIGHT.create(pos, state);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return CONNECTOR_SHAPE.get(state.getValue(FACING).getOpposite());
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(POWERED) ? 15 : 0;
    }

}
