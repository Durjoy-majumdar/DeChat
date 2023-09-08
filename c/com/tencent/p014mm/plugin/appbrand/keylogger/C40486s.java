package com.tencent.p014mm.plugin.appbrand.keylogger;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.util.FrequentLimiter;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.s */
public class C40486s implements Runnable {
    public void run() {
        C86009m1[] u;
        String c = C40484r.m43709c();
        if (Util.isNullOrNil(c)) {
            Log.m105928w("MicroMsg.DefaultKeyStepLogger", "doCleanJob getKeyStepRootDir null");
        } else {
            long e = C40484r.m43710e(C40484r.f108774a.format(Long.valueOf(Util.nowMilliSecond() - FrequentLimiter.WEEK_MILLS)));
            Log.m105925i("MicroMsg.DefaultKeyStepLogger", "doCleanJob rootDir:%s expiredDateTime:%d", c, Long.valueOf(e));
            C86009m1 m1Var = new C86009m1(c);
            if (m1Var.mo119977o()) {
                C86009m1[] u2 = m1Var.mo119984u();
                if (u2 == null || u2.length == 0) {
                    Log.m105924i("MicroMsg.DefaultKeyStepLogger", "doCleanJob no dirs");
                } else {
                    for (int i = 0; i < u2.length; i++) {
                        if (u2[i].mo119977o()) {
                            long e2 = C40484r.m43710e(u2[i].getName());
                            Log.m105925i("MicroMsg.DefaultKeyStepLogger", "dateTimeOfDir:%d", Long.valueOf(e2));
                            if (e2 <= e) {
                                Log.m105925i("MicroMsg.DefaultKeyStepLogger", "doCleanJob expired dirPath:%s", u2[i].mo119976n());
                                C86009m1 m1Var2 = u2[i];
                                if (m1Var2 != null && m1Var2.mo119967g() && m1Var2.mo119977o() && (u = m1Var2.mo119984u()) != null) {
                                    for (C86009m1 f : u) {
                                        f.mo119966f();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        MMApplicationContext.getDefaultPreference().edit().putLong("MMTempKeyStepLogger-Last-Clean-Time", System.currentTimeMillis()).commit();
    }
}
