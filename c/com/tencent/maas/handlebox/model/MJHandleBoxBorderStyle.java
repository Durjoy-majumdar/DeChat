package com.tencent.maas.handlebox.model;

import com.tencent.maas.model.MJColor;

public class MJHandleBoxBorderStyle {
    private final MJColor shadowColor;
    private final float shadowWidth;
    private final MJColor strokeColor;
    private final float strokeWidth;

    public MJHandleBoxBorderStyle(MJColor mJColor, float f, MJColor mJColor2, float f2) {
        this.strokeColor = mJColor;
        this.strokeWidth = f;
        this.shadowColor = mJColor2;
        this.shadowWidth = f2;
    }

    public MJColor getShadowColor() {
        return this.shadowColor;
    }

    public float getShadowWidth() {
        return this.shadowWidth;
    }

    public MJColor getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }
}
