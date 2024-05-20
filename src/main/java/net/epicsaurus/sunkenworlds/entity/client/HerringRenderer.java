package net.epicsaurus.sunkenworlds.entity.client;

import net.epicsaurus.sunkenworlds.SunkenWorlds;
import net.epicsaurus.sunkenworlds.entity.custom.HerringEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class HerringRenderer extends MobEntityRenderer<HerringEntity, HerringModel<HerringEntity>> {
    private static final Identifier TEXTURE = new Identifier(SunkenWorlds.MOD_ID, "textures/entity/herring.png");

    public HerringRenderer(EntityRendererFactory.Context context) {
        super(context, new HerringModel<>(context.getPart(ModModelLayers.HERRING)), 0.1f);
    }

    @Override
    public Identifier getTexture(HerringEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(HerringEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if ()

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
