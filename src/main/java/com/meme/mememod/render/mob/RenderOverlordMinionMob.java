package com.meme.mememod.render.mob;

import com.meme.mememod.mob.EntityOverlordMinionMob;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderOverlordMinionMob extends RenderBiped {

	private static final ResourceLocation mobTextures = new ResourceLocation("nz:textures/entity/OverlordMinion.png");
	
	public RenderOverlordMinionMob(ModelBiped p1ModelBase, float p2) {
		super(p1ModelBase, p2);
		
	}

	protected ResourceLocation getEntityTexture(EntityOverlordMinionMob entity)
	{
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityOverlordMinionMob)entity);
	}

}
