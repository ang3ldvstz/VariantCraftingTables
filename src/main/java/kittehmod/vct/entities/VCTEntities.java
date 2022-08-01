package kittehmod.vct.entities;

import kittehmod.vct.VariantCraftingTablesMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VCTEntities
{
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VariantCraftingTablesMod.MOD_ID);
	
	public static final RegistryObject<EntityType<MinecartCraftingTable>> CRAFTING_TABLE_MINECART = ENTITIES.register("crafting_table_minecart", () -> EntityType.Builder.<MinecartCraftingTable>of(MinecartCraftingTable::new, MobCategory.MISC).sized(0.98F, 0.7F).setTrackingRange(8).setCustomClientFactory((spawnEntity, world) -> new MinecartCraftingTable(world, 0, 0, 0)).build("crafting_table_minecart")); 
}
