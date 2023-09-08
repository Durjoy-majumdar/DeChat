package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import c92.C104328f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;
import te3.C49918iz;
import w33.C111720c0;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z0 */
public class C105744z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49918iz f314453d;

    /* renamed from: e */
    public final /* synthetic */ C105596a1 f314454e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z0$a */
    public class C105745a implements C105598b<ArrayList<C105683r>> {
        public C105745a() {
        }

        /* renamed from: a */
        public void mo150477a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: talk success! tryTriggerInviteSucc %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C105724z zVar = C105744z0.this.f314454e.f314055a;
                C105608d dVar = zVar.f314406p0;
                C105689s sVar = zVar.f314388f;
                dVar.getClass();
                MMHandlerThread.postToMainThread(new C105619e(dVar, sVar));
                return;
            }
            Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: invite failed errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public C105744z0(C105596a1 a1Var, C49918iz izVar) {
        this.f314454e = a1Var;
        this.f314453d = izVar;
    }

    public void run() {
        C105724z zVar = this.f314454e.f314055a;
        zVar.f314346B1 = true;
        zVar.f314390g.mo150526d(this.f314453d);
        this.f314454e.f314055a.f314390g.mo150524b();
        C49918iz izVar = this.f314453d;
        if (izVar != null) {
            C104328f fVar = C104328f.f308805a;
            long j = izVar.f135763d;
            C104328f.f308806b = j;
            C111720c0 c0Var = C111720c0.f334432a;
            long j2 = C104328f.f308807c;
            C111720c0.f334433b = j;
            C111720c0.f334434c = j2;
        }
        this.f314454e.f314055a.mo150591G(new C105745a());
    }
}
