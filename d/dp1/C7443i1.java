package dp1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import mf1.C10817f1;
import pf1.C11920q;
import rf1.C12982a;
import rx3.C13598b0;
import te3.C49321er0;

/* renamed from: dp1.i1 */
public final class C7443i1 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C49321er0 f25632d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7443i1(C49321er0 er02) {
        super(1);
        this.f25632d = er02;
    }

    public Object invoke(Object obj) {
        C10817f1 f1Var;
        C12982a aVar = (C12982a) obj;
        C87412m.m108594g(aVar, "observer");
        C11920q qVar = aVar.f37015d;
        if (C87412m.m108589b(qVar != null ? qVar.f34827a : null, this.f25632d.f133080d)) {
            C11920q qVar2 = aVar.f37015d;
            boolean z = true;
            if (qVar2 == null || (f1Var = qVar2.f34823A) == null || !f1Var.f32317a) {
                z = false;
            }
            if (z) {
                this.f25632d.f133081e = 2;
            }
        }
        return C13598b0.f38549a;
    }
}
