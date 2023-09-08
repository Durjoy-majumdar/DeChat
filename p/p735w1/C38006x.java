package p735w1;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: w1.x */
public final class C38006x {

    /* renamed from: b */
    public static final long f100498b = C38007y.m41701a(0, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f100499c = 0;

    /* renamed from: a */
    public final long f100500a;

    public /* synthetic */ C38006x(long j) {
        this.f100500a = j;
    }

    /* renamed from: a */
    public static final boolean m41693a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final boolean m41694b(long j) {
        return ((int) (j >> 32)) == m41695c(j);
    }

    /* renamed from: c */
    public static final int m41695c(long j) {
        return (int) (j & Util.MAX_32BIT_VALUE);
    }

    /* renamed from: d */
    public static final int m41696d(long j) {
        return m41697e(j) - m41698f(j);
    }

    /* renamed from: e */
    public static final int m41697e(long j) {
        int i = (int) (j >> 32);
        return i > m41695c(j) ? i : m41695c(j);
    }

    /* renamed from: f */
    public static final int m41698f(long j) {
        int i = (int) (j >> 32);
        return i > m41695c(j) ? m41695c(j) : i;
    }

    /* renamed from: g */
    public static final boolean m41699g(long j) {
        return ((int) (j >> 32)) > m41695c(j);
    }

    /* renamed from: h */
    public static String m41700h(long j) {
        return "TextRange(" + ((int) (j >> 32)) + ", " + m41695c(j) + ')';
    }

    public boolean equals(Object obj) {
        return (obj instanceof C38006x) && this.f100500a == ((C38006x) obj).f100500a;
    }

    public int hashCode() {
        long j = this.f100500a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return m41700h(this.f100500a);
    }
}
