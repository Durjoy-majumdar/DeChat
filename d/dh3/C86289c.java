package dh3;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import z04.C112550d0;

/* renamed from: dh3.c */
public final class C86289c implements C116617e {
    /* renamed from: a */
    public boolean mo8501a() {
        return (MMApplicationContext.isAppBrandProcess() && mo120685b()) || (MMApplicationContext.isToolsProcess() && mo120685b()) || AppForegroundDelegate.INSTANCE.f343454n;
    }

    /* renamed from: b */
    public final boolean mo120685b() {
        String topActivityName = Util.getTopActivityName(MMApplicationContext.getContext());
        Log.m105924i("ForegroundCondition", "[existForegroundActivity] " + topActivityName);
        C87412m.m108593f(topActivityName, "topActivity");
        if (topActivityName.length() > 0) {
            String sourcePackageName = MMApplicationContext.getSourcePackageName();
            C87412m.m108593f(sourcePackageName, "getSourcePackageName()");
            if (C112550d0.m153801u(topActivityName, sourcePackageName, false)) {
                return true;
            }
        }
        return false;
    }
}
