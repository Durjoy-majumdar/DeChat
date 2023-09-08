package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;

/* renamed from: com.tencent.mapsdk.internal.je */
public final class C0942je implements Interpolator {
    public C0942je() {
    }

    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (float) Math.sqrt((double) (1.0f - (f2 * f2)));
    }

    private C0942je(byte b) {
    }
}
