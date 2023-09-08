package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;

/* renamed from: i2.j */
public final class C33177j {

    /* renamed from: b */
    public static final long f90050b = C33179k.m39964a(0, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f90051c = 0;

    /* renamed from: a */
    public final long f90052a;

    /* renamed from: i2.j$a */
    public static final class C33178a {
        public C33178a(C8480h hVar) {
        }
    }

    static {
        new C33178a((C8480h) null);
    }

    public /* synthetic */ C33177j(long j) {
        this.f90052a = j;
    }

    /* renamed from: a */
    public static final int m39962a(long j) {
        return (int) (j & Util.MAX_32BIT_VALUE);
    }

    /* renamed from: b */
    public static String m39963b(long j) {
        return '(' + ((int) (j >> 32)) + ", " + m39962a(j) + ')';
    }

    public boolean equals(Object obj) {
        return (obj instanceof C33177j) && this.f90052a == ((C33177j) obj).f90052a;
    }

    public int hashCode() {
        long j = this.f90052a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return m39963b(this.f90052a);
    }
}
