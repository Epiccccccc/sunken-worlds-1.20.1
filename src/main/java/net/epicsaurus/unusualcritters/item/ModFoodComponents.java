package net.epicsaurus.unusualcritters.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RAW_SHARK_MEAT = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).meat().build();
    public static final FoodComponent COOKED_SHARK_MEAT = new FoodComponent.Builder().hunger(7).saturationModifier(0.25f).meat().build();
}
