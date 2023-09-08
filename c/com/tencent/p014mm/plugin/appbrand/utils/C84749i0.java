package com.tencent.p014mm.plugin.appbrand.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.i0 */
public class C84749i0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public final Queue<C84750a> f247162d = new LinkedList();

    /* renamed from: e */
    public int f247163e = 0;

    /* renamed from: f */
    public boolean f247164f = false;

    /* renamed from: g */
    public Application f247165g;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.i0$a */
    public interface C84750a {
        /* renamed from: a */
        void mo33476a(Context context);

        /* renamed from: b */
        void mo33477b(Context context);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.f247163e + 1;
        this.f247163e = i;
        if (i == 1) {
            Log.m105924i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.notifyOnActivityCreated ");
            for (C84750a b : this.f247162d) {
                b.mo33477b(activity);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Application application;
        int i = this.f247163e - 1;
        this.f247163e = i;
        if (i == 0) {
            Log.m105924i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.notifyOnNoActivityLeft ");
            for (C84750a a : this.f247162d) {
                a.mo33476a(activity);
            }
            if (this.f247164f && (application = this.f247165g) != null) {
                Log.m105924i("MicroMsg.AppSingletonRegistry", "AppSingletonRegistry.release ");
                application.unregisterActivityLifecycleCallbacks(this);
                ((LinkedList) this.f247162d).clear();
                this.f247164f = false;
                this.f247165g = null;
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
    }

    public void onActivityStopped(Activity activity) {
    }
}
