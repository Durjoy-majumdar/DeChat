package vl2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import zt3.C119157j;

/* renamed from: vl2.h */
public final class C37754h implements Runnable {

    /* renamed from: d */
    public static final C37754h f100001d = new C37754h();

    public final void run() {
        Log.m105925i("MicroMsg.OfflineScanManager", "alvinluo OfflineScan onNetworkChange netWorkStatus: %d, current: %d", Integer.valueOf(C86709a0.m107524d().mo123467m()), Integer.valueOf(C37755i.f100003b));
        if (C86709a0.m107524d().mo123467m() != 6 && C86709a0.m107524d().mo123467m() != 4) {
            C37755i.f100003b = C86709a0.m107524d().mo123467m();
        } else if (C37755i.f100003b != C86709a0.m107524d().mo123467m()) {
            C37755i.f100003b = C86709a0.m107524d().mo123467m();
            Log.m105924i("MicroMsg.OfflineScanManager", "alvinluo notifyMessage");
            if (!C86709a0.m107522a()) {
                Log.m105924i("MicroMsg.OfflineScanManager", "alvinluo notifyMessage account not ready and ignore");
                return;
            }
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC, (Object) null);
            if (f == null) {
                Log.m105924i("MicroMsg.OfflineScanManager", "alvinluo notifyOfflineScanMessage no message, ignore");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C37753g(f));
        }
    }
}
