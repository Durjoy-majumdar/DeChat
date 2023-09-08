package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;

/* renamed from: com.tencent.mapsdk.internal.jd */
public final class C0941jd implements Interpolator {
    public final float getInterpolation(float f) {
        double d = (double) f;
        double d2 = d * d;
        double d3 = d2 * d2;
        return (float) (d3 * d3);
    }
}
