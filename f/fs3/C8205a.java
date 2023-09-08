package fs3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: fs3.a */
public final class C8205a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public final LinkedList<String> f27134d = new LinkedList<>();

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r3 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0025 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9251a(android.app.Activity r3, java.lang.String r4) {
        /*
            r2 = this;
            java.util.LinkedList<java.lang.String> r0 = r2.f27134d
            monitor-enter(r0)
            java.lang.String r3 = r2.mo9252b(r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            java.util.LinkedList<java.lang.String> r4 = r2.f27134d     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            int r4 = r4.size()     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            r1 = 10
            if (r4 < r1) goto L_0x001d
            java.util.LinkedList<java.lang.String> r4 = r2.f27134d     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            r1 = 0
            r4.remove(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            java.util.LinkedList<java.lang.String> r4 = r2.f27134d     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            r4.add(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            goto L_0x0027
        L_0x001d:
            java.util.LinkedList<java.lang.String> r4 = r2.f27134d     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            r4.add(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0025 }
            goto L_0x0027
        L_0x0023:
            r3 = move-exception
            goto L_0x0029
        L_0x0025:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0023 }
        L_0x0027:
            monitor-exit(r0)
            return
        L_0x0029:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fs3.C8205a.mo9251a(android.app.Activity, java.lang.String):void");
    }

    /* renamed from: b */
    public final String mo9252b(Activity activity, String str) {
        return activity.getClass().getSimpleName() + '_' + str;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        mo9251a(activity, "Create");
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        mo9251a(activity, "Destroy");
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
