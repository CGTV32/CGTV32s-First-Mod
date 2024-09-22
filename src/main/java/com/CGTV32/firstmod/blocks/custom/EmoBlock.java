package com.CGTV32.firstmod.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class EmoBlock extends Block {

    public EmoBlock(Properties properties) {
        super(properties);
    }

    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity){
        if(!pLevel.isClientSide && pEntity instanceof LivingEntity) {
            ((LivingEntity) pEntity).addEffect(new MobEffectInstance(MobEffects.WITHER));
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
