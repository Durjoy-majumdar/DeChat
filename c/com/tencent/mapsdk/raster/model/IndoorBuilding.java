package com.tencent.mapsdk.raster.model;

import java.util.List;

public final class IndoorBuilding {
    private int mActiveLevelIndex;
    private String mBuidlingId;
    private String mBuildingName;
    private List<IndoorLevel> mLevels;

    public IndoorBuilding(String str, String str2, List<IndoorLevel> list, int i) {
        this.mBuidlingId = str;
        this.mBuildingName = str2;
        this.mLevels = list;
        this.mActiveLevelIndex = i;
    }

    public int getActiveLevelIndex() {
        return this.mActiveLevelIndex;
    }

    public String getBuidlingId() {
        return this.mBuidlingId;
    }

    public String getBuildingName() {
        return this.mBuildingName;
    }

    public List<IndoorLevel> getLevels() {
        return this.mLevels;
    }

    public String toString() {
        List<IndoorLevel> list;
        if (this.mBuidlingId == null || (list = this.mLevels) == null || list.size() <= this.mActiveLevelIndex) {
            return null;
        }
        return this.mBuidlingId + "_" + this.mLevels.get(this.mActiveLevelIndex).getName();
    }
}
