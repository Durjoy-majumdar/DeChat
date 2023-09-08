package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.ht */
public class C24207ht extends C24204hq {

    /* renamed from: g */
    public float f69295g;

    /* renamed from: h */
    public float f69296h;

    /* renamed from: i */
    public float f69297i;

    /* renamed from: j */
    public float f69298j;

    public C24207ht(float f, float f2, float f3, float f4, long j) {
        super(j);
        this.f69295g = f;
        this.f69296h = f2;
        this.f69297i = f3;
        this.f69298j = f4;
    }

    /* renamed from: a */
    public void mo40958a(GL10 gl10, long j) {
        float f = this.f69296h;
        float f2 = this.f69295g;
        float f3 = this.f69298j;
        float f4 = this.f69297i;
        float f5 = (float) j;
        long j2 = this.f69287e;
        gl10.glScalef(f2 + (((f - f2) * f5) / ((float) j2)), f4 + (((f3 - f4) * f5) / ((float) j2)), 1.0f);
    }
}
