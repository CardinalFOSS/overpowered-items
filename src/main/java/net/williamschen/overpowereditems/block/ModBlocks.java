package net.williamschen.overpowereditems.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.williamschen.overpowereditems.OverpoweredItems;
import net.williamschen.overpowereditems.item.ModItemGroup;

public class ModBlocks {

    public static final Block OVERPOWERED_BLOCK = registerBlock("overpowered_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 1200.0f)
            ), ModItemGroup.OVERPOWERED);


    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(OverpoweredItems.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(OverpoweredItems.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }



    public static void registerModBlock(){
        OverpoweredItems.LOGGER.info("Registering ModBlocks for " + OverpoweredItems.MOD_ID);
    }
}
