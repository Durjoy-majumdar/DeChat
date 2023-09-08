package com.tencent.maas.model.composing;

import com.tencent.maas.model.MJSpatialInfo;

public class MJOverlayDesc {
    private int index;
    private MJSpatialInfo spatialInfo;

    public MJOverlayDesc(MJSpatialInfo mJSpatialInfo) {
        this.spatialInfo = mJSpatialInfo;
        this.index = 0;
    }

    public int getIndex() {
        return this.index;
    }

    public MJSpatialInfo getSpatialInfo() {
        return this.spatialInfo;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setSpatialInfo(MJSpatialInfo mJSpatialInfo) {
        this.spatialInfo = mJSpatialInfo;
    }

    public MJOverlayDesc(MJSpatialInfo mJSpatialInfo, int i) {
        this.spatialInfo = mJSpatialInfo;
        this.index = i;
    }
}
