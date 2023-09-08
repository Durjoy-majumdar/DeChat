package t72;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import qe3.C101127f;

/* renamed from: t72.j */
public class C118395j implements Runnable {
    public C118395j(C118391i iVar) {
    }

    public void run() {
        Log.m105925i("MicroMsg.SubCoreBaseMonitor", "reportECDHAuth USE_ECDH[%s] USE_ML[%b]", Boolean.valueOf(C101127f.f296015a), Boolean.valueOf(C101127f.f296016b));
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(148, C101127f.f296015a ? 100 : 101, 1, true);
        nVar.idkeyStat(148, C101127f.f296016b ? 102 : 103, 1, true);
    }
}
