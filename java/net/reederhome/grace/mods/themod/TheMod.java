package net.reederhome.grace.mods.themod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=TheMod.MODID,name=TheMod.NAME)
public class TheMod {
	public static final String MODID="themod";
	public static final String NAME="The Mod";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent ev) {
		
	}
}
