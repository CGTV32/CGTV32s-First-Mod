package com.CGTV32.firstmod.item;

import com.CGTV32.firstmod.FirstMod;
import com.CGTV32.firstmod.item.custom.FuelItem;
import com.CGTV32.firstmod.item.custom.gary.BlickyItem;
import com.CGTV32.firstmod.item.custom.obamium.items.ObamiumSwordItem;
import com.CGTV32.firstmod.item.custom.obamium.items.ObamiumTemplateItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.event.GatherComponentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

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

    public static final RegistryObject<Item> RAW_SIGMITE = ITEMS.register("raw_sigmite",
            () -> new Item(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.firstmod.emo_block"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> SIGMITE = ITEMS.register("sigmite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SKIBIDI_ORE = ITEMS.register("skibidi_ore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SKIBIDI_INGOT = ITEMS.register("skibidi_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUM = ITEMS.register("cum",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.CUM)));

    public static final RegistryObject<Item> PURE_EJACULATE = ITEMS.register("pure_ejaculate",
            () -> new FuelItem(new Item.Properties(), 3000));


    public static void register(IEventBus eventbus){
        ITEMS.register((eventbus));

    }

}
