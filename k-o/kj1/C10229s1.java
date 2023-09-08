package kj1;

import java.util.ArrayList;
import java.util.Iterator;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: kj1.s1 */
public final class C10229s1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C10125e1.C10127b f31241d;

    public C10229s1(C10125e1.C10127b bVar) {
        this.f31241d = bVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        Iterator it = ((ArrayList) this.f31241d.f31025r).iterator();
        while (it.hasNext()) {
            ((C10538e) it.next()).mo10809p(e0Var);
        }
    }
}
