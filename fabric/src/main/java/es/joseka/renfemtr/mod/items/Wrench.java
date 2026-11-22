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
