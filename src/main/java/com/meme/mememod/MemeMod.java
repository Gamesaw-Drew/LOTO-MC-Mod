package com.meme.mememod;

import com.meme.mememod.armor.HitlerClothes;
import com.meme.mememod.armor.OberlordArmor;
import com.meme.mememod.armor.dwiGlassesHelm;
import com.meme.mememod.block.ChrisMachine;
import com.meme.mememod.crafting.LotoRecipes;
import com.meme.mememod.crafting.MemeModRecipes;
import com.meme.mememod.create.CreateBlocks;
import com.meme.mememod.create.CreateItems;
import com.meme.mememod.dimension.DimensionOverlord;
import com.meme.mememod.init.IProxy;
import com.meme.mememod.item.ChipmunkMeme;
import com.meme.mememod.item.DebNotes;
import com.meme.mememod.item.Gtx970;
import com.meme.mememod.item.ItemAmdSword;
import com.meme.mememod.item.ItemClassicBow;
import com.meme.mememod.item.ItemOberlordAxe;
import com.meme.mememod.item.ItemOberlordPick;
import com.meme.mememod.item.ItemOberlordSword;
import com.meme.mememod.mob.EntityOverlordMinion;
import com.meme.mememod.mob.EntityOverlordMinionMob;
import com.meme.mememod.render.mob.ModelEntityOverlordMinion;
import com.meme.mememod.render.mob.RenderOverlordMinionMob;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
@Mod(modid = MemeMod.MODID, version = MemeMod.VERSION)
public class MemeMod {
	@SidedProxy(clientSide = "com.meme.mememod.init.ClientProxy", serverSide = "com.meme.mememod.init.ServerProxy")
	public static IProxy proxy;
	public static MemeModRecipes memerecipes;
	
	public static final String MODID = "mememod";
	public static final String VERSION = "Alpha 1.4.1";

	@Metadata
	public static ModMetadata meta;
	
	@Instance(MemeMod.MODID)
	public static MemeMod modInstance;
	
	
	// Toggles LOTO Build. (Disables and enables specific features)
	public static boolean lotobuild = true;
	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent)
	{
		// Create the overlord minion
		EntityOverlordMinion.summonOberlordMinion();
		
		// TODO: Costa / DiBenedetto mobs
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenderers();

		// Create blocks
		CreateBlocks.createBlocks();
		CreateItems.createItems();

		// Initialize Crafting Recipes
		
		memerecipes.initItemRecipes();
		memerecipes.initBlockRecipes();
		
		// Initialize Loto Crafting Recipes (IF LOTO MOD)
		if (lotobuild){
			LotoRecipes.initItemRecipes();
			LotoRecipes.initBlockRecipes();
		}
		
	}
	
	public static CreativeTabs tabMemeMod = new CreativeTabs("tabMemeMod"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(CreateItems.gtx970).getItem();
		}
		
		
	};
	
	public static CreativeTabs tabLoto = new CreativeTabs("tabLoto"){
			@Override
			public Item getTabIconItem(){
				
				if (lotobuild){
					return new ItemStack(CreateItems.oberlordSword).getItem();
				}
				
				else{
					return new ItemStack(CreateItems.chipmunkmeme).getItem();
				}
		}
		
		
		
	};
	
}
