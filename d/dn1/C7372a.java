package dn1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: dn1.a */
public class C7372a implements Application.ActivityLifecycleCallbacks {
    /* renamed from: a */
    public final boolean mo8543a(Context context, Context context2) {
        C87412m.m108594g(context, "c1");
        C87412m.m108594g(context2, "c2");
        return C87412m.m108589b(context, context2);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
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
