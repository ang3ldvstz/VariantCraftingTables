package kittehmod.vct.items;

import javax.annotation.Nullable;

import kittehmod.vct.VariantCraftingTablesMod;
import kittehmod.vct.blocks.VCTBlocks;
import kittehmod.vct.entities.MinecartCraftingTable.CraftingTableType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.util.MutableHashedLinkedMap;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VCTItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VariantCraftingTablesMod.MOD_ID);
	
	// Vanilla
	public static final RegistryObject<Item> SPRUCE_CRAFTING_TABLE = ITEMS.register("spruce_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SPRUCE_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_CRAFTING_TABLE = ITEMS.register("birch_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BIRCH_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_CRAFTING_TABLE = ITEMS.register("jungle_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.JUNGLE_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_CRAFTING_TABLE = ITEMS.register("acacia_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ACACIA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_CRAFTING_TABLE = ITEMS.register("dark_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DARK_OAK_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_CRAFTING_TABLE = ITEMS.register("mangrove_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MANGROVE_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_CRAFTING_TABLE = ITEMS.register("bamboo_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BAMBOO_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_CRAFTING_TABLE = ITEMS.register("cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CHERRY_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_CRAFTING_TABLE = ITEMS.register("crimson_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CRIMSON_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_CRAFTING_TABLE = ITEMS.register("warped_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WARPED_CRAFTING_TABLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> OAK_CRAFTING_TABLE_MINECART = ITEMS.register("oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.OAK));
	public static final RegistryObject<Item> SPRUCE_CRAFTING_TABLE_MINECART = ITEMS.register("spruce_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.SPRUCE));
	public static final RegistryObject<Item> BIRCH_CRAFTING_TABLE_MINECART = ITEMS.register("birch_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BIRCH));
	public static final RegistryObject<Item> JUNGLE_CRAFTING_TABLE_MINECART = ITEMS.register("jungle_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.JUNGLE));
	public static final RegistryObject<Item> ACACIA_CRAFTING_TABLE_MINECART = ITEMS.register("acacia_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ACACIA));
	public static final RegistryObject<Item> DARK_OAK_CRAFTING_TABLE_MINECART = ITEMS.register("dark_oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.DARK_OAK));
	public static final RegistryObject<Item> MANGROVE_CRAFTING_TABLE_MINECART = ITEMS.register("mangrove_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.MANGROVE));
	public static final RegistryObject<Item> BAMBOO_CRAFTING_TABLE_MINECART = ITEMS.register("bamboo_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BAMBOO));
	public static final RegistryObject<Item> CHERRY_CRAFTING_TABLE_MINECART = ITEMS.register("cherry_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.CHERRY));
	public static final RegistryObject<Item> CRIMSON_CRAFTING_TABLE_MINECART = ITEMS.register("crimson_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.CRIMSON));
	public static final RegistryObject<Item> WARPED_CRAFTING_TABLE_MINECART = ITEMS.register("warped_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.WARPED));

    /* The big, popular mods */
	// Biomes o' Plenty
	//public static final RegistryObject<Item> BOP_CHERRY_CRAFTING_TABLE = ITEMS.register("bop_cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_CHERRY_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_DEAD_CRAFTING_TABLE = ITEMS.register("bop_dead_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_DEAD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_FIR_CRAFTING_TABLE = ITEMS.register("bop_fir_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_FIR_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_HELLBARK_CRAFTING_TABLE = ITEMS.register("bop_hellbark_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_HELLBARK_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_JACARANDA_CRAFTING_TABLE = ITEMS.register("bop_jacaranda_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_JACARANDA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_MAGIC_CRAFTING_TABLE = ITEMS.register("bop_magic_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_MAGIC_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_MAHOGANY_CRAFTING_TABLE = ITEMS.register("bop_mahogany_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_MAHOGANY_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_PALM_CRAFTING_TABLE = ITEMS.register("bop_palm_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_PALM_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_REDWOOD_CRAFTING_TABLE = ITEMS.register("bop_redwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_REDWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_UMBRAN_CRAFTING_TABLE = ITEMS.register("bop_umbran_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_UMBRAN_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOP_WILLOW_CRAFTING_TABLE = ITEMS.register("bop_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_WILLOW_CRAFTING_TABLE.get(), new Item.Properties()));
	
	//public static final RegistryObject<Item> BOP_CHERRY_CRAFTING_TABLE_MINECART = ITEMS.register("bop_cherry_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_CHERRY));
	public static final RegistryObject<Item> BOP_DEAD_CRAFTING_TABLE_MINECART = ITEMS.register("bop_dead_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_DEAD));
	public static final RegistryObject<Item> BOP_FIR_CRAFTING_TABLE_MINECART = ITEMS.register("bop_fir_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_FIR));
	public static final RegistryObject<Item> BOP_HELLBARK_CRAFTING_TABLE_MINECART = ITEMS.register("bop_hellbark_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_HELLBARK));
	public static final RegistryObject<Item> BOP_JACARANDA_CRAFTING_TABLE_MINECART = ITEMS.register("bop_jacaranda_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_JACARANDA));
	public static final RegistryObject<Item> BOP_MAGIC_CRAFTING_TABLE_MINECART = ITEMS.register("bop_magic_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_MAGIC));
	public static final RegistryObject<Item> BOP_MAHOGANY_CRAFTING_TABLE_MINECART = ITEMS.register("bop_mahogany_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_MAHOGANY));
	public static final RegistryObject<Item> BOP_PALM_CRAFTING_TABLE_MINECART = ITEMS.register("bop_palm_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_PALM));
	public static final RegistryObject<Item> BOP_REDWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("bop_redwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_REDWOOD));
	public static final RegistryObject<Item> BOP_UMBRAN_CRAFTING_TABLE_MINECART = ITEMS.register("bop_umbran_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_UMBRAN));
	public static final RegistryObject<Item> BOP_WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("bop_willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BOP_WILLOW));
	
	// Twilight Forest
	public static final RegistryObject<Item> CANOPY_CRAFTING_TABLE = ITEMS.register("canopy_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CANOPY_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARKWOOD_CRAFTING_TABLE = ITEMS.register("darkwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DARKWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TWILIGHT_MANGROVE_CRAFTING_TABLE = ITEMS.register("twilight_mangrove_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TWILIGHT_MANGROVE_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MINEWOOD_CRAFTING_TABLE = ITEMS.register("minewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MINEWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SORTINGWOOD_CRAFTING_TABLE = ITEMS.register("sortingwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SORTINGWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TIMEWOOD_CRAFTING_TABLE = ITEMS.register("timewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TIMEWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TRANSWOOD_CRAFTING_TABLE = ITEMS.register("transwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TRANSWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TWILIGHT_OAK_CRAFTING_TABLE = ITEMS.register("twilight_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TWILIGHT_OAK_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TOWERWOOD_CRAFTING_TABLE = ITEMS.register("towerwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TOWERWOOD_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> CANOPY_CRAFTING_TABLE_MINECART = ITEMS.register("canopy_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.CANOPY));
	public static final RegistryObject<Item> DARKWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("darkwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.DARKWOOD));
	public static final RegistryObject<Item> TWILIGHT_MANGROVE_CRAFTING_TABLE_MINECART = ITEMS.register("twilight_mangrove_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.TWILIGHT_MANGROVE));
	public static final RegistryObject<Item> MINEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("minewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.MINEWOOD));
	public static final RegistryObject<Item> SORTINGWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("sortingwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.SORTINGWOOD));
	public static final RegistryObject<Item> TIMEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("timewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.TIMEWOOD));
	public static final RegistryObject<Item> TRANSWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("transwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.TRANSWOOD));
	public static final RegistryObject<Item> TWILIGHT_OAK_CRAFTING_TABLE_MINECART = ITEMS.register("twilight_oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.TWILIGHT_OAK));
	public static final RegistryObject<Item> TOWERWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("towerwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.TOWERWOOD));

	/* Abnormals Mods */
	// Atmospheric
	public static final RegistryObject<Item> ASPEN_CRAFTING_TABLE = ITEMS.register("aspen_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ASPEN_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRIMWOOD_CRAFTING_TABLE = ITEMS.register("grimwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GRIMWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> KOUSA_CRAFTING_TABLE = ITEMS.register("kousa_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.KOUSA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MORADO_CRAFTING_TABLE = ITEMS.register("morado_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MORADO_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROSEWOOD_CRAFTING_TABLE = ITEMS.register("rosewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ROSEWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> YUCCA_CRAFTING_TABLE = ITEMS.register("yucca_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.YUCCA_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> ASPEN_CRAFTING_TABLE_MINECART = ITEMS.register("aspen_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ASPEN));
	public static final RegistryObject<Item> GRIMWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("grimwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GRIMWOOD));
	public static final RegistryObject<Item> KOUSA_CRAFTING_TABLE_MINECART = ITEMS.register("kousa_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.KOUSA));
	public static final RegistryObject<Item> MORADO_CRAFTING_TABLE_MINECART = ITEMS.register("morado_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.MORADO));
	public static final RegistryObject<Item> ROSEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("rosewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ROSEWOOD));
	public static final RegistryObject<Item> YUCCA_CRAFTING_TABLE_MINECART = ITEMS.register("yucca_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.YUCCA));
	
	// Autumnity
	public static final RegistryObject<Item> MAPLE_CRAFTING_TABLE = ITEMS.register("maple_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MAPLE_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> MAPLE_CRAFTING_TABLE_MINECART = ITEMS.register("maple_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.MAPLE));

	// Caverns and Chasms
	public static final RegistryObject<Item> AZALEA_CRAFTING_TABLE = ITEMS.register("azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.AZALEA));
	
	// Endergetic Expansion
	public static final RegistryObject<Item> POISE_CRAFTING_TABLE = ITEMS.register("poise_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.POISE_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> POISE_CRAFTING_TABLE_MINECART = ITEMS.register("poise_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.POISE));
	
	// Environmental
	public static final RegistryObject<Item> DARK_CHERRY_CRAFTING_TABLE = ITEMS.register("dark_cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DARK_CHERRY_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WILLOW_CRAFTING_TABLE = ITEMS.register("willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WILLOW_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WISTERIA_CRAFTING_TABLE = ITEMS.register("wisteria_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WISTERIA_CRAFTING_TABLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> DARK_CHERRY_CRAFTING_TABLE_MINECART = ITEMS.register("dark_cherry_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.DARK_CHERRY));
	public static final RegistryObject<Item> WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.WILLOW));
	public static final RegistryObject<Item> WISTERIA_CRAFTING_TABLE_MINECART = ITEMS.register("wisteria_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.WISTERIA));
	
	// Upgrade Aquatic
	public static final RegistryObject<Item> DRIFTWOOD_CRAFTING_TABLE = ITEMS.register("driftwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DRIFTWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RIVER_CRAFTING_TABLE = ITEMS.register("river_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RIVER_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> DRIFTWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("driftwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.DRIFTWOOD));
	public static final RegistryObject<Item> RIVER_CRAFTING_TABLE_MINECART = ITEMS.register("river_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RIVER));
	
	/* Team Aurora Mods */
	// Abundance
	public static final RegistryObject<Item> JACARANDA_CRAFTING_TABLE = ITEMS.register("jacaranda_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.JACARANDA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> REDBUD_CRAFTING_TABLE = ITEMS.register("redbud_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.REDBUD_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> JACARANDA_CRAFTING_TABLE_MINECART = ITEMS.register("jacaranda_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.JACARANDA));
	public static final RegistryObject<Item> REDBUD_CRAFTING_TABLE_MINECART = ITEMS.register("redbud_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.REDBUD));
	
	// Bayou Blues
	public static final RegistryObject<Item> CYPRESS_CRAFTING_TABLE = ITEMS.register("cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CYPRESS_CRAFTING_TABLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> CYPRESS_CRAFTING_TABLE_MINECART = ITEMS.register("cypress_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.CYPRESS));
	
	// Enhanced Mushrooms
	public static final RegistryObject<Item> BROWN_MUSHROOM_CRAFTING_TABLE = ITEMS.register("brown_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BROWN_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_MUSHROOM_CRAFTING_TABLE = ITEMS.register("red_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RED_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> BROWN_MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("brown_mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BROWN_MUSHROOM));
	public static final RegistryObject<Item> RED_MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("red_mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RED_MUSHROOM));
	
	/* Miscellaneous Mods */
	// Abundant Atmosphere
	public static final RegistryObject<Item> ASH_CRAFTING_TABLE = ITEMS.register("ash_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ASH_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOURDROT_CRAFTING_TABLE = ITEMS.register("gourdrot_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GOURDROT_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> ASH_CRAFTING_TABLE_MINECART = ITEMS.register("ash_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ASH));
	public static final RegistryObject<Item> GOURDROT_CRAFTING_TABLE_MINECART = ITEMS.register("gourdrot_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GOURDROT));
	
	// Ad Astra
	public static final RegistryObject<Item> AERONOS_CRAFTING_TABLE = ITEMS.register("aeronos_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AERONOS_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GLACIAN_CRAFTING_TABLE = ITEMS.register("glacian_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GLACIAN_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> STROPHAR_CRAFTING_TABLE = ITEMS.register("strophar_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.STROPHAR_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> AERONOS_CRAFTING_TABLE_MINECART = ITEMS.register("aeronos_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.AERONOS));
	public static final RegistryObject<Item> GLACIAN_CRAFTING_TABLE_MINECART = ITEMS.register("glacian_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GLACIAN));
	public static final RegistryObject<Item> STROPHAR_CRAFTING_TABLE_MINECART = ITEMS.register("strophar_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.STROPHAR));
	
	// The Aether
	public static final RegistryObject<Item> AETHER_SKYROOT_CRAFTING_TABLE = ITEMS.register("aether_skyroot_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AETHER_SKYROOT_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> AETHER_SKYROOT_CRAFTING_TABLE_MINECART = ITEMS.register("aether_skyroot_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.AETHER_SKYROOT));	
	
	// Architects Palette
	public static final RegistryObject<Item> AP_TWISTED_CRAFTING_TABLE = ITEMS.register("ap_twisted_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AP_TWISTED_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> AP_TWISTED_CRAFTING_TABLE_MINECART = ITEMS.register("ap_twisted_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.AP_TWISTED));

	// Ars Nouveau
	public static final RegistryObject<Item> ARCHWOOD_CRAFTING_TABLE = ITEMS.register("archwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ARCHWOOD_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> ARCHWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("archwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ARCHWOOD));
	
	// Biome Makeover
	public static final RegistryObject<Item> BM_ANCIENT_OAK_CRAFTING_TABLE = ITEMS.register("bm_ancient_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BM_ANCIENT_OAK_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BM_BLIGHTED_BALSA_CRAFTING_TABLE = ITEMS.register("bm_blighted_balsa_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BM_BLIGHTED_BALSA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BM_SWAMP_CYPRESS_CRAFTING_TABLE = ITEMS.register("bm_swamp_cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BM_SWAMP_CYPRESS_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BM_WILLOW_CRAFTING_TABLE = ITEMS.register("bm_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BM_WILLOW_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> BM_ANCIENT_OAK_CRAFTING_TABLE_MINECART = ITEMS.register("bm_ancient_oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BM_ANCIENT_OAK));	
	public static final RegistryObject<Item> BM_BLIGHTED_BALSA_CRAFTING_TABLE_MINECART = ITEMS.register("bm_blighted_balsa_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BM_BLIGHTED_BALSA));
	public static final RegistryObject<Item> BM_SWAMP_CYPRESS_CRAFTING_TABLE_MINECART = ITEMS.register("bm_swamp_cypress_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BM_SWAMP_CYPRESS));
	public static final RegistryObject<Item> BM_WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("bm_willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BM_WILLOW));
	
	// Caupona
	public static final RegistryObject<Item> WALNUT_CRAFTING_TABLE = ITEMS.register("walnut_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WALNUT_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> WALNUT_CRAFTING_TABLE_MINECART = ITEMS.register("walnut_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.WALNUT));
	
	// Ceilands
	public static final RegistryObject<Item> CEILTRUNK_CRAFTING_TABLE = ITEMS.register("ceiltrunk_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CEILTRUNK_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> LUZAWOOD_CRAFTING_TABLE = ITEMS.register("luzawood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.LUZAWOOD_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> CEILTRUNK_CRAFTING_TABLE_MINECART = ITEMS.register("ceiltrunk_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.CEILTRUNK));
	public static final RegistryObject<Item> LUZAWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("luzawood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.LUZAWOOD));

	// Cobblemon
	public static final RegistryObject<Item> APRICORN_CRAFTING_TABLE = ITEMS.register("apricorn_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.APRICORN_CRAFTING_TABLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> APRICORN_CRAFTING_TABLE_MINECART = ITEMS.register("apricorn_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.APRICORN));

	// Colourful Azaleas
	public static final RegistryObject<Item> AZULE_AZALEA_CRAFTING_TABLE = ITEMS.register("azule_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AZULE_AZALEA_CRAFTING_TABLE.get(), new Item.Properties())); 
	public static final RegistryObject<Item> BRIGHT_AZALEA_CRAFTING_TABLE = ITEMS.register("bright_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BRIGHT_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> FISS_AZALEA_CRAFTING_TABLE = ITEMS.register("fiss_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FISS_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROZE_AZALEA_CRAFTING_TABLE = ITEMS.register("roze_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ROZE_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TECAL_AZALEA_CRAFTING_TABLE = ITEMS.register("tecal_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TECAL_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TITANIUM_AZALEA_CRAFTING_TABLE = ITEMS.register("titanium_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TITANIUM_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WALNUT_AZALEA_CRAFTING_TABLE = ITEMS.register("walnut_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WALNUT_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> AZULE_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("azule_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.AZULE_AZALEA));	
	public static final RegistryObject<Item> BRIGHT_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("bright_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BRIGHT_AZALEA));	
	public static final RegistryObject<Item> FISS_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("fiss_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.FISS_AZALEA));	
	public static final RegistryObject<Item> ROZE_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("roze_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ROZE_AZALEA));	
	public static final RegistryObject<Item> TECAL_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("tecal_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.TECAL_AZALEA));	
	public static final RegistryObject<Item> TITANIUM_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("titanium_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.TITANIUM_AZALEA));	
	public static final RegistryObject<Item> WALNUT_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("walnut_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.WALNUT_AZALEA));	
	
	// Darker Depths
	public static final RegistryObject<Item> PETRIFIED_CRAFTING_TABLE = ITEMS.register("petrified_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PETRIFIED_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> PETRIFIED_CRAFTING_TABLE_MINECART = ITEMS.register("petrified_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.PETRIFIED));

	// Deeper & Darker
	public static final RegistryObject<Item> ECHO_CRAFTING_TABLE = ITEMS.register("echo_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECHO_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> ECHO_CRAFTING_TABLE_MINECART = ITEMS.register("echo_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ECHO));
	
	// Ecologics
	public static final RegistryObject<Item> ECO_AZALEA_CRAFTING_TABLE = ITEMS.register("eco_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECO_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ECO_FLOWERING_AZALEA_CRAFTING_TABLE = ITEMS.register("eco_flowering_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECO_FLOWERING_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ECO_COCONUT_CRAFTING_TABLE = ITEMS.register("eco_coconut_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECO_COCONUT_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ECO_WALNUT_CRAFTING_TABLE = ITEMS.register("eco_walnut_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECO_WALNUT_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> ECO_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("eco_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ECO_AZALEA));
	public static final RegistryObject<Item> ECO_FLOWERING_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("eco_flowering_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ECO_FLOWERING_AZALEA));
	public static final RegistryObject<Item> ECO_COCONUT_CRAFTING_TABLE_MINECART = ITEMS.register("eco_coconut_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ECO_COCONUT));
	public static final RegistryObject<Item> ECO_WALNUT_CRAFTING_TABLE_MINECART = ITEMS.register("eco_walnut_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ECO_WALNUT));
	
	// End's Phantasm
	public static final RegistryObject<Item> EBONY_CRAFTING_TABLE = ITEMS.register("ebony_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.EBONY_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> PREAM_CRAFTING_TABLE = ITEMS.register("pream_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PREAM_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> EBONY_CRAFTING_TABLE_MINECART = ITEMS.register("ebony_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.EBONY));
	public static final RegistryObject<Item> PREAM_CRAFTING_TABLE_MINECART = ITEMS.register("pream_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.PREAM));
	
	// Endless Biomes
	public static final RegistryObject<Item> PENUMBRA_CRAFTING_TABLE = ITEMS.register("penumbra_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PENUMBRA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> TWISTED_CRAFTING_TABLE = ITEMS.register("twisted_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TWISTED_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> PENUMBRA_CRAFTING_TABLE_MINECART = ITEMS.register("penumbra_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.PENUMBRA));
	public static final RegistryObject<Item> TWISTED_CRAFTING_TABLE_MINECART = ITEMS.register("twisted_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.TWISTED));
	
	// Enlightened End
	public static final RegistryObject<Item> CONGEALED_CRAFTING_TABLE = ITEMS.register("congealed_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CONGEALED_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> VERDANT_CRAFTING_TABLE = ITEMS.register("verdant_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.VERDANT_CRAFTING_TABLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> CONGEALED_CRAFTING_TABLE_MINECART = ITEMS.register("congealed_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.CONGEALED));
	public static final RegistryObject<Item> VERDANT_CRAFTING_TABLE_MINECART = ITEMS.register("verdant_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.VERDANT));
	
	// Extended Mushrooms
	public static final RegistryObject<Item> MUSHROOM_CRAFTING_TABLE = ITEMS.register("mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> POISONOUS_MUSHROOM_CRAFTING_TABLE = ITEMS.register("poisonous_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.POISONOUS_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> HONEY_FUNGUS_CRAFTING_TABLE = ITEMS.register("honey_fungus_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HONEY_FUNGUS_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GLOWSHROOM_CRAFTING_TABLE = ITEMS.register("glowshroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GLOWSHROOM_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.MUSHROOM));
	public static final RegistryObject<Item> POISONOUS_MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("poisonous_mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.POISONOUS_MUSHROOM));
	public static final RegistryObject<Item> HONEY_FUNGUS_CRAFTING_TABLE_MINECART = ITEMS.register("honey_fungus_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.HONEY_FUNGUS));
	public static final RegistryObject<Item> GLOWSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("glowshroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GLOWSHROOM));

	// Forbidden & Arcanus
	public static final RegistryObject<Item> ARCANE_EDELWOOD_CRAFTING_TABLE = ITEMS.register("arcane_edelwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ARCANE_EDELWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRYWOOD_CRAFTING_TABLE = ITEMS.register("cherrywood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CHERRYWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> EDELWOOD_CRAFTING_TABLE = ITEMS.register("edelwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.EDELWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> FUNGYSS_CRAFTING_TABLE = ITEMS.register("fungyss_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FUNGYSS_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> AURUM_CRAFTING_TABLE = ITEMS.register("aurum_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AURUM_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> ARCANE_EDELWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("arcane_edelwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ARCANE_EDELWOOD));
	public static final RegistryObject<Item> CHERRYWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("cherrywood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.CHERRYWOOD));
	public static final RegistryObject<Item> EDELWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("edelwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.EDELWOOD));
	public static final RegistryObject<Item> FUNGYSS_CRAFTING_TABLE_MINECART = ITEMS.register("fungyss_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.FUNGYSS));
	public static final RegistryObject<Item> AURUM_CRAFTING_TABLE_MINECART = ITEMS.register("aurum_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.AURUM));
	
	// Fruit Trees
	public static final RegistryObject<Item> FT_CHERRY_CRAFTING_TABLE = ITEMS.register("ft_cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FT_CHERRY_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> FT_CITRUS_CRAFTING_TABLE = ITEMS.register("ft_citrus_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FT_CITRUS_CRAFTING_TABLE.get(), new Item.Properties()));	

	public static final RegistryObject<Item> FT_CHERRY_CRAFTING_TABLE_MINECART = ITEMS.register("ft_cherry_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.FT_CHERRY));
	public static final RegistryObject<Item> FT_CITRUS_CRAFTING_TABLE_MINECART = ITEMS.register("ft_citrus_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.FT_CITRUS));

	// Gardens of the Dead
	public static final RegistryObject<Item> SOULBLIGHT_CRAFTING_TABLE = ITEMS.register("soulblight_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SOULBLIGHT_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WHISTLECANE_CRAFTING_TABLE = ITEMS.register("whistlecane_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WHISTLECANE_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> SOULBLIGHT_CRAFTING_TABLE_MINECART = ITEMS.register("soulblight_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.SOULBLIGHT));
	public static final RegistryObject<Item> WHISTLECANE_CRAFTING_TABLE_MINECART = ITEMS.register("whistlecane_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.WHISTLECANE));	
	
	// Good Ending
	public static final RegistryObject<Item> GE_CYPRESS_CRAFTING_TABLE = ITEMS.register("ge_cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GE_CYPRESS_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GE_MUDDY_OAK_CRAFTING_TABLE = ITEMS.register("ge_muddy_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GE_MUDDY_OAK_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> GE_CYPRESS_CRAFTING_TABLE_MINECART = ITEMS.register("ge_cypress_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GE_CYPRESS));
	public static final RegistryObject<Item> GE_MUDDY_OAK_CRAFTING_TABLE_MINECART = ITEMS.register("ge_muddy_oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GE_MUDDY_OAK));
	
	// Habitat
	public static final RegistryObject<Item> FAIRY_RING_MUSHROOM_CRAFTING_TABLE = ITEMS.register("fairy_ring_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FAIRY_RING_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> FAIRY_RING_MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("fairy_ring_mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.FAIRY_RING_MUSHROOM));
	
	// Hexcasting
	public static final RegistryObject<Item> EDIFIED_CRAFTING_TABLE = ITEMS.register("edified_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.EDIFIED_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> EDIFIED_CRAFTING_TABLE_MINECART = ITEMS.register("edified_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.EDIFIED));

	// Hexerei
	public static final RegistryObject<Item> HEXEREI_MAHOGANY_CRAFTING_TABLE = ITEMS.register("hexerei_mahogany_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HEXEREI_MAHOGANY_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> HEXEREI_WILLOW_CRAFTING_TABLE = ITEMS.register("hexerei_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HEXEREI_WILLOW_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> HEXEREI_WITCH_HAZEL_CRAFTING_TABLE = ITEMS.register("hexerei_witch_hazel_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HEXEREI_WITCH_HAZEL_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> HEXEREI_MAHOGANY_CRAFTING_TABLE_MINECART = ITEMS.register("hexerei_mahogany_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.HEXEREI_MAHOGANY));
	public static final RegistryObject<Item> HEXEREI_WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("hexerei_willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.HEXEREI_WILLOW));
	public static final RegistryObject<Item> HEXEREI_WITCH_HAZEL_CRAFTING_TABLE_MINECART = ITEMS.register("hexerei_witch_hazel_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.HEXEREI_WITCH_HAZEL));
	
	// Integrated Dynamics
	public static final RegistryObject<Item> MENRIL_CRAFTING_TABLE = ITEMS.register("menril_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MENRIL_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> MENRIL_CRAFTING_TABLE_MINECART = ITEMS.register("menril_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.MENRIL));
	
	// Malum
	public static final RegistryObject<Item> RUNEWOOD_CRAFTING_TABLE = ITEMS.register("runewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUNEWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SOULWOOD_CRAFTING_TABLE = ITEMS.register("soulwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SOULWOOD_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> RUNEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("runewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUNEWOOD));
	public static final RegistryObject<Item> SOULWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("soulwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.SOULWOOD));
	
	// Morecraft
	public static final RegistryObject<Item> NETHERWOOD_CRAFTING_TABLE = ITEMS.register("netherwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.NETHERWOOD_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> NETHERWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("netherwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.NETHERWOOD));
	
	// Nether's Exoticism
	public static final RegistryObject<Item> JABOTICABA_CRAFTING_TABLE = ITEMS.register("jaboticaba_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.JABOTICABA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAMBOUTAN_CRAFTING_TABLE = ITEMS.register("ramboutan_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RAMBOUTAN_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> JABOTICABA_CRAFTING_TABLE_MINECART = ITEMS.register("jaboticaba_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.JABOTICABA));
	public static final RegistryObject<Item> RAMBOUTAN_CRAFTING_TABLE_MINECART = ITEMS.register("ramboutan_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RAMBOUTAN));
	
	// New World
	public static final RegistryObject<Item> FIR_CRAFTING_TABLE = ITEMS.register("fir_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FIR_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> FIR_CRAFTING_TABLE_MINECART = ITEMS.register("fir_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.FIR));
	
	// Outer End
	public static final RegistryObject<Item> AZURE_CRAFTING_TABLE = ITEMS.register("azure_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AZURE_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> AZURE_CRAFTING_TABLE_MINECART = ITEMS.register("azure_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.AZURE));
	
	// Prehistoric Fauna
	public static final RegistryObject<Item> ARAUCARIA_CRAFTING_TABLE = ITEMS.register("araucaria_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ARAUCARIA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> HEIDIPHYLLUM_CRAFTING_TABLE = ITEMS.register("heidiphyllum_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HEIDIPHYLLUM_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> LIRIODENDRITES_CRAFTING_TABLE = ITEMS.register("liriodendrites_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.LIRIODENDRITES_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> METASEQUOIA_CRAFTING_TABLE = ITEMS.register("metasequoia_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.METASEQUOIA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> PROTOJUNIPEROXYLON_CRAFTING_TABLE = ITEMS.register("protojuniperoxylon_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PROTOJUNIPEROXYLON_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> PROTOPICEOXYLON_CRAFTING_TABLE = ITEMS.register("protopiceoxylon_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PROTOPICEOXYLON_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ZAMITES_CRAFTING_TABLE = ITEMS.register("zamites_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ZAMITES_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> ARAUCARIA_CRAFTING_TABLE_MINECART = ITEMS.register("araucaria_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ARAUCARIA));
	public static final RegistryObject<Item> HEIDIPHYLLUM_CRAFTING_TABLE_MINECART = ITEMS.register("heidiphyllum_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.HEIDIPHYLLUM));
	public static final RegistryObject<Item> LIRIODENDRITES_CRAFTING_TABLE_MINECART = ITEMS.register("liriodendrites_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.LIRIODENDRITES));
	public static final RegistryObject<Item> METASEQUOIA_CRAFTING_TABLE_MINECART = ITEMS.register("metasequoia_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.METASEQUOIA));
	public static final RegistryObject<Item> PROTOJUNIPEROXYLON_CRAFTING_TABLE_MINECART = ITEMS.register("protojuniperoxylon_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.PROTOJUNIPEROXYLON));
	public static final RegistryObject<Item> PROTOPICEOXYLON_CRAFTING_TABLE_MINECART = ITEMS.register("protopiceoxylon_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.PROTOPICEOXYLON));
	public static final RegistryObject<Item> ZAMITES_CRAFTING_TABLE_MINECART = ITEMS.register("zamites_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ZAMITES));
	
	// Pyromancy
	public static final RegistryObject<Item> PYROWOOD_CRAFTING_TABLE = ITEMS.register("pyrowood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PYROWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ROTTEN_PLANKS_CRAFTING_TABLE = ITEMS.register("rotten_planks_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ROTTEN_PLANKS_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> PYROWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("pyrowood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.PYROWOOD));
	public static final RegistryObject<Item> ROTTEN_PLANKS_CRAFTING_TABLE_MINECART = ITEMS.register("rotten_planks_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.ROTTEN_PLANKS));
	
	// Quark
	public static final RegistryObject<Item> QUARK_ANCIENT_CRAFTING_TABLE = ITEMS.register("quark_ancient_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.QUARK_ANCIENT_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> QUARK_AZALEA_CRAFTING_TABLE = ITEMS.register("quark_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.QUARK_AZALEA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> QUARK_BLOSSOM_CRAFTING_TABLE = ITEMS.register("quark_blossom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.QUARK_BLOSSOM_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> QUARK_ANCIENT_CRAFTING_TABLE_MINECART = ITEMS.register("quark_ancient_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.QUARK_ANCIENT));
	public static final RegistryObject<Item> QUARK_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("quark_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.QUARK_AZALEA));
	public static final RegistryObject<Item> QUARK_BLOSSOM_CRAFTING_TABLE_MINECART = ITEMS.register("quark_blossom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.QUARK_BLOSSOM));
	
	// Regions Unexplored
	public static final RegistryObject<Item> RUE_BAOBAB_CRAFTING_TABLE = ITEMS.register("rue_baobab_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_BAOBAB_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_BLACKWOOD_CRAFTING_TABLE = ITEMS.register("rue_blackwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_BLACKWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_BRIMWOOD_CRAFTING_TABLE = ITEMS.register("rue_brimwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_BRIMWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_MAGNOLIA_CRAFTING_TABLE = ITEMS.register("rue_magnolia_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_MAGNOLIA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_CYPRESS_CRAFTING_TABLE = ITEMS.register("rue_cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_CYPRESS_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_DEAD_CRAFTING_TABLE = ITEMS.register("rue_dead_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_DEAD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_EUCALYPTUS_CRAFTING_TABLE = ITEMS.register("rue_eucalyptus_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_EUCALYPTUS_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_JOSHUA_CRAFTING_TABLE = ITEMS.register("rue_joshua_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_JOSHUA_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_LARCH_CRAFTING_TABLE = ITEMS.register("rue_larch_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_LARCH_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_MAPLE_CRAFTING_TABLE = ITEMS.register("rue_maple_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_MAPLE_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_MAUVE_CRAFTING_TABLE = ITEMS.register("rue_mauve_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_MAUVE_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_PALM_CRAFTING_TABLE = ITEMS.register("rue_palm_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_PALM_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_PINE_CRAFTING_TABLE = ITEMS.register("rue_pine_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_PINE_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_REDWOOD_CRAFTING_TABLE = ITEMS.register("rue_redwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_REDWOOD_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RUE_WILLOW_CRAFTING_TABLE = ITEMS.register("rue_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_WILLOW_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> RUE_BAOBAB_CRAFTING_TABLE_MINECART = ITEMS.register("rue_baobab_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_BAOBAB));
	public static final RegistryObject<Item> RUE_BLACKWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("rue_blackwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_BLACKWOOD));
	public static final RegistryObject<Item> RUE_BRIMWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("rue_brimwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_BRIMWOOD));
	public static final RegistryObject<Item> RUE_MAGNOLIA_CRAFTING_TABLE_MINECART = ITEMS.register("rue_magnolia_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_MAGNOLIA));
	public static final RegistryObject<Item> RUE_CYPRESS_CRAFTING_TABLE_MINECART = ITEMS.register("rue_cypress_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_CYPRESS));
	public static final RegistryObject<Item> RUE_DEAD_CRAFTING_TABLE_MINECART = ITEMS.register("rue_dead_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_DEAD));
	public static final RegistryObject<Item> RUE_EUCALYPTUS_CRAFTING_TABLE_MINECART = ITEMS.register("rue_eucalyptus_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_EUCALYPTUS));
	public static final RegistryObject<Item> RUE_JOSHUA_CRAFTING_TABLE_MINECART = ITEMS.register("rue_joshua_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_JOSHUA));
	public static final RegistryObject<Item> RUE_LARCH_CRAFTING_TABLE_MINECART = ITEMS.register("rue_larch_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_LARCH));
	public static final RegistryObject<Item> RUE_MAPLE_CRAFTING_TABLE_MINECART = ITEMS.register("rue_maple_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_MAPLE));
	public static final RegistryObject<Item> RUE_MAUVE_CRAFTING_TABLE_MINECART = ITEMS.register("rue_mauve_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_MAUVE));
	public static final RegistryObject<Item> RUE_PALM_CRAFTING_TABLE_MINECART = ITEMS.register("rue_palm_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_PALM));
	public static final RegistryObject<Item> RUE_PINE_CRAFTING_TABLE_MINECART = ITEMS.register("rue_pine_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_PINE));
	public static final RegistryObject<Item> RUE_REDWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("rue_redwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_REDWOOD));
	public static final RegistryObject<Item> RUE_WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("rue_willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.RUE_WILLOW));
	
	// Silent Gear
	public static final RegistryObject<Item> SG_NETHERWOOD_CRAFTING_TABLE = ITEMS.register("sg_netherwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SG_NETHERWOOD_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> SG_NETHERWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("sg_netherwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.SG_NETHERWOOD));

	// Snowy Spirit
	public static final RegistryObject<Item> GINGERBREAD_CRAFTING_TABLE = ITEMS.register("gingerbread_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GINGERBREAD_CRAFTING_TABLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> GINGERBREAD_CRAFTING_TABLE_MINECART = ITEMS.register("gingerbread_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GINGERBREAD));
	
	// Tinkers Construct
	public static final RegistryObject<Item> BLOODSHROOM_CRAFTING_TABLE = ITEMS.register("bloodshroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BLOODSHROOM_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GREENHEART_CRAFTING_TABLE = ITEMS.register("greenheart_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GREENHEART_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SKYROOT_CRAFTING_TABLE = ITEMS.register("skyroot_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SKYROOT_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> BLOODSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("bloodshroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.BLOODSHROOM));
	public static final RegistryObject<Item> GREENHEART_CRAFTING_TABLE_MINECART = ITEMS.register("greenheart_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GREENHEART));
	public static final RegistryObject<Item> SKYROOT_CRAFTING_TABLE_MINECART = ITEMS.register("skyroot_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.SKYROOT));
	
	// Twigs 
	public static final RegistryObject<Item> STRIPPED_BAMBOO_CRAFTING_TABLE = ITEMS.register("stripped_bamboo_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.STRIPPED_BAMBOO_CRAFTING_TABLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> STRIPPED_BAMBOO_CRAFTING_TABLE_MINECART = ITEMS.register("stripped_bamboo_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.STRIPPED_BAMBOO));
	
	// Undergarden
	public static final RegistryObject<Item> GRONGLE_CRAFTING_TABLE = ITEMS.register("grongle_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GRONGLE_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SMOGSTEM_CRAFTING_TABLE = ITEMS.register("smogstem_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SMOGSTEM_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WIGGLEWOOD_CRAFTING_TABLE = ITEMS.register("wigglewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WIGGLEWOOD_CRAFTING_TABLE.get(), new Item.Properties()));

	public static final RegistryObject<Item> GRONGLE_CRAFTING_TABLE_MINECART = ITEMS.register("grongle_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.GRONGLE));
	public static final RegistryObject<Item> SMOGSTEM_CRAFTING_TABLE_MINECART = ITEMS.register("smogstem_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.SMOGSTEM));
	public static final RegistryObject<Item> WIGGLEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("wigglewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.WIGGLEWOOD));
	
	// Windswept
	public static final RegistryObject<Item> CHESTNUT_CRAFTING_TABLE = ITEMS.register("chestnut_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CHESTNUT_CRAFTING_TABLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> HOLLY_CRAFTING_TABLE = ITEMS.register("holly_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HOLLY_CRAFTING_TABLE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> CHESTNUT_CRAFTING_TABLE_MINECART = ITEMS.register("chestnut_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.CHESTNUT));
	public static final RegistryObject<Item> HOLLY_CRAFTING_TABLE_MINECART = ITEMS.register("holly_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().stacksTo(1), CraftingTableType.HOLLY));

    private static ResourceKey<CreativeModeTab> getTabWithMatchingName(ResourceLocation tabLocation, @Nullable ResourceKey<CreativeModeTab> fallbackTab) {
    	ResourceKey<CreativeModeTab> tab = null;
    	if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) {
    		return null;
    	}
		if (BuiltInRegistries.CREATIVE_MODE_TAB.containsKey(tabLocation)) {
			CreativeModeTab tempTab = BuiltInRegistries.CREATIVE_MODE_TAB.get(tabLocation);
			tab = BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(tempTab).get();
		}
    	if (tab == null && fallbackTab != null) { // If for some reason the tab doesn't exist, fallback.
    		tab = fallbackTab;
    	}
    	return tab;
    }
	
    @SubscribeEvent
    public static void assignItemsToTabs(BuildCreativeModeTabContentsEvent event) {
    	MutableHashedLinkedMap<ItemStack, TabVisibility> map = event.getEntries();
    	// Insert crafting tables into vanilla tab.
    	if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
    		map.putAfter(Items.CRAFTING_TABLE.getDefaultInstance(), SPRUCE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(SPRUCE_CRAFTING_TABLE.get().getDefaultInstance(), BIRCH_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(BIRCH_CRAFTING_TABLE.get().getDefaultInstance(), JUNGLE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(JUNGLE_CRAFTING_TABLE.get().getDefaultInstance(), ACACIA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(ACACIA_CRAFTING_TABLE.get().getDefaultInstance(), DARK_OAK_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(DARK_OAK_CRAFTING_TABLE.get().getDefaultInstance(), MANGROVE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MANGROVE_CRAFTING_TABLE.get().getDefaultInstance(), CRIMSON_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CRIMSON_CRAFTING_TABLE.get().getDefaultInstance(), WARPED_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putBefore(CRIMSON_CRAFTING_TABLE.get().getDefaultInstance(), BAMBOO_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putBefore(CRIMSON_CRAFTING_TABLE.get().getDefaultInstance(), CHERRY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		// Insert modded crafting tables that use vanilla tab.
    		if (ModList.get().isLoaded("atmospheric")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), ASPEN_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(ASPEN_CRAFTING_TABLE.get().getDefaultInstance(), GRIMWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(GRIMWOOD_CRAFTING_TABLE.get().getDefaultInstance(), KOUSA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(KOUSA_CRAFTING_TABLE.get().getDefaultInstance(), MORADO_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(MORADO_CRAFTING_TABLE.get().getDefaultInstance(), ROSEWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(ROSEWOOD_CRAFTING_TABLE.get().getDefaultInstance(), YUCCA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("autumnity")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), MAPLE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("caverns_and_chasms")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("endergetic")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), POISE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("environmental")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), CHERRY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(CHERRY_CRAFTING_TABLE.get().getDefaultInstance(), WILLOW_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(WILLOW_CRAFTING_TABLE.get().getDefaultInstance(), WISTERIA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("upgrade_aquatic")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), DRIFTWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(DRIFTWOOD_CRAFTING_TABLE.get().getDefaultInstance(), RIVER_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("abundance")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), JACARANDA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(JACARANDA_CRAFTING_TABLE.get().getDefaultInstance(), REDBUD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("bayou_blues")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), CYPRESS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("enhanced_mushrooms")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), BROWN_MUSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(BROWN_MUSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), RED_MUSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("abundant_atmosphere")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), ASH_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("aether")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), AETHER_SKYROOT_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("architects_palette")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), TWISTED_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("caupona")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), WALNUT_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
	    	if (ModList.get().isLoaded("cobblemon")) {
	    		map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), APRICORN_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    	}
    		if (ModList.get().isLoaded("deeperdarker")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), ASH_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("endlessbiomes")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), PENUMBRA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(PENUMBRA_CRAFTING_TABLE.get().getDefaultInstance(), TWISTED_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("extendedmushrooms")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), MUSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(MUSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), POISONOUS_MUSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(POISONOUS_MUSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), HONEY_FUNGUS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(HONEY_FUNGUS_CRAFTING_TABLE.get().getDefaultInstance(), GLOWSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("fruittrees")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), FT_CHERRY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(FT_CHERRY_CRAFTING_TABLE.get().getDefaultInstance(), FT_CITRUS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("gardens_of_the_dead")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), SOULBLIGHT_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(SOULBLIGHT_CRAFTING_TABLE.get().getDefaultInstance(), WHISTLECANE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("goodending")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), GE_CYPRESS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(GE_CYPRESS_CRAFTING_TABLE.get().getDefaultInstance(), GE_MUDDY_OAK_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("habitat")) {
    			if (ModList.get().isLoaded("quark")) { map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), FAIRY_RING_MUSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS); }
    		}
    		if (ModList.get().isLoaded("morecraft")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), NETHERWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("newworld")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), FIR_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("pyromancer")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), PYROWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(PYROWOOD_CRAFTING_TABLE.get().getDefaultInstance(), ROTTEN_PLANKS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("quark")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), QUARK_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(QUARK_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), QUARK_BLOSSOM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("snowyspirits")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), GINGERBREAD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("windswept")) {
    			map.putAfter(WARPED_CRAFTING_TABLE.get().getDefaultInstance(), CHESTNUT_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(CHESTNUT_CRAFTING_TABLE.get().getDefaultInstance(), HOLLY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	// Insert crafting table minecarts into vanilla tab.
    	if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
    		map.putAfter(Items.FURNACE_MINECART.getDefaultInstance(), OAK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(OAK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), SPRUCE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(SPRUCE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), BIRCH_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(BIRCH_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), JUNGLE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(JUNGLE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), ACACIA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(ACACIA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), DARK_OAK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(DARK_OAK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), MANGROVE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(MANGROVE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), CRIMSON_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putAfter(CRIMSON_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putBefore(CRIMSON_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), BAMBOO_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		map.putBefore(CRIMSON_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), CHERRY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		// Insert modded crafting table minecarts that use vanilla tab.
    		if (ModList.get().isLoaded("atmospheric")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), ASPEN_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(ASPEN_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), GRIMWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(GRIMWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), KOUSA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(KOUSA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), MORADO_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(MORADO_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), ROSEWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(ROSEWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), YUCCA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("autumnity")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), MAPLE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("caverns_and_chasms")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("endergetic")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), POISE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("environmental")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), DARK_CHERRY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(DARK_CHERRY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), WILLOW_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(WILLOW_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), WISTERIA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("upgrade_aquatic")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), DRIFTWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(DRIFTWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), RIVER_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("abundance")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), JACARANDA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(JACARANDA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), REDBUD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("bayou_blues")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), CYPRESS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("enhanced_mushrooms")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), BROWN_MUSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(BROWN_MUSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), RED_MUSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("abundant_atmosphere")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), ASH_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	    if (ModList.get().isLoaded("aether")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), AETHER_SKYROOT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("architects_palette")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TWISTED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("caupona")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), WALNUT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("cobblemon")) {
	    		map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), APRICORN_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("deeperdarker")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), ECHO_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("endlessbiomes")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), PENUMBRA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(PENUMBRA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TWISTED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("extendedmushrooms")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), MUSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(MUSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), POISONOUS_MUSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(POISONOUS_MUSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), HONEY_FUNGUS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(HONEY_FUNGUS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), GLOWSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("fruittrees")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), FT_CHERRY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(FT_CHERRY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), FT_CITRUS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("goodending")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), GE_CYPRESS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(GE_CYPRESS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), GE_MUDDY_OAK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("gardens_of_the_dead")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), SOULBLIGHT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(SOULBLIGHT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), WHISTLECANE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("habitat")) {
    			if (ModList.get().isLoaded("quark")) { map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), FAIRY_RING_MUSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS); }
    		}
    		if (ModList.get().isLoaded("morecraft")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), NETHERWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("outer_end")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), AZURE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("newworld")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), FIR_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("pyromancer")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), PYROWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(PYROWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), ROTTEN_PLANKS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("quark")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), QUARK_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(QUARK_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), QUARK_BLOSSOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("snowyspirits")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), GINGERBREAD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (ModList.get().isLoaded("windswept")) {
    			map.putAfter(WARPED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), CHESTNUT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    			map.putAfter(CHESTNUT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), HOLLY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("ad_astra")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("ad_astra", "ad_astra"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(AERONOS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(GLACIAN_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(STROPHAR_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("ad_astra", "ad_astra"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(AERONOS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(GLACIAN_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(STROPHAR_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("ars_nouveau")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("ars_nouveau", "ars_nouveau"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(ARCHWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("ars_nouveau", "ars_nouveau"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(ARCHWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("biomemakeover")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("biomemakeover", "biomemakeover"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(BM_ANCIENT_OAK_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BM_BLIGHTED_BALSA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BM_SWAMP_CYPRESS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BM_WILLOW_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("biomemakeover", "biomemakeover"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(BM_ANCIENT_OAK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BM_BLIGHTED_BALSA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BM_SWAMP_CYPRESS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BM_WILLOW_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("biomesoplenty")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("biomesoplenty", "biomesoplenty"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		//map.put(BOP_CHERRY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_DEAD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_FIR_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_HELLBARK_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_JACARANDA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_MAGIC_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_MAHOGANY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_PALM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_REDWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_UMBRAN_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_WILLOW_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("biomesoplenty", "biomesoplenty"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		//map.put(BOP_CHERRY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_DEAD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_FIR_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_HELLBARK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_JACARANDA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_MAGIC_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_MAHOGANY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_PALM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_REDWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_UMBRAN_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BOP_WILLOW_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("ceilands")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("ceilands", "ceilands"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(CEILTRUNK_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(LUZAWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("ceilands", "ceilands"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(CEILTRUNK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(LUZAWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("colorfulazaleas")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("colorfulazaleas", "colorful_azaleas"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(AZULE_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BRIGHT_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(FISS_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ROZE_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TECAL_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TITANIUM_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(WALNUT_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("colorfulazaleas", "colorful_azaleas"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(AZULE_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(BRIGHT_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(FISS_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ROZE_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TECAL_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TITANIUM_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(WALNUT_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("darkerdepths")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("darkerdepths", "darkerdepths"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(PETRIFIED_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("darkerdepths", "darkerdepths"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(PETRIFIED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("enlightened_end")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("enlightened_end", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(CONGEALED_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(VERDANT_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("enlightened_end", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(CONGEALED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(VERDANT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("ecologics")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("ecologics", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(ECO_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ECO_FLOWERING_AZALEA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ECO_COCONUT_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ECO_WALNUT_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("ecologics", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(ECO_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ECO_FLOWERING_AZALEA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ECO_COCONUT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ECO_WALNUT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("forbidden_arcanus")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("forbidden_arcanus", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(ARCANE_EDELWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(AURUM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(CHERRYWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(EDELWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(FUNGYSS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("forbidden_arcanus", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(ARCANE_EDELWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(AURUM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(CHERRYWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(EDELWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(FUNGYSS_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("hexcasting")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("hexcasting", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(EDIFIED_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("hexcasting", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(EDIFIED_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("hexerei")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("hexerei", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(HEXEREI_MAHOGANY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(HEXEREI_WILLOW_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(HEXEREI_WITCH_HAZEL_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("hexerei", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(HEXEREI_MAHOGANY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(HEXEREI_WILLOW_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(HEXEREI_WITCH_HAZEL_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("integrateddynamics")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("integrateddynamics", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(MENRIL_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("integrateddynamics", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(MENRIL_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("malum")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("malum", "naturals_wonders"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(RUNEWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(SOULWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("malum", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(RUNEWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(SOULWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("nethers_exoticism")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("nethers_exoticism", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(JABOTICABA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RAMBOUTAN_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("nethers_exoticism", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(JABOTICABA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RAMBOUTAN_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("phantasm")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("phantasm", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(EBONY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(PREAM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("phantasm", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(EBONY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(PREAM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("prehistoricfauna")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("prehistoricfauna", "decoration_tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(ARAUCARIA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(HEIDIPHYLLUM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(LIRIODENDRITES_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(METASEQUOIA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(PROTOJUNIPEROXYLON_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(PROTOPICEOXYLON_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ZAMITES_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("prehistoricfauna", "misc_tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(ARAUCARIA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(HEIDIPHYLLUM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(LIRIODENDRITES_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(METASEQUOIA_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(PROTOJUNIPEROXYLON_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(PROTOPICEOXYLON_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(ZAMITES_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("regions_unexplored")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("regions_unexplored", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(RUE_BAOBAB_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_BLACKWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_BRIMWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_CHERRY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_CYPRESS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_DEAD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_EUCALYPTUS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_JOSHUA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_LARCH_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_MAPLE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_MAUVE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_PALM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_PINE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_REDWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_WILLOW_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("regions_unexplored", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(RUE_BAOBAB_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_BLACKWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_BRIMWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_CHERRY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_CYPRESS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_DEAD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_EUCALYPTUS_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_JOSHUA_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_LARCH_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_MAPLE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_MAUVE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_PALM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_PINE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_REDWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(RUE_WILLOW_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("silentgear")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("silentgear", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(SG_NETHERWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("silentgear", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(SG_NETHERWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("tconstruct")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("tconstruct", "world"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(BLOODSHROOM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(GREENHEART_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(SKYROOT_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("tconstruct", "world"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(BLOODSHROOM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(GREENHEART_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(SKYROOT_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("twigs")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("twigs", "item_group"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(STRIPPED_BAMBOO_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("twigs", "item_group"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(STRIPPED_BAMBOO_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    	if (ModList.get().isLoaded("twilightforest")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("twilightforest", "building_blocks"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(CANOPY_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(DARKWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TWILIGHT_MANGROVE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(MINEWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(SORTINGWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TIMEWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TRANSWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TWILIGHT_OAK_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		if (ModList.get().isLoaded("tflostblocks")) { map.put(TOWERWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS); }
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("twilightforest", "tools"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(CANOPY_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(DARKWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TWILIGHT_MANGROVE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(MINEWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(SORTINGWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TIMEWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TRANSWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(TWILIGHT_OAK_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		if (ModList.get().isLoaded("tflostblocks")) { map.put(TOWERWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS); }
    		}
    	}
    	if (ModList.get().isLoaded("undergarden")) {
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("undergarden", "tab"), CreativeModeTabs.FUNCTIONAL_BLOCKS)) {
	    		map.put(GRONGLE_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(SMOGSTEM_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(WIGGLEWOOD_CRAFTING_TABLE.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    		if (event.getTabKey() == getTabWithMatchingName(new ResourceLocation("undergarden", "tab"), CreativeModeTabs.TOOLS_AND_UTILITIES)) {
	    		map.put(GRONGLE_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(SMOGSTEM_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	    		map.put(WIGGLEWOOD_CRAFTING_TABLE_MINECART.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
    		}
    	}
    }
}
