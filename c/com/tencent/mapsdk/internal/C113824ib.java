package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C113820hz;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.ib */
public final class C113824ib extends C113820hz {

    /* renamed from: i */
    public LatLng f340565i;

    public C113824ib(LatLng latLng) {
        this.f340565i = latLng;
    }

    /* renamed from: c */
    private LatLng m157220c() {
        return this.f340565i;
    }

    /* renamed from: a */
    public final void mo172201a(float f, Interpolator interpolator) {
        float interpolation = interpolator.getInterpolation(f);
        C113820hz.C113822b bVar = this.f340562h;
        if (bVar != null) {
            bVar.mo172212b(interpolation);
        }
    }
}
