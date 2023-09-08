package com.tencent.tencentmap.mapsdk.maps.model;

import java.util.ArrayList;
import java.util.List;

public final class IndoorBuilding implements Cloneable {
    private int mActiveLevelIndex;
    private String mBuidlingId;
    private String mBuildingName;
    private LatLng mLatLng;
    private List<IndoorLevel> mLevels;

    public IndoorBuilding(String str, String str2, LatLng latLng, List<IndoorLevel> list, int i) {
        this.mBuidlingId = str;
        this.mBuildingName = str2;
        this.mLatLng = latLng;
        this.mLevels = list;
        this.mActiveLevelIndex = i;
    }

    public final Object clone() {
        IndoorBuilding indoorBuilding = (IndoorBuilding) super.clone();
        if (this.mLevels != null) {
            indoorBuilding.mLevels = new ArrayList(this.mLevels.size());
            for (int i = 0; i < this.mLevels.size(); i++) {
                indoorBuilding.mLevels.add(new IndoorLevel(this.mLevels.get(i).getName()));
            }
        }
        if (this.mLatLng != null) {
            LatLng latLng = this.mLatLng;
            indoorBuilding.mLatLng = new LatLng(latLng.latitude, latLng.longitude);
        }
        return indoorBuilding;
    }

    public final int getActiveLevelIndex() {
        return this.mActiveLevelIndex;
    }

    public final String getBuidlingId() {
        return this.mBuidlingId;
    }

    public final LatLng getBuildingLatLng() {
        return this.mLatLng;
    }

    public final String getBuildingName() {
        return this.mBuildingName;
    }

    public final List<IndoorLevel> getLevels() {
        return this.mLevels;
    }

    public final String toString() {
        List<IndoorLevel> list;
        if (this.mBuidlingId == null || (list = this.mLevels) == null || list.size() <= this.mActiveLevelIndex) {
            return "";
        }
        return this.mBuidlingId + "_" + this.mLevels.get(this.mActiveLevelIndex).getName();
    }
}
