package com.CGTV32.firstmod.datagen;

import com.CGTV32.firstmod.FirstMod;
import com.CGTV32.firstmod.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FirstMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.OBAMIUM_BLOCK);

        blockWithItem(ModBlocks.OSAMABLOCK);
        blockWithItem(ModBlocks.CAMBLOCK);
        blockWithItem(ModBlocks.EMOBLOCK);
        blockWithItem(ModBlocks.LACHYBLOCK);
        blockWithItem(ModBlocks.JOSHBLOCK);

        blockWithItem(ModBlocks.BLOCKMAKER);

        blockWithItem(ModBlocks.OPPITE_BLOCK);
        blockWithItem(ModBlocks.OPPITE_ORE);
        blockWithItem(ModBlocks.RAW_OPPITE_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
