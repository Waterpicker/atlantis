package com.mystic.atlantis.init;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary
{
	public static void registerOres() 
	{
		OreDictionary.registerOre("oreAquamarine", ModBlocks.AQUAMARINE_ORE);
		OreDictionary.registerOre("ingotAquamarine", ModItems.INGOT_AQUAMARINE);
		OreDictionary.registerOre("blockAquamarine", ModBlocks.BLOCK_OF_AQUAMARINE);
	}
}
