package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;

/* renamed from: i2.m */
public final class C33181m {

    /* renamed from: a */
    public final long f90057a;

    /* renamed from: i2.m$a */
    public static final class C33182a {
        public C33182a(C8480h hVar) {
        }
    }

    static {
        new C33182a((C8480h) null);
    }

    public /* synthetic */ C33181m(long j) {
        this.f90057a = j;
    }

    /* renamed from: a */
    public static final boolean m39965a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final int m39966b(long j) {
        return (int) (j & Util.MAX_32BIT_VALUE);
    }

    /* renamed from: c */
    public static String m39967c(long j) {
        return ((int) (j >> 32)) + " x " + m39966b(j);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C33181m) && this.f90057a == ((C33181m) obj).f90057a;
    }

    public int hashCode() {
        long j = this.f90057a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return m39967c(this.f90057a);
    }
}
