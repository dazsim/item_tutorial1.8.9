package com.workshopcraft.itemtutorial;

import com.workshopcraft.itemtutorial.items.BasicItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ItemTutorial.MODID, version = ItemTutorial.VERSION)
public class ItemTutorial
{
    public static final String MODID = "ItemTutorial";
    public static final String VERSION = "1.0";
    
    public static BasicItem SuperStick;
    public static TutorialTab myTab;
    
    @EventHandler 
    public void preinit(FMLPreInitializationEvent event)
    {	
    	myTab = new TutorialTab("tabTutorialTab");
    	SuperStick = new BasicItem("superstick");
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	GameRegistry.addRecipe(new ItemStack(SuperStick,1), new Object[]{
    			"A  ",
    			"A  ",
    			'A',Blocks.obsidian
    	});
    	
    	
    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	renderItem.getItemModelMesher().register(SuperStick, 0, new ModelResourceLocation(ItemTutorial.MODID + ":" + ((BasicItem) SuperStick).getName(),"inventory"));
        
    }
}

