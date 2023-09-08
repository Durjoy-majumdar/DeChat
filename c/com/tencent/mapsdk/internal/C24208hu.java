package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.hu */
public final class C24208hu extends C24207ht {

    /* renamed from: k */
    private long f69299k;

    /* renamed from: l */
    private long f69300l;

    private C24208hu(float f, float f2, float f3, float f4, long j, long j2) {
        super(f, f2, f3, f4, j + j2);
        this.f69299k = j;
        this.f69300l = j2;
    }

    /* renamed from: a */
    public final void mo40958a(GL10 gl10, long j) {
        float f;
        float f2;
        float f3 = this.f69296h;
        float f4 = this.f69295g;
        float f5 = f3 - f4;
        float f6 = this.f69298j;
        float f7 = this.f69297i;
        float f8 = f6 - f7;
        long j2 = this.f69299k;
        if (j < j2) {
            float f9 = (float) j;
            f2 = f4 + ((f5 * f9) / ((float) j2));
            f = f7 + ((f8 * f9) / ((float) j2));
        } else {
            float f15 = (float) (j - j2);
            long j3 = this.f69300l;
            f2 = f3 - ((f5 * f15) / ((float) j3));
            f = f6 - ((f8 * f15) / ((float) j3));
        }
        gl10.glScalef(f2, f, 1.0f);
    }
}
