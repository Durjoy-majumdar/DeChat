package pa0;

import fy3.C32227p;
import gy3.C87413o;
import la0.C61242a;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60655g0;
import p175j0.C60690y0;
import p415q0.C110261c;
import rx3.C13598b0;
import va0.C111510j;
import wx3.C15601d;

/* renamed from: pa0.k */
public final class C62234k extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62211a f176919d;

    /* renamed from: e */
    public final /* synthetic */ C61242a f176920e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62234k(C62211a aVar, C61242a aVar2) {
        super(2);
        this.f176919d = aVar;
        this.f176920e = aVar2;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            int i = C108504h.f324828a;
            if (q == C108504h.C60656a.f172772a) {
                q = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
                hVar.mo51553F(q);
            }
            hVar.mo51565P();
            C60690y0 y0Var = (C60690y0) q;
            C111510j.m152007a(C110261c.m149878b(hVar, -1347480020, true, new C62232i(this.f176919d, y0Var, this.f176920e)), hVar, 6);
            C60655g0.m70932c(y0Var.getValue(), new C62233j(y0Var, this.f176919d, (C15601d<? super C62233j>) null), hVar, 64);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
