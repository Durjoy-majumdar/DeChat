package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import te3.rs4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.j0 */
public class C105646j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105650k0 f314140d;

    public C105646j0(C105650k0 k0Var) {
        this.f314140d = k0Var;
    }

    public void run() {
        Map<Long, rs4> map = this.f314140d.f314144a.f314427y1;
        if (map != null && ((ConcurrentHashMap) map).size() > 0) {
            ((ConcurrentHashMap) this.f314140d.f314144a.f314427y1).clear();
            Log.m105918d("MicroMsg.Multitalk.ILinkService", "clearmap recvInviteInfoMap success");
        }
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "accept call timeout");
        C105724z zVar = this.f314140d.f314144a;
        C105608d dVar = zVar.f314406p0;
        C105689s sVar = zVar.f314388f;
        dVar.getClass();
        MMHandlerThread.postToMainThread(new C105604c(dVar, sVar));
        this.f314140d.f314144a.mo150603m();
    }
}
