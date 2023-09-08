package vo1;

import cj1.C0581o5;
import cl1.C0702z0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import qj1.C12322e5;
import rx3.C13598b0;

/* renamed from: vo1.r */
public final class C14920r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65820t f40947d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14920r(C65820t tVar) {
        super(0);
        this.f40947d = tVar;
    }

    public Object invoke() {
        C65820t tVar = this.f40947d;
        C12322e5 e5Var = tVar.f189284q;
        if (e5Var != null) {
            List<C0581o5> list = ((C0702z0) tVar.mo83051g(C0702z0.class)).f1672f;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
            C12322e5.m11877s1(e5Var, list, false, false, 6, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
