package vo1;

import bp1.C54519d;
import cj1.C0581o5;
import cl1.C0668l;
import cl1.C0702z0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import qj1.C12322e5;
import qj1.C62632a6;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64337e61;

/* renamed from: vo1.p */
public final class C65814p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65820t f189273d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65814p(C65820t tVar) {
        super(0);
        this.f189273d = tVar;
    }

    public Object invoke() {
        LinkedList linkedList = new LinkedList();
        C65820t tVar = this.f189273d;
        if (((C54519d) tVar.mo83051g(C54519d.class)).mo75376j3() && C0668l.m589e3((C0668l) tVar.mo83051g(C0668l.class), (C64337e61) null, 1, (Object) null)) {
            linkedList.add(new C13604l(1, null));
        }
        String str = (String) new C65815q(tVar).invoke();
        if (str.length() > 0) {
            linkedList.add(new C13604l(2, str));
        }
        C62632a6 a6Var = tVar.f189282o;
        if (a6Var != null) {
            a6Var.mo10792g(0);
        }
        C62632a6 a6Var2 = tVar.f189282o;
        if (a6Var2 != null) {
            a6Var2.mo87672f1(linkedList, false, true);
        }
        C65820t tVar2 = this.f189273d;
        C12322e5 e5Var = tVar2.f189284q;
        if (e5Var != null) {
            List<C0581o5> list = ((C0702z0) tVar2.mo83051g(C0702z0.class)).f1672f;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
            C12322e5.m11877s1(e5Var, list, false, false, 6, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
