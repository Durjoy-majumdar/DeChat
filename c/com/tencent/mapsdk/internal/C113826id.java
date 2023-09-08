package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C113820hz;

/* renamed from: com.tencent.mapsdk.internal.id */
public final class C113826id extends C113820hz {

    /* renamed from: i */
    private float f340571i;

    /* renamed from: j */
    private float f340572j;

    /* renamed from: k */
    private float f340573k;

    /* renamed from: l */
    private float f340574l;

    public C113826id(float f, float f2, float f3, float f4) {
        this.f340571i = f;
        this.f340572j = f2;
        this.f340573k = f3;
        this.f340574l = f4;
    }

    /* renamed from: a */
    public final void mo172201a(float f, Interpolator interpolator) {
        if (f >= 0.0f) {
            float f2 = this.f340572j - this.f340571i;
            float interpolation = interpolator.getInterpolation(f);
            float f3 = this.f340571i + (f2 * interpolation);
            float f4 = this.f340573k + ((this.f340574l - this.f340573k) * interpolation);
            C113820hz.C113822b bVar = this.f340562h;
            if (bVar != null) {
                bVar.mo172209a(f3, f4);
            }
        }
    }
}
