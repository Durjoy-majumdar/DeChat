package p294b7;

import p333e8.C20551y;

/* renamed from: b7.a */
public final class C16737a implements C16748l {

    /* renamed from: a */
    public final long[] f45236a;

    /* renamed from: b */
    public final long[] f45237b;

    /* renamed from: c */
    public final long f45238c;

    public C16737a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f45236a = jArr;
        this.f45237b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f45238c = jArr2[i] + jArr3[i];
            return;
        }
        this.f45238c = 0;
    }

    /* renamed from: f */
    public boolean mo17730f() {
        return true;
    }

    /* renamed from: g */
    public long mo17731g(long j) {
        return this.f45236a[C20551y.m22313c(this.f45237b, j, true, true)];
    }

    /* renamed from: h */
    public long mo17732h() {
        return this.f45238c;
    }
}
