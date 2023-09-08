package p267x;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p436a1.C103257q;
import p436a1.C103266t0;
import p658q1.C110298h0;
import p721v0.C65503j;
import p868x0.C111983i;

/* renamed from: x.e */
public final class C111905e extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ float f335014d;

    /* renamed from: e */
    public final /* synthetic */ C103266t0 f335015e;

    /* renamed from: f */
    public final /* synthetic */ C103257q f335016f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111905e(float f, C103266t0 t0Var, C103257q qVar) {
        super(3);
        this.f335014d = f;
        this.f335015e = t0Var;
        this.f335016f = qVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C65503j jVar = (C65503j) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(jVar, "$this$composed");
        hVar.mo51557H(-1498088849);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = new C110298h0();
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        int i2 = C65503j.f188489K0;
        C65503j i0 = jVar.mo74972i0(C111983i.m152701b(C65503j.C65504a.f188490d, new C111895d(this.f335014d, this.f335015e, (C110298h0) q, this.f335016f)));
        hVar.mo51565P();
        return i0;
    }
}
