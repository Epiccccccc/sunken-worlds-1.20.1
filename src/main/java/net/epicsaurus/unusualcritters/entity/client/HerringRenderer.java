package net.epicsaurus.unusualcritters.entity.client;

import net.epicsaurus.unusualcritters.UnusualCritters;
import net.epicsaurus.unusualcritters.entity.custom.HerringEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class HerringRenderer extends MobEntityRenderer<HerringEntity, HerringModel<HerringEntity>> {
    private static final Identifier TEXTURE = new Identifier(UnusualCritters.MOD_ID, "textures/entity/herring.png");

    public HerringRenderer(EntityRendererFactory.Context context) {
        super(context, new HerringModel<>(context.getPart(ModModelLayers.HERRING)), 0.2f);
    }

    @Override
    public Identifier getTexture(HerringEntity entity) {
        return TEXTURE;
    }
}
