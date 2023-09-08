package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105134d1;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.ConcurrentHashMap;
import p576jp.C33610c;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u0 */
public class C105177u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105180v0 f312322d;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u0$a */
    public class C105178a implements C105134d1.C105136b {
        public C105178a() {
        }

        /* renamed from: a */
        public void mo149449a(int i, int i2, String str, C105132c1 c1Var, boolean z) {
            if (i != 0 || i2 != 0 || c1Var == null || !c1Var.mo149444a()) {
                Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: refresh session key error!");
                C105181w wVar = C105177u0.this.f312322d.f312333a;
                C33610c.C33611a aVar = C33610c.C33611a.ReasonSessionUpdateFailed;
                C105181w wVar2 = C105181w.INSTANCE;
                wVar.mo149499f(aVar);
                return;
            }
            String str2 = c1Var.f312154a;
            C105172s.f312297c.UpdateAuthKey(str2.getBytes(), str2.getBytes().length);
        }
    }

    public C105177u0(C105180v0 v0Var) {
        this.f312322d = v0Var;
    }

    public void run() {
        if (!Util.isNullOrNil(this.f312322d.f312333a.f312383p)) {
            C105181w wVar = this.f312322d.f312333a;
            if (wVar.f312381n != C105181w.C85161i.NotInRoom) {
                C105134d1 d1Var = wVar.f312374d;
                String str = wVar.f312383p;
                d1Var.getClass();
                Log.m105924i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: on exit");
                if (!Util.isNullOrNil(str)) {
                    ((ConcurrentHashMap) d1Var.f312158a).remove(str);
                }
                C105181w wVar2 = this.f312322d.f312333a;
                wVar2.f312374d.mo149447b(wVar2.f312383p, wVar2.f312386r, new C105178a());
                return;
            }
        }
        Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room now");
    }
}
