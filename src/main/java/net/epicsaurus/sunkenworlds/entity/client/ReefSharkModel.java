// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.epicsaurus.sunkenworlds.entity.client;

import net.epicsaurus.sunkenworlds.entity.custom.ReefSharkEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class ReefSharkModel<T extends ReefSharkEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Root;

	public ReefSharkModel(ModelPart root) {
		this.Root = root.getChild("Root");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Root = modelPartData.addChild("Root", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 15.5F, 0.0F));

		ModelPartData Torso = Root.addChild("Torso", ModelPartBuilder.create().uv(0, 0).cuboid(-3.5F, -6.0F, -11.0F, 7.0F, 7.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.5F, 5.0F));

		ModelPartData Left_Pectoral_Fin = Torso.addChild("Left_Pectoral_Fin", ModelPartBuilder.create().uv(0, 35).cuboid(0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(3.5F, 0.0F, -9.0F));

		ModelPartData Right_Pectoral_Fin = Torso.addChild("Right_Pectoral_Fin", ModelPartBuilder.create().uv(30, 30).cuboid(-7.0F, 0.0F, 0.0F, 7.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData First_Dorsal_Fin = Torso.addChild("First_Dorsal_Fin", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -4.7836F, -0.9763F, 1.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -6.0F, -4.0F, -0.2182F, 0.0F, 0.0F));

		ModelPartData Left_Pelvic_Fin = Torso.addChild("Left_Pelvic_Fin", ModelPartBuilder.create().uv(26, 8).cuboid(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData Right_Pelvic_Fin = Torso.addChild("Right_Pelvic_Fin", ModelPartBuilder.create().uv(18, 35).cuboid(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData Tail = Torso.addChild("Tail", ModelPartBuilder.create().uv(0, 19).cuboid(-2.0F, -2.0F, 0.0F, 4.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 1.0F));

		ModelPartData Second_Dorsal_Fin = Tail.addChild("Second_Dorsal_Fin", ModelPartBuilder.create().uv(46, 9).cuboid(-0.5F, -2.4462F, -0.1051F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 2.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData Caudal_Fin = Tail.addChild("Caudal_Fin", ModelPartBuilder.create().uv(54, 0).cuboid(-0.5F, -6.2F, -2.0F, 1.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.2F, 10.0F));

		ModelPartData Head = Torso.addChild("Head", ModelPartBuilder.create().uv(19, 19).cuboid(-3.0F, -2.0F, -8.0F, 6.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, -11.0F));

		ModelPartData Jaw = Head.addChild("Jaw", ModelPartBuilder.create().uv(27, 1).cuboid(-3.0F, 0.0F, -5.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, -1.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(ReefSharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Root;
	}
}