package p697tm;

import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.jsapi.openvoice.AppBrandVoIP1v1FloatBallEvent;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C76630x0;
import xv0.C38857m;

/* renamed from: tm.g1 */
public class C90520g1 extends C38857m {
    /* renamed from: G1 */
    public void mo58338G1(BallInfo ballInfo) {
        C76630x0 x0Var;
        C76630x0 x0Var2;
        C76630x0 x0Var3;
        BallInfo ballInfo2 = ballInfo;
        Class cls = C76630x0.class;
        if (ballInfo2 != null) {
            int i = ballInfo2.f311686d;
            if (i == 1 || (i == 20 && ballInfo2.f311687e == 1)) {
                if (ballInfo2.f311678C != null) {
                    Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "handleBallInfoClicked, openAppBrand ballInfo:%s", ballInfo2);
                    String string = ballInfo2.f311678C.getString("appId");
                    String string2 = ballInfo2.f311678C.getString("username");
                    int i2 = ballInfo2.f311678C.getInt("versionType");
                    AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                    appBrandStatObject.f245533f = 1131;
                    if ((!Util.isNullOrNil(string2) || !Util.isNullOrNil(string)) && (x0Var = (C76630x0) C86312j.m106911c(cls)) != null) {
                        Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "openAppBrand, launch:%s#%s", string, Integer.valueOf(i2));
                        x0Var.Ko0(MMApplicationContext.getContext(), string2, string, i2, -1, (String) null, appBrandStatObject);
                    }
                }
            } else if (i == 17) {
                if (i == 17) {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
                    String string3 = ballInfo2.f311678C.getString("appId");
                    String string4 = ballInfo2.f311678C.getString("username");
                    int i3 = ballInfo2.f311678C.getInt("versionType");
                    AppBrandStatObject appBrandStatObject2 = new AppBrandStatObject();
                    appBrandStatObject2.f245533f = 1131;
                    if ((!Util.isNullOrNil(string4) || !Util.isNullOrNil(string3)) && (x0Var3 = (C76630x0) C86312j.m106911c(cls)) != null) {
                        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "openAppBrand, launch:%s#%s", string3, Integer.valueOf(i3));
                        x0Var3.Ko0(MMApplicationContext.getContext(), string4, string3, i3, -1, (String) null, appBrandStatObject2);
                    }
                }
            } else if (i == 19 && i == 19) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
                String string5 = ballInfo2.f311678C.getString("appId");
                String string6 = ballInfo2.f311678C.getString("username");
                int i4 = ballInfo2.f311678C.getInt("versionType");
                AppBrandStatObject appBrandStatObject3 = new AppBrandStatObject();
                appBrandStatObject3.f245533f = 1131;
                if ((!Util.isNullOrNil(string6) || !Util.isNullOrNil(string5)) && (x0Var2 = (C76630x0) C86312j.m106911c(cls)) != null) {
                    Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "openAppBrand, launch:%s#%s", string5, Integer.valueOf(i4));
                    x0Var2.Ko0(MMApplicationContext.getContext(), string6, string5, i4, -1, (String) null, appBrandStatObject3);
                }
            }
        }
    }

    /* renamed from: H */
    public void mo58339H(BallInfo ballInfo) {
    }

    /* renamed from: c2 */
    public void mo58340c2(BallInfo ballInfo) {
        int i;
        if (ballInfo != null && (i = ballInfo.f311686d) == 19 && i == 19) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
            String string = ballInfo.f311678C.getString("appId");
            AppBrandVoIP1v1FloatBallEvent appBrandVoIP1v1FloatBallEvent = new AppBrandVoIP1v1FloatBallEvent();
            appBrandVoIP1v1FloatBallEvent.f242313d = 1;
            C81964j.m100679b(string, appBrandVoIP1v1FloatBallEvent);
        }
    }
}
