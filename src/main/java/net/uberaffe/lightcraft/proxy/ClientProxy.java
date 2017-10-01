package net.uberaffe.lightcraft.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.uberaffe.lightcraft.LightCraftMod;
import net.uberaffe.lightcraft.Items.DraftBase;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerItemRenderer(DraftBase item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(LightCraftMod.modId + ":" + id, "inventory"));
	}
	
}
