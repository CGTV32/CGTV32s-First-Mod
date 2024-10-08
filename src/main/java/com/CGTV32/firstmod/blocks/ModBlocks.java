package com.CGTV32.firstmod.blocks;

import com.CGTV32.firstmod.FirstMod;
import com.CGTV32.firstmod.blocks.custom.*;
import com.CGTV32.firstmod.item.ModItems;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static final RegistryObject<Block> OPPITE_BLOCK = registerBlock("oppite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANVIL)));

    public static final RegistryObject<Block> RAW_OPPITE_BLOCK = registerBlock("raw_oppite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OPPITE_ORE = registerBlock("oppite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OBAMIUM_BLOCK = registerBlock("obamium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> JOSHBLOCK = registerBlock("josh_block",
            () -> new JoshBlock(BlockBehaviour.Properties.of()
                    .strength(5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANVIL)));

    public static final RegistryObject<Block> LACHYBLOCK = registerBlock("lachy_block",
            () -> new LachyBlock(BlockBehaviour.Properties.of()
                    .strength(4F)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OSAMABLOCK = registerBlock("osama_block",
            () -> new OsamaBlock(BlockBehaviour.Properties.of()
                    .strength(4F)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CAMBLOCK = registerBlock("cam_block",
            () -> new CamBlock(BlockBehaviour.Properties.of()
                    .strength(1F)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> EMOBLOCK = registerBlock("emo_block",
            () -> new EmoBlock(BlockBehaviour.Properties.of()
                    .strength(0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLOCKMAKER = registerBlock("block_maker",
            () -> new BlockMaker(BlockBehaviour.Properties.of()
                    .strength(5F)
                    .requiresCorrectToolForDrops()));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
