package net.epicsaurus.unusualcritters.block;

import net.epicsaurus.unusualcritters.UnusualCritters;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
     public static final Block CAT_BLOCK = registerBlock("cat_block",
             new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
     public static final Block BLUBBER_BLOCK = registerBlock("blubber_block",
             new Block(FabricBlockSettings.copyOf(Blocks.MUD)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(UnusualCritters.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(UnusualCritters.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void RegisterModBlocks() {
        UnusualCritters.LOGGER.info("Registering Modblocks for " + UnusualCritters.MOD_ID);
    }
}
