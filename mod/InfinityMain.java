
package com.Infinity.mod;

import java.util.logging.Level;

import com.Infinity.mod.lib.InfinityLogHelper;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = InfinityMain.modid, name = "Infinity Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class InfinityMain {
	
	public static final String modid = "infinitymod";
	public static CreativeTabs InfinityToolsTabCreativeTab = new com.Infinity.mod.lib.InfinityToolsTabCreativeTab(CreativeTabs.getNextID(), "InfinityToolsTabCreativeTab");
	
	@EventHandler
	public void load(FMLPreInitializationEvent event) {
	InfinityLogHelper.log(Level.INFO, "Starting Infinity By Ash and Buffalo");
	
}
}



