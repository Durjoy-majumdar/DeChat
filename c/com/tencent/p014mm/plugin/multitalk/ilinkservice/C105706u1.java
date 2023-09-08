package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import c92.C104328f;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import te3.C49918iz;
import w33.C111720c0;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.u1 */
public class C105706u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49918iz f314289d;

    /* renamed from: e */
    public final /* synthetic */ C105724z.C105736l f314290e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.u1$a */
    public class C105707a implements C105598b<ArrayList<C105683r>> {
        public C105707a() {
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

    public C105706u1(C105724z.C105736l lVar, C49918iz izVar) {
        this.f314290e = lVar;
        this.f314289d = izVar;
    }

    public void run() {
        C105724z zVar = C105724z.this;
        zVar.f314346B1 = true;
        C49918iz izVar = this.f314289d;
        if (izVar != null) {
            C104328f fVar = C104328f.f308805a;
            long j = izVar.f135763d;
            C104328f.f308806b = j;
            C111720c0 c0Var = C111720c0.f334432a;
            long j2 = C104328f.f308807c;
            C111720c0.f334433b = j;
            C111720c0.f334434c = j2;
        }
        zVar.f314390g.mo150526d(izVar);
        C105724z.this.f314390g.mo150524b();
        C105724z.this.mo150590F(new C105707a());
    }
}
