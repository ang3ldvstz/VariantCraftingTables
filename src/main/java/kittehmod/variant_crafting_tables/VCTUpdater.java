package kittehmod.variant_crafting_tables;

import com.google.common.collect.ImmutableList;

import kittehmod.variant_crafting_tables.blocks.VCTBlocks;
import kittehmod.variant_crafting_tables.items.VCTItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.MissingMappings.Mapping;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;

public class VCTUpdater
{
	// Update Better Azalea to Ecologics.
	@SubscribeEvent
	public void updateMissingMappingsForBlocks(RegistryEvent.MissingMappings<Block> event) {
		ImmutableList<Mapping<Block>> map = event.getMappings(VariantCraftingTablesMod.MOD_ID);
		for (RegistryEvent.MissingMappings.Mapping<Block> entry : map) {
			if (ModList.get().isLoaded("ecologics")) {
				if (entry.key.getPath().equalsIgnoreCase("ba_azalea_crafting_table")) {
					entry.remap(VCTBlocks.ECO_AZALEA_CRAFTING_TABLE.get());
				}
				if (entry.key.getPath().equalsIgnoreCase("ba_flowering_azalea_crafting_table")) {
					entry.remap(VCTBlocks.ECO_FLOWERING_AZALEA_CRAFTING_TABLE.get());
				}
				if (entry.key.getPath().equalsIgnoreCase("coconut_crafting_table")) {
					entry.remap(VCTBlocks.ECO_COCONUT_CRAFTING_TABLE.get());
				}
			}
		}
	}
	
	@SubscribeEvent
	public void updateMissingMappingsForItems(RegistryEvent.MissingMappings<Item> event) {
		ImmutableList<Mapping<Item>> map = event.getMappings(VariantCraftingTablesMod.MOD_ID);
		for (RegistryEvent.MissingMappings.Mapping<Item> entry : map) {
			if (ModList.get().isLoaded("ecologics")) {
				if (entry.key.getPath().equalsIgnoreCase("ba_azalea_crafting_table")) {
					entry.remap(VCTItems.ECO_AZALEA_CRAFTING_TABLE.get());
				}
				if (entry.key.getPath().equalsIgnoreCase("ba_flowering_azalea_crafting_table")) {
					entry.remap(VCTItems.ECO_FLOWERING_AZALEA_CRAFTING_TABLE.get());
				}
				if (entry.key.getPath().equalsIgnoreCase("coconut_crafting_table")) {
					entry.remap(VCTItems.ECO_COCONUT_CRAFTING_TABLE.get());
				}
			}
		}
	}
}
