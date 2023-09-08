package pc0;

import com.tencent.mars.comm.WakerLock;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;

public class e0$$c implements WakerLock.IAutoUnlockCallback {

    /* renamed from: a */
    public final /* synthetic */ C118002e0 f352721a;

    public e0$$c(C118002e0 e0Var) {
        this.f352721a = e0Var;
    }

    public void autoUnlockCallback() {
        Log.m105921e("MicroMsg.SyncService", "ERROR: %s auto unlock syncWakerLock", this.f352721a.f352709e);
        C118002e0 e0Var = this.f352721a;
        C118010i iVar = e0Var.f352709e;
        e0Var.getClass();
        if (iVar == null) {
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo160131h(11098, 3550, "" + CrashReportFactory.foreground + ";" + e0Var.mo182764h());
            dVar.idkeyStat(99, 48, 1, false);
        } else if ((iVar instanceof e0$$g) || (iVar instanceof C118011j)) {
            C117407d dVar2 = C117407d.INSTANCE;
            dVar2.mo160131h(11098, 3551, "" + CrashReportFactory.foreground + ";" + e0Var.mo182764h());
            dVar2.idkeyStat(99, 49, 1, false);
        } else if (iVar instanceof e0$$h) {
            C117407d dVar3 = C117407d.INSTANCE;
            dVar3.mo160131h(11098, 3552, "" + CrashReportFactory.foreground + ";" + e0Var.mo182764h());
            dVar3.idkeyStat(99, 50, 1, false);
        } else if (iVar instanceof e0$$f) {
            C117407d dVar4 = C117407d.INSTANCE;
            dVar4.mo160131h(11098, 3553, "" + CrashReportFactory.foreground + ";" + e0Var.mo182764h());
            dVar4.idkeyStat(99, 51, 1, false);
        } else {
            C117407d dVar5 = C117407d.INSTANCE;
            dVar5.mo160131h(11098, 3554, "" + CrashReportFactory.foreground + ";" + e0Var.mo182764h());
            dVar5.idkeyStat(99, 52, 1, false);
        }
    }
}
