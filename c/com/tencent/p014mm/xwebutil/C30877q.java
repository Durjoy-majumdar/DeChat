package com.tencent.p014mm.xwebutil;

import com.tencent.p014mm.plugin.expansions.C29892r;
import com.tencent.p014mm.plugin.expansions.C85178q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import zt3.C119157j;

/* renamed from: com.tencent.mm.xwebutil.q */
public class C30877q {

    /* renamed from: a */
    public static C30879b f82911a;

    /* renamed from: com.tencent.mm.xwebutil.q$a */
    public class C30878a implements Runnable {
        public void run() {
            C30879b bVar = C30877q.f82911a;
            if (bVar == null) {
                Log.m105928w("MicroMsg.XWebWithExpansion", "initExpansionSetting, sExpansionImp is null");
                XWebSdk.setIsEmbedDirReady(false);
                return;
            }
            ((C29892r) bVar).getClass();
            byte[] bArr = C85178q.f248171a;
            XWebSdk.setIsEmbedDirReady(true);
            Log.m105924i("MicroMsg.XWebWithExpansion", "initExpansionSetting, isInstalled:true");
            XWebSdk.setSoLibDirs(((C29892r) C30877q.f82911a).mo56971a());
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.q$b */
    public interface C30879b {
    }

    /* renamed from: a */
    public static synchronized void m39256a() {
        synchronized (C30877q.class) {
            if (XWebSdk.getBuildConfigNeedTurnOffDynamicCode() && XWebSdk.getBuildConfigShouldEmbedXWebCore()) {
                ((C119157j) C119157j.f356862d).mo183875f(new C30878a());
            }
        }
    }
}
