package pc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C117747y;
import sf0.C36667o0;
import te3.ie4;

public class e0$$d implements C118007g {

    /* renamed from: a */
    public final /* synthetic */ C118002e0 f352722a;

    public e0$$d(C118002e0 e0Var) {
        this.f352722a = e0Var;
    }

    /* renamed from: a */
    public void mo182774a(ie4 ie4, C117999c cVar) {
        Log.m105925i("MicroMsg.SyncService", "onContinueSync continueSyncScene:%s syncDataId:%s", cVar, ie4.f354051j);
        C36667o0 o0Var = this.f352722a.f352705a;
        e0$$d$$a e0__d__a = new e0$$d$$a(this, ie4);
        o0Var.getClass();
        o0Var.mo60790a(e0__d__a, 50, true);
    }

    /* renamed from: b */
    public void mo182775b(ie4 ie4, C118010i iVar) {
        if (ie4.f354052n != 0) {
            return;
        }
        if (iVar == null) {
            C118011j jVar = new C118011j(ie4);
            Log.m105925i("MicroMsg.SyncService", "onSceneCallback netscene is null, use:%s", jVar.toString());
            C86709a0.m107524d().onSceneEnd(0, 0, "", jVar);
            return;
        }
        C117747y yVar = (C117747y) iVar;
        Log.m105925i("MicroMsg.SyncService", "onSceneCallback netscene is %s", Integer.valueOf(yVar.hashCode()));
        C86709a0.m107524d().onSceneEnd(0, 0, "", yVar);
    }
}
