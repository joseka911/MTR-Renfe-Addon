package es.joseka.renfemtr.mod.data;

import org.mtr.mapping.holder.IntegerProperty;

public interface Incrementable {

    IntegerProperty getPropertyToIncrement();

    int getMinValue();
    int getMaxValue();

    default int getNextValue(int currentValue) {
        return (currentValue >= getMaxValue()) ? getMinValue() : (currentValue + 1);
    }
}
