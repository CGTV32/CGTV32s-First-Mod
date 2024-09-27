package com.CGTV32.firstmod.datagen;

import com.CGTV32.firstmod.FirstMod;
import com.CGTV32.firstmod.blocks.ModBlocks;
import com.CGTV32.firstmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.OPPITE_ORE.get())
                .add(ModBlocks.RAW_OPPITE_BLOCK.get())
                .add(ModBlocks.OPPITE_BLOCK.get())
                .add(ModBlocks.OSAMABLOCK.get())
                .add(ModBlocks.OBAMIUM_BLOCK.get())
                .add(ModBlocks.JOSHBLOCK.get())
                .add(ModBlocks.CAMBLOCK.get())
                .add(ModBlocks.LACHYBLOCK.get())
                .add(ModBlocks.BLOCKMAKER.get())
                .add(ModBlocks.EMOBLOCK.get());

        tag(ModTags.Blocks.NEEDS_OBAMIUM_TOOL)
                .add(ModBlocks.OPPITE_ORE.get())
                .add(ModBlocks.RAW_OPPITE_BLOCK.get())
                .add(ModBlocks.OPPITE_BLOCK.get())
                .add(ModBlocks.OSAMABLOCK.get())
                .add(ModBlocks.OBAMIUM_BLOCK.get())
                .add(ModBlocks.JOSHBLOCK.get())
                .add(ModBlocks.CAMBLOCK.get())
                .add(ModBlocks.LACHYBLOCK.get())
                .add(ModBlocks.BLOCKMAKER.get())
                .add(ModBlocks.EMOBLOCK.get())
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}
