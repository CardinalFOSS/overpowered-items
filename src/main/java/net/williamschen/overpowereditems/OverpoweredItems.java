package net.williamschen.overpowereditems;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.williamschen.overpowereditems.block.ModBlocks;
import net.williamschen.overpowereditems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverpoweredItems implements ModInitializer {
	public static final String MOD_ID = "overpowereditems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlock();
		LOGGER.info("Hello Fabric world!");
	}
}
