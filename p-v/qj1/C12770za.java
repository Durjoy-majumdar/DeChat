package qj1;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: qj1.za */
public final class C12770za implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f36570d;

    /* renamed from: e */
    public final /* synthetic */ int f36571e;

    public C12770za(C12389fa faVar, int i) {
        this.f36570d = faVar;
        this.f36571e = i;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        C12389fa faVar = this.f36570d;
        if (this.f36571e == 3) {
            e0Var.mo107142f(faVar.f35701y, faVar.f35665B.getString(C0966R.string.e_k));
        }
        e0Var.mo107142f(faVar.f35699x, faVar.f35665B.getString(C0966R.string.dxw));
    }
}
