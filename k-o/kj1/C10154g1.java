package kj1;

import com.tencent.p014mm.plugin.finder.view.C4191v0;
import kj1.C10125e1;
import lj1.C10536d;

/* renamed from: kj1.g1 */
public final class C10154g1 implements C4191v0.C4192a {

    /* renamed from: a */
    public final /* synthetic */ C10125e1.C10127b f31086a;

    /* renamed from: b */
    public final /* synthetic */ C10125e1 f31087b;

    public C10154g1(C10125e1.C10127b bVar, C10125e1 e1Var) {
        this.f31086a = bVar;
        this.f31087b = e1Var;
    }

    public final void onDismiss() {
        this.f31086a.f31014g = null;
        C10536d dVar = this.f31087b.f30990i;
        if (dVar != null) {
            dVar.mo10802d();
        }
    }
}
