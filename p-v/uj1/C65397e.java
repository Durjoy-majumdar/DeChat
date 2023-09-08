package uj1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rp1.C63486a;
import rx3.C13598b0;

/* renamed from: uj1.e */
public final class C65397e extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65374a f188203d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65397e(C65374a aVar) {
        super(1);
        this.f188203d = aVar;
    }

    public Object invoke(Object obj) {
        if (!((Boolean) obj).booleanValue() && this.f188203d.mo89472b().getVisibility() != 0) {
            C63486a aVar = this.f188203d.f188163e;
            if (aVar != null) {
                aVar.mo10792g(8);
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
