package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gv0.C20842c;
import gv0.e$$d;

public class s$$b implements e$$d {

    /* renamed from: a */
    public final /* synthetic */ C23589s f67683a;

    public s$$b(C23589s sVar) {
        this.f67683a = sVar;
    }

    /* renamed from: a */
    public void mo37064a(boolean z, String str, int i, int i2) {
        long j = (long) i;
        this.f67683a.f67670a.f67622k += j;
        C20842c.f58882p.f58942d += j;
        C23583j jVar = C23584k.f67611q;
        jVar.f67610k.addAndGet(-j);
        jVar.f67605f.open();
        Log.m105925i("MicroMsg.BackupFlowQueue", "releaseCacheSize [%d]", Long.valueOf(C23584k.f67611q.f67610k.get()));
    }
}
