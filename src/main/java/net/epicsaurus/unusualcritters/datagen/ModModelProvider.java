package net.epicsaurus.unusualcritters.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.epicsaurus.unusualcritters.block.ModBlocks;
import net.epicsaurus.unusualcritters.item.ModItems;
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
        itemModelGenerator.register(ModItems.RAW_HERRING_MEAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_HERRING_MEAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HERRING_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STINK_BOTTLE, Models.GENERATED);
    }
}
