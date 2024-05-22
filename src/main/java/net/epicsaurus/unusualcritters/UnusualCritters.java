package net.epicsaurus.unusualcritters;

import net.epicsaurus.unusualcritters.block.ModBlocks;
import net.epicsaurus.unusualcritters.entity.ModEntities;
import net.epicsaurus.unusualcritters.entity.custom.HerringEntity;
import net.epicsaurus.unusualcritters.item.ModItemGroups;
import net.epicsaurus.unusualcritters.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnusualCritters implements ModInitializer {
	public static final String MOD_ID = "unusual_critters";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.RegisterModBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.HERRING, HerringEntity.createHerringAttributes());

	}
}