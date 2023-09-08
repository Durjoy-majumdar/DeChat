package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ob0.C47350c;
import te3.bt4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d2 */
public class C105617d2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f314091d;

    /* renamed from: e */
    public final /* synthetic */ C105724z f314092e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d2$a */
    public class C105618a implements C40324j.C40326a {
        public C105618a() {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            bt4 bt4 = (bt4) cVar.f127056b.f127083a;
            C105617d2 d2Var = C105617d2.this;
            C105608d dVar = d2Var.f314092e.f314406p0;
            dVar.f314075a.mo150629F(d2Var.f314091d, i2, bt4.f131301e);
            Log.m105919d("MicroMsg.Multitalk.ILinkService", "DoScreenSharingSecurityCheck callback roomId %d errCode %d checkRet %d", Long.valueOf(bt4.f131300d), Integer.valueOf(i2), Integer.valueOf(bt4.f131301e));
        }
    }

    public C105617d2(C105724z zVar, String str) {
        this.f314092e = zVar;
        this.f314091d = str;
    }

    public void run() {
        C105724z zVar = this.f314092e;
        C105689s sVar = zVar.f314388f;
        String str = sVar.f314256d;
        String str2 = sVar.f314260h;
        long j = sVar.f314254b;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(zVar.f314394i.mo66669c((int) zVar.f314364R0, str, str2, j, zVar.f314362Q0, (String) null, this.f314091d), new C105618a());
        Log.m105919d("MicroMsg.Multitalk.ILinkService", "DoScreenSharingSecurityCheck roomId %d fileMd5 %s", Long.valueOf(this.f314092e.f314388f.f314254b), this.f314091d);
    }
}
