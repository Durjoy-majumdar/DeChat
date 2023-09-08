package vy3;

import fy3.C32224a;
import gy3.C87413o;
import vy3.C26391g;

/* renamed from: vy3.h */
public final class C26395h extends C87413o implements C32224a<C26391g.C26392b> {

    /* renamed from: d */
    public final /* synthetic */ C26391g f73624d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26395h(C26391g gVar) {
        super(0);
        this.f73624d = gVar;
    }

    public Object invoke() {
        C32224a<C26391g.C26392b> aVar = this.f73624d.f73616f;
        if (aVar != null) {
            C26391g.C26392b invoke = aVar.invoke();
            this.f73624d.f73616f = null;
            return invoke;
        }
        throw new AssertionError("JvmBuiltins instance has not been initialized properly");
    }
}
