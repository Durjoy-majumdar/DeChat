package fl1;

import cj1.C0581o5;
import cl1.C0702z0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import qj1.C12322e5;
import rx3.C13598b0;

/* renamed from: fl1.o2 */
public final class C59216o2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169361d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59216o2(C59161f fVar) {
        super(0);
        this.f169361d = fVar;
    }

    public Object invoke() {
        C59161f fVar = this.f169361d;
        C12322e5 e5Var = fVar.f169237t;
        if (e5Var != null) {
            List<C0581o5> list = ((C0702z0) fVar.mo83051g(C0702z0.class)).f1672f;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
            C12322e5.m11877s1(e5Var, list, false, true, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
