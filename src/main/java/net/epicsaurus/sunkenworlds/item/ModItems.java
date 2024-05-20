package net.epicsaurus.sunkenworlds.item;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SHARKTOOTH = registerItem("shark_tooth", new Item(new FabricItemSettings()));
    public static final Item BLUBBER = registerItem("blubber", new Item(new FabricItemSettings()));

    public static final Item RAWSHARKMEAT = registerItem("raw_shark_meat", new Item(new FabricItemSettings().food(ModFoodComponents.RAWSHARKMEAT)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SHARKTOOTH);
        entries.add(BLUBBER);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SunkenWorlds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SunkenWorlds.LOGGER.info("Registering Mod Items for " + SunkenWorlds.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}