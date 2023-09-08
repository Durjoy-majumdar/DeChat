package c71;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j71.C108587c;
import j71.C98914h;
import rx3.C13598b0;

/* renamed from: c71.r */
public final class C92377r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C92379t f264338d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92377r(C92379t tVar) {
        super(0);
        this.f264338d = tVar;
    }

    public Object invoke() {
        C92379t tVar = this.f264338d;
        C108587c cVar = tVar.f264349i;
        if (cVar != null) {
            cVar.f325062k.post(new C98914h(new C92376q(tVar)));
            return C13598b0.f38549a;
        }
        C87412m.m108603p("mixPixelBuffer");
        throw null;
    }
}
