package gl1;

import cj1.C0581o5;
import cl1.C0702z0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import qj1.C12322e5;
import rx3.C13598b0;

/* renamed from: gl1.f2 */
public final class C59546f2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170179d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59546f2(C59559k kVar) {
        super(0);
        this.f170179d = kVar;
    }

    public Object invoke() {
        C59559k kVar = this.f170179d;
        C12322e5 e5Var = kVar.f170252u;
        if (e5Var != null) {
            List<C0581o5> list = ((C0702z0) kVar.mo83051g(C0702z0.class)).f1672f;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
            C12322e5.m11877s1(e5Var, list, false, true, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
