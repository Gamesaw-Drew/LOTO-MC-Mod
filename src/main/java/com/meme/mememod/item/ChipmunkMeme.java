package com.meme.mememod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ChipmunkMeme extends Item {
	public ChipmunkMeme() {
		this.setMaxStackSize(64);
	}
	
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_){
		return p_77659_1_;
		
	}
}
