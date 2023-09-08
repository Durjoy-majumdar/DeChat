package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105662m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C47350c;
import pe3.C47465a;
import te3.ks4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.n2 */
public class C105668n2 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C105662m2.C105664b f314182a;

    /* renamed from: b */
    public final /* synthetic */ String f314183b;

    /* renamed from: c */
    public final /* synthetic */ C105662m2 f314184c;

    public C105668n2(C105662m2 m2Var, C105662m2.C105664b bVar, String str) {
        this.f314184c = m2Var;
        this.f314182a = bVar;
        this.f314183b = str;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            C105656l2 l2Var = new C105656l2();
            l2Var.f314150a = ((ks4) aVar).f137026d.mo123705h();
            l2Var.f314152c = Util.currentTicks();
            l2Var.f314151b = 0;
            Log.m105925i("MicroMsg.Multitalk.ILinkSessionMgr", "hy: getSession sessionKey: %s", l2Var);
            ((ConcurrentHashMap) this.f314184c.f314175a).put(this.f314183b, l2Var);
            this.f314184c.mo150532a(0, 0, "", l2Var, true, this.f314182a);
            return;
        }
        Log.m105920e("MicroMsg.Multitalk.ILinkSessionMgr", "hy: get sessionkey fail,errType:" + i + ",errCode:" + i2);
        this.f314184c.mo150532a(i, i2, str, (C105656l2) null, false, this.f314182a);
    }
}
