package wk2;

import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: wk2.a */
public final class C15485a implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ String[] f42011d;

    public C15485a(String[] strArr) {
        this.f42011d = strArr;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        int length = this.f42011d.length;
        for (int i = 0; i < length; i++) {
            e0Var.mo107142f(i, this.f42011d[i]);
        }
    }
}
