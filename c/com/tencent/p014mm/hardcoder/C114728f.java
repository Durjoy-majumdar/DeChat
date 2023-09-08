package com.tencent.p014mm.hardcoder;

/* renamed from: com.tencent.mm.hardcoder.f */
public class C114728f {

    /* renamed from: a */
    public int f343946a;

    /* renamed from: b */
    public long f343947b;

    /* renamed from: c */
    public int f343948c;

    /* renamed from: d */
    public int f343949d;

    /* renamed from: e */
    public int f343950e;

    /* renamed from: f */
    public int[] f343951f;

    public C114728f(int i, long j, int i2, int i3, int i4, int[] iArr) {
        this.f343946a = i;
        this.f343947b = j;
        this.f343948c = i2;
        this.f343949d = i3;
        this.f343950e = i4;
        this.f343951f = (int[]) iArr.clone();
    }

    public String toString() {
        return "[RequestStatus, " + "scene:" + this.f343946a + ", action:" + this.f343947b + ", cpulevel:" + this.f343948c + ", gpulevel:" + this.f343949d + ", iolevel:" + this.f343950e + ", bindtids size:" + this.f343951f.length + "]";
    }
}
