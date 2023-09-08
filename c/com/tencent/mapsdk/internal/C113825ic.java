package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.C113820hz;

/* renamed from: com.tencent.mapsdk.internal.ic */
public final class C113825ic extends C113820hz {

    /* renamed from: i */
    private float f340566i;

    /* renamed from: j */
    private float f340567j;

    /* renamed from: k */
    private float f340568k;

    /* renamed from: l */
    private float f340569l;

    /* renamed from: m */
    private float f340570m;

    public C113825ic(float f, float f2, float f3, float f4, float f5) {
        this.f340566i = f;
        this.f340567j = f2;
        this.f340568k = f3;
        this.f340569l = f4;
        this.f340570m = f5;
    }

    /* renamed from: a */
    public final void mo172201a(float f, Interpolator interpolator) {
        float interpolation = this.f340566i + ((this.f340567j - this.f340566i) * interpolator.getInterpolation(f));
        C113820hz.C113822b bVar = this.f340562h;
        if (bVar != null) {
            bVar.mo172210a(interpolation, this.f340568k, this.f340569l, this.f340570m);
        }
    }
}
