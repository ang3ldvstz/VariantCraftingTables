package kittehmod.variant_crafting_tables.items;

import javax.annotation.Nullable;

import kittehmod.variant_crafting_tables.VariantCraftingTablesMod;
import kittehmod.variant_crafting_tables.blocks.VCTBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VCTItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VariantCraftingTablesMod.MOD_ID);
	
	// Vanilla
	public static final RegistryObject<Item> SPRUCE_CRAFTING_TABLE = ITEMS.register("spruce_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SPRUCE_CRAFTING_TABLE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<Item> BIRCH_CRAFTING_TABLE = ITEMS.register("birch_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BIRCH_CRAFTING_TABLE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<Item> JUNGLE_CRAFTING_TABLE = ITEMS.register("jungle_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.JUNGLE_CRAFTING_TABLE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<Item> ACACIA_CRAFTING_TABLE = ITEMS.register("acacia_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ACACIA_CRAFTING_TABLE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<Item> DARK_OAK_CRAFTING_TABLE = ITEMS.register("dark_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DARK_OAK_CRAFTING_TABLE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<Item> CRIMSON_CRAFTING_TABLE = ITEMS.register("crimson_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CRIMSON_CRAFTING_TABLE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<Item> WARPED_CRAFTING_TABLE = ITEMS.register("warped_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WARPED_CRAFTING_TABLE.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	
    /* The big, popular mods */
	// Biomes o' Plenty
	public static final RegistryObject<Item> BOP_CHERRY_CRAFTING_TABLE = ITEMS.register("bop_cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_CHERRY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_DEAD_CRAFTING_TABLE = ITEMS.register("bop_dead_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_DEAD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_FIR_CRAFTING_TABLE = ITEMS.register("bop_fir_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_FIR_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_HELLBARK_CRAFTING_TABLE = ITEMS.register("bop_hellbark_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_HELLBARK_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_JACARANDA_CRAFTING_TABLE = ITEMS.register("bop_jacaranda_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_JACARANDA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_MAGIC_CRAFTING_TABLE = ITEMS.register("bop_magic_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_MAGIC_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_MAHOGANY_CRAFTING_TABLE = ITEMS.register("bop_mahogany_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_MAHOGANY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_PALM_CRAFTING_TABLE = ITEMS.register("bop_palm_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_PALM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_REDWOOD_CRAFTING_TABLE = ITEMS.register("bop_redwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_REDWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_UMBRAN_CRAFTING_TABLE = ITEMS.register("bop_umbran_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_UMBRAN_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	public static final RegistryObject<Item> BOP_WILLOW_CRAFTING_TABLE = ITEMS.register("bop_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_WILLOW_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty")))));
	
	// Twilight Forest
	public static final RegistryObject<Item> CANOPY_CRAFTING_TABLE = ITEMS.register("canopy_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CANOPY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest")))));
	public static final RegistryObject<Item> DARKWOOD_CRAFTING_TABLE = ITEMS.register("darkwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DARKWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest")))));
	public static final RegistryObject<Item> MANGROVE_CRAFTING_TABLE = ITEMS.register("mangrove_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MANGROVE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest")))));
	public static final RegistryObject<Item> MINEWOOD_CRAFTING_TABLE = ITEMS.register("minewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MINEWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest")))));
	public static final RegistryObject<Item> SORTINGWOOD_CRAFTING_TABLE = ITEMS.register("sortingwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SORTINGWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest")))));
	public static final RegistryObject<Item> TIMEWOOD_CRAFTING_TABLE = ITEMS.register("timewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TIMEWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest")))));
	public static final RegistryObject<Item> TRANSWOOD_CRAFTING_TABLE = ITEMS.register("transwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TRANSWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest")))));
	public static final RegistryObject<Item> TWILIGHT_OAK_CRAFTING_TABLE = ITEMS.register("twilight_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TWILIGHT_OAK_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest")))));

	/* Abnormals Mods */
	// Atmospheric
	public static final RegistryObject<Item> ASPEN_CRAFTING_TABLE = ITEMS.register("aspen_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ASPEN_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> GRIMWOOD_CRAFTING_TABLE = ITEMS.register("grimwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GRIMWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> KOUSA_CRAFTING_TABLE = ITEMS.register("kousa_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.KOUSA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> MORADO_CRAFTING_TABLE = ITEMS.register("morado_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MORADO_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> ROSEWOOD_CRAFTING_TABLE = ITEMS.register("rosewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ROSEWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> YUCCA_CRAFTING_TABLE = ITEMS.register("yucca_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.YUCCA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", ItemGroup.TAB_DECORATIONS))));
	
	// Autumnity
	public static final RegistryObject<Item> MAPLE_CRAFTING_TABLE = ITEMS.register("maple_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MAPLE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("autumnity", ItemGroup.TAB_DECORATIONS))));
	
	// Bamboo Blocks
	public static final RegistryObject<Item> BAMBOO_CRAFTING_TABLE = ITEMS.register("bamboo_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BAMBOO_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("bamboo_blocks", ItemGroup.TAB_DECORATIONS))));
	
	// Endergetic Expansion
	public static final RegistryObject<Item> POISE_CRAFTING_TABLE = ITEMS.register("poise_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.POISE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("endergetic_expansion", ItemGroup.TAB_DECORATIONS))));
	
	// Environmental
	public static final RegistryObject<Item> CHERRY_CRAFTING_TABLE = ITEMS.register("cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CHERRY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("environmental", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> WILLOW_CRAFTING_TABLE = ITEMS.register("willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WILLOW_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("environmental", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> WISTERIA_CRAFTING_TABLE = ITEMS.register("wisteria_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WISTERIA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("environmental", ItemGroup.TAB_DECORATIONS))));
	
	// Upgrade Aquatic
	public static final RegistryObject<Item> DRIFTWOOD_CRAFTING_TABLE = ITEMS.register("driftwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DRIFTWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("upgrade_aquatic", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> RIVER_CRAFTING_TABLE = ITEMS.register("river_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RIVER_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("upgrade_aquatic", ItemGroup.TAB_DECORATIONS))));
	
	/* Team Aurora Mods */
	// Abundance
	public static final RegistryObject<Item> JACARANDA_CRAFTING_TABLE = ITEMS.register("jacaranda_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.JACARANDA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("abundance", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> REDBUD_CRAFTING_TABLE = ITEMS.register("redbud_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.REDBUD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("abundance", ItemGroup.TAB_DECORATIONS))));

	// Bayou Blues
	public static final RegistryObject<Item> CYPRESS_CRAFTING_TABLE = ITEMS.register("cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CYPRESS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("bayou_blues", ItemGroup.TAB_DECORATIONS))));
	
	// Enhanced Mushrooms
	public static final RegistryObject<Item> BROWN_MUSHROOM_CRAFTING_TABLE = ITEMS.register("brown_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BROWN_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("enhanced_mushrooms", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> RED_MUSHROOM_CRAFTING_TABLE = ITEMS.register("red_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RED_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("enhanced_mushrooms", ItemGroup.TAB_DECORATIONS))));
	public static final RegistryObject<Item> GLOWSHROOM_CRAFTING_TABLE = ITEMS.register("glowshroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GLOWSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("enhanced_mushrooms", ItemGroup.TAB_DECORATIONS))));
	
	/* Miscellaneous Mods */
	// Darker Depths
	public static final RegistryObject<Item> PETRIFIED_CRAFTING_TABLE = ITEMS.register("petrified_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PETRIFIED_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("darkerdepths", ItemGroup.TAB_DECORATIONS))));

	// Habitat
	public static final RegistryObject<Item> FAIRY_RING_MUSHROOM_CRAFTING_TABLE = ITEMS.register("fairy_ring_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BROWN_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(ModList.get().isLoaded("enhanced_mushrooms") ? conditionallyAddTab("habitat", ItemGroup.TAB_DECORATIONS) : null)));

	// Outer End
	public static final RegistryObject<Item> AZURE_CRAFTING_TABLE = ITEMS.register("azure_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AZURE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("outer_end", ItemGroup.TAB_DECORATIONS))));
	
	@Nullable
    private static ItemGroup conditionallyAddTab(String modid, ItemGroup tab) {
    	if (ModList.get().isLoaded(modid)) {
    		return tab;
    	}
    	else {
    		return null;
    	}
    }
    
    private static ItemGroup getTabWithMatchingName(String tabName) {
    	ItemGroup tab = null;
    	for (ItemGroup tempTab : ItemGroup.TABS) {
    		TranslationTextComponent tabComp = (TranslationTextComponent) tempTab.getDisplayName();
    		if (tabComp.getKey().equalsIgnoreCase("itemGroup." + tabName)) {
    			tab = tempTab;
    			break;
    		}
    	}
    	return tab;
    }
    
	@EventBusSubscriber(modid = VariantCraftingTablesMod.MOD_ID)
	public static class RegistrationHandler 
	{
	    @SubscribeEvent
	    public static void registerItems(final RegistryEvent.Register<Item> event) {
	    	event.getRegistry().registerAll();
	    }
	}
}
