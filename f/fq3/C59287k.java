package fq3;

import fy3.C32226l;
import fy3.C32228q;
import gq3.C107902e;
import gq3.C59629h;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103941f;
import p157gk.C32466a;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: fq3.k */
public final class C59287k extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59629h f169539d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C32466a, C13598b0> f169540e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59287k(C59629h hVar, C32226l<? super C32466a, C13598b0> lVar) {
        super(3);
        this.f169539d = hVar;
        this.f169540e = lVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        int intValue = ((Number) obj3).intValue();
        C87412m.m108594g((C103941f) obj, "$this$item");
        if ((intValue & 81) != 16 || !hVar.mo51575a()) {
            C107902e.m146204i(this.f169539d, hVar, 8);
            C32226l<C32466a, C13598b0> lVar = this.f169540e;
            C87412m.m108591d(lVar);
            C107568g.m145735b(lVar, this.f169539d, hVar, 64);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
