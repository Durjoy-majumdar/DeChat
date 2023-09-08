package h23;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n80.C109697b;
import rx3.C13598b0;

/* renamed from: h23.p */
public final class C108037p extends C87413o implements C32226l<C109697b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108038q f323517d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108037p(C108038q qVar) {
        super(1);
        this.f323517d = qVar;
    }

    public Object invoke(Object obj) {
        C109697b bVar = (C109697b) obj;
        C87412m.m108594g(bVar, "iMediaCodecTransEncoder");
        bVar.f328347d = new C108035n(this.f323517d);
        bVar.f328348e = new C108036o(this.f323517d);
        bVar.f328350g = true;
        return C13598b0.f38549a;
    }
}
