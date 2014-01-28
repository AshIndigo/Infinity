package com.Infinity.mod.lib;

import com.Infinity.mod.InfinityMain;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class InfinityToolsTabCreativeTab extends CreativeTabs
{
    public InfinityToolsTabCreativeTab(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return InfinityMain.StoneStick.itemID;
       
    }

    public String getTranslatedTabLabel()
    {
        return "Xgen Mod Creative Tab";
    }
}