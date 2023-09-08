package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.RemoteException;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import u24.C90595a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.p2 */
public final class C84572p2 {

    /* renamed from: a */
    public static final C84572p2 f246773a = new C84572p2();

    /* renamed from: b */
    public static final Integer[] f246774b = {100, 200};

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.p2$a */
    public static final class C29670a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ Activity f80626d;

        public C29670a(Activity activity) {
            this.f80626d = activity;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            boolean z = true;
            if (iPCBoolean == null || !iPCBoolean.f10312d) {
                z = false;
            }
            if (z) {
                ((C119157j) C119157j.f356862d).mo183895z(new C29669o2(this.f80626d));
                return;
            }
            C84572p2.m104168b(this.f80626d);
        }
    }

    /* renamed from: b */
    public static final void m104168b(Activity activity) {
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo117255a(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.AppBrandUIAccountReleaseHandler", "handleAccountRelease activity:" + activity.getComponentName() + ", stack:" + android.util.Log.getStackTraceString(new Throwable()));
        try {
            runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (RemoteException unused) {
            runningAppProcessInfo = null;
        }
        if (runningAppProcessInfo == null || !C90595a.m113498b(f246774b, Integer.valueOf(runningAppProcessInfo.importance)) || activity.isFinishing() || activity.isDestroyed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("finish directly importance[");
            sb.append(runningAppProcessInfo != null ? runningAppProcessInfo.importance : -1);
            sb.append(']');
            Log.m105924i("MicroMsg.AppBrandUIAccountReleaseHandler", sb.toString());
            m104168b(activity);
            return;
        }
        C80907o.m98781d(MMApplicationContext.getMainProcessName(), IPCVoid.f10316d, C84590r4.class, new C29670a(activity));
    }
}
