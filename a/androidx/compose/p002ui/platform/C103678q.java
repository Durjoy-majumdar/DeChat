package androidx.compose.p002ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import p1166z0.C112538d;
import p1166z0.C112541g;
import p1166z0.C112545k;
import p246u1.C111063a;
import p246u1.C111074j;
import p246u1.C111075k;
import p246u1.C111076l;
import p246u1.C111078m;
import p246u1.C111079n;
import p246u1.C111087s;
import p246u1.C111090t;
import p246u1.C111092v;
import p246u1.C111096z;
import p436a1.C103250n0;
import p631o1.C109857o;
import p631o1.C109861p;
import p658q1.C110301j;
import p658q1.C110311s;
import p735w1.C111703v;

/* renamed from: androidx.compose.ui.platform.q */
public final class C103678q {
    /* renamed from: a */
    public static final boolean m137966a(C111087s sVar) {
        return C111076l.m151465a(sVar.mo162837f(), C111092v.f332654i) == null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r3 = r3.mo162827c();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m137967b(p246u1.C111087s r3) {
        /*
            boolean r0 = m137971f(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0018
            u1.k r0 = r3.f332640e
            u1.z<java.lang.Boolean> r2 = p246u1.C111092v.f332656k
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x0018
            goto L_0x0041
        L_0x0018:
            q1.j r3 = r3.f332642g
            androidx.compose.ui.platform.p r0 = androidx.compose.p002ui.platform.C103674p.f306231d
            q1.j r3 = m137969d(r3, r0)
            r0 = 0
            if (r3 == 0) goto L_0x0040
            u1.m r3 = p246u1.C111090t.m151491d(r3)
            if (r3 == 0) goto L_0x003c
            u1.k r3 = r3.mo162827c()
            if (r3 == 0) goto L_0x003c
            u1.z<java.lang.Boolean> r2 = p246u1.C111092v.f332656k
            java.lang.Object r3 = p246u1.C111076l.m151465a(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r3 = gy3.C87412m.m108589b(r3, r2)
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C103678q.m137967b(u1.s):boolean");
    }

    /* renamed from: c */
    public static final C103690u1 m137968c(List<C103690u1> list, int i) {
        C87412m.m108594g(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).f306261d == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final C110301j m137969d(C110301j jVar, C32226l<? super C110301j, Boolean> lVar) {
        for (C110301j s = jVar.mo161723s(); s != null; s = s.mo161723s()) {
            if (lVar.invoke(s).booleanValue()) {
                return s;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final void m137970e(Region region, C111087s sVar, Map<Integer, C103703v1> map, C111087s sVar2) {
        C111078m mVar;
        C112541g gVar;
        C110301j jVar;
        C110301j jVar2 = sVar2.f332642g;
        boolean z = false;
        boolean z2 = !jVar2.f329887A || !jVar2.mo161701A();
        if (region.isEmpty() && sVar2.f332641f != sVar.f332641f) {
            return;
        }
        if (!z2 || sVar2.f332638c) {
            if (sVar2.f332640e.f332625e) {
                mVar = C111090t.m151490c(sVar2.f332642g);
                if (mVar == null) {
                    mVar = sVar2.f332636a;
                }
            } else {
                mVar = sVar2.f332636a;
            }
            if (mVar.f329964g) {
                if (C111076l.m151465a(((C111079n) mVar.f329962e).mo162830v0(), C111074j.f332609b) != null) {
                    C110311s sVar3 = mVar.f329961d;
                    if (sVar3.mo161183y()) {
                        C109857o c = C109861p.m149327c(sVar3);
                        C112538d dVar = sVar3.f329985x;
                        if (dVar == null) {
                            dVar = new C112538d(0.0f, 0.0f, 0.0f, 0.0f);
                            sVar3.f329985x = dVar;
                        }
                        long y0 = sVar3.mo161761y0(sVar3.mo161742I0());
                        dVar.f336951a = -C112545k.m153758d(y0);
                        dVar.f336952b = -C112545k.m153756b(y0);
                        dVar.f336953c = ((float) sVar3.mo161168i0()) + C112545k.m153758d(y0);
                        dVar.f336954d = ((float) sVar3.mo161167c0()) + C112545k.m153756b(y0);
                        while (true) {
                            if (sVar3 == c) {
                                gVar = new C112541g(dVar.f336951a, dVar.f336952b, dVar.f336953c, dVar.f336954d);
                                break;
                            }
                            sVar3.mo161753V0(dVar, false, true);
                            if (dVar.mo164255b()) {
                                gVar = C112541g.f336960e;
                                break;
                            } else {
                                sVar3 = sVar3.f329973i;
                                C87412m.m108591d(sVar3);
                            }
                        }
                    } else {
                        gVar = C112541g.f336960e;
                    }
                } else {
                    gVar = C109861p.m149326b(mVar.f329961d);
                }
            } else {
                gVar = C112541g.f336960e;
            }
            Rect a = C103250n0.m136707a(gVar);
            Region region2 = new Region();
            region2.set(a);
            int i = sVar2.f332641f;
            if (i == sVar.f332641f) {
                i = -1;
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i);
                Rect bounds = region2.getBounds();
                C87412m.m108593f(bounds, "region.bounds");
                map.put(valueOf, new C103703v1(sVar2, bounds));
                List<C111087s> h = sVar2.mo162839h();
                for (int size = h.size() - 1; -1 < size; size--) {
                    m137970e(region, sVar, map, h.get(size));
                }
                region.op(a, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (sVar2.f332638c) {
                C111087s g = sVar2.mo162838g();
                if (!(g == null || (jVar = g.f332642g) == null || !jVar.f329887A)) {
                    z = true;
                }
                map.put(Integer.valueOf(i), new C103703v1(sVar2, C103250n0.m136707a(z ? g.mo162835d() : new C112541g(0.0f, 0.0f, 10.0f, 10.0f))));
            } else if (i == -1) {
                Integer valueOf2 = Integer.valueOf(i);
                Rect bounds2 = region2.getBounds();
                C87412m.m108593f(bounds2, "region.bounds");
                map.put(valueOf2, new C103703v1(sVar2, bounds2));
            }
        }
    }

    /* renamed from: f */
    public static final boolean m137971f(C111087s sVar) {
        C111075k kVar = sVar.f332640e;
        C111096z<C111063a<C32226l<List<C111703v>, Boolean>>> zVar = C111074j.f332608a;
        return kVar.mo162823i(C111074j.f332615h);
    }
}
