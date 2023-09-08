package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.luggage.sdk.processes.C80249b;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.plugin.appbrand.app.w1 */
public class C81189w1 extends C80401d {
    public C81189w1(C81161g2 g2Var) {
    }

    /* renamed from: a */
    public void mo17850a() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_kill_process_on_wx_deep_background, 0) == 1;
        Log.m105925i("MicroMsg.SubCoreAppBrand", "AppDeepBackgroundOwner.onEnterBackground, should kill appbrand process? %b", Boolean.valueOf(z));
        if (z) {
            AppBrandProcessesManager.m103869I().mo111405r(C80249b.KILL_TYPE_SILENT);
        }
    }

    /* renamed from: b */
    public void mo17851b() {
    }
}
