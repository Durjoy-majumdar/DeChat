package jz3;

import gy3.C87412m;
import gz3.C24597k;
import iz3.C24646e;
import iz3.C24651h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kz3.C24863e;
import mz3.C25058j;
import mz3.C25072x;
import n04.C25143j0;
import n04.C25146k0;
import n04.C25176s0;
import n04.C25202z1;
import sx3.C26236u;
import sx3.C36907w;
import wy3.C26469k;
import wy3.C26521y0;
import zy3.C26730c;

/* renamed from: jz3.v */
public final class C24851v extends C26730c {

    /* renamed from: q */
    public final C24651h f70833q;

    /* renamed from: r */
    public final C25072x f70834r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24851v(C24651h hVar, C25072x xVar, int i, C26469k kVar) {
        super(hVar.f70290a.f70256a, kVar, new C24646e(hVar, xVar, false), xVar.getName(), C25202z1.INVARIANT, false, i, C26521y0.f73808a, hVar.f70290a.f70268m);
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(xVar, "javaTypeParameter");
        C87412m.m108594g(kVar, "containingDeclaration");
        this.f70833q = hVar;
        this.f70834r = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        r1 = new nz3.C25308u(r13, false, r0, fz3.C24498c.TYPE_PARAMETER_BOUNDS, false, 16, (gy3.C8480h) null);
     */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<n04.C25143j0> mo51854I0(java.util.List<? extends n04.C25143j0> r14) {
        /*
            r13 = this;
            java.lang.String r0 = "bounds"
            gy3.C87412m.m108594g(r14, r0)
            iz3.h r0 = r13.f70833q
            iz3.c r1 = r0.f70290a
            nz3.s r9 = r1.f70273r
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            r1 = 10
            int r1 = sx3.C36907w.m41090l(r14, r1)
            r10.<init>(r1)
            java.util.Iterator r14 = r14.iterator()
        L_0x001d:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r14.next()
            r11 = r1
            n04.j0 r11 = (n04.C25143j0) r11
            nz3.r r1 = nz3.C109825r.f328746d
            java.lang.String r2 = "<this>"
            gy3.C87412m.m108594g(r11, r2)
            java.lang.String r2 = "predicate"
            gy3.C87412m.m108594g(r1, r2)
            boolean r1 = n04.C25187v1.m32083c(r11, r1)
            if (r1 == 0) goto L_0x003d
            goto L_0x005b
        L_0x003d:
            nz3.u r12 = new nz3.u
            r3 = 0
            fz3.c r5 = fz3.C24498c.TYPE_PARAMETER_BOUNDS
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r12
            r2 = r13
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            sx3.f0 r5 = sx3.C64186f0.f181907d
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r12
            r4 = r11
            n04.j0 r1 = r2.mo52386a(r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r11 = r1
        L_0x005b:
            r10.add(r11)
            goto L_0x001d
        L_0x005f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24851v.mo51854I0(java.util.List):java.util.List");
    }

    /* renamed from: J0 */
    public void mo51855J0(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "type");
    }

    /* renamed from: K0 */
    public List<C25143j0> mo51856K0() {
        Collection<C25058j> upperBounds = this.f70834r.getUpperBounds();
        if (upperBounds.isEmpty()) {
            C25176s0 f = this.f70833q.f70290a.f70270o.mo52623m().mo53314f();
            C87412m.m108593f(f, "c.module.builtIns.anyType");
            C25176s0 p = this.f70833q.f70290a.f70270o.mo52623m().mo53324p();
            C87412m.m108593f(p, "c.module.builtIns.nullableAnyType");
            return C26236u.m33719b(C25146k0.m31957c(f, p));
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(upperBounds, 10));
        for (C25058j e : upperBounds) {
            arrayList.add(this.f70833q.f70294e.mo51869e(e, C24863e.m31346b(C24597k.COMMON, false, this, 1, (Object) null)));
        }
        return arrayList;
    }
}
