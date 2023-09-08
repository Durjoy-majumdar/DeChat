package hl1;

import fy3.C32224a;
import gy3.C87413o;
import vk1.C65762c;
import wj1.C15410a;

/* renamed from: hl1.g2 */
public final class C8551g2 extends C87413o implements C32224a<C15410a> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f27624d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f27625e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8551g2(C59988k kVar, C65762c cVar) {
        super(0);
        this.f27624d = kVar;
        this.f27625e = cVar;
    }

    public Object invoke() {
        C15410a aVar = this.f27624d.f171159G;
        if (aVar != null) {
            return aVar;
        }
        C65762c cVar = this.f27625e;
        return new C15410a(cVar, cVar);
    }
}
