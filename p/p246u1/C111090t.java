package p246u1;

import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import p410k0.C108793e;
import p658q1.C110290e;
import p658q1.C110301j;
import p658q1.C110311s;

/* renamed from: u1.t */
public final class C111090t {
    /* renamed from: a */
    public static final C110301j m151488a(C110301j jVar, C32226l lVar) {
        for (C110301j s = jVar.mo161723s(); s != null; s = s.mo161723s()) {
            if (((Boolean) lVar.invoke(s)).booleanValue()) {
                return s;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final List<C111078m> m151489b(C110301j jVar, List<C111078m> list) {
        C108793e<C110301j> t = jVar.mo161724t();
        int i = t.f325786f;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = t.f325784d;
            do {
                C110301j jVar2 = (C110301j) tArr[i2];
                C111078m d = m151491d(jVar2);
                if (d != null) {
                    list.add(d);
                } else {
                    m151489b(jVar2, list);
                }
                i2++;
            } while (i2 < i);
        }
        return list;
    }

    /* renamed from: c */
    public static final C111078m m151490c(C110301j jVar) {
        C111078m mVar;
        C87412m.m108594g(jVar, "<this>");
        C110311s sVar = jVar.f329896J.f329845i;
        while (sVar != null && !C110290e.m149956a(sVar.f329986y, 2)) {
            sVar = sVar.mo161744K0();
        }
        if (sVar == null || (mVar = (C111078m) sVar.f329986y[2]) == null) {
            return null;
        }
        C110311s sVar2 = mVar.f329961d;
        while (sVar2 != null) {
            while (mVar != null) {
                if (((C111079n) mVar.f329962e).mo162830v0().f332625e) {
                    return mVar;
                }
                mVar = (C111078m) mVar.f329963f;
            }
            sVar2 = sVar2.mo161744K0();
            mVar = sVar2 != null ? (C111078m) sVar2.f329986y[2] : null;
        }
        return null;
    }

    /* renamed from: d */
    public static final C111078m m151491d(C110301j jVar) {
        C111078m mVar;
        C87412m.m108594g(jVar, "<this>");
        C110311s sVar = jVar.f329896J.f329845i;
        while (sVar != null && !C110290e.m149956a(sVar.f329986y, 2)) {
            sVar = sVar.mo161744K0();
        }
        if (sVar == null || (mVar = (C111078m) sVar.f329986y[2]) == null) {
            return null;
        }
        C110311s sVar2 = mVar.f329961d;
        while (sVar2 != null) {
            if (mVar != null) {
                return mVar;
            }
            sVar2 = sVar2.mo161744K0();
            mVar = sVar2 != null ? (C111078m) sVar2.f329986y[2] : null;
        }
        return null;
    }
}
