package kittehmod.variant_crafting_tables.client;

import kittehmod.variant_crafting_tables.blocks.VCTBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class ClientRenderers
{
	public static void initialize() {
		RenderTypeLookup.setRenderLayer(VCTBlocks.GLOWSHROOM_CRAFTING_TABLE.get(), RenderType.translucent());
	}
}
