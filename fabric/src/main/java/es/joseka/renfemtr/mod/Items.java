package es.joseka.renfemtr.mod;


import es.joseka.renfemtr.mod.data.ExtendedRails;
import es.joseka.renfemtr.mod.items.*;
import es.joseka.renfemtr.mod.mixin.GetRailType;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.Item;
import org.mtr.mapping.registry.ItemRegistryObject;
import org.mtr.mod.data.RailType;

public class Items {
    static {
        PLAT_NUMBER_CHANGER = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "plat_number_changer"), itemSettings -> new Item(new Wrench(itemSettings.maxCount(1))), CreativeModeTabs.DECORATIONS);
        CERCANIAS_TOTEM = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "cercanias_totem"), itemSettings -> new Item(new TotemItem(Blocks.CERCANIAS_TOTEM_BLOCK_1.get(), itemSettings)), CreativeModeTabs.DECORATIONS);
        RAIL_CONNECTOR_5 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rail_connector_5"), itemSettings -> new Item(new ExtendedItemRailModifier(false, RailType.valueOf("RAIL_5"), 5, itemSettings)),CreativeModeTabs.RAILWAYS);
        RAIL_CONNECTOR_5_ONE_WAY = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rail_connector_5_one_way"), itemSettings -> new Item(new ExtendedItemRailModifier(true, RailType.valueOf("RAIL_5"), 5, itemSettings)),CreativeModeTabs.RAILWAYS);
        RAIL_CONNECTOR_10 = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rail_connector_10"), itemSettings -> new Item(new ExtendedItemRailModifier(false, RailType.valueOf("RAIL_10"), 10, itemSettings)),CreativeModeTabs.RAILWAYS);
        RAIL_CONNECTOR_10_ONE_WAY = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "rail_connector_10_one_way"), itemSettings -> new Item(new ExtendedItemRailModifier(true, RailType.valueOf("RAIL_10"), 10, itemSettings)),CreativeModeTabs.RAILWAYS);

    }
    public static final ItemRegistryObject PLAT_NUMBER_CHANGER;
    public static final ItemRegistryObject CERCANIAS_TOTEM;
    public static final ItemRegistryObject RAIL_CONNECTOR_5;
    public static final ItemRegistryObject RAIL_CONNECTOR_5_ONE_WAY;
    public static final ItemRegistryObject RAIL_CONNECTOR_10;
    public static final ItemRegistryObject RAIL_CONNECTOR_10_ONE_WAY;

    public static void init() {
        Init.LOGGER.info("Registering MTR Renfe Addon Items");
    }
}
