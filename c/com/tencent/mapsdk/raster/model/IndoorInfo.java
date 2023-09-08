package com.tencent.mapsdk.raster.model;

public class IndoorInfo {
    private String buildingId;
    private String floorName;

    public IndoorInfo(String str, String str2) {
        this.buildingId = str;
        this.floorName = str2;
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public String getFloorName() {
        return this.floorName;
    }

    public String toString() {
        return this.buildingId + "_" + this.floorName;
    }
}
