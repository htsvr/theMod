package net.reederhome.grace.mods.themod;

import java.util.Random;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IIcon;

public class ItemItem extends Item {

	Item item;
	public ItemItem() {
		super();
		do {
			Object[] keys = Item.itemRegistry.getKeys().toArray();
			item = (Item)Item.itemRegistry.getObject(keys[new Random().nextInt(keys.length)]);
		} while(item==this||item instanceof ItemBlock);
		System.out.println(item.getUnlocalizedName());
		setUnlocalizedName("itemItem");
	}
	public IIcon getIconFromDamage(int m){
		return item.getIconFromDamage(m);
	}
}
