package qq0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import li0.C88508b;
import p170ic.C87692f;
import rx3.C13598b0;

/* renamed from: qq0.h */
public final class C89803h extends C87413o implements C32226l<C87692f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89797e f258207d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89803h(C89797e eVar) {
        super(1);
        this.f258207d = eVar;
    }

    public Object invoke(Object obj) {
        C87692f fVar = (C87692f) obj;
        C87412m.m108594g(fVar, "$this$lifecycle");
        C89801f fVar2 = new C89801f(this.f258207d);
        fVar.f253969d.put(C88508b.BACKGROUND, fVar2);
        C89802g gVar = new C89802g(this.f258207d);
        fVar.f253969d.put(C88508b.FOREGROUND, gVar);
        return C13598b0.f38549a;
    }
}
