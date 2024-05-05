package kittehmod.vct.client;

import kittehmod.vct.entities.VCTEntities;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.MinecartRenderer;

public class ClientRenderers
{
	public static void initialize() {		
		EntityRenderers.register(VCTEntities.CRAFTING_TABLE_MINECART.get(), (entity) -> { return new MinecartRenderer<>(entity, ModelLayers.MINECART); });
	}
}
