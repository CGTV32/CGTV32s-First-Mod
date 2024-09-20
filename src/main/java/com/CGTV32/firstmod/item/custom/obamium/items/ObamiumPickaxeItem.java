package com.CGTV32.firstmod.item.custom.obamium.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class ObamiumPickaxeItem extends PickaxeItem {
    public ObamiumPickaxeItem() {
        super(Tiers.NETHERITE, new Item.Properties()
                .fireResistant()
                .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 10, 100)));
    }
}
