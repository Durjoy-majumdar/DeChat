package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.tencentmap.mapsdk.maps.model.ITranslateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

/* renamed from: com.tencent.mapsdk.internal.hn */
public final class C113813hn extends C113805hi implements ITranslateAnimation {
    public C113813hn(LatLng latLng) {
        GeoPoint from = GeoPoint.from(latLng);
        if (this.f340538a == null) {
            this.f340538a = new C113827ie(from);
        }
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
