package com.CGTV32.firstmod.blocks.custom;

import com.CGTV32.firstmod.blocks.ModBlocks;
import com.CGTV32.firstmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CamBlock extends Block {

    public CamBlock(Properties properties) {
        super(properties);
    }

    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity){
        if(pEntity instanceof ItemEntity itemEntity){
            if(itemEntity.getItem().getItem() == Items.TNT){
                itemEntity.setItem(new ItemStack(ModBlocks.OSAMABLOCK.get(), itemEntity.getItem().getCount()));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

}
