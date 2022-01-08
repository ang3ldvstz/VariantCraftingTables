package kittehmod.variant_crafting_tables.entities;

import kittehmod.variant_crafting_tables.VariantCraftingTablesMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class VCTEntities
{
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, VariantCraftingTablesMod.MOD_ID);
	
	public static final RegistryObject<EntityType<MinecartCraftingTable>> OAK_CRAFTING_TABLE_MINECART = ENTITIES.register("oak_crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0, MinecartCraftingTable.CraftingTableType.OAK)).build("oak_crafting_table_minecart")); 
	public static final RegistryObject<EntityType<MinecartCraftingTable>> SPRUCE_CRAFTING_TABLE_MINECART = ENTITIES.register("spruce_crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0, MinecartCraftingTable.CraftingTableType.SPRUCE)).build("spruce_crafting_table_minecart")); 
	public static final RegistryObject<EntityType<MinecartCraftingTable>> BIRCH_CRAFTING_TABLE_MINECART = ENTITIES.register("birch_crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0, MinecartCraftingTable.CraftingTableType.BIRCH)).build("birch_crafting_table_minecart")); 
	public static final RegistryObject<EntityType<MinecartCraftingTable>> JUNGLE_CRAFTING_TABLE_MINECART = ENTITIES.register("jungle_crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0, MinecartCraftingTable.CraftingTableType.JUNGLE)).build("jungle_crafting_table_minecart")); 
	public static final RegistryObject<EntityType<MinecartCraftingTable>> ACACIA_CRAFTING_TABLE_MINECART = ENTITIES.register("acacia_crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0, MinecartCraftingTable.CraftingTableType.ACACIA)).build("acacia_crafting_table_minecart")); 
	public static final RegistryObject<EntityType<MinecartCraftingTable>> DARK_OAK_CRAFTING_TABLE_MINECART = ENTITIES.register("dark_oak_crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0, MinecartCraftingTable.CraftingTableType.DARK_OAK)).build("dark_oak_crafting_table_minecart")); 
	public static final RegistryObject<EntityType<MinecartCraftingTable>> CRIMSON_CRAFTING_TABLE_MINECART = ENTITIES.register("crimson_crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0, MinecartCraftingTable.CraftingTableType.CRIMSON)).build("crimson_crafting_table_minecart")); 
	public static final RegistryObject<EntityType<MinecartCraftingTable>> WARPED_CRAFTING_TABLE_MINECART = ENTITIES.register("warped_crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0, MinecartCraftingTable.CraftingTableType.WARPED)).build("warped_crafting_table_minecart")); 
	
	@EventBusSubscriber(modid = VariantCraftingTablesMod.MOD_ID)
	public static class RegistrationHandler 
	{
		public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
			return setup(entry, new ResourceLocation(VariantCraftingTablesMod.MOD_ID, name));
		}

		public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
			entry.setRegistryName(registryName);
			return entry;
		}
		
	    @SubscribeEvent
	    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) { 
	    	event.getRegistry().registerAll();
	    }
	}
}
