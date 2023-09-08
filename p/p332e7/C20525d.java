package p332e7;

import p332e7.C20522b;
import p333e8.C20551y;

/* renamed from: e7.d */
public final class C20525d implements C20522b.C20523a {

    /* renamed from: a */
    public final long f57759a;

    /* renamed from: b */
    public final long f57760b;

    /* renamed from: c */
    public final long f57761c;

    /* renamed from: d */
    public final long[] f57762d;

    /* renamed from: e */
    public final long f57763e;

    /* renamed from: f */
    public final int f57764f;

    public C20525d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f57759a = j;
        this.f57760b = j2;
        this.f57761c = j3;
        this.f57762d = jArr;
        this.f57763e = j4;
        this.f57764f = i;
    }

    /* renamed from: d */
    public long mo32076d(long j) {
        long j2 = 0;
        if (mo17730f()) {
            long j3 = this.f57759a;
            if (j >= j3) {
                double d = (((double) (j - j3)) * 256.0d) / ((double) this.f57763e);
                int c = C20551y.m22313c(this.f57762d, (long) d, true, false) + 1;
                long j4 = this.f57760b;
                long j5 = (((long) c) * j4) / 100;
                long j6 = c == 0 ? 0 : this.f57762d[c - 1];
                long j7 = c == 99 ? 256 : this.f57762d[c];
                long j8 = (j4 * ((long) (c + 1))) / 100;
                if (j7 != j6) {
                    j2 = (long) ((((double) (j8 - j5)) * (d - ((double) j6))) / ((double) (j7 - j6)));
                }
                return j5 + j2;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public boolean mo17730f() {
        return this.f57762d != null;
    }

    /* renamed from: g */
    public long mo17731g(long j) {
        if (!mo17730f()) {
            return this.f57759a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.f57760b);
        float f2 = 256.0f;
        float f3 = 0.0f;
        if (f <= 0.0f) {
            f2 = 0.0f;
        } else if (f < 100.0f) {
            int i = (int) f;
            if (i != 0) {
                f3 = (float) this.f57762d[i - 1];
            }
            if (i < 99) {
                f2 = (float) this.f57762d[i];
            }
            f2 = ((f2 - f3) * (f - ((float) i))) + f3;
        }
        long round = Math.round(((double) f2) * 0.00390625d * ((double) this.f57763e));
        long j2 = this.f57759a;
        long j3 = round + j2;
        long j4 = this.f57761c;
        return Math.min(j3, j4 != -1 ? j4 - 1 : ((j2 - ((long) this.f57764f)) + this.f57763e) - 1);
    }

    /* renamed from: h */
    public long mo17732h() {
        return this.f57760b;
    }
}
