package net.reederhome.grace.mods.themod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=TheMod.MODID,name=TheMod.NAME,version=TheMod.VERSION)
public class TheMod {
	public static final String MODID="themod";
	public static final String NAME="The Mod";
	public static final String VERSION="0.0.0";
	
	public static Block blockBlock=new BlockBlock();
	public static Item itemItem=new ItemItem();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent ev) {
		GameRegistry.registerBlock(blockBlock, "blockBlock");
		GameRegistry.registerItem(itemItem, "itemItem");
		
		GameRegistry.addRecipe(new ItemStack(itemItem),"byb","oso","ryr",'b',new ItemStack(Items.dye, 1, 4),'y',new ItemStack(Items.dye, 1, 11),'o',new ItemStack(Items.dye, 1, 14),'s',Items.stick,'r',Items.redstone);
		GameRegistry.addRecipe(new ItemStack(blockBlock),"scs","wIw","rir",'s',Blocks.stone,'c',Blocks.cobblestone,'w',Blocks.planks,'I',itemItem,'r',Items.redstone,'i',Items.iron_ingot);
	}
}
