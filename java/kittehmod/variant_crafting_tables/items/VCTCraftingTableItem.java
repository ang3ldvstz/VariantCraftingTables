package kittehmod.variant_crafting_tables.items;

import javax.annotation.Nullable;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class VCTCraftingTableItem extends BlockItem
{
	public VCTCraftingTableItem(Block block, Properties properties) {
		super(block, properties);
	}

	@Override
	public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType) {
		if (stack.getItem() == VCTItems.CRIMSON_CRAFTING_TABLE.get() || stack.getItem() == VCTItems.WARPED_CRAFTING_TABLE.get() || stack.getItem() == VCTItems.BOP_HELLBARK_CRAFTING_TABLE.get()) {
			return -1; // Can't be used in furnace.
		}
		else {
			return 300;
		}
		
	}
}
