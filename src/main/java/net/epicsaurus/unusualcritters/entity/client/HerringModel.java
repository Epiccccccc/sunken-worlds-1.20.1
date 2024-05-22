package net.epicsaurus.unusualcritters.entity.client;

import net.epicsaurus.unusualcritters.entity.animation.ModAnimations;
import net.epicsaurus.unusualcritters.entity.custom.HerringEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;


public class HerringModel<T extends HerringEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Herring;
	public HerringModel(ModelPart root) {
		this.Herring = root.getChild("Herring");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Herring = modelPartData.addChild("Herring", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 29.0F, 0.0F));

		ModelPartData Body = Herring.addChild("Body", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -7.0F, -3.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Tail = Body.addChild("Tail", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.0F, 3.0F));

		ModelPartData Dorsal = Body.addChild("Dorsal", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData Dorsal_r1 = Dorsal.addChild("Dorsal_r1", ModelPartBuilder.create().uv(0, 1).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, -0.5F, -0.3927F, 0.0F, 0.0F));

		ModelPartData Pectoral = Body.addChild("Pectoral", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData L = Pectoral.addChild("L", ModelPartBuilder.create().uv(0, 1).cuboid(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -0.75F, -1.25F, 0.0F, -0.7418F, 0.9163F));

		ModelPartData R = Pectoral.addChild("R", ModelPartBuilder.create().uv(0, 0).cuboid(-2.25F, -0.25F, 0.0F, 2.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.75F, -0.5F, -1.25F, 0.0F, 0.7418F, -0.9163F));
		return TexturedModelData.of(modelData, 16, 16);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Herring.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);

		//this.animateMovement(ModAnimations.He);

	}



	@Override
	public ModelPart getPart() {
		return null;
	}

	@Override
	public void setAngles(T HerringEntity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		//this.getPart().traverse().forEach(ModelPart::resetTransform);



	}
}