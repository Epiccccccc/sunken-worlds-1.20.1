package net.epicsaurus.sunkenworlds.datagen;

import net.epicsaurus.sunkenworlds.block.ModBlocks;
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
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CAT_BLOCK);

     //   getOrCreateTagBuilder(BlockTags).NEEDS_STONE_TOOLS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CAT_BLOCK);


     //   getOrCreateTagBuilder(BlockTags).NEEDS_DIAMOND_TOOLS);

     //   getOrCreateTagBuilder(BlockTags).NEEDS_STONE_TOOLS);

     //   getOrCreateTagBuilder(BlockTags).NEEDS_STONE_TOOLS);


    }
}
