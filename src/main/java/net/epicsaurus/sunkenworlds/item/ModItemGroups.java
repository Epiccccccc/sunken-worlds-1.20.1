package net.epicsaurus.sunkenworlds.item;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.epicsaurus.sunkenworlds.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SUNKEN_WORLDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SunkenWorlds.MOD_ID, "sunken_worlds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sunken_worlds"))
                    .icon(() -> new ItemStack(ModItems.SHARK_TOOTH)).entries((displayContext, entries) -> {
                    entries.add(ModItems.BLUBBER);
                    entries.add(ModItems.SHARK_TOOTH);

                    entries.add(ModItems.RAW_SHARK_MEAT);
                    entries.add(ModItems.COOKED_SHARK_MEAT);

                    entries.add(ModBlocks.CAT_BLOCK);
                    entries.add(ModBlocks.BLUBBER_BLOCK );

                    }).build());

    public static void registerItemGroups() {
        SunkenWorlds.LOGGER.info("Registering Item Groups For " +SunkenWorlds.MOD_ID);
    }
}
