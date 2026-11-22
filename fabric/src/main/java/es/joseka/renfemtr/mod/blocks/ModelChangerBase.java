package es.joseka.renfemtr.mod.blocks;

import es.joseka.renfemtr.mod.data.Incrementable;
import es.joseka.renfemtr.mod.items.ItemHold;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;


import java.util.List;

public abstract class ModelChangerBase extends BlockExtension implements DirectionHelper, Incrementable {

    public ModelChangerBase(BlockSettings blockSettings/*, int maxModelNum*/) {
        super(blockSettings);
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
        properties.add(getPropertyToIncrement());
    }

    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        final Direction facing = ctx.getPlayerFacing();
        final CompoundTag compoundTag = ctx.getStack().getOrCreateTag();

        IntegerProperty prop = getPropertyToIncrement();
        int minVal = getMinValue();

        final int index = compoundTag.contains(ItemHold.TAG_HOLD) ? compoundTag.getInt(ItemHold.TAG_HOLD) : minVal;
        return getDefaultState2().with(new Property<>(FACING.data), facing.data).with(new Property<>(prop.data), index);
    }
}