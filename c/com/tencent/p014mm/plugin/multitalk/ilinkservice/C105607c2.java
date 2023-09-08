package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ob0.C47350c;
import te3.bt4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.c2 */
public class C105607c2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314073d;

    /* renamed from: e */
    public final /* synthetic */ C105724z f314074e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.c2$a */
    public class C42573a implements C40324j.C40326a {
        public C42573a(C105607c2 c2Var) {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            bt4 bt4 = (bt4) cVar.f127056b.f127083a;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "videoScreenSharingStart callback roomId %d errCode %d checkRet %d", Long.valueOf(bt4.f131300d), Integer.valueOf(i2), Integer.valueOf(bt4.f131301e));
        }
    }

    public C105607c2(C105724z zVar, int i) {
        this.f314074e = zVar;
        this.f314073d = i;
    }

    public void run() {
        int i = this.f314073d;
        if (i == 101) {
            C105724z zVar = this.f314074e;
            zVar.f314426y0 = 1;
            zVar.f314423x0 = false;
            C105724z zVar2 = this.f314074e;
            C105689s sVar = zVar2.f314388f;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(zVar2.f314394i.mo66669c((int) zVar2.f314364R0, sVar.f314256d, sVar.f314260h, sVar.f314254b, zVar2.f314362Q0, (String) null, (String) null), new C42573a(this));
            Log.m105919d("MicroMsg.Multitalk.ILinkService", "videoScreenSharingStart roomId %d", Long.valueOf(this.f314074e.f314388f.f314254b));
        } else if (i == 102) {
            C105724z zVar3 = this.f314074e;
            zVar3.f314426y0 = 2;
            zVar3.f314423x0 = false;
        } else if (i != 104) {
            this.f314074e.f314426y0 = 0;
        } else {
            this.f314074e.f314426y0 = 0;
        }
        C105724z zVar4 = this.f314074e;
        boolean z = zVar4.f314407p1;
        boolean z2 = zVar4.f314423x0;
        C105714w.f314302c.SwitchAV(z ? 1 : 0, z2 ? 1 : 0, zVar4.f314426y0);
    }
}
