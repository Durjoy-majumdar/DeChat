package qj1;

import androidx.lifecycle.C0120a0;
import cl1.C54951d;
import cl1.C55004v1;

/* renamed from: qj1.hb */
public final class C62808hb<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62772fb f178280d;

    public C62808hb(C62772fb fbVar) {
        this.f178280d = fbVar;
    }

    public void onChanged(Object obj) {
        C55004v1.C55005a aVar = (C55004v1.C55005a) obj;
        if (aVar != null) {
            C62772fb fbVar = this.f178280d;
            fbVar.mo87772a1(aVar.f154448b, aVar.f154449c, aVar.f154450d);
            fbVar.f178183q.mo77661a(aVar.f154447a);
            if (!((C54951d) fbVar.mo87696x0(C54951d.class)).mo75869e3()) {
                fbVar.f178183q.setAlpha(1.0f);
            }
        }
    }
}
