package com.tencent.p014mm.feature.performance;

import ce2.C28544a;
import com.tencent.matrix.hook.memory.MemoryHook;
import com.tencent.matrix.hook.pthread.PthreadHook;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.plugin.performance.diagnostic.C115654a;
import com.tencent.p014mm.plugin.performance.diagnostic.C85311d;
import com.tencent.p014mm.plugin.performance.jectl.C30346a;
import com.tencent.p014mm.plugin.performance.jectl.JeVersion;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import ee2.C31571c;
import ee2.C86511b;
import f40.C86709a0;
import fe2.C86863b;
import h81.C32735h;
import p564iq.C87790d;
import t70.C36963e;
import ui3.C90664c;

/* renamed from: com.tencent.mm.feature.performance.s */
public class C28935s implements C87790d.C33382a {
    /* renamed from: a */
    public void mo55610a(C90664c cVar) {
        boolean z = false;
        C115654a.m162678b(false);
        C85311d.f248518f = C115654a.f346916a;
        C28544a aVar = C28544a.INSTANCE;
        MemoryHook memoryHook = (MemoryHook) ((C86511b) aVar.mo56045a(C86511b.class)).mo118531e();
        PthreadHook pthreadHook = (PthreadHook) ((C86863b) aVar.mo56045a(C86863b.class)).mo118531e();
        try {
            Log.m105925i("MicroMsg.PluginPerformance", "memoryHook = %s, pthreadHook = %s, eglHook = %s", memoryHook, pthreadHook, "eglHookStub");
            C85311d.m105271q(memoryHook, pthreadHook);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.PluginPerformance", th, "Hook error", new Object[0]);
        }
        C80814d dVar = C86709a0.m107531m().mo58407a().f254268g;
        if (dVar != null && Util.nullAs(dVar.mo112567a(".com.tencent.mm.debug.disable_memory_hook"), false)) {
            Log.m105920e("MicroMsg.PluginPerformance", "disabled by assist on boot");
            C28544a.INSTANCE.mo56047c("<cmd><diagnostic><MemoryHook enable='0' source='push'/></diagnostic></cmd>");
        }
        if (MMApplicationContext.isMainProcess()) {
            MultiProcessMMKV multiProcessMMKV = JeVersion.f81899a;
            if (BuildInfo.IS_ARM64) {
                Log.m105924i("MicroMsg.JeVersion", "it's none of arm64's business");
            } else {
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_jeversion_enable_v2, true)) {
                    z = true;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.JeVersion", "not enabled");
                } else {
                    JeVersion.f81901c.alive();
                    CrashReportFactory.addCrashReportExtraMessageGetter(new C30346a());
                }
            }
        }
        C36963e.f98037b = C31571c.f84375d;
    }
}
