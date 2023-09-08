package kj1;

import com.tencent.p014mm.plugin.finder.view.C4191v0;
import kj1.C10125e1;
import lj1.C10536d;

/* renamed from: kj1.h1 */
public final class C10160h1 implements C4191v0.C4192a {

    /* renamed from: a */
    public final /* synthetic */ C10125e1.C10127b f31097a;

    /* renamed from: b */
    public final /* synthetic */ C10125e1 f31098b;

    public C10160h1(C10125e1.C10127b bVar, C10125e1 e1Var) {
        this.f31097a = bVar;
        this.f31098b = e1Var;
    }

    public final void onDismiss() {
        this.f31097a.f31015h = null;
        C10536d dVar = this.f31098b.f30990i;
        if (dVar != null) {
            dVar.mo10802d();
        }
    }
}
