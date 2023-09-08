package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.hr */
public final class C24205hr extends C24204hq {

    /* renamed from: g */
    private float f69292g;

    /* renamed from: h */
    private float f69293h;

    private C24205hr(float f, float f2, long j) {
        super(j);
        this.f69292g = f;
        this.f69293h = f2;
    }

    /* renamed from: a */
    public final void mo40958a(GL10 gl10, long j) {
        float f = this.f69293h;
        float f2 = this.f69292g;
        float f3 = f2 + (((f - f2) * ((float) j)) / ((float) this.f69287e));
        gl10.glColor4f(f3, f3, f3, f3);
    }
}
