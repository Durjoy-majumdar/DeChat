package uq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import vq1.C14950a;

/* renamed from: uq1.b */
public final class C65429b implements C65231j<C65428a> {

    /* renamed from: a */
    public final /* synthetic */ C65430c f188286a;

    public C65429b(C65430c cVar) {
        this.f188286a = cVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        C87412m.m108594g((C65428a) dVar, "task");
        C87412m.m108594g(nVar, "status");
        C65430c cVar = C65430c.f188287c;
        Log.m105924i("Finder.FinderActionManager", "task callback " + nVar);
        if (nVar == C65234n.OK) {
            this.f188286a.mo89551b();
            return;
        }
        MMHandlerThread.removeRunnable(this.f188286a.f188289b);
        MMHandlerThread.postToMainThreadDelayed(this.f188286a.f188289b, C14950a.f40991a);
    }
}
