package com.CGTV32.firstmod.datagen;

import com.CGTV32.firstmod.FirstMod;
import com.CGTV32.firstmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.OPPITE.get());
        basicItem(ModItems.RAW_OPPITE.get());

        basicItem(ModItems.RAW_OBAMIUM.get());
        basicItem(ModItems.OBAMIUM.get());

        basicItem(ModItems.OBAMIUM_SWORD.get());
        basicItem(ModItems.OBAMIUMTEMPLATE.get());

        basicItem(ModItems.RAW_SIGMITE.get());
        basicItem(ModItems.SIGMITE.get());

        basicItem(ModItems.SKIBIDI_INGOT.get());
        basicItem(ModItems.SKIBIDI_INGOT.get());
        basicItem(ModItems.SKIBIDI_ORE.get());

        basicItem(ModItems.CUM.get());
        basicItem(ModItems.PURE_EJACULATE.get());

        handheldItem(ModItems.OBAMIUM_SWORD);
        handheldItem(ModItems.OBAMIUM_PICKAXE);
        handheldItem(ModItems.OBAMIUM_AXE);
        handheldItem(ModItems.OBAMIUM_SHOVEL);
        handheldItem(ModItems.OBAMIUM_HOE);

        handheldItem(ModItems.BLICKY);

    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath( FirstMod.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}

