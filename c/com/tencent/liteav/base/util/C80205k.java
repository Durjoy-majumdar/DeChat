package com.tencent.liteav.base.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.base.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.tencent.liteav.base.util.k */
public final class C80205k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public volatile boolean f234754a;

    /* renamed from: b */
    private final Set<Integer> f234755b = new HashSet();

    /* renamed from: c */
    private final Set<Integer> f234756c = new HashSet();

    public C80205k(Context context) {
        if (context == null) {
            Log.m97546e("ProcessLifecycleOwner", "ProcessStateOwner init failed. Context is null", new Object[0]);
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        this.f234754a = m97556a(context);
    }

    /* renamed from: a */
    private static boolean m97556a(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager == null) {
                Log.m97546e("ProcessLifecycleOwner", "activityManager is null.", new Object[0]);
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                Log.m97546e("ProcessLifecycleOwner", "processInfoList is null.", new Object[0]);
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.importance == 100 && context.getPackageName().equals(next.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            Log.m97546e("ProcessLifecycleOwner", "Get App background state failed. ".concat(String.valueOf(e)), new Object[0]);
            return false;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.f234756c.add(Integer.valueOf(activity.hashCode()));
    }

    public final void onActivityResumed(Activity activity) {
        m97555a(activity.hashCode());
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m97555a(activity.hashCode());
    }

    public final void onActivityStopped(Activity activity) {
        int hashCode = activity.hashCode();
        boolean z = true;
        if (this.f234755b.contains(Integer.valueOf(hashCode))) {
            this.f234755b.remove(Integer.valueOf(hashCode));
            if (this.f234755b.size() != 0) {
                z = false;
            }
            this.f234754a = z;
        } else if (this.f234755b.size() != 0) {
            this.f234754a = false;
        } else if (this.f234756c.contains(Integer.valueOf(hashCode))) {
            this.f234754a = true;
        }
        this.f234756c.remove(Integer.valueOf(hashCode));
    }

    /* renamed from: a */
    private void m97555a(int i) {
        this.f234755b.add(Integer.valueOf(i));
        this.f234754a = false;
    }
}
