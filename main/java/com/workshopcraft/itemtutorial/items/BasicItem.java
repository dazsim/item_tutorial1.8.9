package com.workshopcraft.itemtutorial.items;

import com.workshopcraft.itemtutorial.ItemTutorial;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicItem extends Item{

	private String name = "";
	Item setCreativeTab;
	
	public BasicItem()
	{
		if (name.equals(""))
		{
			// do nothing
		} else
		{
			GameRegistry.registerItem(this,  name);
		}
		setUnlocalizedName(ItemTutorial.MODID + "_" + name);
		setMaxStackSize(64);
		setCreativeTab(ItemTutorial.myTab);

	}
	public BasicItem(String uname)
	{
		super();
		GameRegistry.registerItem(this,uname);
		name = uname;
		this.setUnlocalizedName(ItemTutorial.MODID + "_" + name);
		setCreativeTab(ItemTutorial.myTab);
		
	}
	
	public String getName()
	{
		return name;
		
	}
}
