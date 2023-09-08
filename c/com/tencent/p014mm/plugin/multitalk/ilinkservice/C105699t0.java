package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105662m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C47350c;
import te3.js4;
import te3.ks4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.t0 */
public class C105699t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105705u0 f314277d;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.t0$a */
    public class C105700a implements C105662m2.C105664b {
        public C105700a() {
        }
    }

    public C105699t0(C105705u0 u0Var) {
        this.f314277d = u0Var;
    }

    public void run() {
        if (!Util.isNullOrNil(this.f314277d.f314288a.f314405p)) {
            C105724z zVar = this.f314277d.f314288a;
            if (zVar.f314401n != 1) {
                zVar.f314384d.mo150533b(zVar.f314405p);
                C105724z zVar2 = this.f314277d.f314288a;
                C105662m2 m2Var = zVar2.f314384d;
                String str = zVar2.f314405p;
                C105700a aVar = new C105700a();
                C105656l2 l2Var = (C105656l2) ((ConcurrentHashMap) m2Var.f314175a).get(str);
                if (l2Var == null || !l2Var.mo150521a()) {
                    ((ConcurrentHashMap) m2Var.f314175a).remove(str);
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127066a = new js4();
                    bVar.f127067b = new ks4();
                    bVar.f127069d = 3773;
                    bVar.f127068c = "/cgi-bin/micromsg-bin/voipmtgensession";
                    bVar.f127070e = 0;
                    bVar.f127071f = 0;
                    C47350c a = bVar.mo72403a();
                    ((js4) a.f127055a.f127080a).f136300e = str;
                    ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C105668n2(m2Var, aVar, str));
                    return;
                }
                Log.m105918d("MicroMsg.Multitalk.ILinkSessionMgr", "hy: has valid sessionKey");
                m2Var.mo150532a(0, 0, "", l2Var, false, aVar);
                return;
            }
        }
        Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: not in room now");
    }
}
