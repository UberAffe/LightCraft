package net.uberaffe.lightcraft.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.uberaffe.lightcraft.LightCraftMod;

public class DraftBase extends Item {

	protected String name;
	
	public DraftBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		LightCraftMod.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public DraftBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
