package p155g0;

import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112539e;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p257w.C111626b;
import p257w.C111647j;
import p721v0.C65503j;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: g0.s */
public final class C107645s extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C112539e> f322039d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C32224a<C112539e>, C65503j> f322040e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107645s(C32224a<C112539e> aVar, C32226l<? super C32224a<C112539e>, ? extends C65503j> lVar) {
        super(3);
        this.f322039d = aVar;
        this.f322040e = lVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65503j) obj, "$this$composed");
        hVar.mo51557H(759876635);
        C32224a aVar = this.f322039d;
        hVar.mo51557H(-1589795249);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        Object obj4 = C108504h.C60656a.f172772a;
        if (q == obj4) {
            q = C108500f2.m146994a(aVar);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60667k2 k2Var = (C60667k2) q;
        hVar.mo51557H(-492369756);
        Object q2 = hVar.mo51606q();
        if (q2 == obj4) {
            q2 = new C111626b(new C112539e(((C112539e) k2Var.getValue()).f336959a), C107641q.f322033b, new C112539e(C107641q.f322034c));
            hVar.mo51553F(q2);
        }
        hVar.mo51565P();
        C111626b bVar = (C111626b) q2;
        C60655g0.m70932c(C13598b0.f38549a, new C107646t(k2Var, bVar, (C15601d<? super C107646t>) null), hVar, 0);
        C111647j<T, V> jVar = bVar.f334166c;
        hVar.mo51565P();
        C65503j invoke = this.f322040e.invoke(new C107644r(jVar));
        hVar.mo51565P();
        return invoke;
    }
}
