package kittehmod.variant_crafting_tables.entities;

import kittehmod.variant_crafting_tables.blocks.VCTBlocks;
import kittehmod.variant_crafting_tables.container.MinecartWorkbenchContainer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.item.minecart.ContainerMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.network.IPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class CraftingTableMinecartEntity extends ContainerMinecartEntity implements IInventory, INamedContainerProvider
{
	public CraftingTableMinecartEntity(EntityType<? extends CraftingTableMinecartEntity> workbenchCart, World world) {
		super(workbenchCart, world);
	}

	public CraftingTableMinecartEntity(World worldIn, double x, double y, double z, CraftingTableType type) {
		super(getEntitySubtype(type), x, y, z, worldIn);
	}

	public ActionResultType interact(PlayerEntity player, Hand hand) {
		ActionResultType ret = super.interact(player, hand);
		if (ret.consumesAction()) return ret;
		player.openMenu(this);
		if (!player.level.isClientSide) {
			return ActionResultType.CONSUME;
		} else {
			return ActionResultType.SUCCESS;
		}
	}

	@Override
	public BlockState getDisplayBlockState() {
		return this.getDefaultDisplayBlockState();
	}

	@Override
	public BlockState getDefaultDisplayBlockState() {
		Block block;
		switch (this.getCraftingTableType()) {
		case OAK:
			block = Blocks.CRAFTING_TABLE;
			break;
		case SPRUCE:
			block = VCTBlocks.SPRUCE_CRAFTING_TABLE.get();
			break;
		case BIRCH:
			block = VCTBlocks.BIRCH_CRAFTING_TABLE.get();
			break;
		case JUNGLE:
			block = VCTBlocks.JUNGLE_CRAFTING_TABLE.get();
			break;
		case ACACIA:
			block = VCTBlocks.ACACIA_CRAFTING_TABLE.get();
			break;
		case DARK_OAK:
			block = VCTBlocks.DARK_OAK_CRAFTING_TABLE.get();
			break;
		case CRIMSON:
			block = VCTBlocks.CRIMSON_CRAFTING_TABLE.get();
			break;
		case WARPED:
			block = VCTBlocks.WARPED_CRAFTING_TABLE.get();
			break;
		default:
			block = Blocks.CRAFTING_TABLE;
		}
		return block.defaultBlockState();
	}

	public int getDefaultDisplayTileOffset() {
		return 8;
	}

	public Container createMenu(int cid, PlayerInventory playerInventoryIn) {
		return new MinecartWorkbenchContainer(cid, playerInventoryIn, IWorldPosCallable.create(this.level, this.blockPosition()), this);
	}

	@Override
	public Type getMinecartType() {
		return AbstractMinecartEntity.Type.CHEST; // Arbitrarily set but its only purpose is to make the errors shut up.
	}

	public static CraftingTableMinecartEntity create(World worldIn, double x, double y, double z, CraftingTableType type) {
		return new CraftingTableMinecartEntity(worldIn, x, y, z, type);
	}

	@Override
	public int getContainerSize() {
		return 9;
	}

	public IPacket<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public void destroy(DamageSource source) {
		super.destroy(source);
		if (!source.isExplosion() && this.level.getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
			this.spawnAtLocation(this.getDisplayBlockState().getBlock());
		}
	}

	/*@Override
	public ITextComponent getName() {
		if (!this.hasCustomName()) {
			return this.getCustomName();
		}
		else {
			return ModCraftingTableBlock.TITLE;
		}
	}*/
	
	public CraftingTableType getCraftingTableType() {
		if (this.getType() == VCTEntities.OAK_CRAFTING_TABLE_MINECART.get()) {
			return CraftingTableType.OAK;
		} else if (this.getType() == VCTEntities.SPRUCE_CRAFTING_TABLE_MINECART.get()) {
			return CraftingTableType.SPRUCE;
		} else if (this.getType() == VCTEntities.BIRCH_CRAFTING_TABLE_MINECART.get()) {
			return CraftingTableType.BIRCH;
		} else if (this.getType() == VCTEntities.JUNGLE_CRAFTING_TABLE_MINECART.get()) {
			return CraftingTableType.JUNGLE;
		} else if (this.getType() == VCTEntities.ACACIA_CRAFTING_TABLE_MINECART.get()) {
			return CraftingTableType.ACACIA;
		} else if (this.getType() == VCTEntities.DARK_OAK_CRAFTING_TABLE_MINECART.get()) {
			return CraftingTableType.DARK_OAK;
		} else if (this.getType() == VCTEntities.CRIMSON_CRAFTING_TABLE_MINECART.get()) {
			return CraftingTableType.CRIMSON;
		} else if (this.getType() == VCTEntities.WARPED_CRAFTING_TABLE_MINECART.get()) {
			return CraftingTableType.WARPED;
		} else {
			return CraftingTableType.OAK;
		}
	}

	private static EntityType<CraftingTableMinecartEntity> getEntitySubtype(CraftingTableType type) {
		switch (type) {
		case OAK:
			return VCTEntities.OAK_CRAFTING_TABLE_MINECART.get();
		case SPRUCE:
			return VCTEntities.SPRUCE_CRAFTING_TABLE_MINECART.get();
		case BIRCH:
			return VCTEntities.BIRCH_CRAFTING_TABLE_MINECART.get();
		case JUNGLE:
			return VCTEntities.JUNGLE_CRAFTING_TABLE_MINECART.get();
		case ACACIA:
			return VCTEntities.ACACIA_CRAFTING_TABLE_MINECART.get();
		case DARK_OAK:
			return VCTEntities.DARK_OAK_CRAFTING_TABLE_MINECART.get();
		case CRIMSON:
			return VCTEntities.CRIMSON_CRAFTING_TABLE_MINECART.get();
		case WARPED:
			return VCTEntities.WARPED_CRAFTING_TABLE_MINECART.get();
		default:
			return VCTEntities.OAK_CRAFTING_TABLE_MINECART.get();
		}
	}

	public static enum CraftingTableType
	{
		OAK, SPRUCE, BIRCH, JUNGLE, ACACIA, DARK_OAK, CRIMSON, WARPED
	}

}
