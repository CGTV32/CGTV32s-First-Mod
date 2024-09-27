package com.CGTV32.firstmod.util;

import com.CGTV32.firstmod.FirstMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks{

        public static final TagKey<Block> NEEDS_OBAMIUM_TOOL = createTag("needs_obamium_tool");
        public static final TagKey<Block> INCORRECT_FOR_OBAMIUM_TOOL = createTag("incorrect_for_obamium_tool");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID, name));
        }
    }

    public static class Items{

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID, name));
        }

    }
}
