package net.epicsaurus.unusualcritters.datagen;

import net.epicsaurus.unusualcritters.block.ModBlocks;
import net.epicsaurus.unusualcritters.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CAT_BLOCK);
        addDrop(ModBlocks.BLUBBER_BLOCK, drops(ModItems.BLUBBER));
    }
}
