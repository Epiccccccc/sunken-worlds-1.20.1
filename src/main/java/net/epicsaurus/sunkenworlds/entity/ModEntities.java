package net.epicsaurus.sunkenworlds.entity;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.epicsaurus.sunkenworlds.entity.custom.HerringEntity;
import net.epicsaurus.sunkenworlds.entity.custom.ReefSharkEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<HerringEntity> HERRING = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(SunkenWorlds.MOD_ID, "herring"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, HerringEntity::new)
                    .dimensions(EntityDimensions.fixed(0.3f, 0.15f)).build());

    public static final EntityType<ReefSharkEntity> REEFSHARK = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(SunkenWorlds.MOD_ID, "reef_shark"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, ReefSharkEntity::new)
                    .dimensions(EntityDimensions.fixed(0.3f, 0.15f)).build());
}