package net.williamschen.overpowereditems.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.williamschen.overpowereditems.OverpoweredItems;
import net.williamschen.overpowereditems.item.custom.ModAxeItem;
import net.williamschen.overpowereditems.item.custom.ModHoeItem;
import net.williamschen.overpowereditems.item.custom.ModPickaxeItem;

public class ModItems {
    public static final Item OVERPOWERED_SWORD = registerItem("overpowered_sword",
            new SwordItem(ModToolMaterials.OVERPOWERED, Integer.MAX_VALUE, -4f,
                    new FabricItemSettings().group(ModItemGroup.OVERPOWERED)));

    public static final Item OVERPOWERED_PICKAXE = registerItem("overpowered_pickaxe",
            new ModPickaxeItem(ModToolMaterials.OVERPOWERED, 4, -2f,
                    new FabricItemSettings().group(ModItemGroup.OVERPOWERED)));

    public static final Item OVERPOWERED_SHOVEl = registerItem("overpowered_shovel",
            new ShovelItem(ModToolMaterials.OVERPOWERED, 4, -2f,
                    new FabricItemSettings().group(ModItemGroup.OVERPOWERED)));

    public static final Item OVERPOWERED_AXE = registerItem("overpowered_axe",
            new ModAxeItem(ModToolMaterials.OVERPOWERED, 15, -3f,
                    new FabricItemSettings().group(ModItemGroup.OVERPOWERED)));

    public static final Item OVERPOWERED_HOE = registerItem("overpowered_hoe",
            new ModHoeItem(ModToolMaterials.OVERPOWERED, 4, -2f,
                    new FabricItemSettings().group(ModItemGroup.OVERPOWERED)));

    public static final Item OVERPOWERED_INGOT = registerItem("overpowered_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.OVERPOWERED)));



    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(OverpoweredItems.MOD_ID, name), item);
    }

    public static void registerModItems(){
        OverpoweredItems.LOGGER.info("Registering Mod Items for OP items");
    }

}
