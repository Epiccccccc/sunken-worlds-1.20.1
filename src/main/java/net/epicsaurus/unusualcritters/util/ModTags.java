package net.epicsaurus.unusualcritters.util;

import net.epicsaurus.unusualcritters.UnusualCritters;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

         private static TagKey<Block> createTag(String name) {
             return TagKey.of(RegistryKeys.BLOCK, new Identifier(UnusualCritters.MOD_ID, name));
         }
    }

    public class items {



        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(UnusualCritters.MOD_ID, name));
        }
    }
}
