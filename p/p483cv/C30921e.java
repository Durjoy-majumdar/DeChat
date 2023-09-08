package p483cv;

import android.os.Handler;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;

/* renamed from: cv.e */
public final class C30921e implements C114661d0 {
    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C105923s sVar = (C105923s) C86312j.m106911c(C105923s.class);
        sVar.getClass();
        Log.m105925i(sVar.f315124d, "onAppBackground, activity:%s", str);
        C105923s.C30306a aVar = C105923s.f315123o;
        if (aVar != null) {
            aVar.mo57276f(AppForegroundDelegate.INSTANCE.f343454n);
        }
    }

    public void onAppForeground(String str) {
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C105923s sVar = (C105923s) C86312j.m106911c(C105923s.class);
        sVar.getClass();
        Log.m105925i(sVar.f315124d, "onAppForeground, activity:%s", str);
        if (AppForegroundDelegate.INSTANCE.f343454n && C86709a0.m107522a()) {
            boolean isTopApplication = Util.isTopApplication(MMApplicationContext.getContext());
            Log.m105925i(sVar.f315124d, "onAppForeground isTopApplication: %b", Boolean.valueOf(isTopApplication));
            if (isTopApplication) {
                C105923s.C30306a aVar = C105923s.f315123o;
                if (aVar != null) {
                    aVar.mo57276f(true);
                }
                sVar.yx0();
            }
        }
    }
}
