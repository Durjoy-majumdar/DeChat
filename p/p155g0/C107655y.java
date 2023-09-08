package p155g0;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p009c2.C104239a;
import p009c2.C104247d;
import p009c2.C104269s;
import p009c2.C104277y;
import p009c2.C28482z;
import p152f0.C107401q2;
import p735w1.C38006x;
import sx3.C26236u;
import sx3.C64197v;

/* renamed from: g0.y */
public final class C107655y extends C107617f<C107655y> {

    /* renamed from: h */
    public final C28482z f322055h;

    /* renamed from: i */
    public final C107401q2 f322056i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107655y(C28482z zVar, C104269s sVar, C107401q2 q2Var, C107622i0 i0Var) {
        super(zVar.f78285a, zVar.f78286b, q2Var != null ? q2Var.f321339a : null, sVar, i0Var, (C8480h) null);
        C87412m.m108594g(zVar, "currentValue");
        C87412m.m108594g(sVar, "offsetMapping");
        C87412m.m108594g(i0Var, "state");
        this.f322055h = zVar;
        this.f322056i = q2Var;
    }

    /* renamed from: x */
    public final List<C104247d> mo158070x(C32226l<? super C107655y, ? extends C104247d> lVar) {
        C87412m.m108594g(lVar, "or");
        if (C38006x.m41694b(this.f322004f)) {
            C104247d dVar = (C104247d) lVar.invoke(this);
            if (dVar != null) {
                return C26236u.m33719b(dVar);
            }
            return null;
        }
        return C64197v.m75537f(new C104239a("", 0), new C104277y(C38006x.m41698f(this.f322004f), C38006x.m41698f(this.f322004f)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2 == null) goto L_0x0011;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo158071y(p152f0.C107401q2 r6, int r7) {
        /*
            r5 = this;
            o1.o r0 = r6.f321340b
            if (r0 == 0) goto L_0x0011
            o1.o r1 = r6.f321341c
            r2 = 0
            if (r1 == 0) goto L_0x000f
            r3 = 0
            r4 = 2
            z0.g r2 = p631o1.C109857o.C109858a.m149324a(r1, r0, r3, r4, r2)
        L_0x000f:
            if (r2 != 0) goto L_0x0013
        L_0x0011:
            z0.g r2 = p1166z0.C112541g.f336960e
        L_0x0013:
            c2.s r0 = r5.f322002d
            c2.z r1 = r5.f322055h
            long r3 = r1.f78286b
            int r1 = p735w1.C38006x.m41695c(r3)
            int r0 = r0.mo145897b(r1)
            w1.v r1 = r6.f321339a
            z0.g r0 = r1.mo163365c(r0)
            float r1 = r0.f336961a
            float r0 = r0.f336962b
            float r3 = r2.f336963c
            float r4 = r2.f336961a
            float r3 = r3 - r4
            float r4 = r2.f336964d
            float r2 = r2.f336962b
            float r4 = r4 - r2
            long r2 = p1166z0.C112546l.m153761a(r3, r4)
            float r2 = p1166z0.C112545k.m153756b(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            c2.s r7 = r5.f322002d
            w1.v r6 = r6.f321339a
            long r0 = p1166z0.C112540f.m153745a(r1, r0)
            int r6 = r6.mo163376l(r0)
            int r6 = r7.mo145896a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p155g0.C107655y.mo158071y(f0.q2, int):int");
    }
}
