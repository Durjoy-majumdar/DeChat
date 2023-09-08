package p267x;

import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1165z.C112527l;
import p1165z.C112528m;
import p175j0.C108504h;
import p246u1.C111072h;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: x.p */
public final class C111946p extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ boolean f335135d;

    /* renamed from: e */
    public final /* synthetic */ String f335136e;

    /* renamed from: f */
    public final /* synthetic */ C111072h f335137f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f335138g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111946p(boolean z, String str, C111072h hVar, C32224a<C13598b0> aVar) {
        super(3);
        this.f335135d = z;
        this.f335136e = str;
        this.f335137f = hVar;
        this.f335138g = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65503j) obj, "$this$composed");
        hVar.mo51557H(-756081143);
        int i = C65503j.f188489K0;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        C111907e1 e1Var = (C111907e1) hVar.mo51598m(C111912g1.f335027a);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = new C112528m();
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C65503j b = C111940o.m152649b(aVar, (C112527l) q, e1Var, this.f335135d, this.f335136e, this.f335137f, this.f335138g);
        hVar.mo51565P();
        return b;
    }
}
