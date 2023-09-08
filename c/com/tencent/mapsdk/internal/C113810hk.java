package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.hk */
public final class C113810hk extends C113805hi implements IEmergeAnimation {

    /* renamed from: c */
    private LatLng f340543c = null;

    public C113810hk(LatLng latLng) {
        if (this.f340538a == null) {
            this.f340538a = new C113824ib(latLng);
        }
        this.f340543c = latLng;
    }

    /* renamed from: a */
    private LatLng m157163a() {
        return this.f340543c;
    }

    public final void setDuration(long j) {
        C113820hz hzVar = this.f340538a;
        if (hzVar != null) {
            hzVar.mo172203a(j);
        }
    }

    public final void setInterpolator(Interpolator interpolator) {
        C113820hz hzVar = this.f340538a;
        if (hzVar != null && interpolator != null) {
            hzVar.f340560f = interpolator;
        }
    }
}
