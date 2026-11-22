package es.joseka.renfemtr.mod.mixin;

import es.joseka.renfemtr.mod.data.ExtendedRails;
import org.mtr.core.data.Rail;
import org.mtr.mapping.holder.MapColor;
import org.mtr.mod.data.RailType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mixin(value = RailType.class, remap = false)
public abstract class GetRailType {

    @Shadow @Final @Mutable
    private static RailType[] $VALUES;

    @Invoker("<init>")
    private static RailType newRailType(String name, int ordinal, int speedLimit, MapColor mapColor, boolean isSavedRail, boolean canAccelerate, boolean hasSignal, Rail.Shape railShape) {
        throw new AssertionError();
    }

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void addextendedRailType(CallbackInfo cI) {
        System.out.println("[Renfe] mixin RailType ejecutado, constantes antes: " + $VALUES.length);
        List<RailType> railTypes = new ArrayList<>(Arrays.asList($VALUES));
        int initialOrdinal = $VALUES.length;
        for (int i = 0; i < ExtendedRails.EXTENDED_RAILS.size(); i++){
            ExtendedRails.RailData data = ExtendedRails.EXTENDED_RAILS.get(i);
            railTypes.add(newRailType(data.name, initialOrdinal + i, data.speed, data.color, true, true, true, Rail.Shape.QUADRATIC));
        }
        $VALUES = railTypes.toArray(new RailType[0]);
        System.out.println("[Renfe] constantes después: " + $VALUES.length);
    }
}
