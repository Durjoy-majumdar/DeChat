package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import com.tencent.p014mm.plugin.appbrand.C81970j;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.C83316f1;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83559g;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di0.C86299o;
import di0.C86300q;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import js0.C88024r;
import org.xwalk.core.XWalkEnvironment;
import p564iq.C87790d;
import sx3.C36907w;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.a */
public abstract class C83410a extends MutableContextWrapper {

    /* renamed from: i */
    public static final /* synthetic */ int f243759i = 0;

    /* renamed from: d */
    public volatile boolean f243760d = false;

    /* renamed from: e */
    public volatile boolean f243761e = false;

    /* renamed from: f */
    public boolean f243762f = true;

    /* renamed from: g */
    public final Queue<Runnable> f243763g = new ConcurrentLinkedQueue();

    /* renamed from: h */
    public LaunchParcel f243764h;

    public C83410a() {
        super(MMApplicationContext.getContext());
    }

    /* renamed from: a */
    public final boolean mo115706a() {
        Context baseContext = getBaseContext();
        if (!(baseContext instanceof AppBrandLaunchProxyUI)) {
            return false;
        }
        AppBrandLaunchProxyUI appBrandLaunchProxyUI = (AppBrandLaunchProxyUI) baseContext;
        return !appBrandLaunchProxyUI.isDestroyed() && !appBrandLaunchProxyUI.isFinishing();
    }

    /* renamed from: b */
    public final boolean mo115707b() {
        return mo115706a() && ((AppBrandLaunchProxyUI) getBaseContext()).isFinishing();
    }

    /* renamed from: d */
    public final void mo115708d() {
        this.f243760d = true;
        this.f243763g.clear();
        super.setBaseContext(MMApplicationContext.getContext());
    }

    /* renamed from: e */
    public void mo115709e(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        C86299o e;
        C86300q qVar;
        if (appBrandInitConfigWC != null) {
            C83440v.m102393a(mo115710f(), this.f243764h.f243745v, appBrandInitConfigWC, appBrandStatObject);
            Log.m105924i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "finish, after startAppOnInitConfigGot");
            C88024r.m109572b(new a$$a(appBrandInitConfigWC));
        } else {
            this.f243762f = true;
            LaunchParcel launchParcel = this.f243764h;
            if (!(launchParcel == null || (e = C83316f1.f243478a.mo115611e(launchParcel.f243721M)) == null || (qVar = e.f250916E) == null)) {
                qVar.mo63857e();
            }
        }
        if (this.f243762f) {
            mo115712h(new C83411b(this));
        }
        this.f243761e = true;
    }

    /* renamed from: f */
    public final Context mo115710f() {
        Context baseContext = getBaseContext();
        Context g = mo115711g();
        if (!(baseContext instanceof Activity) && g != null) {
            baseContext = g;
        }
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(baseContext);
        return (castActivityOrNull == null || castActivityOrNull.isFinishing()) ? MMApplicationContext.getContext() : baseContext;
    }

    /* renamed from: g */
    public Context mo115711g() {
        return null;
    }

    /* renamed from: h */
    public final void mo115712h(Runnable runnable) {
        if (runnable != null) {
            if (mo115706a()) {
                ((Activity) getBaseContext()).runOnUiThread(runnable);
            } else if (this.f243760d) {
                Log.m105921e("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "runOnUiEnv but destroyed, clear mUiEnvQueue, call stack = %s", android.util.Log.getStackTraceString(new Throwable()));
                this.f243763g.clear();
            } else {
                ((ConcurrentLinkedQueue) this.f243763g).offer(runnable);
            }
        }
    }

    /* renamed from: i */
    public boolean mo115713i(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        if (DebuggerShell.f239772d) {
            Log.m105924i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "shouldCheckTbsBeforeAppLaunch inMonkeyEnv");
            return true;
        }
        boolean z = false;
        boolean b = C83559g.m102556b(appBrandInitConfigWC, appBrandStatObject) | (AppBrandProcessesManager.m103869I().mo111384F(appBrandInitConfigWC.f239362d) || appBrandInitConfigWC.mo111300k());
        if (appBrandInitConfigWC.f239373d1) {
            String str = C81970j.f240372a;
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_android_appbrand_fakenative_check_xweb_required, C81970j.f240372a);
            C87412m.m108593f(Y60, "getService(IExptService:…required, DEFAULT_CONFIG)");
            List U = C112550d0.m153785U(Y60, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object next : U) {
                if (!(((String) next).length() == 0)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C112550d0.m153799i0((String) it.next()).toString());
            }
            if (arrayList2.contains(appBrandInitConfigWC.f239362d)) {
                b = false;
            }
        }
        if (!appBrandInitConfigWC.mo111300k() || ((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
            z = true;
        }
        return !(b & z);
    }

    public final void setBaseContext(Context context) {
        super.setBaseContext(context);
        if (!mo115706a()) {
            return;
        }
        if (this.f243760d) {
            this.f243763g.clear();
            return;
        }
        while (!((ConcurrentLinkedQueue) this.f243763g).isEmpty()) {
            if (!mo115706a()) {
                Log.m105920e("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "fileAllPendingUiTasks but !currentInUiEnv, return");
                this.f243763g.clear();
                return;
            }
            try {
                ((Runnable) ((ConcurrentLinkedQueue) this.f243763g).poll()).run();
            } catch (ClassCastException e) {
                if (e.getMessage().endsWith("cannot be cast to com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI")) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", e, "mUiEnvQueue.poll().run()", new Object[0]);
                    this.f243763g.clear();
                    return;
                }
                throw e;
            }
        }
    }
}
