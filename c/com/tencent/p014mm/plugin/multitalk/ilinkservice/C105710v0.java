package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import java.util.Iterator;
import ob0.C47350c;
import te3.C50612nz;
import te3.et4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.v0 */
public class C105710v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C50612nz f314294d;

    /* renamed from: e */
    public final /* synthetic */ C105715w0 f314295e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.v0$a */
    public class C105711a implements C40324j.C40326a {
        public C105711a() {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            if (i != 0 || i2 != 0 || cVar.f127056b.f127083a == null) {
                Log.m105920e("MicroMsg.Multitalk.ILinkService", "hy: invite fail, errType:" + i + ",errCode:" + i2);
                C105715w0 w0Var = C105710v0.this.f314295e;
                C105724z zVar = w0Var.f314305c;
                C105598b bVar = w0Var.f314304b;
                String format = String.format("invite failed.  errType: %d, errCode: %d, errMsg: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str});
                C105724z zVar2 = C105724z.INSTANCE;
                zVar.mo150601k(bVar, -10088, i2, format, (byte[]) null);
            }
        }
    }

    public C105710v0(C105715w0 w0Var, C50612nz nzVar) {
        this.f314295e = w0Var;
        this.f314294d = nzVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "invite success, roomid:%d, selfmemberid:%d, selfname:%s", Long.valueOf(this.f314294d.f138843d), Integer.valueOf(this.f314294d.f138845f), this.f314295e.f314305c.f314362Q0);
        C105724z zVar = this.f314295e.f314305c;
        zVar.f314401n = 1;
        C105689s sVar = zVar.f314388f;
        C50612nz nzVar = this.f314294d;
        sVar.f314254b = nzVar.f138843d;
        sVar.f314258f = zVar.f314362Q0;
        String str = nzVar.f138844e;
        zVar.f314368T0 = str;
        sVar.f314260h = str;
        zVar.getClass();
        C105715w0 w0Var = this.f314295e;
        w0Var.f314305c.f314344A1 = true;
        et4 et4 = null;
        Iterator it = w0Var.f314303a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            et4 et42 = (et4) it.next();
            if (et42.f133116d.equals(this.f314295e.f314305c.f314362Q0)) {
                et4 = et42;
                break;
            }
        }
        C105724z zVar2 = this.f314295e.f314305c;
        C105608d dVar = zVar2.f314406p0;
        C105689s sVar2 = zVar2.f314388f;
        dVar.getClass();
        MMHandlerThread.postToMainThread(new C105632h(dVar, sVar2));
        C105715w0 w0Var2 = this.f314295e;
        C105724z zVar3 = w0Var2.f314305c;
        String str2 = zVar3.f314366S0;
        C50612nz nzVar2 = this.f314294d;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(zVar3.f314394i.mo66667a((int) zVar3.f314364R0, str2, nzVar2.f138843d, nzVar2.f138844e, et4.f133116d, et4.f133117e, w0Var2.f314303a, nzVar2.f138846g), new C105711a());
    }
}
