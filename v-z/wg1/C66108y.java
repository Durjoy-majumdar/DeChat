package wg1;

import fy3.C32224a;
import gy3.C87413o;
import qk1.C63213g;
import rx3.C13598b0;

/* renamed from: wg1.y */
public final class C66108y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65954a0 f190023d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66108y(C65954a0 a0Var) {
        super(0);
        this.f190023d = a0Var;
    }

    public Object invoke() {
        C63213g gVar = this.f190023d.f189625i;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        return C13598b0.f38549a;
    }
}
