package com.meme.mememod.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class ChipmunkMeme extends Item {
	public ChipmunkMeme() {
		this.setMaxStackSize(64);
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean par4)
	{
		lores.add("§3§lSummon the lord CHIPMUNK!");
	} 
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
		float var4 = 1.0F;
		int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
		int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D);
		int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

		if(true){
		
			if(entity instanceof EntityPlayer){MinecraftServer minecraftserver = MinecraftServer.getServer();if(minecraftserver!=null)minecraftserver.getCommandManager().executeCommand((EntityPlayer)entity, "tpa chipmunk48 here");}
	}
		return itemstack;

	}
}
