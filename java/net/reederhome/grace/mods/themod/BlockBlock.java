package net.reederhome.grace.mods.themod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockBlock extends Block {

	Block block;
	public BlockBlock() {
		super(Material.rock);
		do {
			Object[] keys = Block.blockRegistry.getKeys().toArray();
			block = (Block)Block.blockRegistry.getObject(keys[new Random().nextInt(keys.length)]);
		} while(block==this);
		System.out.println(block.getUnlocalizedName());
		setBlockName("blockBlock");
	}
	public IIcon getIcon(int s, int m) {
		return block.getIcon(s, m);
	}
}
