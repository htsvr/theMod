package net.reederhome.grace.mods.themod;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=TheMod.MODID,name=TheMod.NAME)
public class TheMod {
	public static final String MODID="themod";
	public static final String NAME="The Mod";
	
	public static Block blockBlock=new BlockBlock();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent ev) {
		GameRegistry.registerBlock(blockBlock, "blockBlock");
	}
}