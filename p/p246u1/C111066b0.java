package p246u1;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p246u1.C111068f;
import p658q1.C110301j;
import sx3.C110818d0;
import sx3.C77813z;

/* renamed from: u1.b0 */
public final class C111066b0 {
    /* renamed from: a */
    public static final C110301j m151458a(C110301j jVar, C32226l<? super C110301j, Boolean> lVar) {
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(lVar, "predicate");
        if (lVar.invoke(jVar).booleanValue()) {
            return jVar;
        }
        List<C110301j> q = jVar.mo161721q();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            C110301j a = m151458a(q.get(i), lVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final List<C111078m> m151459b(C110301j jVar, List<C111078m> list) {
        List list2;
        C87412m.m108594g(jVar, "<this>");
        C87412m.m108594g(list, "list");
        if (!jVar.mo161701A()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        List<C110301j> q = jVar.mo161721q();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            C110301j jVar2 = q.get(i);
            if (jVar2.mo161701A()) {
                arrayList.add(new C111068f(jVar, jVar2));
            }
        }
        try {
            C111068f.f332594h = C111068f.C111069a.Stripe;
            list2 = C110818d0.m150900B0(arrayList);
            C77813z.m93908n(list2);
        } catch (IllegalArgumentException unused) {
            C111068f.f332594h = C111068f.C111069a.Location;
            list2 = C110818d0.m150900B0(arrayList);
            C77813z.m93908n(list2);
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(((C111068f) list2.get(i2)).f332596e);
        }
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C110301j jVar3 = (C110301j) arrayList2.get(i3);
            C111078m d = C111090t.m151491d(jVar3);
            if (d != null) {
                list.add(d);
            } else {
                m151459b(jVar3, list);
            }
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = r0.f329961d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p658q1.C110311s m151460c(p658q1.C110301j r1) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r1, r0)
            u1.m r0 = p246u1.C111090t.m151490c(r1)
            if (r0 != 0) goto L_0x000f
            u1.m r0 = p246u1.C111090t.m151491d(r1)
        L_0x000f:
            if (r0 == 0) goto L_0x0015
            q1.s r0 = r0.f329961d
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            q1.s r0 = r1.f329895I
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p246u1.C111066b0.m151460c(q1.j):q1.s");
    }
}
