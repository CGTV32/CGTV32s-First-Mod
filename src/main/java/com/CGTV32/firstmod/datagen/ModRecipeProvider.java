package com.CGTV32.firstmod.datagen;

import com.CGTV32.firstmod.blocks.ModBlocks;
import com.CGTV32.firstmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OPPITE_BLOCK.get()) // makes 9 oppite into 1 oppite block
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.OPPITE.get())
                .unlockedBy(getHasName(ModItems.OPPITE.get()), has(ModItems.OPPITE.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OBAMIUM.get(), 9)    //makes obamium block into 9 obamium
                .requires(ModBlocks.OBAMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.OBAMIUM_BLOCK.get()), has(ModBlocks.OBAMIUM_BLOCK.get()));
    }

}
