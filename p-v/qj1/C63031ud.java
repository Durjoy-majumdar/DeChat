package qj1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import d60.C58124b;
import pe3.C89349b;
import rx3.C13598b0;
import sk1.C63962r;
import te3.C64822x51;

/* renamed from: qj1.ud */
public final class C63031ud implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C63962r f178879d;

    public C63031ud(C63962r rVar) {
        this.f178879d = rVar;
    }

    public final void run() {
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
            Bundle bundle = new Bundle();
            C63962r rVar = this.f178879d;
            C64822x51 x512 = new C64822x51();
            x512.f186254d = 7;
            x512.f186256f = new C89349b(rVar.f181314s.toByteArray());
            x512.f186258h = rVar.f181291d;
            x512.f186259i = rVar.f181293f;
            C13598b0 b0Var = C13598b0.f38549a;
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
            bVar.statusChange(bVar2, bundle);
        }
    }
}
