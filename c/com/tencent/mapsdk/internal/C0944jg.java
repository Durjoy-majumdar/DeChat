package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;

/* renamed from: com.tencent.mapsdk.internal.jg */
public final class C0944jg implements Interpolator {
    public final float getInterpolation(float f) {
        double d = ((double) f) / 0.5d;
        return (float) ((d < 1.0d ? Math.pow(d, 3.0d) : Math.pow(d - 2.0d, 3.0d) + 2.0d) * 0.5d);
    }
}
