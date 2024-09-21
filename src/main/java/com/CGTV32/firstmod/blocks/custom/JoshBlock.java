package com.CGTV32.firstmod.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class JoshBlock extends Block {

    public JoshBlock(Properties properties) {
        super(properties);
    }

    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity){
        if(pEntity instanceof LivingEntity) {
            pEntity.hurt(pLevel.damageSources().cramming(), 1000000);
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
