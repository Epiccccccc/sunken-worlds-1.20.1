package net.epicsaurus.sunkenworlds.item;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SHARK_TOOTH = registerItem("shark_tooth", new Item(new FabricItemSettings()));
    public static final Item BLUBBER = registerItem("blubber", new Item(new FabricItemSettings()));
    public static final Item RAW_SHARK_MEAT = registerItem("raw_shark_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_SHARK_MEAT)));
    public static final Item COOKED_SHARK_MEAT = registerItem("cooked_shark_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SHARK_MEAT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SunkenWorlds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SunkenWorlds.LOGGER.info("Registering Mod Items for " + SunkenWorlds.MOD_ID);

    }
}