package qj1;

import androidx.lifecycle.C0120a0;
import cl1.C54951d;
import cl1.C54991o;
import cl1.C55004v1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qj1.uf */
public final class C63039uf<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62979sf f178900d;

    public C63039uf(C62979sf sfVar) {
        this.f178900d = sfVar;
    }

    public void onChanged(Object obj) {
        C55004v1.C55005a aVar = (C55004v1.C55005a) obj;
        if (aVar != null) {
            C62979sf sfVar = this.f178900d;
            Log.m105924i(sfVar.f178702s, "initPlugin onPageSelect");
            sfVar.mo87915d1(((C54991o) sfVar.mo87696x0(C54991o.class)).mo75966J4());
            sfVar.mo87914b1(aVar.f154448b, aVar.f154449c, aVar.f154450d);
            if (!((C54951d) sfVar.mo87696x0(C54951d.class)).mo75869e3()) {
                sfVar.f178699p.setAlpha(1.0f);
            }
        }
    }
}
