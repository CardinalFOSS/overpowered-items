package net.williamschen.overpowereditems.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.williamschen.overpowereditems.OverpoweredItems;

public class ModItemGroup {
    public static final ItemGroup OVERPOWERED = FabricItemGroupBuilder.build(
        new Identifier(OverpoweredItems.MOD_ID, "overpowered"),() -> new ItemStack(ModItems.OVERPOWERED_INGOT));
}
