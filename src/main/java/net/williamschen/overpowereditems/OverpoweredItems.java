package net.williamschen.overpowereditems;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverpoweredItems implements ModInitializer {
	public static final Item OVERPOWERED_SWORD = new Item(new Item.Settings().group(ItemGroup.COMBAT));
	public static final Logger LOGGER = LoggerFactory.getLogger("overpowereditems");

	@Override
	public void onInitialize() {
		
		Registry.register(Registry.ITEM, new Identifier("overpowereditems", "overpowered_sword"), OVERPOWERED_SWORD);
		LOGGER.info("Hello Fabric world!");
	}
}
