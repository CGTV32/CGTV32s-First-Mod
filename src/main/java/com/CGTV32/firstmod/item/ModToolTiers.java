package com.CGTV32.firstmod.item;

import com.CGTV32.firstmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier OBAMIUM = new ForgeTier(5000, 100, 5f, 20,
            ModTags.Blocks.NEEDS_OBAMIUM_TOOL, () -> Ingredient.of(ModItems.OBAMIUM.get()),
            ModTags.Blocks.INCORRECT_FOR_OBAMIUM_TOOL);
}
