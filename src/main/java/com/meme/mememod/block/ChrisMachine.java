package com.meme.mememod.block;

import com.meme.mememod.MemeMod;
import com.meme.mememod.create.CreateBlocks;
import com.meme.mememod.create.CreateItems;
import com.meme.mememod.machine.EntityMachinePrimed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

//TODO: make this do something that after 1 minecraft hour the GET OFF THE MACHINES sound plays and locks you out of it until the next minecraft day
//TODO: make this code not so cancerous looking
public class ChrisMachine extends Block {

	public ChrisMachine(){
		super(Material.rock);
	}
	
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (p_149727_5_.getCurrentEquippedItem() != null && p_149727_5_.getCurrentEquippedItem().getItem() == CreateItems.gtx970)
        {
            this.func_150114_a(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, 1, p_149727_5_);
            //p_149727_1_.setBlockToAir(p_149727_2_, p_149727_3_, p_149727_4_);
            //p_149727_5_.getCurrentEquippedItem().damageItem(1, p_149727_5_);
            return true;
        }
        else
        {
            return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
        }
    }

    public void func_150114_a(World p_150114_1_, int p_150114_2_, int p_150114_3_, int p_150114_4_, int p_150114_5_, EntityLivingBase p_150114_6_)
    {
        if (!p_150114_1_.isRemote)
        {
            if ((p_150114_5_ & 1) == 1)
            {
                EntityMachinePrimed entitytntprimed = new EntityMachinePrimed(p_150114_1_, (double)((float)p_150114_2_ + 0.5F), (double)((float)p_150114_3_ + 0.5F), (double)((float)p_150114_4_ + 0.5F), p_150114_6_);
                p_150114_1_.spawnEntityInWorld(entitytntprimed);
                p_150114_1_.playSoundAtEntity(entitytntprimed, "nz:machines", 1.0F, 1.0F);
            }
        }
    }

}
