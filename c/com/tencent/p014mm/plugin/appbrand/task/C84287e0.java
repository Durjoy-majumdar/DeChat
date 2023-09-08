package com.tencent.p014mm.plugin.appbrand.task;

import android.util.SparseArray;
import com.tencent.p014mm.autogen.mmdata.rpt.SwitchTaskStruct;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.C29666j3;
import com.tencent.p014mm.plugin.appbrand.report.C29630y;
import com.tencent.p014mm.plugin.appbrand.report.C84244x;
import com.tencent.p014mm.plugin.appbrand.report.C84246z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import yi0.C91456b;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.task.e0 */
public final class C84287e0 {

    /* renamed from: a */
    public static final C84287e0 f246157a = new C84287e0();

    /* renamed from: a */
    public final void mo116975a(AppBrandUI appBrandUI, String str) {
        AppBrandInitConfigWC Y7;
        int hashCode;
        SparseArray<C84244x> sparseArray;
        AppBrandUI appBrandUI2 = appBrandUI;
        String str2 = str;
        C87412m.m108594g(appBrandUI2, "ui");
        C87412m.m108594g(str2, "lifecycle");
        C84244x.f246077c.getClass();
        C84244x xVar = null;
        if (appBrandUI.isFinishing() || appBrandUI.isDestroyed()) {
            C84244x.f246078d.remove(appBrandUI.hashCode());
        } else if (appBrandUI.mo117074l8() && (xVar = sparseArray.get(hashCode, (Object) null)) == null) {
            xVar = new C84244x(appBrandUI2);
            (sparseArray = C84244x.f246078d).put((hashCode = appBrandUI.hashCode()), xVar);
        }
        if (xVar != null) {
            if (!C112551y.m153819s(str2, "onCreate", false)) {
                switch (str.hashCode()) {
                    case -1401315045:
                        if (str2.equals("onDestroy")) {
                            C84244x.f246078d.remove(xVar.f246079a.hashCode());
                            break;
                        }
                        break;
                    case -1340212393:
                        if (str2.equals("onPause")) {
                            xVar.f246080b = 0;
                            AppBrandUI appBrandUI3 = xVar.f246079a;
                            C84246z zVar = new C84246z(xVar);
                            C87412m.m108594g(appBrandUI3, "context");
                            MMHandlerThread.postToMainThread(new C29666j3(appBrandUI3, zVar));
                            break;
                        }
                        break;
                    case -918269635:
                        if (str2.equals("onNewIntent")) {
                            xVar.f246080b = 4;
                            AppBrandInitConfigWC Y72 = xVar.f246079a.mo117109Y7();
                            if (Y72 != null) {
                                SwitchTaskStruct switchTaskStruct = new SwitchTaskStruct();
                                switchTaskStruct.f236398d = 1;
                                switchTaskStruct.f236399e = 2;
                                switchTaskStruct.f236400f = switchTaskStruct.mo86045b("ItemId", Y72.f239362d, true);
                                switchTaskStruct.f236401g = switchTaskStruct.mo86045b("ItemSessionId", Y72.f234837q, true);
                                switchTaskStruct.mo86054n();
                                break;
                            }
                        }
                        break;
                    case 1463983852:
                        if (str2.equals("onResume")) {
                            ((C119157j) C119157j.f356862d).mo183871b(new C29630y(1), "AppBrandUIStandaloneTaskVisitReporter");
                            int i = xVar.f246080b;
                            if (i <= 0) {
                                i = 2;
                            }
                            ((C119157j) C119157j.f356862d).mo183871b(new C29630y(i), "AppBrandUIStandaloneTaskVisitReporter");
                            if (2 == i && (Y7 = xVar.f246079a.mo117109Y7()) != null) {
                                SwitchTaskStruct switchTaskStruct2 = new SwitchTaskStruct();
                                switchTaskStruct2.f236398d = 2;
                                switchTaskStruct2.f236399e = 2;
                                switchTaskStruct2.f236400f = switchTaskStruct2.mo86045b("ItemId", Y7.f239362d, true);
                                switchTaskStruct2.f236401g = switchTaskStruct2.mo86045b("ItemSessionId", Y7.f234837q, true);
                                switchTaskStruct2.mo86054n();
                                break;
                            }
                        }
                        break;
                }
            } else {
                xVar.f246080b = 3;
                AppBrandInitConfigWC Y73 = xVar.f246079a.mo117109Y7();
                if (Y73 != null) {
                    SwitchTaskStruct switchTaskStruct3 = new SwitchTaskStruct();
                    switchTaskStruct3.f236398d = 1;
                    switchTaskStruct3.f236399e = 2;
                    switchTaskStruct3.f236400f = switchTaskStruct3.mo86045b("ItemId", Y73.f239362d, true);
                    switchTaskStruct3.f236401g = switchTaskStruct3.mo86045b("ItemSessionId", Y73.f234837q, true);
                    switchTaskStruct3.mo86054n();
                }
            }
        }
        if (C112551y.m153819s(str2, "onCreate", false)) {
            C91456b.f262190a.mo125391b(365, appBrandUI.mo117074l8() ? 29 : 30);
        } else if (C87412m.m108589b(str2, "onDestroy")) {
            C91456b.f262190a.mo125391b(365, appBrandUI.mo117074l8() ? 26 : 27);
        }
        try {
            if (C87412m.m108589b("finish", str2)) {
                Log.m105924i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + appBrandUI.hashCode() + ' ' + appBrandUI.getLocalClassName() + " finish, stack:" + android.util.Log.getStackTraceString(new Throwable()));
                return;
            }
            Log.m105924i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + appBrandUI.hashCode() + ' ' + appBrandUI.getLocalClassName() + ' ' + str2);
        } catch (Throwable unused) {
            Log.m105924i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + appBrandUI.hashCode() + ' ' + appBrandUI.getClass().getSimpleName() + ' ' + str2);
        }
    }
}
