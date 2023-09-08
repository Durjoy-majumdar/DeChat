package fz3;

import b04.C23643b;
import b04.C23649g;
import b04.C23654k;
import d04.C24442a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sx3.C26236u;
import sx3.C64175a0;
import sx3.C64186f0;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26447e;
import xy3.C26566c;

/* renamed from: fz3.e */
public final class C24502e extends C24496b<C26566c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24502e(C24494a0 a0Var) {
        super(a0Var);
        C87412m.m108594g(a0Var, "javaTypeEnhancementState");
    }

    /* renamed from: a */
    public Iterable mo51181a(Object obj, boolean z) {
        C26566c cVar = (C26566c) obj;
        C87412m.m108594g(cVar, "<this>");
        Map<C22830f, C23649g<?>> a = cVar.mo51296a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : a.entrySet()) {
            C64175a0.m75508p(arrayList, (!z || C87412m.m108589b((C22830f) next.getKey(), C24503f0.f70031b)) ? mo51195l((C23649g) next.getValue()) : C64186f0.f181907d);
        }
        return arrayList;
    }

    /* renamed from: e */
    public C22826c mo51185e(Object obj) {
        C26566c cVar = (C26566c) obj;
        C87412m.m108594g(cVar, "<this>");
        return cVar.mo51298d();
    }

    /* renamed from: f */
    public Object mo51186f(Object obj) {
        C26566c cVar = (C26566c) obj;
        C87412m.m108594g(cVar, "<this>");
        C26447e d = C24442a.m30537d(cVar);
        C87412m.m108591d(d);
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r2.getAnnotations();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Iterable mo51187g(java.lang.Object r2) {
        /*
            r1 = this;
            xy3.c r2 = (xy3.C26566c) r2
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r2, r0)
            wy3.e r2 = d04.C24442a.m30537d(r2)
            if (r2 == 0) goto L_0x0014
            xy3.h r2 = r2.getAnnotations()
            if (r2 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            sx3.f0 r2 = sx3.C64186f0.f181907d
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fz3.C24502e.mo51187g(java.lang.Object):java.lang.Iterable");
    }

    /* renamed from: l */
    public final List<String> mo51195l(C23649g<?> gVar) {
        if (!(gVar instanceof C23643b)) {
            return gVar instanceof C23654k ? C26236u.m33719b(((C23654k) gVar).f67844c.mo35996c()) : C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList();
        for (C23649g l : (Iterable) ((C23643b) gVar).f67839a) {
            C64175a0.m75508p(arrayList, mo51195l(l));
        }
        return arrayList;
    }
}
