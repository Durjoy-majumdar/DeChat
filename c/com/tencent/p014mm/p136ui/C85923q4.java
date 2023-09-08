package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.WeakHashMap;
import p210o.C11323a;

/* renamed from: com.tencent.mm.ui.q4 */
public class C85923q4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public final /* synthetic */ C11323a f250283d;

    public C85923q4(C11323a aVar) {
        this.f250283d = aVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f250283d.apply(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        C85924r4 remove;
        WeakHashMap<Activity, C85924r4> weakHashMap = C85924r4.f250286e;
        synchronized (weakHashMap) {
            remove = weakHashMap.remove(activity);
        }
        if (remove != null) {
            synchronized (remove.f250288b) {
                ((HashSet) remove.f250288b).clear();
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
        this.f250283d.apply(activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
