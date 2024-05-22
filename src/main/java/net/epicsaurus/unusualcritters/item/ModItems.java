package net.epicsaurus.unusualcritters.item;

import net.epicsaurus.unusualcritters.UnusualCritters;
import net.epicsaurus.unusualcritters.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.EntityBucketItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SHARK_TOOTH = registerItem("shark_tooth", new Item(new FabricItemSettings()));
    public static final Item BLUBBER = registerItem("blubber", new Item(new FabricItemSettings()));
    public static final Item RAW_SHARK_MEAT = registerItem("raw_shark_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.RAW_SHARK_MEAT)));
    public static final Item COOKED_SHARK_MEAT = registerItem("cooked_shark_meat",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SHARK_MEAT)));
    public static final Item HERRING_BUCKET = registerItem("herring_bucket",
            new EntityBucketItem(ModEntities.HERRING, Fluids.WATER, SoundEvents.ITEM_BUCKET_EMPTY_FISH, (new Item.Settings()).maxCount(1)));
    public static final Item STINK_BOTTLE = registerItem("stink_bottle", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(UnusualCritters.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UnusualCritters.LOGGER.info("Registering Mod Items for " + UnusualCritters.MOD_ID);

    }
}