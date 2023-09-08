package ov2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import lv2.C34383b;
import lv2.C34385c;
import pv2.C77292s;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import rt3.C22252b;
import su0.C118309f;
import ut3.C22662b;
import zt3.C119157j;

/* renamed from: ov2.b */
public class C35317b implements C118309f {

    /* renamed from: ov2.b$a */
    public class C35318a implements Runnable {
        public C35318a(C35317b bVar) {
        }

        public void run() {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SOTER_REPORT_TIMESTAMP_LONG_SYNC;
            long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 86400000 && C22252b.m25806c()) {
                C115669n.INSTANCE.mo175911u(1034, 1);
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
            }
        }
    }

    public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
        Log.m105925i("SoterHandleAuthResponse", "autoAuth: %s", Boolean.valueOf(z));
        ((C119157j) C119157j.f356862d).mo183875f(new C35318a(this));
        if (!z && C22662b.m26538b().mo35776d() && C22662b.m26538b().mo35774a().get(1).equals("WechatAuthKeyPay&null")) {
            Log.m105924i("SoterHandleAuthResponse", "init error, reinit");
            C22662b.m26538b().mo35778f(false);
            C34385c cVar = (C34385c) C86312j.m106911c(C34385c.class);
            cVar.getClass();
            C77292s.m93119f();
            new MTimerHandler(new C34383b(cVar), true).startTimer(100, 1000);
        }
    }

    public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
    }
}
