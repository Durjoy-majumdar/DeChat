package p759y;

import c14.C54612b0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p190l1.C109107m;
import p190l1.C109111s;
import p604m1.C109464f;
import p604m1.C109465g;
import p759y.C112236i;
import rx3.C13598b0;

/* renamed from: y.r */
public final class C112279r extends C87413o implements C32226l<C109111s, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C109464f f336207d;

    /* renamed from: e */
    public final /* synthetic */ C112218f0 f336208e;

    /* renamed from: f */
    public final /* synthetic */ C54612b0<C112236i> f336209f;

    /* renamed from: g */
    public final /* synthetic */ boolean f336210g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112279r(C109464f fVar, C112218f0 f0Var, C54612b0<? super C112236i> b0Var, boolean z) {
        super(1);
        this.f336207d = fVar;
        this.f336208e = f0Var;
        this.f336209f = b0Var;
        this.f336210g = z;
    }

    public Object invoke(Object obj) {
        C109111s sVar = (C109111s) obj;
        C87412m.m108594g(sVar, "event");
        C109465g.m148683a(this.f336207d, sVar);
        long e = C109107m.m148152e(sVar, false);
        float d = this.f336208e == C112218f0.Vertical ? C112539e.m153739d(e) : C112539e.m153738c(e);
        sVar.mo160354a();
        C54612b0<C112236i> b0Var = this.f336209f;
        if (this.f336210g) {
            d *= (float) -1;
        }
        b0Var.mo75539t(new C112236i.C112238b(d, sVar.f326719c, (C8480h) null));
        return C13598b0.f38549a;
    }
}
