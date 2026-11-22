package es.joseka.renfemtr.mod.data;

import org.mtr.mapping.holder.IntegerProperty;

public interface Incrementable {
    // Retorna la propiedad que queremos cambiar (sea textura, modelo, nivel, etc.)
    IntegerProperty getPropertyToIncrement();
    // Definimos los límites aquí
    int getMinValue();
    int getMaxValue();
    // Define el comportamiento de rotación (si vuelve a 0 o al mínimo)
    default int getNextValue(int currentValue) {
        return (currentValue >= getMaxValue()) ? getMinValue() : (currentValue + 1);
    }
}
