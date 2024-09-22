package com.CGTV32.firstmod.item;

import com.CGTV32.firstmod.blocks.ModBlocks;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CUM = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(5)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 400), 1F)
            .usingConvertsTo(ModBlocks.OSAMABLOCK.get())
            .build();
}
