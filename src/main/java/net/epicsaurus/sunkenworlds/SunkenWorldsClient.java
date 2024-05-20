package net.epicsaurus.sunkenworlds;

import net.epicsaurus.sunkenworlds.entity.client.HerringModel;
import net.epicsaurus.sunkenworlds.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class SunkenWorldsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HERRING, HerringModel::getTexturedModelData);

    }
}
