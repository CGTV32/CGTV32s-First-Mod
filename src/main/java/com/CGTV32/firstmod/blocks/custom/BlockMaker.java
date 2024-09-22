package com.CGTV32.firstmod.blocks.custom;

import com.CGTV32.firstmod.blocks.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockMaker extends Block {


    public BlockMaker(Properties properties) {
        super(properties);
    }
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity){

        if(pEntity instanceof ItemEntity itemEntity){

            if(itemEntity.getItem().getItem() == Items.IRON_PICKAXE){
                itemEntity.setItem(new ItemStack(ModBlocks.CAMBLOCK.get(), itemEntity.getItem().getCount()));
            }
            else if(itemEntity.getItem().getItem() == Items.BLACK_DYE && itemEntity.getItem().getCount() >= 32){
                itemEntity.setItem(new ItemStack(ModBlocks.EMOBLOCK.get(), 1));
            }
            else if(itemEntity.getItem().getItem() == Items.BLACK_DYE){
                itemEntity.setItem(new ItemStack(ModBlocks.LACHYBLOCK.get(), itemEntity.getItem().getCount()));
            }
            else if(itemEntity.getItem().getItem() == Items.TNT && itemEntity.getItem().getCount() == 64){
                itemEntity.setItem(new ItemStack(ModBlocks.OSAMABLOCK.get(), itemEntity.getItem().getCount()));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

}
