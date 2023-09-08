package tv0;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import p646pn.C110234e;

/* renamed from: tv0.a */
public class C37277a extends C114661d0.C28676a {
    public void onAppBackground(String str) {
        Class cls = C110234e.class;
        Log.m105925i("MicroMsg.BallAppForegroundListener", "onAppBackground, activity:%s", str);
        AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
        if (!appForegroundDelegate.f343454n && C86709a0.m107522a() && ((C110234e) C86312j.m106911c(cls)).mo161399pY() != null) {
            ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149113c(false);
            ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149136n0(false);
        }
        if (((C110234e) C86312j.m106911c(cls)).mo161398Zc() != null) {
            ((C110234e) C86312j.m106911c(cls)).mo161398Zc().mo22763f(appForegroundDelegate.f343454n);
        }
    }

    public void onAppForeground(String str) {
        Class cls = C110234e.class;
        Log.m105925i("MicroMsg.BallAppForegroundListener", "onAppForeground, activity:%s", str);
        if (AppForegroundDelegate.INSTANCE.f343454n && C86709a0.m107522a() && ((C110234e) C86312j.m106911c(cls)).mo161399pY() != null) {
            boolean isTopApplication = Util.isTopApplication(MMApplicationContext.getContext());
            Log.m105925i("MicroMsg.BallAppForegroundListener", "alvinluo onAppForeground isTopApplication: %b", Boolean.valueOf(isTopApplication));
            if (isTopApplication) {
                ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149115d(true);
                ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149136n0(true);
            }
        }
    }
}
