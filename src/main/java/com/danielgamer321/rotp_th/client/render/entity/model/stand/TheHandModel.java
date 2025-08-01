package com.danielgamer321.rotp_th.client.render.entity.model.stand;

import com.danielgamer321.rotp_th.action.stand.*;
import com.danielgamer321.rotp_th.entity.stand.stands.TheHandEntity;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.pose.*;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.client.render.entity.pose.anim.barrage.StandOneHandedBarrageAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.util.general.MathUtil;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.Hand;

import javax.annotation.Nullable;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class TheHandModel extends HumanoidStandModel<TheHandEntity> {
	private final ModelRenderer rightPartForehead;
	private final ModelRenderer leftPartForehead;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer spine1;
	private final ModelRenderer spine2;
	private final ModelRenderer leftPartTriangle;
	private final ModelRenderer rightPartTriangle;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer leftForeArm_r1;
	private final ModelRenderer rightForeArm_r1;
	private final ModelRenderer eraseEffect;
	private final ModelRenderer eraseRot;
	private final ModelRenderer eraseRot2;
	private final ModelRenderer eraseRot3;
	private final ModelRenderer eraseRot4;
	private final ModelRenderer eraseRot5;
	private final ModelRenderer eraseRot6;
	private final ModelRenderer eraseRot7;
	private final ModelRenderer leftLeg_r1;

	public TheHandModel() {
		super();

		addHumanoidBaseBoxes(null);
		texWidth = 128;
		texHeight = 128;

		head.texOffs(0, 0).addBox(-3.0F, -4.0F, -4.15F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(0, 2).addBox(1.0F, -4.0F, -4.15F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		head.texOffs(26, 1).addBox(-5.0F, -4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(26, 3).addBox(3.0F, -4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(67, 7).addBox(2.8342F, -8.1F, -4.0F, 1.0F, 8.0F, 1.0F, 0.2F, false);
		head.texOffs(76, 7).addBox(-3.8363F, -8.1F, -4.0F, 1.0F, 8.0F, 1.0F, 0.2F, false);
		head.texOffs(34, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);
		head.texOffs(71, 7).addBox(2.8342F, -8.1F, -4.3634F, 1.0F, 8.0F, 1.0F, 0.2F, false);
		head.texOffs(80, 7).addBox(-3.8363F, -8.1F, -4.3634F, 1.0F, 8.0F, 1.0F, 0.2F, false);
		head.texOffs(67, 22).addBox(-4.0F, -3.195F, 1.0F, 8.0F, 1.0F, 3.0F, 0.2F, false);
		head.texOffs(67, 26).addBox(-4.0F, -4.195F, 0.73F, 8.0F, 2.0F, 1.0F, 0.2F, false);
		head.texOffs(67, 29).addBox(-4.0F, -4.1F, -1.727F, 8.0F, 4.0F, 1.0F, 0.2F, false);
		head.texOffs(85, 28).addBox(-4.365F, -1.1F, -1.73F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		head.texOffs(85, 26).addBox(3.365F, -1.1F, -1.73F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		head.texOffs(34, 17).addBox(-4.0F, -8.46F, -4.0F, 8.0F, 1.0F, 8.0F, -0.8399F, false);
		head.texOffs(34, 26).addBox(-4.0F, -0.74F, -4.0F, 8.0F, 1.0F, 8.0F, -0.8399F, false);
		head.texOffs(5, 17).addBox(-3.0F, -8.0F, -4.09F, 6.0F, 4.0F, 2.0F, -0.01F, false);

		rightPartForehead = new ModelRenderer(this);
		rightPartForehead.setPos(0.0F, -2.01F, -4.29F);
		head.addChild(rightPartForehead);
		setRotationAngle(rightPartForehead, 0.0F, -0.2182F, 0.0F);
		rightPartForehead.texOffs(22, 17).addBox(-0.01F, -5.99F, -0.01F, 1.0F, 6.0F, 1.0F, -0.01F, false);

		leftPartForehead = new ModelRenderer(this);
		leftPartForehead.setPos(0.0F, -2.01F, -4.29F);
		head.addChild(leftPartForehead);
		setRotationAngle(leftPartForehead, 0.0F, 0.2182F, 0.0F);
		leftPartForehead.texOffs(0, 17).addBox(-0.99F, -5.99F, -0.01F, 1.0F, 6.0F, 1.0F, -0.01F, false);

		torso.texOffs(28, 73).addBox(-4.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		torso.texOffs(28, 76).addBox(3.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		torso.texOffs(51, 65).addBox(-5.0F, -0.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.1F, false);
		torso.texOffs(61, 67).addBox(-3.5F, 2.55F, 1.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(36, 65).addBox(3.0F, -0.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.1F, false);
		torso.texOffs(46, 67).addBox(1.5F, 2.55F, 1.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(20, 64).addBox(-3.5F, 1.1F, -2.0F, 7.0F, 3.0F, 1.0F, 0.4F, false);
		torso.texOffs(25, 69).addBox(-1.5F, 4.0F, -2.3F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(24, 80).addBox(-1.0F, 10.75F, -2.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		torso.texOffs(0, 81).addBox(-3.0F, 1.0F, 1.2F, 6.0F, 10.0F, 1.0F, 0.0F, false);
		torso.texOffs(24, 86).addBox(-1.0F, 9.5F, 0.75F, 2.0F, 2.0F, 2.0F, -0.3F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-2.376F, 1.0875F, -2.45F);
		torso.addChild(bone);
		setRotationAngle(bone, -0.0436F, 0.0F, -0.0436F);
		bone.texOffs(61, 76).addBox(-1.5196F, -1.5943F, -1.0555F, 3.0F, 3.0F, 2.0F, -0.6F, false);
		bone.texOffs(51, 76).addBox(-1.375F, -1.4375F, -0.95F, 3.0F, 3.0F, 2.0F, -0.6F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(2.376F, 1.0875F, -2.45F);
		torso.addChild(bone2);
		setRotationAngle(bone2, -0.0436F, 0.0F, 0.0436F);
		bone2.texOffs(72, 76).addBox(-1.6054F, -1.5943F, -1.0305F, 3.0F, 3.0F, 2.0F, -0.6F, true);
		bone2.texOffs(72, 71).addBox(-1.7554F, -1.4693F, -1.2555F, 3.0F, 3.0F, 2.0F, -0.75F, true);
		bone2.texOffs(51, 76).addBox(-1.625F, -1.4375F, -0.95F, 3.0F, 3.0F, 2.0F, -0.6F, true);

		spine1 = new ModelRenderer(this);
		spine1.setPos(0.0F, -0.6F, 2.6F);
		torso.addChild(spine1);
		setRotationAngle(spine1, -0.7854F, 0.0F, 0.0F);
		spine1.texOffs(24, 73).addBox(-4.5F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		spine1.texOffs(24, 76).addBox(3.5F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F, -0.2F, false);

		spine2 = new ModelRenderer(this);
		spine2.setPos(0.0F, -0.6F, -2.6F);
		torso.addChild(spine2);
		setRotationAngle(spine2, 0.7854F, 0.0F, 0.0F);
		spine2.texOffs(32, 73).addBox(-4.5F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		spine2.texOffs(32, 76).addBox(3.5F, -0.65F, -0.5F, 1.0F, 2.0F, 1.0F, -0.2F, false);

		leftPartTriangle = new ModelRenderer(this);
		leftPartTriangle.setPos(0.5F, 11.0F, 2.2F);
		torso.addChild(leftPartTriangle);
		setRotationAngle(leftPartTriangle, 0.0F, 0.0F, 0.3272F);
		leftPartTriangle.texOffs(15, 83).addBox(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.01F, false);

		rightPartTriangle = new ModelRenderer(this);
		rightPartTriangle.setPos(-0.5F, 11.0F, 2.2F);
		torso.addChild(rightPartTriangle);
		setRotationAngle(rightPartTriangle, 0.0F, 0.0F, -0.3272F);
		rightPartTriangle.texOffs(19, 83).addBox(0.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, 0.01F, false);

		leftArm.texOffs(44, 107).addBox(-1.5F, 2.0F, 0.75F, 3.0F, 3.0F, 2.0F, -0.4F, true);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setPos(0.275F, 3.7625F, 2.0625F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, 0.0F, 3.1416F, 0.0F);
		leftArm_r1.texOffs(72, 71).addBox(-1.375F, -1.7875F, -1.2125F, 3.0F, 3.0F, 2.0F, -0.75F, true);
		leftArm_r1.texOffs(72, 76).addBox(-1.225F, -1.9125F, -0.9875F, 3.0F, 3.0F, 2.0F, -0.6F, true);

		leftForeArm.texOffs(43, 123).addBox(-2.5F, 3.0F, -2.5F, 5.0F, 0.0F, 5.0F, 0.0F, false);
		leftForeArm.texOffs(50, 83).addBox(-2.0F, 2.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);
		leftForeArm.texOffs(32, 96).addBox(1.0F, 2.9F, -1.5F, 2.0F, 3.0F, 3.0F, -0.6F, true);
		leftForeArm.texOffs(42, 97).addBox(1.5F, 5.1F, -2.0F, 1.0F, 1.0F, 4.0F, -0.2F, true);
		leftForeArm.texOffs(56, 117).addBox(1.75F, -0.25F, -1.5F, 1.0F, 3.0F, 3.0F, -0.251F, false);
		leftForeArm.texOffs(48, 117).addBox(-2.75F, -0.25F, -1.5F, 1.0F, 3.0F, 3.0F, -0.251F, false);

		leftForeArm_r1 = new ModelRenderer(this);
		leftForeArm_r1.setPos(2.1F, 4.25F, 0.0F);
		leftForeArm.addChild(leftForeArm_r1);
		setRotationAngle(leftForeArm_r1, 3.1416F, 0.0F, 0.0F);
		leftForeArm_r1.texOffs(32, 90).addBox(-1.0F, -1.8F, -1.35F, 2.0F, 3.0F, 3.0F, -0.6F, true);

		rightArm.texOffs(12, 107).addBox(-1.5F, 2.0F, 0.75F, 3.0F, 3.0F, 2.0F, -0.4F, true);
		rightArm.texOffs(22, 97).addBox(-1.3F, 2.15F, 0.85F, 3.0F, 3.0F, 2.0F, -0.4F, true);

		rightForeArm.texOffs(11, 123).addBox(-2.5F, 3.0F, -2.5F, 5.0F, 0.0F, 5.0F, 0.0F, false);
		rightForeArm.texOffs(50, 83).addBox(-2.0F, 2.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
		rightForeArm.texOffs(0, 96).addBox(-3.0F, 2.9F, -1.5F, 2.0F, 3.0F, 3.0F, -0.6F, false);
		rightForeArm.texOffs(10, 97).addBox(-2.5F, 5.1F, -2.0F, 1.0F, 1.0F, 4.0F, -0.2F, false);
		rightForeArm.texOffs(16, 117).addBox(-2.75F, -0.25F, -1.5F, 1.0F, 3.0F, 3.0F, -0.251F, false);
		rightForeArm.texOffs(24, 117).addBox(1.75F, -0.25F, -1.5F, 1.0F, 3.0F, 3.0F, -0.251F, false);

		rightForeArm_r1 = new ModelRenderer(this);
		rightForeArm_r1.setPos(-2.5375F, 5.2375F, -2.725F);
		rightForeArm.addChild(rightForeArm_r1);
		setRotationAngle(rightForeArm_r1, 0.0F, 1.5708F, 0.0F);
		rightForeArm_r1.texOffs(72, 71).addBox(-4.375F, -2.3375F, -0.7375F, 3.0F, 3.0F, 2.0F, -0.75F, true);
		rightForeArm_r1.texOffs(72, 76).addBox(-4.225F, -2.4625F, -0.5125F, 3.0F, 3.0F, 2.0F, -0.6F, true);

		eraseEffect = new ModelRenderer(this);
		eraseEffect.setPos(0.0F, 0.0F, 0.0F);
		rightForeArm.addChild(eraseEffect);
		eraseEffect.texOffs(34, 83).addBox(-2.0F, 5.9F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		eraseRot = new ModelRenderer(this);
		eraseRot.setPos(-1.5F, 6.9F, 0.0F);
		eraseEffect.addChild(eraseRot);
		

		eraseRot2 = new ModelRenderer(this);
		eraseRot2.setPos(0.5F, -6.9F, 0.0F);
		eraseRot.addChild(eraseRot2);
		eraseRot2.texOffs(34, 83).addBox(-1.0F, 5.9F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		eraseRot3 = new ModelRenderer(this);
		eraseRot3.setPos(0.0F, 0.0F, 0.0F);
		eraseRot2.addChild(eraseRot3);
		eraseRot3.texOffs(34, 83).addBox(-1.0F, 5.9F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		eraseRot4 = new ModelRenderer(this);
		eraseRot4.setPos(0.0F, 0.0F, 0.0F);
		eraseRot3.addChild(eraseRot4);
		eraseRot4.texOffs(34, 83).addBox(-1.0F, 5.9F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		eraseRot5 = new ModelRenderer(this);
		eraseRot5.setPos(0.0F, 0.0F, 0.0F);
		eraseRot4.addChild(eraseRot5);
		eraseRot5.texOffs(34, 83).addBox(-1.0F, 5.9F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		eraseRot6 = new ModelRenderer(this);
		eraseRot6.setPos(0.0F, 0.0F, 0.0F);
		eraseRot5.addChild(eraseRot6);
		eraseRot6.texOffs(34, 83).addBox(-1.0F, 5.9F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		eraseRot7 = new ModelRenderer(this);
		eraseRot7.setPos(0.0F, 0.0F, 0.0F);
		eraseRot6.addChild(eraseRot7);
		eraseRot7.texOffs(34, 83).addBox(-1.0F, 5.9F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		leftLeg.texOffs(112, 108).addBox(2.0F, -1.25F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		leftLeg.texOffs(108, 118).addBox(-1.0F, 4.5F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		leftLeg.texOffs(111, 101).addBox(-2.0F, -0.5F, 0.5F, 5.0F, 1.0F, 2.0F, -0.1F, false);
		leftLeg.texOffs(111, 104).addBox(-2.0F, 0.3F, 1.5F, 1.0F, 3.0F, 1.0F, -0.1F, false);
		leftLeg.texOffs(115, 104).addBox(-3.0F, 2.5F, 0.5F, 2.0F, 1.0F, 2.0F, -0.1F, false);
		leftLeg.texOffs(111, 96).addBox(-3.0F, 2.5F, -2.5F, 3.0F, 1.0F, 4.0F, -0.1F, false);
		leftLeg.texOffs(121, 96).addBox(-1.0F, 0.3F, -2.5F, 1.0F, 3.0F, 1.0F, -0.1F, false);
		leftLeg.texOffs(113, 93).addBox(-1.0F, -0.5F, -2.5F, 4.0F, 1.0F, 2.0F, -0.1F, false);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setPos(-11.5125F, -1.7875F, -1.275F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, 0.0F, -1.5708F, 0.0F);
		leftLeg_r1.texOffs(72, 71).addBox(-0.375F, 0.5375F, -14.8375F, 3.0F, 3.0F, 2.0F, -0.15F, true);
		leftLeg_r1.texOffs(73, 77).addBox(-0.225F, 0.2875F, -14.6125F, 3.0F, 3.0F, 1.0F, 0.0F, true);

		rightLeg.texOffs(80, 108).addBox(-3.0F, -1.25F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		rightLeg.texOffs(88, 108).addBox(-3.1F, -1.5F, -1.75F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		rightLeg.texOffs(76, 118).addBox(-1.0F, 4.5F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		rightLeg.texOffs(81, 93).addBox(-3.0F, -0.5F, -2.5F, 4.0F, 1.0F, 2.0F, -0.1F, false);
		rightLeg.texOffs(79, 101).addBox(-3.0F, -0.5F, 0.5F, 5.0F, 1.0F, 2.0F, -0.1F, false);
		rightLeg.texOffs(79, 96).addBox(0.0F, 2.5F, -2.5F, 3.0F, 1.0F, 4.0F, -0.1F, false);
		rightLeg.texOffs(83, 104).addBox(1.0F, 2.5F, 0.5F, 2.0F, 1.0F, 2.0F, -0.1F, false);
		rightLeg.texOffs(89, 96).addBox(0.0F, 0.3F, -2.5F, 1.0F, 3.0F, 1.0F, -0.1F, false);
		rightLeg.texOffs(79, 104).addBox(1.0F, 0.3F, 1.5F, 1.0F, 3.0F, 1.0F, -0.1F, false);
	}

	@Override
	public void prepareMobModel(@Nullable TheHandEntity entity, float walkAnimPos, float walkAnimSpeed, float partialTick) {
		super.prepareMobModel(entity, walkAnimPos, walkAnimSpeed, partialTick);
		if (eraseEffect != null) {
			eraseEffect.visible = entity != null && entity.isErasing();
		}
	}

	@Override
	protected RotationAngle[][] initSummonPoseRotations() {
		return new RotationAngle[][] {
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, -5F, 0F, -5F),
						RotationAngle.fromDegrees(body, 0F, 0F, 0F),
						RotationAngle.fromDegrees(upperPart, 0F, 0F, 0F),
						RotationAngle.fromDegrees(leftArm, -5F, 0F, 0F),
						RotationAngle.fromDegrees(leftArmJoint, -45F, 0F, 0F),
						RotationAngle.fromDegrees(leftForeArm, -90F, 0F, 95F),
						RotationAngle.fromDegrees(rightArm, 5F, 0F, 0F),
						RotationAngle.fromDegrees(rightArmJoint, -45F, 0F, 0F),
						RotationAngle.fromDegrees(rightForeArm, -90F, 0F, -95F),
						RotationAngle.fromDegrees(leftLeg, -5F, 0F, -10F),
						RotationAngle.fromDegrees(leftLowerLeg, 30F, 0F, 0),
						RotationAngle.fromDegrees(rightLeg, -5F, 0F, 10F),
						RotationAngle.fromDegrees(rightLowerLeg, 30F, 0F, 0F)
				},
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, -5F, 0F, 5F),
						RotationAngle.fromDegrees(body, 5F, 0F, 0F),
						RotationAngle.fromDegrees(upperPart, 0F, 0F, 0F),
						RotationAngle.fromDegrees(leftArm, 0F, 0F, -40F),
						RotationAngle.fromDegrees(leftArmJoint, 30F, 0F, 0F),
						RotationAngle.fromDegrees(leftForeArm, -120F, 0F, -40F),
						RotationAngle.fromDegrees(rightArm, -35F, 0F, 15F),
						RotationAngle.fromDegrees(rightArmJoint, 35F, 0F, 0F),
						RotationAngle.fromDegrees(rightForeArm, -60F, -20F, 30F),
						RotationAngle.fromDegrees(leftLeg, -5F, 0F, -10F),
						RotationAngle.fromDegrees(leftLowerLeg, 30F, 0F, 0F),
						RotationAngle.fromDegrees(rightLeg, -5F, 0F, 10F),
						RotationAngle.fromDegrees(rightLowerLeg, 30F, 0F, 0F)
				},
				new RotationAngle[] {
						RotationAngle.fromDegrees(head, 0F, 0F, 0F),
						RotationAngle.fromDegrees(body, 10F, -40F, 0F),
						RotationAngle.fromDegrees(upperPart, 0F, 0F, 0F),
						RotationAngle.fromDegrees(leftArm, -60F, -40F, -20F),
						RotationAngle.fromDegrees(leftArmJoint, 0F, 0F, 45F),
						RotationAngle.fromDegrees(leftForeArm, 20F, 20F, 110F),
						RotationAngle.fromDegrees(rightArm, -40F, 5F, 80F),
						RotationAngle.fromDegrees(rightArmJoint, 0F, 0F, 0F),
						RotationAngle.fromDegrees(rightForeArm, -10F, 15F, 0F),
						RotationAngle.fromDegrees(leftLeg, -20F, 0F, -20F),
						RotationAngle.fromDegrees(leftLowerLeg, 20F, 0F, 0F),
						RotationAngle.fromDegrees(rightLeg, -20F, 0F, 20F),
						RotationAngle.fromDegrees(rightLowerLeg, 20F, 0F, 0F)
				}
		};
	}

	@Override
	protected void initActionPoses() {
		ModelPose<TheHandEntity> kickPose1 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, -30F, 0F, 0F),
				RotationAngle.fromDegrees(leftArm, -40F, -30F, 0F),
				RotationAngle.fromDegrees(leftArmJoint, 34F, 0F, 0F),
				RotationAngle.fromDegrees(leftForeArm, -110F, 0F, 0F),
				RotationAngle.fromDegrees(rightArm, -40F, 30F, 0F),
				RotationAngle.fromDegrees(rightArmJoint, 34F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -110F, 0F, 0F),
				RotationAngle.fromDegrees(leftLeg, -60F, -10F, 0F),
				RotationAngle.fromDegrees(leftLegJoint, 30F, 0F, 0F),
				RotationAngle.fromDegrees(leftLowerLeg, 60F, 0F, 0F),
				RotationAngle.fromDegrees(rightLeg, -10F, 15F, 10F),
				RotationAngle.fromDegrees(rightLowerLeg, 10F, 0F, -10F)
		});
		ModelPose<TheHandEntity> kickPose2 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, -30F, 0F, 0F),
				RotationAngle.fromDegrees(leftArm, -40F, -30F, 0F),
				RotationAngle.fromDegrees(leftArmJoint, 34F, 0F, 0F),
				RotationAngle.fromDegrees(leftForeArm, -110F, 0F, 0F),
				RotationAngle.fromDegrees(rightArm, -40F, 30F, 0F),
				RotationAngle.fromDegrees(rightArmJoint, 34F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -110F, 0F, 0F),
				RotationAngle.fromDegrees(leftLeg, -80F, -10F, 0F),
				RotationAngle.fromDegrees(leftLegJoint, 40F, 0F, 0F),
				RotationAngle.fromDegrees(leftLowerLeg, 80F, 0F, 0F),
				RotationAngle.fromDegrees(rightLeg, -10F, 15F, 10F),
				RotationAngle.fromDegrees(rightLowerLeg, 10F, 0F, -10F)
		});
		ModelPose<TheHandEntity> kickPose3 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, -30F, 0F, 0F),
				RotationAngle.fromDegrees(leftArm, -40F, -30F, 0F),
				RotationAngle.fromDegrees(leftArmJoint, 34F, 0F, 0F),
				RotationAngle.fromDegrees(leftForeArm, -110F, 0F, 0F),
				RotationAngle.fromDegrees(rightArm, -40F, 30F, 0F),
				RotationAngle.fromDegrees(rightArmJoint, 34F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -110F, 0F, 0F),
				RotationAngle.fromDegrees(leftLeg, -35F, -10F, 0F),
				RotationAngle.fromDegrees(leftLegJoint, 20F, 0F, 0F),
				RotationAngle.fromDegrees(leftLowerLeg, 35F, 0, 0F),
				RotationAngle.fromDegrees(rightLeg, -10F, 15F, 10F),
				RotationAngle.fromDegrees(rightLowerLeg, 10F, 0F, -10F)
		});
		ModelPose<TheHandEntity> kickRecoveryBodyFix = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0F, 0F, 0F)
		});
		actionAnim.put(StandPose.HEAVY_ATTACK_FINISHER, new PosedActionAnimation.Builder<TheHandEntity>()
				.addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransitionMultiple.Builder<>(idlePose)
						.addPose(0.5F, kickPose1)
						.addPose(0.75F, kickPose2)
						.build(kickPose3))
				.addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(kickPose3)
						.addPose(0.5F, kickPose3)
						.addPose(0.9F, kickRecoveryBodyFix)
						.build(idlePose))
				.build(idlePose));

		ModelPose<TheHandEntity> handPose1 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0F, 10F, 0F),
				RotationAngle.fromDegrees(leftArm, -2.5F, 0F, -5F),
				RotationAngle.fromDegrees(leftForeArm, -20F, 0F, 0F),
				RotationAngle.fromDegrees(rightArm, 45F, 0F, 90F),
				RotationAngle.fromDegrees(rightArmJoint, 45F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -140F, 35F, -35F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 0F),
				RotationAngle.fromDegrees(leftLeg, -5.5F, 0F, -10F),
				RotationAngle.fromDegrees(leftLowerLeg, 25F, 0F, 0F),
				RotationAngle.fromDegrees(rightLeg, -5.5F, 0F, 15F),
				RotationAngle.fromDegrees(rightLowerLeg, 15F, 0F, 0F)
		});
		ModelPose<TheHandEntity> handPose2 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 5F, -10F, 0F),
				RotationAngle.fromDegrees(rightArm, -45.3409F, 63.1383F, 116.7521F),
				RotationAngle.fromDegrees(rightArmJoint, 0F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -10F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 2.5F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 0F)
		});
		ModelPose<TheHandEntity> handPose3 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 6.67F, -20F, -3.33F),
				RotationAngle.fromDegrees(rightArm, -53.6054F, 20.4195F, 101.6022F),
				RotationAngle.fromDegrees(rightArmJoint, 0F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -6.67F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 2.5F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 2.5F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 0F)
		});
		ModelPose<TheHandEntity> handPose4 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 10F, -40F, -5F),
				RotationAngle.fromDegrees(rightArm, -31.4798F, -43.9257F, 37.3255F),
				RotationAngle.fromDegrees(rightArmJoint, 0F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 5F)
		});
		ModelPose<TheHandEntity> handPose5 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 10F, -40F, -5F),
				RotationAngle.fromDegrees(rightArm, -31.4798F, -43.9257F, 37.3255F),
				RotationAngle.fromDegrees(rightArmJoint, 0F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 0F)
		});
		actionAnim.put(TheHandErase.ERASE_POSE, new PosedActionAnimation.Builder<TheHandEntity>()
				.addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPose<TheHandEntity>(new RotationAngle[] {
						RotationAngle.fromDegrees(body, 0F, 10F, 0F),
						RotationAngle.fromDegrees(leftArm, -2.5F, 0F, -5F),
						RotationAngle.fromDegrees(leftForeArm, -20F, 0F, 0F),
						RotationAngle.fromDegrees(rightArm, 45F, 0F, 90F),
						RotationAngle.fromDegrees(rightArmJoint, 45F, 0F, 0F),
						RotationAngle.fromDegrees(rightForeArm, -140F, 35F, -35F),
						RotationAngle.fromDegrees(eraseRot, 0F, 0F, 0F),
						RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 0F),
						RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 0F),
						RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 0F),
						RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 0F),
						RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 0F),
						RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 0F),
						RotationAngle.fromDegrees(leftLeg, -5.5F, 0F, -10F),
						RotationAngle.fromDegrees(leftLowerLeg, 25F, 0F, 0F),
						RotationAngle.fromDegrees(rightLeg, -5.5F, 0F, 15F),
						RotationAngle.fromDegrees(rightLowerLeg, 15F, 0F, 0F)
				}).createRigid())
				.addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransition<>(handPose1, handPose2))
				.addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransitionMultiple.Builder<>(handPose2)
						.addPose(0.5F, handPose3)
						.build(handPose4))
				.addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(handPose4)
						.addPose(0.5F, handPose4)
						.addPose(0.9F, handPose5)
						.build(idlePose))
				.build(idlePose));

		ModelPose.ModelAnim<TheHandEntity> armsRotation = (rotationAmount, entity, ticks, yRotationOffset, xRotation) -> {
			leftArm.xRotSecond = xRotation * MathUtil.DEG_TO_RAD;
			rightArm.xRotSecond = xRotation * MathUtil.DEG_TO_RAD;
		};

		RotationAngle[]erasureRightStart = new RotationAngle[] {
				RotationAngle.fromDegrees(body, 10F, -45F, 0F),
				RotationAngle.fromDegrees(rightArm, -90F, 90F, 0F),
				RotationAngle.fromDegrees(rightArmJoint, 0F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, 0F, 0F, -20F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 0F)
		};

		RotationAngle[] erasureRightImpact = new RotationAngle[] {
				RotationAngle.fromDegrees(rightArm, -90F, 0F, 0F),
				RotationAngle.fromDegrees(rightArmJoint, -24F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, 0F, 0F, -50F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 10F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 5F)
		};

		IModelPose<TheHandEntity> erasureStabStart = new ModelPoseSided<>(
				new ModelPose<TheHandEntity>(mirrorAngles(erasureRightStart)).setAdditionalAnim(armsRotation),
				new ModelPose<TheHandEntity>(erasureRightStart).setAdditionalAnim(armsRotation));

		IModelPose<TheHandEntity> erasureStabImpact = new ModelPoseSided<>(
				new ModelPose<TheHandEntity>(mirrorAngles(erasureRightImpact)).setAdditionalAnim(armsRotation),
				new ModelPose<TheHandEntity>(erasureRightImpact).setAdditionalAnim(armsRotation));

		IModelPose<TheHandEntity> stabLoop = new ModelPoseTransition<TheHandEntity>(erasureStabStart, erasureStabImpact).setEasing(sw -> {
			float halfSwing = sw < 0.4F ? sw * 20 / 8 : sw > 0.6F ? (1 - sw) * 20 / 8 : 1F;
			return halfSwing * halfSwing * halfSwing;
		});

		actionAnim.putIfAbsent(TheHandErasureBarrage.ERASURE_BARRAGE_POSE, new StandOneHandedBarrageAnimation<TheHandEntity>(this,
				stabLoop,
				idlePose,
				Hand.MAIN_HAND));

		ModelPose<TheHandEntity> eraseItem1 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head, 29.5082F, 34.1015F, 6.0722F),
				RotationAngle.fromDegrees(body, 10F, 29.8742F, 5.3807F),
				RotationAngle.fromDegrees(leftArm, -2.5F, 0F, -5F),
				RotationAngle.fromDegrees(leftForeArm, -20F, 0F, 0F),
				RotationAngle.fromDegrees(rightArm, -62.8923F, -27.0377F, 10.4828F),
				RotationAngle.fromDegrees(rightArmJoint, -15F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -91.2283F, -50.6342F, 77.3291F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 0F),
				RotationAngle.fromDegrees(leftLeg, -5.5F, 0F, -10F),
				RotationAngle.fromDegrees(leftLowerLeg, 25F, 0F, 0F),
				RotationAngle.fromDegrees(rightLeg, -5.5F, 0F, 15F),
				RotationAngle.fromDegrees(rightLowerLeg, 15F, 0F, 0F)
		});
		ModelPose<TheHandEntity> eraseItem2 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(rightArmJoint, 0F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -112.7381F, -87.9841F, 99.1049F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 10F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 5F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 5F)
		});

		IModelPose<TheHandEntity> eraseItems = new ModelPoseTransition<TheHandEntity>(eraseItem1, eraseItem2).setEasing(sw -> {
			float halfSwing = sw < 0.4F ? sw * 20 / 8 : sw > 0.6F ? (1 - sw) * 20 / 8 : 1F;
			return halfSwing * halfSwing * halfSwing;
		});

		actionAnim.putIfAbsent(TheHandEraseItem.ERASE_ITEM_POSE, new StandOneHandedBarrageAnimation<TheHandEntity>(this,
				eraseItems,
				idlePose,
				Hand.MAIN_HAND));

		super.initActionPoses();
	}

	@Override
	protected ModelPose<TheHandEntity> initIdlePose() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(upperPart, 0F, 0F, 0F),
				RotationAngle.fromDegrees(leftArm, -2.5F, 0F, -5F),
				RotationAngle.fromDegrees(leftArmJoint, 0F, 0F, 0F),
				RotationAngle.fromDegrees(leftForeArm, -20F, 0F, 0F),
				RotationAngle.fromDegrees(rightArm, -22.5F, -35F, 15F),
				RotationAngle.fromDegrees(rightArmJoint, 34F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -105F, -10F, 0F),
				RotationAngle.fromDegrees(eraseRot, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot2, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot3, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot4, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot5, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot6, 0F, 0F, 0F),
				RotationAngle.fromDegrees(eraseRot7, 0F, 0F, 0F),
				RotationAngle.fromDegrees(leftLeg, -5.5F, 0F, -10F),
				RotationAngle.fromDegrees(leftLowerLeg, 25F, 0F, 0F),
				RotationAngle.fromDegrees(rightLeg, -5.5F, 0F, 15F),
				RotationAngle.fromDegrees(rightLowerLeg, 15F, 0F, 0F)
		});
	}

	@Override
	protected ModelPose<TheHandEntity> initIdlePose2Loop() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(leftArm, 0F, 0F, -5F),
				RotationAngle.fromDegrees(leftForeArm, -22.5F, 0F, 0F),
				RotationAngle.fromDegrees(rightArm, -25F, -35F, 15F),
				RotationAngle.fromDegrees(rightArmJoint, 35F, 0F, 0F),
				RotationAngle.fromDegrees(rightForeArm, -102.5F, -10F, 0F)
		});
	}
}