package kj1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import d60.C58124b;
import kj1.C10125e1;
import lj1.C10536d;

/* renamed from: kj1.a2 */
public final class C10100a2 implements C4191v0.C4192a {

    /* renamed from: a */
    public final /* synthetic */ C10125e1 f30902a;

    /* renamed from: b */
    public final /* synthetic */ C10125e1.C10132d f30903b;

    public C10100a2(C10125e1 e1Var, C10125e1.C10132d dVar) {
        this.f30902a = e1Var;
        this.f30903b = dVar;
    }

    public final void onDismiss() {
        C58124b bVar = this.f30902a.f30986e;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_MORE_ACTION_HIDE, (Bundle) null, 2, (Object) null);
        }
        this.f30903b.f31039e = null;
        C10536d dVar = this.f30902a.f30990i;
        if (dVar != null) {
            dVar.mo10802d();
        }
    }
}
