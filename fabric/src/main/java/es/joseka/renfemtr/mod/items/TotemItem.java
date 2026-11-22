package es.joseka.renfemtr.mod.items;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.ItemSettings;
import org.mtr.mapping.mapper.BlockItemExtension;

public class TotemItem extends BlockItemExtension {

    public TotemItem(Block block, ItemSettings itemSettings) {
        super(block, itemSettings);
    }
    @Override
    public String getTranslationKey2() {
        return "item.renfe.cercanias_totem";
    }
}
