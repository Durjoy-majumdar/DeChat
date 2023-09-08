package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.luggage.sdk.processes.C80259g;
import com.tencent.luggage.sdk.processes.C80279o;
import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81648d;
import com.tencent.p014mm.plugin.appbrand.launching.AppLaunchPrepareProcess;
import com.tencent.p014mm.plugin.appbrand.launching.C83323g;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83558f;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83559g;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83594m;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84274b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import gy3.C87412m;
import org.json.JSONObject;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.v */
public final class C83440v {
    /* renamed from: a */
    public static void m102393a(Context context, ActivityStarterIpcDelegate activityStarterIpcDelegate, AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        boolean z;
        JSONObject jSONObject;
        Log.m105925i("MicroMsg.AppBrand.PreconditionUtil", "startAppOnInitConfigGot, %s", appBrandInitConfigWC);
        C83323g.m102275a(appBrandInitConfigWC, appBrandStatObject);
        appBrandInitConfigWC.f239374e1 = Util.nowMilliSecond();
        C87412m.m108594g(appBrandStatObject, "stat");
        if (C83559g.m102556b(appBrandInitConfigWC, appBrandStatObject)) {
            AppBrandProcessesManager a = AppBrandProcessesManager.f246131g.mo116962a();
            int i = appBrandInitConfigWC.f234811P;
            String str = appBrandInitConfigWC.f239362d;
            C87412m.m108593f(str, "config.appId");
            a.mo111393h(str, -1, new C80259g(a, i));
            if (!TextUtils.isEmpty(appBrandInitConfigWC.f234807K)) {
                try {
                    jSONObject = new JSONObject(!TextUtils.isEmpty(appBrandInitConfigWC.f234807K) ? appBrandInitConfigWC.f234807K : appBrandInitConfigWC.f234846y.f239405p);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                String optString = jSONObject.optString("instanceId", "");
                if (!(optString == null || optString.length() == 0)) {
                    appBrandInitConfigWC.mo111298i(optString);
                    appBrandInitConfigWC.f239379j1 = new QualitySession(appBrandInitConfigWC.f234838r, appBrandInitConfigWC, appBrandStatObject);
                }
                String optString2 = jSONObject.optString("sessionId", "");
                if (!(optString2 == null || optString2.length() == 0)) {
                    Log.m105925i("Luggage.AppBrandInitConfigLU", "resetSession(%s) %s", optString2, android.util.Log.getStackTraceString(new Throwable()));
                    appBrandInitConfigWC.f234837q = optString2;
                }
            }
            Context castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
            if (castActivityOrNull == null) {
                castActivityOrNull = MMApplicationContext.getContext();
            }
            C23564m.m28136f(new C83558f(castActivityOrNull, appBrandInitConfigWC, appBrandStatObject));
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (context instanceof Activity) {
                appBrandInitConfigWC.f234834c1 = appBrandStatObject;
                C83594m.m102619a((Activity) context, appBrandInitConfigWC, appBrandStatObject);
            }
            Log.m105925i("MicroMsg.AppBrand.AppLaunchLogic", "startAppImpl [applaunch] start functional runtime, config[%s]", appBrandInitConfigWC);
        } else {
            if (appBrandInitConfigWC.f234826X) {
                AppBrandProcessesManager.m103869I().mo111408u(appBrandInitConfigWC.f239362d, appBrandInitConfigWC.f239365g, true);
                Log.m105925i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] reloadIfExist killByAppId %s", appBrandInitConfigWC.f239362d);
            }
            try {
                C80279o E = AppBrandProcessesManager.m103869I().mo111383E(context, new C84274b0(appBrandInitConfigWC, appBrandStatObject, activityStarterIpcDelegate));
                Log.m105925i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] startAppOnInitConfigGot %s", appBrandInitConfigWC);
                if (E == C80279o.CREATE_NEW && AppLaunchPrepareProcess.m102197i(appBrandInitConfigWC.f234838r) == null) {
                    Log.m105925i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] init AppLaunchPrepareProcess boost instance, appId:%s, versionType:%d, instanceId:%s", appBrandInitConfigWC.f239362d, Integer.valueOf(appBrandInitConfigWC.f239365g), appBrandInitConfigWC.f234838r);
                    new AppLaunchPrepareProcess(appBrandInitConfigWC, appBrandStatObject).mo115526n();
                    C83606m1.m102639c(21, appBrandInitConfigWC.f239362d, appBrandInitConfigWC.f234802F, appBrandInitConfigWC.f239365g, appBrandInitConfigWC.mo111300k());
                }
            } catch (AndroidRuntimeException e) {
                Log.m105921e("MicroMsg.AppBrand.AppLaunchLogic", "startAppImpl re = %s", e);
            }
        }
        C81648d.m100144g().mo124412e(appBrandInitConfigWC.f234839s, appBrandInitConfigWC.mo111294e());
    }
}
