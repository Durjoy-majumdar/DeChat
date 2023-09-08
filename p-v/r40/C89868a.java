package r40;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: r40.a */
public class C89868a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public static final WeakHashMap<Activity, Integer> f258305d = new WeakHashMap<>();

    /* renamed from: a */
    public static String m112382a() {
        String sb;
        WeakHashMap<Activity, Integer> weakHashMap = f258305d;
        synchronized (weakHashMap) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(weakHashMap.size());
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.addAll(weakHashMap.keySet());
            } catch (ConcurrentModificationException unused) {
                Log.m105928w("MicroMsg.ActivityRefDump", "ConcurrentModificationException occur.");
                sb4.append("concurrent modification exception");
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) it.next();
                if (activity != null) {
                    sb4.append("|");
                    sb4.append(activity.getClass().getSimpleName());
                    sb4.append("@");
                    sb4.append(activity.hashCode());
                    sb4.append(XVFSFile.PATH_SEPARATOR);
                    sb4.append(f258305d.get(activity));
                }
            }
            sb = sb4.toString();
        }
        return sb;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        WeakHashMap<Activity, Integer> weakHashMap = f258305d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 0);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        WeakHashMap<Activity, Integer> weakHashMap = f258305d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 5);
        }
    }

    public void onActivityPaused(Activity activity) {
        WeakHashMap<Activity, Integer> weakHashMap = f258305d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 3);
        }
    }

    public void onActivityResumed(Activity activity) {
        WeakHashMap<Activity, Integer> weakHashMap = f258305d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 2);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        WeakHashMap<Activity, Integer> weakHashMap = f258305d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 1);
        }
    }

    public void onActivityStopped(Activity activity) {
        WeakHashMap<Activity, Integer> weakHashMap = f258305d;
        synchronized (weakHashMap) {
            weakHashMap.put(activity, 4);
        }
    }
}
