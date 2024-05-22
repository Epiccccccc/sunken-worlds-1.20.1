package net.epicsaurus.sunkenworlds;

import net.epicsaurus.sunkenworlds.entity.ModEntities;
import net.epicsaurus.sunkenworlds.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SunkenWorldsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.HERRING, HerringRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HERRING, HerringModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.REEFSHARK, ReefSharkRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.REEFSHARK, ReefSharkModel::getTexturedModelData);

    }
}
