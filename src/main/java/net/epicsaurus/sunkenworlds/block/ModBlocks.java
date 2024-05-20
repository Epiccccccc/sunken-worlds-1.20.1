package net.epicsaurus.sunkenworlds.block;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModBlocks {


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new)
    }

    public static void RegisterModBlocks() {
        SunkenWorlds.LOGGER.info("Registering Modblocks for " + SunkenWorlds.MOD_ID);
    }
}
