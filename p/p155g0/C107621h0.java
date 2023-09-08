package p155g0;

import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60690y0;
import p257w.C111654m;
import p560i2.C108322d;
import p560i2.C33181m;
import p721v0.C111299g;
import p721v0.C65503j;

/* renamed from: g0.h0 */
public final class C107621h0 extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C107601b0 f322013d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107621h0(C107601b0 b0Var) {
        super(3);
        this.f322013d = b0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C65503j jVar = (C65503j) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(jVar, "$this$composed");
        hVar.mo51557H(1980580247);
        C108322d dVar = (C108322d) hVar.mo51598m(C103645l0.f306124e);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146996c(new C33181m(0), (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        C107615d0 d0Var = new C107615d0(this.f322013d, y0Var);
        C107620g0 g0Var = new C107620g0(dVar, y0Var);
        C111654m mVar = C107641q.f322032a;
        C65503j b = C111299g.m151787b(jVar, (C32226l) null, new C107645s(d0Var, g0Var), 1, (Object) null);
        hVar.mo51565P();
        return b;
    }
}
