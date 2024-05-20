package net.epicsaurus.sunkenworlds;

import net.epicsaurus.sunkenworlds.block.ModBlocks;
import net.epicsaurus.sunkenworlds.item.ModItemGroups;
import net.epicsaurus.sunkenworlds.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SunkenWorlds implements ModInitializer {
	public static final String MOD_ID = "sunkenworlds";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registeritemgroups();

		ModItems.registerModItems();
		ModBlocks.RegisterModBlocks();
	}
}