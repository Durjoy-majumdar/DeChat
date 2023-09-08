package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.a0 */
public class C105595a0 implements C105598b<ArrayList<C105683r>> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314054a;

    public C105595a0(C105724z zVar) {
        this.f314054a = zVar;
    }

    /* renamed from: a */
    public void mo150477a(int i, int i2, String str, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: joinRoomWithGroupID success! tryTriggerJoinSucc %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            C105724z zVar = this.f314054a;
            zVar.f314406p0.mo150489b(zVar.f314388f);
            return;
        }
        Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: join failed errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
