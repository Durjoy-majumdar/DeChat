package p212oe;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashMap;

/* renamed from: oe.v$$g */
public class v$$g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public final /* synthetic */ C89205v f257043d;

    public v$$g(C89205v vVar) {
        this.f257043d = vVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        String apply = C89205v.f257038e.apply(activity);
        if (apply != null) {
            C89205v vVar = this.f257043d;
            vVar.f349668a.f339059f.post(new v$$c(vVar, apply));
        }
    }

    public void onActivityDestroyed(Activity activity) {
        String apply = C89205v.f257038e.apply(activity);
        if (apply != null) {
            C89205v vVar = this.f257043d;
            if (((HashMap) vVar.f257039b).containsKey(apply)) {
                vVar.f349668a.f339059f.post(new v$$a(vVar, apply));
            }
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
