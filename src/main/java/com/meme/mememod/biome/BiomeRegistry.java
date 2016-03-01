package com.meme.mememod.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry 
{

	public static void MainClass()
	{
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeOverlord;
	
	
	public static void initializeBiome()
	{
		biomeOverlord = new BiomeGenOverlord(169).setBiomeName("Overlord");
	}
	
	public static void registerBiome()
	{
		BiomeDictionary.registerBiomeType(biomeOverlord, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeOverlord);
		
	}
	
}
