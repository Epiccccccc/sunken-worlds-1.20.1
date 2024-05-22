package net.epicsaurus.sunkenworlds.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.epicsaurus.sunkenworlds.block.ModBlocks;
import net.epicsaurus.sunkenworlds.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CAT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUBBER_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.SHARK_TOOTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUBBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SHARK_MEAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SHARK_MEAT, Models.GENERATED);
    }
}