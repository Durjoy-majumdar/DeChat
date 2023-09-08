package zp0;

import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import g40.C32315i;

/* renamed from: zp0.c */
public final class C91825c implements C32315i {
    public void onNetworkChange(int i) {
        if (C86709a0.m107522a()) {
            Log.m105924i("MicroMsg.AppBrandWeakNetReceiver.MMReceiver", "mmNetEventReceiver.onNetworkChange(status:" + i + ')');
            C91828f.f262936b = i;
            int a = C91828f.m115345a();
            AppBrandProcessesManager.f246131g.mo116962a().mo116953R(new C91827e(a != 4, a));
        }
    }
}
