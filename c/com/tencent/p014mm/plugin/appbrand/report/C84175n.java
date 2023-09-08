package com.tencent.p014mm.plugin.appbrand.report;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.report.n */
public final class C84175n implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public static final C84175n f245826d = new C84175n();

    /* renamed from: e */
    public static boolean f245827e;

    /* renamed from: f */
    public static final Map<FragmentActivity, AppBrandLauncherDesktopReporter> f245828f = new LinkedHashMap();

    /* renamed from: a */
    public final AppBrandLauncherDesktopReporter mo116851a(FragmentActivity fragmentActivity) {
        AppBrandLauncherDesktopReporter appBrandLauncherDesktopReporter;
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Map<FragmentActivity, AppBrandLauncherDesktopReporter> map = f245828f;
        synchronized (map) {
            if (!f245827e) {
                fragmentActivity.getApplication().registerActivityLifecycleCallbacks(this);
                f245827e = true;
            }
            appBrandLauncherDesktopReporter = (AppBrandLauncherDesktopReporter) ((LinkedHashMap) map).get(fragmentActivity);
            if (appBrandLauncherDesktopReporter == null) {
                appBrandLauncherDesktopReporter = new AppBrandLauncherDesktopReporter();
                map.put(fragmentActivity, appBrandLauncherDesktopReporter);
            }
        }
        return appBrandLauncherDesktopReporter;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Map<FragmentActivity, AppBrandLauncherDesktopReporter> map = f245828f;
        synchronized (map) {
            AppBrandLauncherDesktopReporter appBrandLauncherDesktopReporter = (AppBrandLauncherDesktopReporter) C24564k0.m30739c(map).remove(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
