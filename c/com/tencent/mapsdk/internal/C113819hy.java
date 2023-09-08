package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C113820hz;

/* renamed from: com.tencent.mapsdk.internal.hy */
public final class C113819hy extends C113820hz {

    /* renamed from: i */
    private float f340553i;

    /* renamed from: j */
    private float f340554j;

    public C113819hy(float f, float f2) {
        this.f340553i = f;
        this.f340554j = f2;
    }

    /* renamed from: a */
    public final void mo172201a(float f, Interpolator interpolator) {
        float interpolation = this.f340553i + ((this.f340554j - this.f340553i) * interpolator.getInterpolation(f));
        C113820hz.C113822b bVar = this.f340562h;
        if (bVar != null) {
            bVar.mo172208a(interpolation);
        }
    }
}
