package hu0;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import js0.C88015a;
import z04.C112551y;

/* renamed from: hu0.a */
public final class C87593a {

    /* renamed from: a */
    public static final C87593a f253677a = new C87593a();

    /* renamed from: b */
    public static final SparseArray<Activity> f253678b = new SparseArray<>();

    /* renamed from: hu0.a$a */
    public static final class C87594a extends C88015a {
        public void onActivityDestroyed(Activity activity) {
            int indexOfValue;
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            SparseArray<Activity> sparseArray = C87593a.f253678b;
            if (sparseArray.size() > 0 && (indexOfValue = sparseArray.indexOfValue(activity)) >= 0) {
                sparseArray.removeAt(indexOfValue);
            }
        }
    }

    static {
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        C87412m.m108592e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C87594a());
    }

    /* renamed from: a */
    public final Activity mo122047a(String str) {
        Activity activity;
        ComponentName componentName;
        String className;
        C87412m.m108594g(str, "invokeTicket");
        SparseArray<Activity> sparseArray = f253678b;
        int indexOfKey = sparseArray.indexOfKey(str.hashCode());
        if (indexOfKey >= 0) {
            activity = sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        } else {
            activity = null;
        }
        if (activity == null) {
            Log.m105920e("MicroMsg.WxaRedirectingPageExportApi.WXBizEntryActivityPendingMap", "finish with ticket:" + str + ", get null wxBizEntryActivity");
            return null;
        }
        ActivityManager.RunningTaskInfo currentTaskInfo = Util.getCurrentTaskInfo(activity, activity.getTaskId());
        boolean z = true;
        if (currentTaskInfo == null || (componentName = currentTaskInfo.baseActivity) == null || (className = componentName.getClassName()) == null || !C112551y.m153808h(className, "WXEntryActivity", false, 2, (Object) null)) {
            z = false;
        }
        if (z) {
            activity.finishAndRemoveTask();
            Log.m105924i("MicroMsg.WxaRedirectingPageExportApi.WXBizEntryActivityPendingMap", "finish with ticket:" + str + ", invoke finishAndRemoveTask(), wxBizEntryActivity:" + activity.hashCode());
        } else {
            activity.finish();
            Log.m105924i("MicroMsg.WxaRedirectingPageExportApi.WXBizEntryActivityPendingMap", "finish with ticket:" + str + ", invoke finish(), wxBizEntryActivity:" + activity.hashCode());
        }
        return activity;
    }
}
