package net.epicsaurus.sunkenworlds.entity.client;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.epicsaurus.sunkenworlds.entity.custom.ReefSharkEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ReefSharkRenderer extends MobEntityRenderer<ReefSharkEntity, ReefSharkModel<ReefSharkEntity>> {
    private static final Identifier TEXTURE = new Identifier(SunkenWorlds.MOD_ID, "textures/entity/reef_shark.png");

    public ReefSharkRenderer(EntityRendererFactory.Context context) {
        super(context, new ReefSharkModel<>(context.getPart(ModModelLayers.REEFSHARK)), 1f);
    }

    @Override
    public Identifier getTexture(ReefSharkEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(ReefSharkEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
