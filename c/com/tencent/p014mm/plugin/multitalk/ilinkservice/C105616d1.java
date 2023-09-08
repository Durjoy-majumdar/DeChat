package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d1 */
public class C105616d1 implements C105598b<ArrayList<C105683r>> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314090a;

    public C105616d1(C105724z zVar) {
        this.f314090a = zVar;
    }

    /* renamed from: a */
    public void mo150477a(int i, int i2, String str, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: invite success, tryTriggerInviteSucc %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            C105724z zVar = this.f314090a;
            C105608d dVar = zVar.f314406p0;
            C105689s sVar = zVar.f314388f;
            dVar.getClass();
            MMHandlerThread.postToMainThread(new C105619e(dVar, sVar));
            return;
        }
        Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: invite failed errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
