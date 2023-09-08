package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105676p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ob0.C47350c;
import te3.C50612nz;
import te3.et4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.o1 */
public class C105671o1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314191d;

    /* renamed from: e */
    public final /* synthetic */ C50612nz f314192e;

    /* renamed from: f */
    public final /* synthetic */ C105676p1.C105677a.C105678a f314193f;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.o1$a */
    public class C105672a implements C40324j.C40326a {
        public C105672a(C105671o1 o1Var) {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            if (i != 0 || i2 != 0 || cVar.f127056b.f127083a == null) {
                Log.m105920e("MicroMsg.Multitalk.ILinkService", "hy: invite fail, errType:" + i + ",errCode:" + i2);
            }
        }
    }

    public C105671o1(C105676p1.C105677a.C105678a aVar, int i, C50612nz nzVar) {
        this.f314193f = aVar;
        this.f314191d = i;
        this.f314192e = nzVar;
    }

    public void run() {
        int i = this.f314191d;
        boolean z = i == 0;
        if (this.f314192e != null) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "addmember errcode:%d, roomid:%d, selfmemberid:%d, selfname:%s, groupid:%s", Integer.valueOf(i), Long.valueOf(this.f314192e.f138843d), Integer.valueOf(this.f314192e.f138845f), C105676p1.this.f314221a.f314362Q0, this.f314192e.f138844e);
        } else {
            z = false;
        }
        C105724z zVar = C105676p1.this.f314221a;
        C105608d dVar = zVar.f314406p0;
        C105689s sVar = zVar.f314388f;
        dVar.getClass();
        if (z) {
            Log.m105924i("MicroMsg.Multitalk.ILink2MtCallBack", "add member ok.");
        } else {
            Log.m105924i("MicroMsg.Multitalk.ILink2MtCallBack", "add member error.");
        }
        int i2 = this.f314191d;
        if (i2 != 0) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "add fail %d", Integer.valueOf(i2));
            return;
        }
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "add success, roomid:%d selfmemberid:%d", Long.valueOf(this.f314192e.f138843d), Integer.valueOf(this.f314192e.f138845f));
        et4 et4 = new et4();
        C105724z zVar2 = C105676p1.this.f314221a;
        String str = zVar2.f314362Q0;
        et4.f133116d = str;
        et4.f133117e = zVar2.f314388f.mo150550b(str).f314238b;
        this.f314193f.f314226a.add(et4);
        String str2 = this.f314192e.f138844e;
        if (str2 == null || str2.equals("")) {
            str2 = C105676p1.this.f314221a.f314388f.f314260h;
        }
        C105676p1.C105677a.C105678a aVar = this.f314193f;
        C105724z zVar3 = C105676p1.this.f314221a;
        C42574q qVar = zVar3.f314394i;
        int i3 = (int) zVar3.f314364R0;
        String str3 = zVar3.f314366S0;
        C50612nz nzVar = this.f314192e;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(qVar.mo66667a(i3, str3, nzVar.f138843d, str2, et4.f133116d, (String) null, aVar.f314226a, nzVar.f138846g), new C105672a(this));
    }
}
