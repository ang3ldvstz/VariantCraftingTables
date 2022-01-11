package kittehmod.variant_crafting_tables.crafting.conditions;

import com.google.gson.JsonObject;

import kittehmod.variant_crafting_tables.VariantCraftingTablesMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.minecraftforge.fml.ModList;

public class CavernsChasmsModInstalledCondition implements ICondition
{
	private final ResourceLocation location;

	public CavernsChasmsModInstalledCondition(ResourceLocation location) {
		this.location = location;
	}
	
	@Override
	public ResourceLocation getID() {
		return this.location;
	}

	@Override
	public boolean test() {
		return ModList.get().isLoaded("caverns_and_chasms");
	}

	public static class Serializer implements IConditionSerializer<CavernsChasmsModInstalledCondition> {
		private final ResourceLocation location;

		public Serializer() {
			this.location = new ResourceLocation(VariantCraftingTablesMod.MOD_ID, "caverns_and_chasms_mod_installed");
		}

		@Override
		public void write(JsonObject json, CavernsChasmsModInstalledCondition value) {
			// Nothing to write here...
		}

		@Override
		public CavernsChasmsModInstalledCondition read(JsonObject json) {
			return new CavernsChasmsModInstalledCondition(this.location);
		}

		@Override
		public ResourceLocation getID() {
			return this.location;
		}
	}
}