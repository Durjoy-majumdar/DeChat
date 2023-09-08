package p723vf;

import android.app.ActivityManager;
import android.os.Build;
import gy3.C87412m;

/* renamed from: vf.j */
public final class C90787j {
    /* renamed from: a */
    public static final String m113851a(ActivityManager.RecentTaskInfo recentTaskInfo) {
        C87412m.m108594g(recentTaskInfo, "$this$contentToString");
        if (Build.VERSION.SDK_INT >= 29) {
            String obj = recentTaskInfo.toString();
            C87412m.m108593f(obj, "this.toString()");
            return obj;
        }
        try {
            return "RecentTaskInfo{id=" + recentTaskInfo.id + " persistentId=" + recentTaskInfo.persistentId + " baseIntent=" + recentTaskInfo.baseIntent + " baseActivity=" + recentTaskInfo.baseActivity + " topActivity=" + recentTaskInfo.topActivity + " origActivity=" + recentTaskInfo.origActivity + " numActivities=" + recentTaskInfo.numActivities + "}";
        } catch (Throwable unused) {
            String obj2 = recentTaskInfo.toString();
            C87412m.m108593f(obj2, "this.toString()");
            return obj2;
        }
    }
}
