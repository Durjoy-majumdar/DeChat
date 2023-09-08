package zp3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: zp3.j */
public final class C23553j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: zp3.j$a */
    public static final class C23554a implements Runnable {

        /* renamed from: d */
        public static final C23554a f67532d = new C23554a();

        public final void run() {
            if (!C23555k.f67539g) {
                C23555k.m28117b(C23555k.f67533a, "CHECK");
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C23555k.f67539g = false;
        C23564m.f67547a.post(C23554a.f67532d);
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
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
