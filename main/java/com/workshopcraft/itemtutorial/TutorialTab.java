package com.workshopcraft.itemtutorial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialTab extends CreativeTabs{

	public TutorialTab(String tabName)
	{
		super(tabName);
		
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ItemTutorial.SuperStick;
	}
}
