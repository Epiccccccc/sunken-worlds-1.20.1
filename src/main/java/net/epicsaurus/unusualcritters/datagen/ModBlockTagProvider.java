package net.epicsaurus.unusualcritters.datagen;

import net.epicsaurus.unusualcritters.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.CAT_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CAT_BLOCK);

    getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.CAT_BLOCK);

    getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.CAT_BLOCK);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);


    }
}
