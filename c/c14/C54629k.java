package c14;

import c14.C54625h;
import fy3.C32226l;

/* renamed from: c14.k */
public final class C54629k {
    /* renamed from: a */
    public static C54625h m61479a(int i, C54624g gVar, C32226l lVar, int i2, Object obj) {
        C54624g gVar2 = C54624g.SUSPEND;
        boolean z = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            gVar = gVar2;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        int i3 = 1;
        if (i == -2) {
            if (gVar == gVar2) {
                C54625h.f153148g0.getClass();
                i3 = C54625h.C54626a.f153150b;
            }
            return new C54621e(i3, gVar, lVar);
        } else if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? (i == 1 && gVar == C54624g.DROP_OLDEST) ? new C54641r(lVar) : new C54621e(i, gVar, lVar) : new C54642s(lVar) : gVar == gVar2 ? new C54651z(lVar) : new C54621e(1, gVar, lVar);
        } else {
            if (gVar == gVar2) {
                z = true;
            }
            if (z) {
                return new C54641r(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }
}
