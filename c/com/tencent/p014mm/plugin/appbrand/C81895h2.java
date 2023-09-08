package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask$$e;
import com.tencent.p014mm.plugin.appbrand.launching.C83316f1;
import com.tencent.p014mm.plugin.appbrand.launching.C83323g;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84128k0;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import di0.C86299o;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kr0.C76628m0;
import org.json.JSONObject;
import p963fc.C86811f;
import p963fc.C86812g;
import sx3.C110823p;

/* renamed from: com.tencent.mm.plugin.appbrand.h2 */
public final class C81895h2 extends C86811f implements C76628m0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.h2$a */
    public static final class C81896a extends C80401d {

        /* renamed from: com.tencent.mm.plugin.appbrand.h2$a$a */
        public /* synthetic */ class C81897a implements Runnable {
            public C81897a() {
            }

            public final void run() {
                C81896a.this.getClass();
                ConcurrentHashMap<String, AppBrandRuntimeWC> concurrentHashMap = C84803v.f247240a;
                if (!concurrentHashMap.isEmpty()) {
                    Log.m105924i("MicroMsg.AppBrandRuntimeWidgetImpl", "doRecycleStashedRuntimes for mm process");
                    C81882g2 g2Var = C81882g2.f240175d;
                    C87412m.m108594g(g2Var, "block");
                    for (AppBrandRuntimeWC appBrandRuntimeWC : new LinkedList(concurrentHashMap.values())) {
                        C87412m.m108593f(appBrandRuntimeWC, LocaleUtil.ITALIAN);
                        g2Var.invoke(appBrandRuntimeWC);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo17850a() {
            C2039g2.m1988b(new C81897a());
        }

        /* renamed from: b */
        public void mo17851b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.h2$b */
    public static final class C81898b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86812g f240226d;

        /* renamed from: e */
        public final /* synthetic */ String f240227e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f240228f;

        public C81898b(C86812g gVar, String str, JSONObject jSONObject) {
            this.f240226d = gVar;
            this.f240227e = str;
            this.f240228f = jSONObject;
        }

        public final void run() {
            C81925i2 b0 = this.f240226d.mo113047b0();
            if (b0 != null) {
                String str = this.f240227e;
                JSONObject jSONObject = this.f240228f;
                b0.mo109652f(str, jSONObject != null ? jSONObject.toString() : null, 0);
            }
            if ((BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) && C110823p.m151009y(new String[]{"onRequestStatusEmojiPanelDismiss", "onRequestStatusEmojiPanelShow", "onPostTextStatus"}, this.f240227e)) {
                Log.m105924i("MicroMsg.AppBrandRuntimeWidgetImpl", "dispatchJsEvent(" + this.f240227e + ')');
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.h2$c */
    public static final class C81899c implements AppBrandPreInitTask$$e {

        /* renamed from: a */
        public final /* synthetic */ LaunchParcel f240229a;

        /* renamed from: b */
        public final /* synthetic */ C81895h2 f240230b;

        public C81899c(LaunchParcel launchParcel, C81895h2 h2Var) {
            this.f240229a = launchParcel;
            this.f240230b = h2Var;
        }

        /* renamed from: a */
        public final void mo114042a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWidgetImpl", "run()-OnPreLaunchResultListener.onResult, config:" + appBrandInitConfigWC);
            if (appBrandInitConfigWC != null) {
                this.f240229a.mo115681b(appBrandInitConfigWC);
                LaunchParcel launchParcel = this.f240229a;
                appBrandInitConfigWC.f234807K = launchParcel.f243743t;
                appBrandInitConfigWC.f234809M = launchParcel.f243744u;
                appBrandInitConfigWC.f239384o1 = launchParcel.f243712D;
                appBrandInitConfigWC.f239390u1 = launchParcel.f243719K;
                LaunchParamsOptional launchParamsOptional = launchParcel.f243740q;
                appBrandInitConfigWC.f234819T0 = launchParamsOptional != null ? launchParamsOptional.f237922h : 0;
                appBrandInitConfigWC.f234799C = launchParamsOptional != null ? launchParamsOptional.f237923i : null;
                C83323g.m102275a(appBrandInitConfigWC, appBrandStatObject);
                C81895h2 h2Var = this.f240230b;
                h2Var.getClass();
                appBrandInitConfigWC.f234834c1 = appBrandStatObject;
                h2Var.mo113121c((AppBrandRuntime) null, appBrandInitConfigWC);
            }
        }
    }

    static {
        if (MMApplicationContext.isMainProcess()) {
            C81896a aVar = new C81896a();
            AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) aVar);
            AppDeepBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) aVar);
            ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81895h2(Context context) {
        super(context instanceof C84543i2 ? (C84543i2) context : C84543i2.m104128b(context), AppBrandRuntimeWC.class);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: S */
    public void mo114191S(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, AppBrandInitConfig appBrandInitConfig) {
        C86812g gVar = (C86812g) appBrandRuntime;
        C86812g gVar2 = (C86812g) appBrandRuntime2;
        C87412m.m108594g(gVar2, "rt");
        C87412m.m108594g(appBrandInitConfig, "config");
        if (gVar2.f238116N) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWidgetImpl", "loadNew(), runtime[" + gVar2.f238147j + "] initialized, should be persistent, use loadExisted() instead");
            mo114190J(gVar, gVar2, appBrandInitConfig);
            if (C87412m.m108589b(gVar2.f238142e, this)) {
                C84128k0.f245602a.mo116795e((AppBrandInitConfigWC) appBrandInitConfig);
            }
            if (this.f240043e) {
                gVar2.mo113000A();
                return;
            }
            return;
        }
        super.mo114191S(gVar, gVar2, appBrandInitConfig);
        if (C87412m.m108589b(gVar2.f238142e, this)) {
            C84128k0.f245602a.mo116793c((AppBrandInitConfigWC) appBrandInitConfig);
        }
    }

    /* renamed from: g0 */
    public void mo114293g0() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f240048j);
        linkedList.addAll(((HashMap) this.f240049n).values());
        Iterator it = linkedList.iterator();
        C87412m.m108593f(it, "traverseAll()");
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            C86812g gVar = (C86812g) it.next();
            C87412m.m108593f(gVar, "rt");
            if (C83601m.m102633a(this, gVar) && gVar.f238116N && !gVar.mo113064k0() && !gVar.f238117P) {
                Class<?>[] clsArr = AppBrandRuntimeContainerWC.f238235w;
                C87412m.m108593f(clsArr, "EXCLUDE_PERSISTENT_RUNTIME_CLASS");
                if (!C110823p.m151009y(clsArr, gVar.getClass())) {
                    AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
                    ViewParent parent = appBrandRuntimeWC.f238153r.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(appBrandRuntimeWC.f238153r);
                    }
                    mo114193c0(gVar);
                    appBrandRuntimeWC.mo113196a2(false);
                    appBrandRuntimeWC.mo113206i2(AppBrandRuntimeWC$$z.Stash);
                    if (!AppExplicitBackgroundOwner.INSTANCE.isBackground() && !AppDeepBackgroundOwner.INSTANCE.isBackground() && !ProcessExplicitBackgroundOwner.INSTANCE.isBackground()) {
                        z = false;
                    }
                    if (!z || !MMApplicationContext.isMainProcess()) {
                        C84803v.m104484b(appBrandRuntimeWC);
                    } else {
                        appBrandRuntimeWC.mo113175G1();
                    }
                }
            }
        }
        Log.m105925i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchPause tid[%d], mDestroyed[%b]", Long.valueOf(Thread.currentThread().getId()), Boolean.valueOf(this.f240044f));
        this.f240043e = false;
        this.f240044f = true;
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAll(this.f240048j);
        linkedList2.addAll(((HashMap) this.f240049n).values());
        mo114202y();
        Iterator it4 = linkedList2.iterator();
        while (it4.hasNext()) {
            AppBrandRuntime appBrandRuntime = (AppBrandRuntime) it4.next();
            appBrandRuntime.f238136Z = false;
            mo113134k(appBrandRuntime);
        }
        Log.m105924i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "performDestroy done");
    }

    public View getView() {
        return this;
    }

    /* renamed from: h0 */
    public void mo114295h0(String str, JSONObject jSONObject) {
        if (str != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(this.f240048j);
            linkedList.addAll(((HashMap) this.f240049n).values());
            Iterator it = linkedList.iterator();
            C87412m.m108593f(it, "traverseAll()");
            while (it.hasNext()) {
                C86812g gVar = (C86812g) it.next();
                gVar.mo113020N0(new C81898b(gVar, str, jSONObject));
            }
        }
    }

    /* renamed from: i0 */
    public void mo114296i0(C86299o oVar) {
        C87412m.m108594g(oVar, "bundle");
        C83316f1 f1Var = C83316f1.f243478a;
        if (f1Var.mo115610d()) {
            oVar.f250931c = 2;
        }
        LaunchParcel f = f1Var.mo115612f(oVar);
        AppBrandPreInitTask appBrandPreInitTask = new AppBrandPreInitTask(getContext(), f, false, new C81899c(f, this));
        appBrandPreInitTask.f243145o = true;
        appBrandPreInitTask.mo115494v();
    }

    /* renamed from: l */
    public Context mo113150l() {
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandRuntimePersistentContextWrapper");
        return C84543i2.m104128b(((C84543i2) context).getBaseContext());
    }

    public String toString() {
        Object castActivityOrNull = AndroidContextUtil.castActivityOrNull(getContext());
        if (castActivityOrNull == null) {
            castActivityOrNull = getContext();
        }
        return "AppBrandRuntimeWidgetImpl@" + hashCode() + '(' + castActivityOrNull + ')';
    }

    /* renamed from: x */
    public AppBrandRuntime mo114201x(AppBrandInitConfig appBrandInitConfig) {
        C87412m.m108594g(appBrandInitConfig, "cfg");
        AppBrandRuntimeWC a = C84803v.m104483a((AppBrandInitConfigWC) appBrandInitConfig, this);
        return a != null ? a : (C86812g) super.mo114201x(appBrandInitConfig);
    }
}
