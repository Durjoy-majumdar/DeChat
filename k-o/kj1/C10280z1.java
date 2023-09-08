package kj1;

import java.util.ArrayList;
import java.util.Iterator;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: kj1.z1 */
public final class C10280z1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C10125e1.C10132d f31339d;

    public C10280z1(C10125e1.C10132d dVar) {
        this.f31339d = dVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        Iterator it = ((ArrayList) this.f31339d.f31041g).iterator();
        while (it.hasNext()) {
            ((C10538e) it.next()).mo10809p(e0Var);
        }
    }
}
