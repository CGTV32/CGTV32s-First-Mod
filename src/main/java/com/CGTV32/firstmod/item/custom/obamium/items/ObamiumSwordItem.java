package com.CGTV32.firstmod.item.custom.obamium.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class ObamiumSwordItem extends SwordItem {

    public ObamiumSwordItem() {
        // SwordItem constructor: Tier, attack damage modifier, attack speed, item properties
        super(Tiers.NETHERITE, new Item.Properties()
                .fireResistant()
                .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 10, 0)));
    }

}
