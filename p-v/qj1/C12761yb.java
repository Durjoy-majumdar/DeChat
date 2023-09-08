package qj1;

import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: qj1.yb */
public final class C12761yb implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ int f36551d;

    /* renamed from: e */
    public final /* synthetic */ C12707vb f36552e;

    /* renamed from: f */
    public final /* synthetic */ int f36553f;

    public C12761yb(int i, C12707vb vbVar, int i2) {
        this.f36551d = i;
        this.f36552e = vbVar;
        this.f36553f = i2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        if (this.f36551d == 0) {
            C12707vb vbVar = this.f36552e;
            e0Var.mo107142f(vbVar.f36417r, vbVar.f166287d.getContext().getResources().getString(this.f36553f));
            return;
        }
        C12707vb vbVar2 = this.f36552e;
        e0Var.mo107140d(vbVar2.f36417r, vbVar2.f166287d.getContext().getResources().getColor(this.f36551d), this.f36552e.f166287d.getContext().getResources().getString(this.f36553f));
    }
}
