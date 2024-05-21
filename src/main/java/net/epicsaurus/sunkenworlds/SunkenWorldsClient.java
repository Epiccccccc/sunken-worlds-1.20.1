package net.epicsaurus.sunkenworlds;

import net.epicsaurus.sunkenworlds.entity.ModEntities;
import net.epicsaurus.sunkenworlds.entity.client.HerringModel;
import net.epicsaurus.sunkenworlds.entity.client.HerringRenderer;
import net.epicsaurus.sunkenworlds.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SunkenWorldsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.HERRING, HerringRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HERRING, HerringModel::getTexturedModelData);

    }
}
