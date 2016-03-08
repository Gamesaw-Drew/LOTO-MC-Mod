package com.meme.mememod.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class OberlordArmor extends ItemArmor {
	public OberlordArmor(ArmorMaterial armorMat, int renderIndex,int armorType) {
		super(armorMat, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "nz:textures/models/armor/oberlord_layer_2.png";
		}
		return "nz:textures/models/armor/oberlord_layer_1.png";
	}
}
