package ky3;

import gy3.C87412m;
import my3.C61594j;

/* renamed from: ky3.d */
public final class C88336d {
    /* renamed from: a */
    public static final C88334c m110136a(long j) {
        return new C88337e((int) j, (int) (j >> 32));
    }

    /* renamed from: b */
    public static final String m110137b(Object obj, Object obj2) {
        C87412m.m108594g(obj, "from");
        C87412m.m108594g(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: c */
    public static final int m110138c(C88334c cVar, C61594j jVar) {
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(jVar, "range");
        if (!jVar.isEmpty()) {
            int i = jVar.f175175e;
            if (i < Integer.MAX_VALUE) {
                return cVar.mo122723h(jVar.f175174d, i + 1);
            }
            int i2 = jVar.f175174d;
            return i2 > Integer.MIN_VALUE ? cVar.mo122723h(i2 - 1, i) + 1 : cVar.mo122717f();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + jVar);
    }
}
