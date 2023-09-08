package fq3;

import fy3.C32228q;
import gq3.C107902e;
import gq3.C59629h;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103941f;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: fq3.l */
public final class C59288l extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59629h f169541d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59288l(C59629h hVar) {
        super(3);
        this.f169541d = hVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        int intValue = ((Number) obj3).intValue();
        C87412m.m108594g((C103941f) obj, "$this$item");
        if ((intValue & 81) != 16 || !hVar.mo51575a()) {
            C107902e.m146204i(this.f169541d, hVar, 8);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
