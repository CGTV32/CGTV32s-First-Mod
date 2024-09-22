package com.CGTV32.firstmod.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class LachyBlock extends Block {

    public LachyBlock(Properties properties) {
        super(properties);
    }

    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity){
        if(pEntity instanceof Player player) {
            player.sendSystemMessage(Component.literal("*Sniffs toesies*"));

        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

}
