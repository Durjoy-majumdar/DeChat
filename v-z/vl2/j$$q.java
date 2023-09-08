package vl2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;

public class j$$q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public final /* synthetic */ Activity f300975d;

    /* renamed from: f */
    public final /* synthetic */ C102212j f300976f;

    public j$$q(C102212j jVar, Activity activity) {
        this.f300976f = jVar;
        this.f300975d = activity;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f300975d == activity) {
            Log.m105925i("MicroMsg.QBarStringHandler", "onActivityDestroyed %s", activity.getLocalClassName());
            this.f300976f.mo141751o();
        }
    }

    public void onActivityPaused(Activity activity) {
        if (this.f300975d == activity) {
            Log.m105925i("MicroMsg.QBarStringHandler", "onActivityPaused %s", activity.getLocalClassName());
        }
    }

    public void onActivityResumed(Activity activity) {
        if (this.f300975d == activity) {
            Log.m105925i("MicroMsg.QBarStringHandler", "onActivityResumed %s", activity.getLocalClassName());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
