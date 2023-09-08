package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;

/* renamed from: com.tencent.mapsdk.internal.jf */
public final class C0943jf implements Interpolator {
    public final float getInterpolation(float f) {
        double d = ((double) f) - 1.0d;
        double d2 = d * d;
        double d3 = d2 * d2;
        return (float) (1.0d - (d3 * d3));
    }
}
