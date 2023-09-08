package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s1 */
public class C105695s1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105724z.C105734j f314268d;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s1$a */
    public class C105696a implements C105598b<ArrayList<C105683r>> {
        public C105696a() {
        }

        /* renamed from: a */
        public void mo150477a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: accept success! tryTriggerAcceptSucc %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C105724z zVar = C105724z.this;
                zVar.f314406p0.mo150489b(zVar.f314388f);
                return;
            }
            Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: accept failed errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public C105695s1(C105724z.C105734j jVar) {
        this.f314268d = jVar;
    }

    public void run() {
        C105724z zVar = C105724z.this;
        zVar.f314401n = 1;
        zVar.f314344A1 = true;
        zVar.mo150590F(new C105696a());
    }
}
