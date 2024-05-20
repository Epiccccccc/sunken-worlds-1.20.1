package net.epicsaurus.sunkenworlds.item;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FISH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SunkenWorlds.MOD_ID, "fish"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fish"))
                    .icon(() -> new ItemStack(ModItems.SHARKTOOTH)).entries((displayContext, entries) -> {
                    entries.add(ModItems.BLUBBER);
                    entries.add(ModItems.SHARKTOOTH);
                    }).build());

    public static void registeritemgroups() {
        SunkenWorlds.LOGGER.info("Registering Item Groups For " +SunkenWorlds.MOD_ID);
    }
}
