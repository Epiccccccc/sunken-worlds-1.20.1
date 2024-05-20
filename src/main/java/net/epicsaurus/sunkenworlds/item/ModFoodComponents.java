package net.epicsaurus.sunkenworlds.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RAWSHARKMEAT = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).meat().build();
}
