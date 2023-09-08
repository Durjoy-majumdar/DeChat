package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.os.Bundle;
import bm3.C0329a;
import com.tencent.p014mm.app.C114657b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.l2 */
public final class C2009l2 implements C114657b1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.l2$a */
    public static final class C2010a implements Runnable {

        /* renamed from: d */
        public static final C2010a f11952d = new C2010a();

        public final void run() {
            ConcurrentHashMap<String, C32224a<C13598b0>> concurrentHashMap = C2031z2.f11979a;
            for (Map.Entry<String, C32224a<C13598b0>> value : C2031z2.f11979a.entrySet()) {
                ((C32224a) value.getValue()).invoke();
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public /* synthetic */ void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    public /* synthetic */ void onActivityPostDestroyed(Activity activity) {
    }

    public /* synthetic */ void onActivityPostPaused(Activity activity) {
    }

    public /* synthetic */ void onActivityPostResumed(Activity activity) {
    }

    public /* synthetic */ void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityPostStarted(Activity activity) {
        Activity j;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (C86709a0.m107522a()) {
            ConcurrentHashMap<String, C32224a<C13598b0>> concurrentHashMap = C2031z2.f11979a;
            if (C2031z2.f11979a.size() > 0) {
                C0329a aVar = (C0329a) C86709a0.m107533q(C0329a.class);
                boolean z = false;
                if (!(aVar == null || (j = aVar.mo372j()) == null || activity.getTaskId() != j.getTaskId())) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackGuardLogic", "onActivityPostStarted " + activity + ", invoke onMMTaskToFront");
                    ((C119157j) C119157j.f356862d).mo183870a(C2010a.f11952d);
                }
            }
        }
    }

    public /* synthetic */ void onActivityPostStopped(Activity activity) {
    }

    public /* synthetic */ void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    public /* synthetic */ void onActivityPreDestroyed(Activity activity) {
    }

    public /* synthetic */ void onActivityPrePaused(Activity activity) {
    }

    public /* synthetic */ void onActivityPreResumed(Activity activity) {
    }

    public /* synthetic */ void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public /* synthetic */ void onActivityPreStarted(Activity activity) {
    }

    public /* synthetic */ void onActivityPreStopped(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, "p0");
        C87412m.m108594g(bundle, "p1");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }
}
