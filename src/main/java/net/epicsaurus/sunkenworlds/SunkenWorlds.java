package net.epicsaurus.sunkenworlds;

import net.epicsaurus.sunkenworlds.block.ModBlocks;
import net.epicsaurus.sunkenworlds.entity.ModEntities;
import net.epicsaurus.sunkenworlds.entity.custom.HerringEntity;
import net.epicsaurus.sunkenworlds.item.ModItemGroups;
import net.epicsaurus.sunkenworlds.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SunkenWorlds implements ModInitializer {
	public static final String MOD_ID = "sunken_worlds";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.RegisterModBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.HERRING, HerringEntity.createHerringAttributes());

	}
}