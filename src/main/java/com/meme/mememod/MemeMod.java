package com.meme.mememod;

import com.meme.mememod.armor.HitlerClothes;
import com.meme.mememod.armor.dwiGlassesHelm;
import com.meme.mememod.block.ChrisMachine;
import com.meme.mememod.crafting.LotoRecipes;
import com.meme.mememod.crafting.MemeModRecipes;
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
	public static final ItemArmor.ArmorMaterial hitlerClothesMaterial = EnumHelper.addArmorMaterial("hitlerClothesMaterial", 6969, new int[]{4,6,3,2}, 30);
	public static final ItemArmor.ArmorMaterial dwiGlassesMaterial = EnumHelper.addArmorMaterial("dwiGlassesMaterial", 6969, new int[]{4,6,3,2}, 30);

	@Metadata
	public static ModMetadata meta;
	
	@Instance(MemeMod.MODID)
	public static MemeMod modInstance;
	
	// Chris's Machine (M)
	public static Block ChrisMachine;

	// Deal with it glasses (D)
	public static Item dwiglasses;
	
	// Chipmunk Meme Item (C)
	public static Item chipmunkmeme;

	// 970 item (G)
	public static Item gtx970;
	
	// Deb's Notes (N)
	public static Item debnotes;
	
	// Sub Items (Items used for crafting the Main Items):
	
	// Crafting DWIGlasses:
	// Rims (R)
	public static Item glassesrims;
	
	// Lens (L)
	public static Item glasseslens;
	
	// hitlerHelm
	public static Item hitlerHelm;
	public static Item hitlerTop;
	public static Item hitlerBottom;
	public static Item hitlerShoes;
	
	// Oberlord Items
	public static Item oberlordSword;
	public static Item oberlordPick;
	public static Item oberlordAxe;
	
	// Kappafish
	public static Item kappaFish;
	
	// Amd Sword
	public static Item amdSword;
	
	public static Item classicBow;
	
	// Amd Tool Material
	public static final Item.ToolMaterial amdToolMaterial = EnumHelper.addToolMaterial("amdToolMaterial", 1, 23, 10.0F, 2F, 30);
	
	// Oberlord Tool Material
	public static final Item.ToolMaterial oberlordToolMaterial = EnumHelper.addToolMaterial("oberlordToolMaterial", 5, 16542, 20.0F, 16.0F, 30);
	
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
		
		// this prevents server crashing
		proxy.registerRenderers();
		
		
		ChrisMachine = new ChrisMachine().setBlockName("ChrisMachine").setBlockTextureName("nz:chrismachine").setCreativeTab(tabMemeMod);
		GameRegistry.registerBlock(ChrisMachine, ChrisMachine.getUnlocalizedName().substring(5));
		
		// Main Items:
		// Deal with it Glasses Helmet Item
		dwiglasses = new dwiGlassesHelm(dwiGlassesMaterial, 0, 0).setUnlocalizedName("dwiglasses").setCreativeTab(tabMemeMod).setTextureName("nz:dwiglasses");
		GameRegistry.registerItem(dwiglasses, dwiglasses.getUnlocalizedName().substring(5));
		
		// Chipmunk Meme item
		chipmunkmeme = new ChipmunkMeme().setUnlocalizedName("ChipmunkMeme").setTextureName("nz:chipmunkmeme").setCreativeTab(tabLoto);
		GameRegistry.registerItem(chipmunkmeme, chipmunkmeme.getUnlocalizedName().substring(5));
		
		// 970
		gtx970 = new Gtx970().setUnlocalizedName("Gtx970").setTextureName("nz:gpu970").setCreativeTab(tabMemeMod);
		GameRegistry.registerItem(gtx970, gtx970.getUnlocalizedName().substring(5));
		
		debnotes = new DebNotes().setUnlocalizedName("DebNotes").setTextureName("nz:debnotes").setCreativeTab(tabMemeMod);
		GameRegistry.registerItem(debnotes, debnotes.getUnlocalizedName().substring(5));
		
		// Hitler Clothes
		hitlerHelm = new HitlerClothes(hitlerClothesMaterial, 0, 0).setUnlocalizedName("HitlerHelm").setCreativeTab(tabMemeMod);
		hitlerTop = new HitlerClothes(hitlerClothesMaterial, 0, 1).setUnlocalizedName("HitlerTop").setCreativeTab(tabMemeMod);
		hitlerBottom = new HitlerClothes(hitlerClothesMaterial, 0, 2).setUnlocalizedName("HitlerBottom").setCreativeTab(tabMemeMod);
		hitlerShoes = new HitlerClothes(hitlerClothesMaterial, 0, 3).setUnlocalizedName("HitlerShoes").setCreativeTab(tabMemeMod);
		
		if (!lotobuild){
			// Hitler's Clothes (Disable for LOTO Builds)
			GameRegistry.registerItem(hitlerHelm, hitlerHelm.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(hitlerTop, hitlerTop.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(hitlerBottom, hitlerBottom.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(hitlerShoes, hitlerShoes.getUnlocalizedName().substring(5));
		}
		
		if (lotobuild){
			// Oberlord Items
			oberlordSword = new ItemOberlordSword(oberlordToolMaterial).setUnlocalizedName("OberlordSword").setCreativeTab(tabLoto).setTextureName("nz:oberlordsword");
			oberlordPick = new ItemOberlordPick(oberlordToolMaterial).setUnlocalizedName("OberlordPick").setCreativeTab(tabLoto).setTextureName("nz:oberlordpick");
			oberlordAxe = new ItemOberlordAxe(oberlordToolMaterial).setUnlocalizedName("OberlordAxe").setCreativeTab(tabLoto).setTextureName("nz:oberlordaxe");
			GameRegistry.registerItem(oberlordSword, oberlordSword.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(oberlordPick, oberlordPick.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(oberlordAxe, oberlordAxe.getUnlocalizedName().substring(5));
		}
		
		kappaFish = new ItemFood(20, 1.0F, true).setUnlocalizedName("kappaFish").setCreativeTab(tabMemeMod).setTextureName("nz:item.kappafish");
		GameRegistry.registerItem(kappaFish, kappaFish.getUnlocalizedName().substring(5));		
		
		amdSword = new ItemAmdSword(amdToolMaterial).setUnlocalizedName("sword.amd").setCreativeTab(tabMemeMod).setTextureName("nz:sword.amd");
		GameRegistry.registerItem(amdSword, amdSword.getUnlocalizedName().substring(5));
		
		classicBow = new ItemClassicBow().setUnlocalizedName("classicBow").setCreativeTab(tabMemeMod).setTextureName("nz:classicbow");
		GameRegistry.registerItem(classicBow, classicBow.getUnlocalizedName().substring(5));

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
			return new ItemStack(gtx970).getItem();
		}
		
		
	};
	
	public static CreativeTabs tabLoto = new CreativeTabs("tabLoto"){
			@Override
			public Item getTabIconItem(){
				
				if (lotobuild){
					return new ItemStack(oberlordSword).getItem();
				}
				
				else{
					return new ItemStack(chipmunkmeme).getItem();
				}
		}
		
		
		
	};
	
}
