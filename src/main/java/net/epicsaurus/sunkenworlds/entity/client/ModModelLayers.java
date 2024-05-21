package net.epicsaurus.sunkenworlds.entity.client;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer HERRING =
            new EntityModelLayer(new Identifier(SunkenWorlds.MOD_ID, "herring"), "main");
}
