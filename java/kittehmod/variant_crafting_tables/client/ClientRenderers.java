package kittehmod.variant_crafting_tables.client;

import kittehmod.variant_crafting_tables.blocks.VCTBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class ClientRenderers
{
	public static void initialize() {
		ItemBlockRenderTypes.setRenderLayer(VCTBlocks.GLOWSHROOM_CRAFTING_TABLE.get(), RenderType.translucent());
	}
}
