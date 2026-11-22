package es.joseka.renfemtr.mod.items;

import org.mtr.mapping.holder.ItemSettings;
import org.mtr.mod.data.RailType;
import org.mtr.mod.item.ItemRailModifier;

public class ExtendedItemRailModifier extends ItemRailModifier {
    private final int speed;
    private final boolean isOneWay;

    public ExtendedItemRailModifier(boolean isOneWay, RailType railType, int speed, ItemSettings itemSettings) {
        super(true, false, false, isOneWay, railType, itemSettings);
        this.speed = speed;
        this.isOneWay = isOneWay;
    }
}
