package net.epicsaurus.unusualcritters.item;

import net.epicsaurus.unusualcritters.UnusualCritters;
import net.epicsaurus.unusualcritters.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup UNUSUAL_CRITTERS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(UnusualCritters.MOD_ID, "unusual_critter"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.unusual_critters"))
                    .icon(() -> new ItemStack(ModItems.SHARK_TOOTH)).entries((displayContext, entries) -> {
                    entries.add(ModItems.BLUBBER);
                    entries.add(ModItems.SHARK_TOOTH);
                    entries.add(ModItems.HERRING_BUCKET);
                    entries.add(ModItems.STINK_BOTTLE);

                    entries.add(ModItems.RAW_HERRING_MEAT);
                    entries.add(ModItems.COOKED_HERRING_MEAT);

                    entries.add(ModBlocks.CAT_BLOCK);
                    entries.add(ModBlocks.BLUBBER_BLOCK );

                    }).build());

    public static void registerItemGroups() {
        UnusualCritters.LOGGER.info("Registering Item Groups For " + UnusualCritters.MOD_ID);
    }
}
