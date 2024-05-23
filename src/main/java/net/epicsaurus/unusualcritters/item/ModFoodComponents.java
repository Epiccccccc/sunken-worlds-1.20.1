package net.epicsaurus.unusualcritters.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RAW_HERRING_MEAT = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).meat().build();
    public static final FoodComponent COOKED_HERRING_MEAT = new FoodComponent.Builder().hunger(6).saturationModifier(0.25f).meat().build();
}
