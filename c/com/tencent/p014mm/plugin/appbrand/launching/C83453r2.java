package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jp3.C9486a;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.r2 */
public class C83453r2<C extends AppBrandSysConfigLU> implements AppBrandPrepareTask.C83253c<C>, C9486a {

    /* renamed from: d */
    public AppBrandRuntime f243869d;

    /* renamed from: e */
    public volatile AppBrandPrepareTask.C83253c<C> f243870e;

    /* renamed from: f */
    public volatile boolean f243871f;

    public C83453r2(AppBrandRuntime appBrandRuntime, AppBrandPrepareTask.C83253c<C> cVar) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C87412m.m108594g(cVar, "referenced");
        this.f243869d = appBrandRuntime;
        Log.m105924i("MicroMsg.LaunchPrepareCallbackWrapper", "<init> hash=" + hashCode());
        appBrandRuntime.keep(this);
        this.f243870e = cVar;
    }

    /* renamed from: B */
    public void mo113268B() {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113268B();
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }

    /* renamed from: C */
    public void mo113269C(String str) {
        C87412m.m108594g(str, "migrateTargetAppId");
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113269C(str);
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }

    /* renamed from: I */
    public void mo113270I() {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113270I();
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }

    /* renamed from: J */
    public void mo113271J() {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113271J();
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }

    /* renamed from: K */
    public void mo113179K(int i) {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113179K(i);
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }

    /* renamed from: L */
    public void mo113272L() {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113272L();
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }

    /* renamed from: N */
    public void mo113273N(C c, AppBrandLaunchErrorAction appBrandLaunchErrorAction, AppStartupPerformanceReportBundle appStartupPerformanceReportBundle) {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113273N(c, appBrandLaunchErrorAction, appStartupPerformanceReportBundle);
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
            } else {
                throw th;
            }
        }
        if (!this.f243871f) {
            dead();
        }
    }

    /* renamed from: Q */
    public void mo113274Q(int i) {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113274Q(i);
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }

    /* renamed from: c */
    public void mo113275c(long j) {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113275c(j);
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }

    public void dead() {
        throw null;
    }

    /* renamed from: z */
    public void mo113276z() {
        try {
            AppBrandPrepareTask.C83253c<C> cVar = this.f243870e;
            if (cVar != null) {
                cVar.mo113276z();
            }
        } catch (Throwable th) {
            if (this.f243871f) {
                Log.m105928w("MicroMsg.LaunchPrepareCallbackWrapper", "tryOfThrows when dead, get exception: " + android.util.Log.getStackTraceString(th));
                return;
            }
            throw th;
        }
    }
}
