package mq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import vq1.C14950a;

/* renamed from: mq1.b */
public final class C61553b implements C65231j<C61556d> {

    /* renamed from: a */
    public final /* synthetic */ C61554c f174954a;

    public C61553b(C61554c cVar) {
        this.f174954a = cVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        C87412m.m108594g((C61556d) dVar, "task");
        C87412m.m108594g(nVar, "status");
        C61554c cVar = C61554c.f174955c;
        Log.m105924i("MicroMsg.MusicUni.ActionManager", "task callback " + nVar);
        if (nVar != C65234n.OK) {
            MMHandlerThread.removeRunnable(this.f174954a.f174957b);
            MMHandlerThread.postToMainThreadDelayed(this.f174954a.f174957b, C14950a.f40991a);
        }
    }
}
