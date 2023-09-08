package com.tencent.map.sdk.comps.vis;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Options;

public class VisualLayerOptions implements Options<VisualLayerOptions, VisualLayerOptionsBuilder> {
    public float mAlpha = 1.0f;
    public boolean mClickEnabled = false;
    public boolean mIsVisible = true;
    public String mLayerId;
    public int mLevel = 1;
    public int mTimeInternal = 0;
    public int mZIndex;

    public VisualLayerOptions(String str) {
        this.mLayerId = str;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public String getLayerId() {
        return this.mLayerId;
    }

    public int getLevel() {
        return this.mLevel;
    }

    public int getTimeInterval() {
        return this.mTimeInternal;
    }

    public int getZIndex() {
        return this.mZIndex;
    }

    public boolean isClickEnabled() {
        return this.mClickEnabled;
    }

    public boolean isVisible() {
        return this.mIsVisible;
    }

    public VisualLayerOptionsBuilder newBuilder() {
        return new VisualLayerOptionsBuilder(this);
    }
}
