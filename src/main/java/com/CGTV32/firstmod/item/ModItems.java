package com.CGTV32.firstmod.item;

import com.CGTV32.firstmod.FirstMod;
import com.CGTV32.firstmod.item.custom.gary.BlickyItem;
import com.CGTV32.firstmod.item.custom.obamium.items.ObamiumPickaxeItem;
import com.CGTV32.firstmod.item.custom.obamium.items.ObamiumSwordItem;
import com.CGTV32.firstmod.item.custom.obamium.items.ObamiumTemplateItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.concurrent.locks.ReadWriteLock;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> OPPITE = ITEMS.register("oppite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_OPPITE = ITEMS.register("raw_oppite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_OBAMIUM = ITEMS.register("raw_obamium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OBAMIUM = ITEMS.register("obamium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLICKY = ITEMS.register("blicky",
            () -> new BlickyItem(new Item.Properties()
                    .stacksTo(1)));
    public static final RegistryObject<Item> OBAMIUM_SWORD = ITEMS.register("obamium_sword",
            () -> new ObamiumSwordItem());

    public static final RegistryObject<Item> OBAMIUMTEMPLATE = ITEMS.register("obamium_template",
            () -> new ObamiumTemplateItem());

    public static final RegistryObject<Item> OBAMIUM_PICKAXE = ITEMS.register("obamium_pickaxe",
            () -> new ObamiumPickaxeItem());

    public static void register(IEventBus eventbus){
        ITEMS.register((eventbus));

    }

}
