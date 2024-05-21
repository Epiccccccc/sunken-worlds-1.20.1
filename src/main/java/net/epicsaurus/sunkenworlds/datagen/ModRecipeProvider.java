package net.epicsaurus.sunkenworlds.datagen;

import net.epicsaurus.sunkenworlds.block.ModBlocks;
import net.epicsaurus.sunkenworlds.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.client.input.Input;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> FOOD_COOKABLE = List.of(ModItems.RAW_SHARK_MEAT);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, FOOD_COOKABLE, RecipeCategory.FOOD, ModItems.RAW_SHARK_MEAT,
                0.7f, 200, "Meat");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLUBBER, RecipeCategory.DECORATIONS,
                ModBlocks.CAT_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.BLUBBER, 1)
                .pattern("SS")
                .pattern("SS")
                .input('S',ModItems.BLUBBER)
                .criterion(hasItem(ModItems.BLUBBER), conditionsFromItem(ModItems.BLUBBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUBBER_BLOCK)));
    }
}
