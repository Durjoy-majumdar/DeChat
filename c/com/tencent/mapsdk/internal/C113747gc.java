package com.tencent.mapsdk.internal;

import android.opengl.Matrix;

/* renamed from: com.tencent.mapsdk.internal.gc */
public final class C113747gc {

    /* renamed from: a */
    public float f340323a;

    /* renamed from: b */
    public float f340324b;

    /* renamed from: c */
    public float f340325c;

    /* renamed from: d */
    public float f340326d = 1.0f;

    public C113747gc() {
    }

    /* renamed from: a */
    private C113747gc m156919a(float[] fArr) {
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, fArr, 0, new float[]{this.f340323a, this.f340324b, this.f340325c, this.f340326d}, 0);
        float f = fArr2[0];
        float f2 = fArr2[3];
        return new C113747gc(f / f2, fArr2[1] / f2, fArr2[2] / f2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C113747gc)) {
            return false;
        }
        C113747gc gcVar = (C113747gc) obj;
        return this.f340323a == gcVar.f340323a && this.f340324b == gcVar.f340324b && this.f340325c == gcVar.f340325c;
    }

    public final String toString() {
        return this.f340323a + "," + this.f340324b + "," + this.f340325c;
    }

    public C113747gc(float f, float f2, float f3) {
        this.f340323a = f;
        this.f340324b = f2;
        this.f340325c = f3;
    }
}
