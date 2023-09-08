package ce1;

import bl3.C39818r;
import gy3.C87412m;
import qo3.C89779i0;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;

/* renamed from: ce1.r */
public final class C0489r implements C65231j<C65220d> {

    /* renamed from: a */
    public final /* synthetic */ C0479p f1213a;

    public C0489r(C0479p pVar) {
        this.f1213a = pVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        Class cls = C0461e0.class;
        C87412m.m108594g(dVar, "task");
        C87412m.m108594g(nVar, "status");
        if (nVar == C65234n.Fail) {
            C89779i0 i0Var = ((C0461e0) C39818r.f106831a.mo62444c(this.f1213a.getActivity()).mo75002a(cls)).f1096d;
            if (i0Var != null && i0Var.isShowing()) {
                i0Var.dismiss();
                return;
            }
            return;
        }
        ((C0461e0) C39818r.f106831a.mo62444c(this.f1213a.getActivity()).mo75002a(cls)).mo505g3(this.f1213a.f1176H);
        this.f1213a.mo532e3(dVar);
    }
}
