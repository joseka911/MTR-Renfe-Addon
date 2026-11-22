package es.joseka.renfemtr.mod.data;

import org.mtr.mapping.holder.MapColor;

import java.util.Arrays;
import java.util.List;

public  final class ExtendedRails {

    public static final class RailData {
        public final String name;
        public final int speed;
        public final MapColor color;

        public RailData(String name, int speed, MapColor color) {
            this.name = name;
            this.speed = speed;
            this.color = color;
        }
    }

    private ExtendedRails() {}

    public static final List<RailData> EXTENDED_RAILS = Arrays.asList (
            new RailData("RAIL_10", 10, MapColor.getDirtBrownMapped()),
            new RailData("RAIL_5", 5, MapColor.getPinkMapped())
    );
}
