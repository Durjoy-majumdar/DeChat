package kj1;

import cl1.C54991o;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import kj1.C10125e1;
import nj3.C11182m0;
import nj3.C76874e0;
import ok1.C62042e;
import qo3.C77407n;
import wc3.C15133e0;

/* renamed from: kj1.v1 */
public final class C10248v1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C10125e1.C10127b f31273d;

    /* renamed from: e */
    public final /* synthetic */ C10125e1 f31274e;

    public C10248v1(C10125e1.C10127b bVar, C10125e1 e1Var) {
        this.f31273d = bVar;
        this.f31274e = e1Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C10125e1.C10127b bVar;
        C15133e0 e0Var2;
        C77407n nVar = this.f31273d.f31012e;
        if (nVar != null) {
            C10125e1 e1Var = this.f31274e;
            C87412m.m108593f(e0Var, LocaleUtil.ITALIAN);
            Class cls = C54991o.class;
            C87412m.m108594g(e1Var, "<this>");
            if (C62042e.f176370a.mo87082h(((C54991o) e1Var.mo10534b(cls)).f154388y0) && ((C54991o) e1Var.mo10534b(cls)).f154341n != null) {
                FinderObject finderObject = ((C54991o) e1Var.mo10534b(cls)).f154341n;
                boolean z = false;
                if (finderObject != null && finderObject.f164794id == 0) {
                    z = true;
                }
                if (!z && (bVar = e1Var.f30988g) != null && (e0Var2 = bVar.f31019l) != null) {
                    e0Var2.mo14095wW(e1Var.f30985d, e0Var, nVar, 2, C10204o2.f31185d);
                }
            }
        }
    }
}
