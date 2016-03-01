package com.meme.mememod.init;

import com.meme.mememod.mob.EntityOverlordMinionMob;
import com.meme.mememod.render.mob.ModelEntityOverlordMinion;
import com.meme.mememod.render.mob.RenderOverlordMinionMob;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy implements IProxy
{
	// These three following methods are here to prevent a strange crash in the dedicated server whenever packets are received
	// and the wrapped methods are called directly.


	@Override
	public void registerRenderers() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityOverlordMinionMob.class, new RenderOverlordMinionMob(new ModelEntityOverlordMinion(), 0));

	}
}
	


