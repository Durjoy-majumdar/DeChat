package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;

/* renamed from: com.tencent.mapsdk.internal.ji */
public final class C0946ji implements Interpolator {
    public final float getInterpolation(float f) {
        return f * (2.0f - f);
    }
}
