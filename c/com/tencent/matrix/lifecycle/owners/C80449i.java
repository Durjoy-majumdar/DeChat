package com.tencent.matrix.lifecycle.owners;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.WeakHashMap;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.owners.i */
public final class C80449i implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ProcessUILifecycleOwner.f235399x.getClass();
        WeakHashMap<Activity, Object> weakHashMap = ProcessUILifecycleOwner.f235382g;
        boolean isEmpty = weakHashMap.isEmpty();
        C80447g gVar = new C80447g(activity);
        synchronized (weakHashMap) {
            gVar.invoke(weakHashMap);
        }
        if (isEmpty) {
            IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235388m;
            if (iForegroundStatefulOwner != null) {
                ((ProcessUILifecycleOwner.AsyncOwner) iForegroundStatefulOwner).turnOnAsync();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ProcessUILifecycleOwner.f235399x.getClass();
        WeakHashMap<Activity, Object> weakHashMap = ProcessUILifecycleOwner.f235382g;
        C80448h hVar = new C80448h(activity);
        synchronized (weakHashMap) {
            hVar.invoke(weakHashMap);
        }
        ProcessUILifecycleOwner.f235385j.put(activity, ProcessUILifecycleOwner.f235381f);
        if (ProcessUILifecycleOwner.f235384i.remove(activity) != null) {
            C118672d.m167356f("Matrix.ProcessLifecycle", "removed [" + activity + "] when destroy, maybe something wrong with onStart/onStop callback", new Object[0]);
        }
        if (ProcessUILifecycleOwner.f235383h.remove(activity) != null) {
            C118672d.m167356f("Matrix.ProcessLifecycle", "removed [" + activity + "] when destroy, maybe something wrong with onResume/onPause callback", new Object[0]);
        }
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ProcessUILifecycleOwner.f235399x.getClass();
        WeakHashMap<Activity, Object> weakHashMap = ProcessUILifecycleOwner.f235383h;
        weakHashMap.remove(activity);
        if (weakHashMap.isEmpty()) {
            ProcessUILifecycleOwner.f235380e.postDelayed(ProcessUILifecycleOwner.f235393r, 500);
        }
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ProcessUILifecycleOwner.f235399x.getClass();
        WeakHashMap<Activity, Object> weakHashMap = ProcessUILifecycleOwner.f235383h;
        boolean isEmpty = weakHashMap.isEmpty();
        weakHashMap.put(activity, ProcessUILifecycleOwner.f235381f);
        if (!isEmpty) {
            return;
        }
        if (ProcessUILifecycleOwner.f235386k) {
            IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235389n;
            if (iForegroundStatefulOwner != null) {
                ((ProcessUILifecycleOwner.AsyncOwner) iForegroundStatefulOwner).turnOnAsync();
                ProcessUILifecycleOwner.f235386k = false;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
        }
        ProcessUILifecycleOwner.f235380e.removeCallbacks(ProcessUILifecycleOwner.f235393r);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ProcessUILifecycleOwner processUILifecycleOwner = ProcessUILifecycleOwner.f235399x;
        String name = activity.getClass().getName();
        processUILifecycleOwner.getClass();
        ProcessUILifecycleOwner.C80437b bVar = ProcessUILifecycleOwner.f235391p;
        if (bVar != null) {
            try {
                ProcessUILifecycleOwner.f235380e.post(new C80450j(bVar, name));
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.ProcessLifecycle", th, "", new Object[0]);
            }
        }
        ProcessUILifecycleOwner.f235392q = name;
        ProcessUILifecycleOwner.f235399x.getClass();
        ProcessUILifecycleOwner.f235397v = activity.getClass().getName();
        WeakHashMap<Activity, Object> weakHashMap = ProcessUILifecycleOwner.f235384i;
        boolean isEmpty = weakHashMap.isEmpty();
        weakHashMap.put(activity, ProcessUILifecycleOwner.f235381f);
        if (isEmpty && ProcessUILifecycleOwner.f235387l) {
            IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235390o;
            if (iForegroundStatefulOwner != null) {
                ((ProcessUILifecycleOwner.AsyncOwner) iForegroundStatefulOwner).turnOnAsync();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
        }
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ProcessUILifecycleOwner processUILifecycleOwner = ProcessUILifecycleOwner.f235399x;
        processUILifecycleOwner.getClass();
        ProcessUILifecycleOwner.f235384i.remove(activity);
        processUILifecycleOwner.mo111926b();
    }
}
