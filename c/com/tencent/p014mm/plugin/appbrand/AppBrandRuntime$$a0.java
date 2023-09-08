package com.tencent.p014mm.plugin.appbrand;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jp3.C9486a;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$a0 */
public class AppBrandRuntime$$a0 implements AppBrandRuntime$$y, C9486a {

    /* renamed from: d */
    public volatile boolean f238164d = false;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntime f238165e;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$a0$a */
    public class C81066a implements Runnable {

        /* renamed from: d */
        public final long f238166d = Util.currentTicks();

        public C81066a() {
        }

        public void run() {
            if (!AppBrandRuntime$$a0.this.f238164d) {
                AppBrandRuntime appBrandRuntime = AppBrandRuntime$$a0.this.f238165e;
                appBrandRuntime.f238131W0 = null;
                appBrandRuntime.mo113052e("RuntimePrepareAllDoneInitNotify run() waited %dms", Long.valueOf(Util.currentTicks() - this.f238166d));
                AppBrandRuntime$$a0 appBrandRuntime$$a0 = AppBrandRuntime$$a0.this;
                appBrandRuntime$$a0.getClass();
                try {
                    AppBrandRuntime appBrandRuntime2 = appBrandRuntime$$a0.f238165e;
                    appBrandRuntime2.f238144g.dump(appBrandRuntime2.f238145h, "AppBrandRuntimeProfile|dump mUiHandler");
                } catch (Throwable th) {
                    Log.m105921e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "dumpUiThreadInQueueMessages get exception:%s", th);
                }
                AppBrandRuntime appBrandRuntime3 = AppBrandRuntime$$a0.this.f238165e;
                if (!appBrandRuntime3.mo113064k0()) {
                    if (appBrandRuntime3.f238116N) {
                        Log.m105921e("MicroMsg.AppBrandRuntime", "initRuntime, mInitialized TRUE !!!  go check callee %s", Util.stackTraceToString(new Throwable()));
                        return;
                    }
                    appBrandRuntime3.mo113052e("initRuntime", new Object[0]);
                    new C85040y(appBrandRuntime3).run();
                    return;
                }
                return;
            }
            Log.m105921e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "PrepareAllDoneInitNotify.done() hash[%d] check2 dead appId[%s]", Integer.valueOf(hashCode()), AppBrandRuntime$$a0.this.f238165e.f238147j);
        }
    }

    public AppBrandRuntime$$a0(AppBrandRuntime appBrandRuntime, AppBrandRuntime$$h appBrandRuntime$$h) {
        this.f238165e = appBrandRuntime;
        Log.m105925i("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "<init> appId[%s] hash[%d]", appBrandRuntime.f238147j, Integer.valueOf(hashCode()));
        appBrandRuntime.keep(this);
    }

    /* renamed from: a */
    public void mo113094a() {
        if (!this.f238164d) {
            this.f238165e.mo113052e("RuntimePrepareAllDoneInitNotify enqueue", new Object[0]);
            C81066a aVar = new C81066a();
            try {
                AppBrandRuntime appBrandRuntime = this.f238165e;
                appBrandRuntime.f238144g.dump(appBrandRuntime.f238145h, "AppBrandRuntimeProfile|dump mUiHandler");
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "dumpUiThreadInQueueMessages get exception:%s", th);
            }
            Log.m105924i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|dump main thread stacktrace tid  " + Looper.getMainLooper().getThread().getId());
            for (StackTraceElement stackTraceElement : Looper.getMainLooper().getThread().getStackTrace()) {
                ((AppBrandRuntime$$a) this.f238165e.f238145h).println("AppBrandRuntimeProfile|dump main thread stacktrace    " + stackTraceElement.toString());
            }
            this.f238165e.f238144g.postAtFrontOfQueue(aVar);
            this.f238165e.mo1963B7(this);
            return;
        }
        Log.m105921e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "PrepareAllDoneInitNotify.done() hash[%d] check1 dead appId[%s]", Integer.valueOf(hashCode()), this.f238165e.f238147j);
    }

    public void dead() {
        this.f238164d = true;
    }
}
