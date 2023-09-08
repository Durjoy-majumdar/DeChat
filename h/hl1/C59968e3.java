package hl1;

import cj1.C0581o5;
import cl1.C0702z0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import qj1.C12322e5;
import rx3.C13598b0;

/* renamed from: hl1.e3 */
public final class C59968e3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171108d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59968e3(C59988k kVar) {
        super(0);
        this.f171108d = kVar;
    }

    public Object invoke() {
        C59988k kVar = this.f171108d;
        C12322e5 e5Var = kVar.f171250x;
        if (e5Var != null) {
            List<C0581o5> list = ((C0702z0) kVar.mo83051g(C0702z0.class)).f1672f;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
            C12322e5.m11877s1(e5Var, list, false, true, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
