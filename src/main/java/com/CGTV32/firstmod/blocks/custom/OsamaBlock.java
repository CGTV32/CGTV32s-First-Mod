package com.CGTV32.firstmod.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class OsamaBlock extends Block {

    public OsamaBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);

        // Check if the block is powered by redstone
        if (level.hasNeighborSignal(pos)) {
            // Trigger a large explosion when the block gets powered
            level.explode(null, pos.getX(), pos.getY(), pos.getZ(), 500.0F, Level.ExplosionInteraction.BLOCK);

        }
    }
}
