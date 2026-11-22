package es.joseka.renfemtr.mod.items;

import es.joseka.renfemtr.mod.data.Incrementable;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.ItemExtension;

public class Wrench extends ItemExtension {
    public Wrench(ItemSettings itemSettings) {
        super(itemSettings);
    }

    @Override
    public ActionResult useOnBlock2(ItemUsageContext context) {
        final World world = context.getWorld();
        /*
        if (!world.isClient()) {
            final BlockState state = world.getBlockState(context.getBlockPos());
            final Block block = state.getBlock();
            if (block.data instanceof ModelChangerBase) {
                final int value = state.get(new Property<>(ModelChangerBase.TEXTURE.data));
                final int count = ((ModelChangerBase) block.data).getCount();
                int newValue = (value == count) ? 1 : (value + 1);
                world.setBlockState(context.getBlockPos(), state.with(new Property<>(ModelChangerBase.TEXTURE.data), newValue ));
                return ActionResult.SUCCESS;
            }
        }*/
        if (!world.isClient()) {
            final BlockState state = world.getBlockState(context.getBlockPos());

            // "Trampa" mágica: ¿El bloque tiene la interfaz?
            if (state.getBlock().data instanceof Incrementable inc) {

                IntegerProperty prop = inc.getPropertyToIncrement();
                Property<Integer> internalProp = new Property<>(prop.data);

                int currentValue = state.get(internalProp);
                int newValue = inc.getNextValue(currentValue);

                world.setBlockState(context.getBlockPos(), state.with(internalProp, newValue));
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.FAIL;
    }


}
