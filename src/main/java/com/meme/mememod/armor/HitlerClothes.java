package com.meme.mememod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class HitlerClothes extends ItemArmor {
	public HitlerClothes(ArmorMaterial armorMat, int renderIndex,int armorType) {
		super(armorMat, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "nz:textures/models/armor/hitlerClothes_layer_2";
		}
		return "nz:textures/models/armor/hitlerClothes_layer_1";
	}
}
