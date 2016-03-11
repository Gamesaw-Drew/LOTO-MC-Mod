package com.meme.mememod.create;

import net.minecraft.block.Block;

import com.meme.mememod.MemeMod;
import com.meme.mememod.block.ChrisMachine;

import cpw.mods.fml.common.registry.GameRegistry;

public class CreateBlocks 
{
	public static Block ChrisMachine;
	
    public static void createBlocks() 
    {
    	ChrisMachine = new ChrisMachine().setBlockName("ChrisMachine").setBlockTextureName("nz:chrismachine").setCreativeTab(MemeMod.tabMemeMod);
    	GameRegistry.registerBlock(ChrisMachine, ChrisMachine.getUnlocalizedName().substring(5));
    	
    }
    
}
