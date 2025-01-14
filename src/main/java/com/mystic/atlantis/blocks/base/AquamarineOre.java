package com.mystic.atlantis.blocks.base;

import java.util.Random;

import com.mystic.atlantis.blocks.BlockBase;
import com.mystic.atlantis.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

import net.minecraft.item.Item;

public class AquamarineOre extends BlockBase 
{

	public AquamarineOre(String name, Material material) 
	{
		
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.3F); //Light Value has to be 0 to 1!
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.INGOT_AQUAMARINE;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 2;
    }
}
	

