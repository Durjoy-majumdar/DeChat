package zp0;

import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import g40.C32314h;

/* renamed from: zp0.d */
public final class C91826d implements C32314h {
    /* renamed from: q2 */
    public void mo58565q2(boolean z, int i) {
        if (C86709a0.m107522a()) {
            Log.m105924i("MicroMsg.AppBrandWeakNetReceiver.MMReceiver", "mmNetReceiver.onReceiveWeakNet(weak:" + z + ", rtt:" + i + ')');
            C91828f.f262935a = z;
            int a = C91828f.m115345a();
            AppBrandProcessesManager.f246131g.mo116962a().mo116953R(new C91827e(a != 4, a));
        }
    }
}
