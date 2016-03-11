package com.meme.mememod.create;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;

import com.meme.mememod.MemeMod;
import com.meme.mememod.armor.OberlordArmor;
import com.meme.mememod.armor.dwiGlassesHelm;
import com.meme.mememod.block.ChrisMachine;
import com.meme.mememod.item.ChipmunkMeme;
import com.meme.mememod.item.DebNotes;
import com.meme.mememod.item.Gtx970;
import com.meme.mememod.item.ItemAmdSword;
import com.meme.mememod.item.ItemClassicBow;
import com.meme.mememod.item.ItemOberlordAxe;
import com.meme.mememod.item.ItemOberlordPick;
import com.meme.mememod.item.ItemOberlordSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class CreateItems 
{
	public static Item dwiglasses;
	public static Item chipmunkmeme;
	public static Item gtx970;
	public static Item debnotes;
	public static Item glassesrims;
	public static Item glasseslens;
	public static Item hitlerHelm;
	public static Item hitlerTop;
	public static Item hitlerBottom;
	public static Item hitlerShoes;
	public static Item oberlordSword;
	public static Item oberlordPick;
	public static Item oberlordAxe;
	public static Item oberlordHead;
	public static Item oberlordTorso;
	public static Item oberlordLegs;
	public static Item oberlordShoes;
	public static Item kappaFish;
	public static Item amdSword;
	public static Item classicBow;
	public static Item deadChipmunk;
	public static final Item.ToolMaterial amdToolMaterial = EnumHelper.addToolMaterial("amdToolMaterial", 1, 23, 10.0F, 2F, 30);
	public static final Item.ToolMaterial oberlordToolMaterial = EnumHelper.addToolMaterial("oberlordToolMaterial", 5, 16542, 20.0F, 16.0F, 30);
	public static final ItemArmor.ArmorMaterial dwiGlassesMaterial = EnumHelper.addArmorMaterial("dwiGlassesMaterial", 6969, new int[]{4,6,3,2}, 30);
	public static final ItemArmor.ArmorMaterial oberlordArmorMaterial = EnumHelper.addArmorMaterial("oberlordArmorMaterial", 6969, new int[]{4,6,3,2}, 30);
	
    public static void createItems() 
    {

		// Main Items:
		// Deal with it Glasses Helmet Item
		dwiglasses = new dwiGlassesHelm(dwiGlassesMaterial, 0, 0).setUnlocalizedName("dwiglasses").setCreativeTab(MemeMod.tabMemeMod).setTextureName("nz:dwiglasses");
		GameRegistry.registerItem(dwiglasses, dwiglasses.getUnlocalizedName().substring(5));
		
		// Chipmunk Meme item
		chipmunkmeme = new ChipmunkMeme().setUnlocalizedName("ChipmunkMeme").setTextureName("nz:chipmunkmeme").setCreativeTab(MemeMod.tabLoto);
		GameRegistry.registerItem(chipmunkmeme, chipmunkmeme.getUnlocalizedName().substring(5));
		
		// 970
		gtx970 = new Gtx970().setUnlocalizedName("Gtx970").setTextureName("nz:gpu970").setCreativeTab(MemeMod.tabMemeMod);
		GameRegistry.registerItem(gtx970, gtx970.getUnlocalizedName().substring(5));
		
		debnotes = new DebNotes().setUnlocalizedName("DebNotes").setTextureName("nz:debnotes").setCreativeTab(MemeMod.tabMemeMod);
		GameRegistry.registerItem(debnotes, debnotes.getUnlocalizedName().substring(5));
		
		// Oberlord Armor
		oberlordHead = new OberlordArmor(oberlordArmorMaterial, 0, 0).setUnlocalizedName("OberlordHead").setCreativeTab(MemeMod.tabLoto);
		oberlordTorso = new OberlordArmor(oberlordArmorMaterial, 0, 1).setUnlocalizedName("OberlordTorso").setCreativeTab(MemeMod.tabLoto);
		oberlordLegs = new OberlordArmor(oberlordArmorMaterial, 0, 2).setUnlocalizedName("OberlordLegs").setCreativeTab(MemeMod.tabLoto);
		oberlordShoes = new OberlordArmor(oberlordArmorMaterial, 0, 3).setUnlocalizedName("OberlordShoes").setCreativeTab(MemeMod.tabLoto);
		
		if (MemeMod.lotobuild){
			// Oberlord Armor
			GameRegistry.registerItem(oberlordHead, oberlordHead.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(oberlordTorso, oberlordTorso.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(oberlordLegs, oberlordLegs.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(oberlordShoes, oberlordShoes.getUnlocalizedName().substring(5));
		}
		
		if (MemeMod.lotobuild){
			// Oberlord Items
			oberlordSword = new ItemOberlordSword(oberlordToolMaterial).setUnlocalizedName("OberlordSword").setCreativeTab(MemeMod.tabLoto).setTextureName("nz:oberlordsword");
			oberlordPick = new ItemOberlordPick(oberlordToolMaterial).setUnlocalizedName("OberlordPick").setCreativeTab(MemeMod.tabLoto).setTextureName("nz:oberlordpick");
			oberlordAxe = new ItemOberlordAxe(oberlordToolMaterial).setUnlocalizedName("OberlordAxe").setCreativeTab(MemeMod.tabLoto).setTextureName("nz:oberlordaxe");
			GameRegistry.registerItem(oberlordSword, oberlordSword.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(oberlordPick, oberlordPick.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(oberlordAxe, oberlordAxe.getUnlocalizedName().substring(5));
		}
		
		kappaFish = new ItemFood(20, 1.0F, true).setUnlocalizedName("kappaFish").setCreativeTab(MemeMod.tabMemeMod).setTextureName("nz:item.kappafish");
		GameRegistry.registerItem(kappaFish, kappaFish.getUnlocalizedName().substring(5));		
		
		amdSword = new ItemAmdSword(amdToolMaterial).setUnlocalizedName("sword.amd").setCreativeTab(MemeMod.tabMemeMod).setTextureName("nz:sword.amd");
		GameRegistry.registerItem(amdSword, amdSword.getUnlocalizedName().substring(5));
		
		classicBow = new ItemClassicBow().setUnlocalizedName("classicBow").setCreativeTab(MemeMod.tabMemeMod).setTextureName("nz:classicbow");
		GameRegistry.registerItem(classicBow, classicBow.getUnlocalizedName().substring(5));
		
		// TODO
		//deadChipmunk = new ItemDeadChipmunk().setUnlocalizedName("deadChipmunk").setCreativeTab(MemeMod.tabLoto).setTextureName("nz:deadChipmunk");
    }
    
}
