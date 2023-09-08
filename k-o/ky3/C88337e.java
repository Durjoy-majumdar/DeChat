package ky3;

import java.io.Serializable;

/* renamed from: ky3.e */
public final class C88337e extends C88334c implements Serializable {

    /* renamed from: f */
    public int f255324f;

    /* renamed from: g */
    public int f255325g;

    /* renamed from: h */
    public int f255326h = 0;

    /* renamed from: i */
    public int f255327i = 0;

    /* renamed from: j */
    public int f255328j;

    /* renamed from: n */
    public int f255329n;

    public C88337e(int i, int i2) {
        int i3 = ~i;
        this.f255324f = i;
        this.f255325g = i2;
        this.f255328j = i3;
        this.f255329n = (i << 10) ^ (i2 >>> 4);
        if (((((i | i2) | 0) | 0) | i3) != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                mo122717f();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }

    /* renamed from: a */
    public int mo122713a(int i) {
        return ((-i) >> 31) & (mo122717f() >>> (32 - i));
    }

    /* renamed from: f */
    public int mo122717f() {
        int i = this.f255324f;
        int i2 = i ^ (i >>> 2);
        this.f255324f = this.f255325g;
        this.f255325g = this.f255326h;
        this.f255326h = this.f255327i;
        int i3 = this.f255328j;
        this.f255327i = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f255328j = i4;
        int i5 = this.f255329n + 362437;
        this.f255329n = i5;
        return i4 + i5;
    }
}
