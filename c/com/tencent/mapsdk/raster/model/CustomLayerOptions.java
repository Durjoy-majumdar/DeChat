package com.tencent.mapsdk.raster.model;

import android.text.TextUtils;

public class CustomLayerOptions {
    private String mLayerId;
    private String mLayerVersion;

    public String getLayerId() {
        return this.mLayerId;
    }

    public CustomLayerOptions layerId(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mLayerId = str;
        }
        return this;
    }
}
