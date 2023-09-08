package ai0;

import ai0.C79553f;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import wi0.C90973a0;

/* renamed from: ai0.e */
public class C79552e implements C79581v {

    /* renamed from: d */
    public static final C79552e f233287d = new C79552e();

    /* renamed from: O3 */
    public C81415h0 mo109625O3() {
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        return C79553f.C79554a.f233290a;
    }

    /* renamed from: c4 */
    public boolean mo109626c4(AppBrandRuntime appBrandRuntime) {
        return C79553f.m96594a((AppBrandRuntimeWC) appBrandRuntime);
    }

    public boolean t20(AppBrandRuntime appBrandRuntime) {
        boolean z;
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        Class cls = C32735h.class;
        if (!C27903c.m38028a()) {
            Log.m105924i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, showad experiment closed");
        } else if (!(appBrandRuntime instanceof AppBrandRuntimeWC)) {
            Log.m105924i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, wrong runtime");
        } else {
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) appBrandRuntime;
            if (appBrandRuntimeWC.mo113210l1().f234815R0.mo76931c()) {
                Log.m105924i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, do not show ad in half screen wxa");
            } else if (appBrandRuntimeWC.mo113210l1().mo111304q() == C90973a0.TRANSPARENT) {
                Log.m105925i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, appId:%s, windowOpacity==TRANSPARENT, return false", appBrandRuntimeWC.f238147j);
            } else if (appBrandRuntimeWC.mo113194Y1()) {
                Log.m105925i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, ignore plugin app, appId:%s", appBrandRuntimeWC.f238147j);
            } else if (C27903c.m38029b() <= 0) {
                Log.m105924i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, timeThreshold invalid");
            } else {
                if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_ad_liberate_preload_state_limit, 0) == 0) {
                    C79575q qVar = appBrandRuntimeWC.f238294v1;
                    if (!((C79570o.m96621a(qVar.f233331b).f233285s == 2 && qVar.f233332c != null) || (C84331q.m103953h(C84343y.m103969a(qVar.f233331b.mo113210l1().mo111300k())) != null))) {
                        Log.m105924i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, process not preloaded");
                    }
                }
                int k1 = appBrandRuntimeWC.mo113208k1();
                String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_appbrand_ad_scene, "");
                if (!Util.isNullOrNil(Y60)) {
                    try {
                        HashSet hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(Y60);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            hashSet.add(Integer.valueOf(jSONArray.optInt(i)));
                        }
                        Log.m105925i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "checkSceneForShowAd, abtest set:%s, scene:%s", hashSet, Integer.valueOf(k1));
                        z = hashSet.contains(Integer.valueOf(k1));
                    } catch (Exception unused) {
                        Log.m105925i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "checkSceneForShowAd, exception, set:%s, scene:%s", C27903c.f77075a, Integer.valueOf(k1));
                        z = ((HashSet) C27903c.f77075a).contains(Integer.valueOf(k1));
                    }
                } else {
                    Log.m105925i("MicroMsg.AppBrandAdABTests[AppBrandSplashAd]", "checkSceneForShowAd, no abtest, set:%s, scene:%s", C27903c.f77075a, Integer.valueOf(k1));
                    z = ((HashSet) C27903c.f77075a).contains(Integer.valueOf(k1));
                }
                if (!z) {
                    Log.m105925i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, scene not fit:%s", Integer.valueOf(k1));
                } else if (!C79553f.m96594a(appBrandRuntimeWC)) {
                    Log.m105925i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "checkCanShowAd, not ad contact, appId:%s", appBrandRuntimeWC.f238147j);
                } else if (!appBrandRuntimeWC.mo121254q1() || ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_splash_ad_enable_on_game, 0) != 0) {
                    return true;
                } else {
                    Log.m105925i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "appId:%s, disable show ad on game(control by abtest)", appBrandRuntimeWC.f238147j);
                }
            }
        }
        return false;
    }
}
