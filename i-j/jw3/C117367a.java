package jw3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: jw3.a */
public abstract class C117367a implements Application.ActivityLifecycleCallbacks {
    /* renamed from: a */
    public abstract void mo181966a(Activity activity, String str);

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        mo181966a(activity, "onActivityPaused");
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
