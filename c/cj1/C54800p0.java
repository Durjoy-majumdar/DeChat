package cj1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import d60.C58124b;
import hp3.C87581a;
import ob0.C89132b;
import ok1.C62042e;
import rx3.C13598b0;
import sk1.C63962r;
import te3.C64822x51;

/* renamed from: cj1.p0 */
public final class C54800p0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C63962r f153624a;

    public C54800p0(C63962r rVar) {
        this.f153624a = rVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_REPLACE;
                Bundle bundle = new Bundle();
                C64822x51 z1 = C62042e.f176370a.mo87132z1(this.f153624a);
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", z1 != null ? z1.toByteArray() : null);
                C13598b0 b0Var = C13598b0.f38549a;
                bVar.statusChange(bVar2, bundle);
            }
        }
        return C13598b0.f38549a;
    }
}
