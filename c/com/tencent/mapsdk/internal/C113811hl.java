package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.IRotateAnimation;

/* renamed from: com.tencent.mapsdk.internal.hl */
public final class C113811hl extends C113805hi implements IRotateAnimation {
    public C113811hl(float f, float f2, float f3, float f4, float f5) {
        if (this.f340538a == null) {
            this.f340538a = new C113825ic(f, f2, f3, f4, f5);
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
