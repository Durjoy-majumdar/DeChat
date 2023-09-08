package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import c92.C104328f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import te3.C49918iz;
import w33.C111720c0;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.i2 */
public class C105643i2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49918iz f314136d;

    /* renamed from: e */
    public final /* synthetic */ C105648j2 f314137e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.i2$a */
    public class C105644a implements C105598b<ArrayList<C105683r>> {
        public C105644a(C105643i2 i2Var) {
        }

        /* renamed from: a */
        public void mo150477a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: talk success! tryTriggerJoinSucc %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i != 0 || i2 != 0) {
                Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: talk failed errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    public C105643i2(C105648j2 j2Var, C49918iz izVar) {
        this.f314137e = j2Var;
        this.f314136d = izVar;
    }

    public void run() {
        C105724z zVar = this.f314137e.f314142a;
        zVar.f314346B1 = true;
        zVar.f314390g.mo150526d(this.f314136d);
        this.f314137e.f314142a.f314390g.mo150524b();
        C49918iz izVar = this.f314136d;
        if (izVar != null) {
            C104328f fVar = C104328f.f308805a;
            long j = izVar.f135763d;
            C104328f.f308806b = j;
            C111720c0 c0Var = C111720c0.f334432a;
            long j2 = C104328f.f308807c;
            C111720c0.f334433b = j;
            C111720c0.f334434c = j2;
        }
        this.f314137e.f314142a.mo150592H(new C105644a(this));
    }
}
