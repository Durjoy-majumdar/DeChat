package com.tencent.mapsdk.raster.model;

public final class IndoorLevel {
    private String floorName;

    public IndoorLevel(String str) {
        this.floorName = str;
    }

    public String getName() {
        return this.floorName;
    }
}
