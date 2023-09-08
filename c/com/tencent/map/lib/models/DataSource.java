package com.tencent.map.lib.models;

public enum DataSource {
    NONE(-1),
    SATELLITE(0),
    DEM(1),
    MAP(2),
    STREET_VIEW_ROAD(3),
    TRAFFIC_NETWORK(4),
    INDOOR_BUILDINGS(5),
    LANDMARK(6),
    TILE_OVERLAY(7),
    INDOOR_CONFIG(8),
    NUM(9);
    
    private final int mValue;

    private DataSource(int i) {
        this.mValue = i;
    }

    public static DataSource get(int i) {
        for (DataSource dataSource : values()) {
            if (dataSource.mValue == i) {
                return dataSource;
            }
        }
        return NONE;
    }

    public final int getValue() {
        return this.mValue;
    }
}
