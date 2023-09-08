package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation;

/* renamed from: com.tencent.mapsdk.internal.hh */
public final class C113804hh extends C113805hi implements IAlphaAnimation {
    public C113804hh(float f, float f2) {
        if (this.f340538a == null) {
            this.f340538a = new C113819hy(f, f2);
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
