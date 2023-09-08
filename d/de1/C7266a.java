package de1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32228q;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: de1.a */
public final class C7266a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public final C32228q<Activity, Bundle, Boolean, C13598b0> f25327d;

    public C7266a(C32228q<? super Activity, ? super Bundle, ? super Boolean, C13598b0> qVar) {
        C87412m.m108594g(qVar, "callback");
        this.f25327d = qVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f25327d.invoke(activity, bundle, Boolean.TRUE);
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f25327d.invoke(activity, null, Boolean.FALSE);
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, "p0");
        C87412m.m108594g(bundle, "p1");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }
}
