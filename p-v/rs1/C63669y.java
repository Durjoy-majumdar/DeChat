package rs1;

import fy3.C32224a;
import g92.C59398d;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import yl1.C66663a;

/* renamed from: rs1.y */
public final class C63669y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63648v f180492d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63669y(C63648v vVar) {
        super(0);
        this.f180492d = vVar;
    }

    public Object invoke() {
        C66663a aVar = this.f180492d.f180438d;
        if (aVar != null) {
            C59398d dVar = aVar.f326427i;
            if (dVar != null) {
                dVar.start();
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("multiTaskHelper");
        throw null;
    }
}
