package p152f0;

import gy3.C87412m;
import p1166z0.C112539e;
import p631o1.C109857o;
import p735w1.C111703v;

/* renamed from: f0.q2 */
public final class C107401q2 {

    /* renamed from: a */
    public final C111703v f321339a;

    /* renamed from: b */
    public C109857o f321340b;

    /* renamed from: c */
    public C109857o f321341c;

    public C107401q2(C111703v vVar) {
        C87412m.m108594g(vVar, "value");
        this.f321339a = vVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo157813a(long r6) {
        /*
            r5 = this;
            o1.o r0 = r5.f321340b
            if (r0 == 0) goto L_0x001a
            boolean r1 = r0.mo161183y()
            r2 = 0
            if (r1 == 0) goto L_0x0016
            o1.o r1 = r5.f321341c
            if (r1 == 0) goto L_0x0018
            r3 = 0
            r4 = 2
            z0.g r2 = p631o1.C109857o.C109858a.m149324a(r1, r0, r3, r4, r2)
            goto L_0x0018
        L_0x0016:
            z0.g r2 = p1166z0.C112541g.f336960e
        L_0x0018:
            if (r2 != 0) goto L_0x001c
        L_0x001a:
            z0.g r2 = p1166z0.C112541g.f336960e
        L_0x001c:
            float r0 = p1166z0.C112539e.m153738c(r6)
            float r1 = r2.f336961a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0027
            goto L_0x0036
        L_0x0027:
            float r0 = p1166z0.C112539e.m153738c(r6)
            float r1 = r2.f336963c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            float r1 = p1166z0.C112539e.m153738c(r6)
        L_0x0036:
            float r0 = p1166z0.C112539e.m153739d(r6)
            float r3 = r2.f336962b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            goto L_0x0050
        L_0x0041:
            float r0 = p1166z0.C112539e.m153739d(r6)
            float r3 = r2.f336964d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            goto L_0x0050
        L_0x004c:
            float r3 = p1166z0.C112539e.m153739d(r6)
        L_0x0050:
            long r6 = p1166z0.C112540f.m153745a(r1, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p152f0.C107401q2.mo157813a(long):long");
    }

    /* renamed from: b */
    public final int mo157814b(long j, boolean z) {
        if (z) {
            j = mo157813a(j);
        }
        return this.f321339a.mo163376l(mo157815c(j));
    }

    /* renamed from: c */
    public final long mo157815c(long j) {
        C112539e eVar;
        C109857o oVar = this.f321340b;
        if (oVar == null) {
            return j;
        }
        C109857o oVar2 = this.f321341c;
        if (oVar2 != null) {
            eVar = new C112539e((!oVar.mo161183y() || !oVar2.mo161183y()) ? j : oVar.mo161178U(oVar2, j));
        } else {
            eVar = null;
        }
        return eVar != null ? eVar.f336959a : j;
    }
}
