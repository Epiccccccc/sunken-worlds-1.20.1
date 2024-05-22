package net.epicsaurus.unusualcritters;

import net.epicsaurus.unusualcritters.entity.ModEntities;
import net.epicsaurus.unusualcritters.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class UnusualCrittersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.HERRING, HerringRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HERRING, HerringModel::getTexturedModelData);


    }
}
