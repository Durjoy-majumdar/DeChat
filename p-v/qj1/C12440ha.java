package qj1;

import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: qj1.ha */
public final class C12440ha implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ int f35816d;

    /* renamed from: e */
    public final /* synthetic */ C12389fa f35817e;

    /* renamed from: f */
    public final /* synthetic */ int f35818f;

    public C12440ha(int i, C12389fa faVar, int i2) {
        this.f35816d = i;
        this.f35817e = faVar;
        this.f35818f = i2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        int i = this.f35816d;
        if (i == 0) {
            C12389fa faVar = this.f35817e;
            e0Var.mo107142f(faVar.f35695t, faVar.f35665B.getString(this.f35818f));
            return;
        }
        C12389fa faVar2 = this.f35817e;
        e0Var.mo107140d(faVar2.f35695t, faVar2.f35665B.getColor(i), this.f35817e.f35665B.getString(this.f35818f));
    }
}
