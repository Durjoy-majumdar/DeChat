package p697tm;

import android.os.Handler;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84341w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import dk0.C7355a;
import dk0.C7356b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import kr0.C88273g1;
import or0.C11730n;
import p629ny.C76979h;
import zt3.C119157j;

/* renamed from: tm.g0 */
public class C90519g0 implements C114661d0 {
    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        if (C86709a0.m107522a()) {
            C7356b bVar = C7356b.f25481a;
            ((C119157j) C119157j.f356862d).mo183875f(C7355a.f25480d);
            C32224a<Boolean> aVar = C11730n.f34329a;
            C1510o oVar = C1510o.f10864a;
            MultiProcessMMKV a = oVar.mo1516a();
            C87412m.m108591d(a);
            if (!a.getBoolean("last_appbrand_switch_short_link_highlight", false)) {
                ((C76979h) C86312j.m106911c(C76979h.class)).clearCache();
                MultiProcessMMKV a2 = oVar.mo1516a();
                C87412m.m108591d(a2);
                a2.putBoolean("last_appbrand_switch_short_link_highlight", true);
                Log.m105924i("WxaShortLinkCapacity", "short link highlight change to enable!");
            }
            AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f238248d.mo113165a(false);
        }
    }

    public void onAppForeground(String str) {
        if (C86709a0.m107522a()) {
            if (MMApplicationContext.isMainProcess()) {
                AppBrandProcessesManager.m103872O(C84341w.m103968b());
            }
            C81161g2.Dx0("onAppForeground:" + str, C88273g1.APP_FOREGROUND);
            AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f238248d.mo113165a(false);
            C81194z.zx0(C81194z.C81196b.APP_FOREGROUND);
        }
    }
}
