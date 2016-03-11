package com.drew.morefood.create;

/*/
Drew's Minecraft Mods: More Food
Purpose: Adds more food items for random blocks that are already in the game, like piston and stuff
I know its weird but thats the point, supposed ot be stupid
Created by Drew
Dependencies: (OPTIONAL) Ethan's MSM
/*/

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;

import com.meme.mememod.MemeMod;

import cpw.mods.fml.common.registry.GameRegistry;

public class CreateItems 
{
	
    /*/
    TODO: Make this automatically detect if MSM is installed, this will toggle item recipies for some items
    to use items from his mod, if the mod isnt installed, use a different recipe, 
    for example: DiamondSwordSwordSteak, if mod installed: diamodnswordsword + steak,
    if mod not installed: Just use ethan's recipe (diamondsword + diamondsword + stick) + steak
    /*/
    public static boolean isMsmInstalled = true;

	
    // items:
    public static Item DiamondSteak;
    public static Item PistonSteak;
    public static Item SteakSteak;
    public static Item SteakSteakSteak;
    public static Item SteakSteakSteakSteak; // is that enough?
    public static Item DiamondSwordApple;
    public static Item TNTSteak; // DANGER!!!!
    public static Item DiamondSwordSwordSteak; // NEEDS ETHANS MOD FOR MSM:DIAMONDSWORDSWORD TO CRAFT
	
	
    public static void createItems() 
    {
    	
    }
    
    public static void createRecipes()
    {
    	if(isMsmInstalled)
    	{				  // True means we want msm recipes, false means we dont
            foodRecipes.createFoodRecipes(true)
    	}
    	foodRecipes.createFoodRecipes(false)
    }
}
