package p869y0;

import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110100f;
import p175j0.C108504h;
import p175j0.C60655g0;
import p721v0.C65503j;

/* renamed from: y0.o */
public final class C112329o extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public static final C112329o f336350d = new C112329o();

    public C112329o() {
        super(3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C65503j jVar = (C65503j) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(jVar, "$this$composed");
        hVar.mo51557H(-326009031);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        if (q == C108504h.C60656a.f172772a) {
            q = new C112321l(C112306b0.Inactive, (C32226l) null, 2, (C8480h) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C112321l lVar = (C112321l) q;
        C60655g0.m70936g(new C112328n(lVar), hVar, 0);
        C110100f<C112321l> fVar = C112323m.f336346a;
        C87412m.m108594g(lVar, "focusModifier");
        C65503j i0 = jVar.mo74972i0(lVar).mo74972i0(C112323m.f336347b);
        hVar.mo51565P();
        return i0;
    }
}
