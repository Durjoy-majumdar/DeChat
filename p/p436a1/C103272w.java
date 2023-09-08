package p436a1;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import p450b1.C103979c;
import p450b1.C103980d;
import p450b1.C103981e;
import p450b1.C103985g;
import rx3.C110659d0;
import rx3.C90109v;

/* renamed from: a1.w */
public final class C103272w {

    /* renamed from: b */
    public static final long f304510b = C103276y.m136792c(4278190080L);

    /* renamed from: c */
    public static final long f304511c = C103276y.m136792c(Util.MAX_32BIT_VALUE);

    /* renamed from: d */
    public static final long f304512d = C103276y.m136792c(4294901760L);

    /* renamed from: e */
    public static final long f304513e = C103276y.m136792c(4278190335L);

    /* renamed from: f */
    public static final long f304514f = C103276y.m136791b(0);

    /* renamed from: g */
    public static final long f304515g = C103276y.m136790a(0.0f, 0.0f, 0.0f, 0.0f, C103981e.f307557t);

    /* renamed from: h */
    public static final /* synthetic */ int f304516h = 0;

    /* renamed from: a */
    public final long f304517a;

    static {
        C103276y.m136792c(4282664004L);
        C103276y.m136792c(4287137928L);
        C103276y.m136792c(4291611852L);
        C103276y.m136792c(4278255360L);
        C103276y.m136792c(4294967040L);
        C103276y.m136792c(4278255615L);
        C103276y.m136792c(4294902015L);
    }

    public /* synthetic */ C103272w(long j) {
        this.f304517a = j;
    }

    /* renamed from: a */
    public static final long m136779a(long j, C103979c cVar) {
        C87412m.m108594g(cVar, "colorSpace");
        if (C87412m.m108589b(cVar, m136784f(j))) {
            return j;
        }
        C103985g d = C103980d.m138716d(m136784f(j), cVar, 0, 2, (Object) null);
        float[] e = C103276y.m136794e(j);
        d.mo145592a(e);
        return C103276y.m136790a(e[0], e[1], e[2], e[3], cVar);
    }

    /* renamed from: b */
    public static long m136780b(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m136782d(j);
        }
        if ((i & 2) != 0) {
            f2 = m136786h(j);
        }
        if ((i & 4) != 0) {
            f3 = m136785g(j);
        }
        if ((i & 8) != 0) {
            f4 = m136783e(j);
        }
        return C103276y.m136790a(f2, f3, f4, f, m136784f(j));
    }

    /* renamed from: c */
    public static final boolean m136781c(long j, long j2) {
        return j == j2;
    }

    /* renamed from: d */
    public static final float m136782d(long j) {
        float f;
        float f2;
        if ((63 & j) == 0) {
            f2 = (float) C110659d0.m150643a((j >>> 56) & 255);
            f = 255.0f;
        } else {
            f2 = (float) C110659d0.m150643a((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return f2 / f;
    }

    /* renamed from: e */
    public static final float m136783e(long j) {
        return (63 & j) == 0 ? ((float) C110659d0.m150643a((j >>> 32) & 255)) / 255.0f : C103278z.m136799b((short) ((int) ((j >>> 16) & 65535)));
    }

    /* renamed from: f */
    public static final C103979c m136784f(long j) {
        C103981e eVar = C103981e.f307538a;
        return C103981e.f307559v[(int) (j & 63)];
    }

    /* renamed from: g */
    public static final float m136785g(long j) {
        return (63 & j) == 0 ? ((float) C110659d0.m150643a((j >>> 40) & 255)) / 255.0f : C103278z.m136799b((short) ((int) ((j >>> 32) & 65535)));
    }

    /* renamed from: h */
    public static final float m136786h(long j) {
        return (63 & j) == 0 ? ((float) C110659d0.m150643a((j >>> 48) & 255)) / 255.0f : C103278z.m136799b((short) ((int) ((j >>> 48) & 65535)));
    }

    /* renamed from: i */
    public static String m136787i(long j) {
        return "Color(" + m136786h(j) + ", " + m136785g(j) + ", " + m136783e(j) + ", " + m136782d(j) + ", " + m136784f(j).f307535a + ')';
    }

    public boolean equals(Object obj) {
        return (obj instanceof C103272w) && this.f304517a == ((C103272w) obj).f304517a;
    }

    public int hashCode() {
        return C90109v.m112737a(this.f304517a);
    }

    public String toString() {
        return m136787i(this.f304517a);
    }
}
