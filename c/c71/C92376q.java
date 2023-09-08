package c71;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j71.C108587c;
import j71.C108589d;
import j71.C98914h;
import rx3.C13598b0;

/* renamed from: c71.q */
public final class C92376q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C92379t f264337d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92376q(C92379t tVar) {
        super(0);
        this.f264337d = tVar;
    }

    public Object invoke() {
        C92379t tVar = this.f264337d;
        boolean z = tVar.f264350j > 0;
        C92362c cVar = tVar.f264352l;
        if (cVar != null) {
            cVar.f264300b.post(new C92365e(cVar, new C92372l(tVar, z)));
        }
        C108587c cVar2 = this.f264337d.f264349i;
        if (cVar2 != null) {
            cVar2.f325062k.post(new C98914h(new C108589d(cVar2)));
            return C13598b0.f38549a;
        }
        C87412m.m108603p("mixPixelBuffer");
        throw null;
    }
}
