package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.hw */
public final class C24210hw extends C24204hq {

    /* renamed from: g */
    private float f69302g;

    /* renamed from: h */
    private float f69303h;

    /* renamed from: i */
    private float f69304i;

    /* renamed from: j */
    private float f69305j;

    private C24210hw(float f, float f2, float f3, float f4, long j) {
        super(j);
        this.f69302g = f;
        this.f69303h = f2;
        this.f69304i = f3;
        this.f69305j = f4;
    }

    /* renamed from: a */
    public final void mo40958a(GL10 gl10, long j) {
        float f = this.f69303h;
        float f2 = this.f69302g;
        float f3 = this.f69305j;
        float f4 = this.f69304i;
        float f5 = (float) j;
        long j2 = this.f69287e;
        gl10.glTranslatef(f2 + (((f - f2) * f5) / ((float) j2)), f4 + (((f3 - f4) * f5) / ((float) j2)), 0.0f);
    }
}
