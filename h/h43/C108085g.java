package h43;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: h43.g */
public final class C108085g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108073f f323674d;

    /* renamed from: e */
    public final /* synthetic */ C110194c f323675e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108085g(C108073f fVar, C110194c cVar) {
        super(0);
        this.f323674d = fVar;
        this.f323675e = cVar;
    }

    public Object invoke() {
        C108073f fVar = this.f323674d;
        C108109r0 r0Var = fVar.f323617j;
        if (r0Var != null) {
            C110194c cVar = this.f323675e;
            C87412m.m108594g(cVar, "texture");
            r0Var.f323724C = cVar;
            r0Var.f323723B = cVar.f329652e;
            C108073f fVar2 = this.f323674d;
            C108109r0 r0Var2 = fVar2.f323617j;
            if (r0Var2 != null) {
                r0Var2.mo143263u(fVar2.f323620m, fVar2.f323619l);
            }
        } else {
            fVar.f323618k = this.f323675e;
        }
        return C13598b0.f38549a;
    }
}
