package net.snaipy.potatocore.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STONE_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1.0F).alwaysEat().build();

}
