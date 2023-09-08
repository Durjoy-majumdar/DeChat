package kj1;

import com.tencent.p014mm.plugin.finder.view.C4191v0;
import kj1.C10125e1;
import lj1.C10536d;

/* renamed from: kj1.f1 */
public final class C10144f1 implements C4191v0.C4192a {

    /* renamed from: a */
    public final /* synthetic */ C10125e1.C10127b f31066a;

    /* renamed from: b */
    public final /* synthetic */ C10125e1 f31067b;

    public C10144f1(C10125e1.C10127b bVar, C10125e1 e1Var) {
        this.f31066a = bVar;
        this.f31067b = e1Var;
    }

    public final void onDismiss() {
        this.f31066a.f31013f = null;
        C10536d dVar = this.f31067b.f30990i;
        if (dVar != null) {
            dVar.mo10802d();
        }
    }
}
