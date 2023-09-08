package p152f0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import my3.C61595o;
import p009c2.C104269s;
import p009c2.C28482z;
import p1166z0.C112540f;
import p1166z0.C112541g;
import p1166z0.C112545k;
import p257w.C111626b;
import p257w.C37907l;
import p436a1.C103244k0;
import p436a1.C103257q;
import p436a1.C103274x;
import p735w1.C111703v;
import p735w1.C38006x;
import p835c1.C104231f;
import p835c1.C54601d;
import rx3.C13598b0;

/* renamed from: f0.k1 */
public final class C107355k1 extends C87413o implements C32226l<C54601d, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111626b<Float, C37907l> f321192d;

    /* renamed from: e */
    public final /* synthetic */ C104269s f321193e;

    /* renamed from: f */
    public final /* synthetic */ C28482z f321194f;

    /* renamed from: g */
    public final /* synthetic */ C107394p2 f321195g;

    /* renamed from: h */
    public final /* synthetic */ C103257q f321196h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107355k1(C111626b<Float, C37907l> bVar, C104269s sVar, C28482z zVar, C107394p2 p2Var, C103257q qVar) {
        super(1);
        this.f321192d = bVar;
        this.f321193e = sVar;
        this.f321194f = zVar;
        this.f321195g = p2Var;
        this.f321196h = qVar;
    }

    public Object invoke(Object obj) {
        C111703v vVar;
        C54601d dVar = (C54601d) obj;
        C87412m.m108594g(dVar, "$this$drawWithContent");
        dVar.mo75508h0();
        float d = C61595o.m72296d(this.f321192d.mo163295c().floatValue(), 0.0f, 1.0f);
        if (!(d == 0.0f)) {
            C104269s sVar = this.f321193e;
            long j = this.f321194f.f78286b;
            int i = C38006x.f100499c;
            int b = sVar.mo145897b((int) (j >> 32));
            C107401q2 q2Var = this.f321195g.f321319g;
            C112541g gVar = (q2Var == null || (vVar = q2Var.f321339a) == null) ? new C112541g(0.0f, 0.0f, 0.0f, 0.0f) : vVar.mo163365c(b);
            float T = dVar.mo143034T(C31750n1.f84769a);
            float f = T / ((float) 2);
            float f2 = gVar.f336961a + f;
            float d2 = C112545k.m153758d(dVar.mo145819e()) - f;
            if (f2 > d2) {
                f2 = d2;
            }
            long a = C112540f.m153745a(f2, gVar.f336962b);
            long a2 = C112540f.m153745a(f2, gVar.f336964d);
            C103257q qVar = this.f321196h;
            int i2 = C104231f.f308529f0;
            dVar.mo145829x(qVar, a, a2, T, 0, (C103244k0) null, d, (C103274x) null, 3);
        }
        return C13598b0.f38549a;
    }
}
