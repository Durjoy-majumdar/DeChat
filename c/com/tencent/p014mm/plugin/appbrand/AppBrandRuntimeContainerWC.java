package com.tencent.p014mm.plugin.appbrand;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import b34.C79664a;
import br0.C79774c;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandCloseReasonStruct;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83588k;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPluginUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84570o4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84674s4;
import com.tencent.p014mm.plugin.appbrand.report.C84128k0;
import com.tencent.p014mm.plugin.appbrand.report.model.C84174u;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84180a;
import com.tencent.p014mm.plugin.appbrand.task.C84275c0;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.plugin.appbrand.widget.C68730o;
import com.tencent.p014mm.plugin.appbrand.widget.C68731p;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import nj0.C34855o;
import nj0.C88983w;
import nj3.C88990b;
import p170ic.C87690d;
import p224ra.C89909e;
import p849e3.C107168a0;
import p849e3.C107207u;
import p912nb.C88909b;
import p963fc.C86809e;
import p963fc.C86812g;
import st0.C90358a;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC */
public class AppBrandRuntimeContainerWC extends C86809e {

    /* renamed from: w */
    public static final Class<?>[] f238235w = {C83588k.class};

    /* renamed from: v */
    public boolean f238236v = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$a */
    public class C81080a implements View.OnSystemUiVisibilityChangeListener {
        public C81080a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            Activity w;
            FrameLayout frameLayout = AppBrandRuntimeContainerWC.this.f238204i;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(frameLayout) && (w = AppBrandRuntimeContainerWC.this.mo120548w()) != null && w.getWindow() != null) {
                C85875k4.m106173b0(w.getWindow(), !C74933u4.m89770g(w.getWindow().getNavigationBarColor()));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$b */
    public class C81081b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f238238d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandRuntime f238239e;

        /* renamed from: f */
        public final /* synthetic */ AppBrandRuntime f238240f;

        /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$b$a */
        public class C81082a implements Runnable {
            public C81082a() {
            }

            public void run() {
                C81081b.this.f238238d.run();
                if (AppBrandRuntimeContainerWC.this.getActiveRuntime() != null && !AppBrandRuntimeWCAccessible.isGame(AppBrandRuntimeContainerWC.this.getActiveRuntime())) {
                    AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = AppBrandRuntimeContainerWC.this;
                    Class<?>[] clsArr = AppBrandRuntimeContainerWC.f238235w;
                    if (appBrandRuntimeContainerWC.f250648d instanceof AppBrandPluginUI) {
                        C88990b.m111194c(appBrandRuntimeContainerWC.mo120548w(), (C88990b.C61771c) null);
                        Log.m105924i("MicroMsg.AppBrandRuntimeContainerWC", "reset convertActivityToTranslucent");
                    }
                }
            }
        }

        public C81081b(Runnable runnable, AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2) {
            this.f238238d = runnable;
            this.f238239e = appBrandRuntime;
            this.f238240f = appBrandRuntime2;
        }

        public void run() {
            AppBrandRuntimeContainerWC.super.mo113125e0(this.f238239e, this.f238240f, new C81082a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$c */
    public class C81083c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Configuration f238243d;

        public C81083c(Configuration configuration) {
            this.f238243d = configuration;
        }

        public void run() {
            AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = AppBrandRuntimeContainerWC.this;
            Configuration configuration = this.f238243d;
            Class<?>[] clsArr = AppBrandRuntimeContainerWC.f238235w;
            appBrandRuntimeContainerWC.mo113159u0(configuration);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$d */
    public enum C81084d {
        Finish,
        OnDestroy
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.g r0 = com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83559g.f244110a
            java.util.Set<com.tencent.mm.plugin.appbrand.f2> r1 = com.tencent.p014mm.plugin.appbrand.C81831f2.C81832a.f240098a
            monitor-enter(r1)
            r2 = r1
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x0017 }
            r2.add(r0)     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k> r2 = com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83588k.class
            r0[r1] = r2
            f238235w = r0
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC.<clinit>():void");
    }

    public AppBrandRuntimeContainerWC(C84275c0 c0Var) {
        super(c0Var, AppBrandRuntimeWC.class);
        boolean z = false;
        try {
            z = ((Boolean) C79664a.m96761i(C79664a.m96762j("android.view.WindowManagerGlobal").mo109789b("getWindowManagerService", new Object[0]).f233575b).mo109789b("hasNavigationBar", new Object[0]).f233575b).booleanValue();
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.AppBrandFixInputIssuesActivityHelper", "checkDeviceHasNavigationBar2 e=%s", th);
        }
        if (z) {
            Activity w = mo120548w();
            View decorView = mo120548w().getWindow().getDecorView();
            int i = C68731p.f197406e;
            if (!(decorView == null || w == null)) {
                C68731p pVar = new C68731p();
                View decorView2 = w.getWindow().getDecorView();
                decorView.setBackground(pVar);
                C68730o oVar = new C68730o(pVar, decorView2);
                if (decorView2 == decorView) {
                    C85924r4.m106238c(w, true).mo119830a(oVar);
                } else {
                    decorView.setOnApplyWindowInsetsListener(oVar);
                }
                pVar.f197410d = w.getWindow().getNavigationBarColor();
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f238204i.setOnSystemUiVisibilityChangeListener(new C81080a());
        }
    }

    /* renamed from: J */
    public AppBrandRuntime mo113116J(AppBrandInitConfig appBrandInitConfig) {
        return (C86812g) C87690d.m109090a("AppBrandRuntimeProfile|createRuntime-" + appBrandInitConfig.f239362d, new C81972j1(this, appBrandInitConfig));
    }

    /* renamed from: TE */
    public void mo109905TE(int i, AppBrandRuntime appBrandRuntime) {
        super.mo109905TE(i, appBrandRuntime);
        if (((AppBrandRuntimeWC) appBrandRuntime).mo113210l1().f234815R0.mo76931c()) {
            try {
                if (mo113136o(appBrandRuntime) == null) {
                    C88990b.m111194c(mo120548w(), (C88990b.C61771c) null);
                }
            } catch (IllegalAccessError unused) {
            }
        } else if (mo120548w() instanceof AppBrandPluginUI) {
            C88990b.m111193b(mo120548w());
        }
    }

    /* renamed from: V */
    public boolean mo113119V(AppBrandRuntime appBrandRuntime) {
        C86812g gVar = (C86812g) appBrandRuntime;
        C86812g gVar2 = (C86812g) getActiveRuntime();
        if (gVar2 instanceof AppBrandRuntimeWC) {
            HalfScreenConfig halfScreenConfig = ((AppBrandRuntimeWC) gVar2).mo113210l1().f234815R0;
            return halfScreenConfig.mo76931c() && halfScreenConfig.f157932C == HalfScreenConfig.C55455e.EMBED;
        }
    }

    /* renamed from: b0 */
    public void mo113120b0(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, AppBrandInitConfig appBrandInitConfig) {
        C86812g gVar = (C86812g) appBrandRuntime;
        C86812g gVar2 = (C86812g) appBrandRuntime2;
        if (gVar != null) {
            C83231l.m102146g(gVar.f238147j, C83231l.C83235e.LAUNCH_MINI_PROGRAM);
        }
        if (AppBrandRuntimeWCAccessible.m99326b(appBrandInitConfig)) {
            mo113153p0();
        }
        mo113156s0(appBrandInitConfig);
        int indexOf = new LinkedList(this.f238205j).indexOf(gVar2);
        if (indexOf > 0) {
            LinkedList linkedList = new LinkedList();
            ListIterator listIterator = new LinkedList(this.f238205j).listIterator(indexOf);
            while (listIterator.hasPrevious()) {
                C86812g gVar3 = (C86812g) listIterator.previous();
                if (!(gVar3 == gVar2 || gVar3 == gVar || !AppBrandRuntimeWCAccessible.m99328d(gVar3))) {
                    linkedList.add(gVar3);
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                AppBrandRuntime appBrandRuntime3 = (AppBrandRuntime) it.next();
                appBrandRuntime3.f238136Z = false;
                mo113137q(appBrandRuntime3);
                mo113134k(appBrandRuntime3);
            }
        }
        super.mo113120b0(gVar, gVar2, appBrandInitConfig);
        if (gVar2.f238142e == this) {
            C84128k0.f245602a.mo116795e((AppBrandInitConfigWC) appBrandInitConfig);
        }
        if (gVar != null) {
            ((C84674s4) C89909e.m112436a(C84674s4.class)).al0(gVar2, new C83193k1(this, gVar2), gVar, (Runnable) null);
        }
    }

    /* renamed from: c0 */
    public void mo113122c0(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, AppBrandInitConfig appBrandInitConfig) {
        C86812g gVar = (C86812g) appBrandRuntime;
        C86812g gVar2 = (C86812g) appBrandRuntime2;
        if (gVar != null) {
            C83231l.m102146g(gVar.f238147j, C83231l.C83235e.LAUNCH_MINI_PROGRAM);
        }
        if (gVar == null || !MiniProgramNavigatorUglyLogic.m101533a((AppBrandRuntimeWC) gVar, (AppBrandRuntimeWC) gVar2, (AppBrandInitConfigWC) appBrandInitConfig)) {
            if (AppBrandRuntimeWCAccessible.m99326b(appBrandInitConfig)) {
                mo113153p0();
            }
            mo113156s0(appBrandInitConfig);
            this.f238236v = true;
            if (AppBrandRuntimeWCAccessible.m99326b(appBrandInitConfig) && !C34855o.m40516a()) {
                AtomicBoolean atomicBoolean = C81682d.f239731a;
                Log.m105925i("MicroMsg.AppBrandBridge", "clearRunningGames(exclude:%s)", gVar2.f238147j);
                LinkedList<AppBrandRuntimeWC> linkedList = new LinkedList<>();
                LinkedHashMap<String, AppBrandRuntimeWC> linkedHashMap = C81682d.f239733c;
                synchronized (linkedHashMap) {
                    for (AppBrandRuntimeWC next : linkedHashMap.values()) {
                        if (!(next == null || !next.mo121254q1() || next == gVar2)) {
                            linkedList.add(next);
                        }
                    }
                }
                for (AppBrandRuntimeWC G1 : linkedList) {
                    G1.mo113175G1();
                }
            }
            if (gVar2.f238116N) {
                Log.m105925i("MicroMsg.AppBrandRuntimeContainerWC", "loadNew(), runtime[%s] initialized, should be persistent, use loadExisted() instead", gVar2.f238147j);
                super.mo113120b0(gVar, gVar2, appBrandInitConfig);
                if (C84905f.m104620a(gVar2)) {
                    Log.m105924i("MicroMsg.AppBrandRuntimeContainerWC", "[weishi] loadExisted, showSplash");
                    gVar2.mo113043Z0();
                    C84560k4 c0 = gVar2.mo113049c0();
                    C81894h1 h1Var = new C81894h1(this, gVar2);
                    if (c0 instanceof C84570o4) {
                        ((C84570o4) c0).mo117197e(h1Var);
                    } else if (c0 != null) {
                        c0.mo1911D(h1Var);
                    }
                }
                if (gVar2.f238142e == this) {
                    C84128k0.f245602a.mo116795e((AppBrandInitConfigWC) appBrandInitConfig);
                }
            } else {
                super.mo113122c0(gVar, gVar2, appBrandInitConfig);
                if (gVar2.f238142e == this) {
                    AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfig;
                    C84128k0.f245602a.mo116793c(appBrandInitConfigWC);
                    if (gVar != null) {
                        C83606m1.m102638b(1, appBrandInitConfigWC);
                    }
                }
            }
            this.f238236v = false;
            if (gVar != null) {
                ((C84674s4) C89909e.m112436a(C84674s4.class)).al0(gVar2, new C81924i1(this, gVar2), gVar, (Runnable) null);
            }
        }
    }

    /* renamed from: e0 */
    public void mo113125e0(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, Runnable runnable) {
        C81081b bVar = new C81081b(runnable, appBrandRuntime, appBrandRuntime2);
        if (!((AppBrandRuntimeWC) appBrandRuntime2).f238266B1.mo118003a(appBrandRuntime2, true, bVar)) {
            bVar.run();
        }
    }

    /* renamed from: l */
    public Context mo113150l() {
        return C84543i2.m104128b(mo120548w());
    }

    /* renamed from: m0 */
    public void mo113151m0(boolean z) {
        if (this.f238236v) {
            Log.m105925i("MicroMsg.AppBrandRuntimeContainerWC", "closeActivity(%b), mKeepActivityFrontOnce=TRUE", Boolean.valueOf(z));
            return;
        }
        AppBrandRuntime activeRuntime = getActiveRuntime();
        super.mo113151m0(z);
        if ((mo120548w() instanceof AppBrandPluginUI) && mo120548w().isFinishing()) {
            if (activeRuntime != null) {
                try {
                    if (!activeRuntime.mo113042Z().getCurrentPage().f244683H) {
                        return;
                    }
                } catch (NullPointerException e) {
                    Log.printErrStackTrace("MicroMsg.AppBrandRuntimeContainerWC", e, "closeActivity", new Object[0]);
                    return;
                }
            }
            mo120548w().overridePendingTransition(0, 0);
        }
    }

    /* renamed from: n0 */
    public boolean mo113152n0() {
        if (getStackSize() > 0) {
            return false;
        }
        mo113151m0(false);
        return true;
    }

    /* renamed from: p0 */
    public final void mo113153p0() {
        if ((mo120548w() instanceof AppBrandPluginUI) && ((Boolean) C88983w.f256575c.mo123353e()).booleanValue()) {
            C88990b.m111193b(mo120548w());
        }
    }

    /* renamed from: q0 */
    public void mo113154q0(WindowManager.LayoutParams layoutParams) {
        if (mo120548w() != null && mo120548w().getWindow() != null) {
            View decorView = mo120548w().getWindow().getDecorView();
            if ((decorView.getWindowSystemUiVisibility() & 2) == 0) {
                Drawable background = decorView.getBackground();
                if (background instanceof C68731p) {
                    C68731p pVar = (C68731p) background;
                    int navigationBarColor = mo120548w().getWindow().getNavigationBarColor();
                    boolean z = navigationBarColor != pVar.f197410d;
                    pVar.f197410d = navigationBarColor;
                    if (z) {
                        pVar.invalidateSelf();
                    }
                }
            }
        }
    }

    /* renamed from: r0 */
    public void mo113155r0(Configuration configuration) {
        mo113159u0(configuration);
        MMHandlerThread.postToMainThread(new C81083c(configuration));
        LinkedList<RUNTIME> linkedList = this.f238205j;
        if (linkedList != null) {
            Iterator<RUNTIME> it = linkedList.iterator();
            while (it.hasNext()) {
                ((AppBrandRuntime) it.next()).mo113077r0(configuration);
            }
        }
    }

    /* renamed from: s0 */
    public final void mo113156s0(AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig != null) {
            boolean z = (appBrandInitConfig instanceof AppBrandInitConfigLU) && ((AppBrandInitConfigLU) appBrandInitConfig).mo111300k();
            C84983t0 y = z ? C84983t0.m104783y(this.f238204i) : C88909b.m110989O(this.f238204i);
            if (y != null && (y.getParent() instanceof ViewGroup)) {
                y.mo117893z();
                ((ViewGroup) y.getParent()).removeView(y);
            }
            if (!z) {
                try {
                    Activity w = mo120548w();
                    Objects.requireNonNull(w);
                    w.getWindow().setSoftInputMode(16);
                    Activity w2 = mo120548w();
                    int i = C85004y.f247715r;
                    C90358a onLayoutListener = ((C85004y) w2.findViewById(C0966R.C0970id.f6025v7)).getOnLayoutListener();
                    if (onLayoutListener instanceof C84967l0) {
                        ((C84967l0) onLayoutListener).mo117848g(1);
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandRuntimeContainerWC", "removeUnmatchedSoftInputPanel, fix SoftInputMode for MiniProgram, get exception:%s", e);
                }
            }
        }
    }

    public void setWindowDescription(C79774c.C79775a aVar) {
        Activity w = mo120548w();
        if (w != null && (w instanceof AppBrandUI) && ((AppBrandUI) w).mo117074l8()) {
            super.setWindowDescription(aVar);
        }
    }

    /* renamed from: t0 */
    public void mo113157t0() {
        C84174u uVar;
        long j;
        Iterator it = new LinkedList(this.f238205j).iterator();
        while (it.hasNext()) {
            C86812g gVar = (C86812g) it.next();
            if ((gVar instanceof AppBrandRuntimeWC) && (uVar = ((AppBrandRuntimeWC) gVar).f238268D1) != null) {
                AppBrandCloseReasonStruct appBrandCloseReasonStruct = new AppBrandCloseReasonStruct();
                Long l = uVar.f245822a;
                appBrandCloseReasonStruct.f236339e = l != null ? l.longValue() : -1;
                appBrandCloseReasonStruct.f236338d = appBrandCloseReasonStruct.mo86045b("appId", uVar.f245823b, true);
                appBrandCloseReasonStruct.f236342h = appBrandCloseReasonStruct.mo86045b("flags", C84180a.f245866a.mo116874a(), true);
                appBrandCloseReasonStruct.f236341g = 2;
                appBrandCloseReasonStruct.f236343i = appBrandCloseReasonStruct.mo86045b("sessionId", uVar.f245824c, true);
                if (uVar.f245825d == null) {
                    j = 0;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    Long l2 = uVar.f245825d;
                    C87412m.m108591d(l2);
                    j = currentTimeMillis - l2.longValue();
                }
                appBrandCloseReasonStruct.f236340f = j;
                Log.m105919d("MicroMsg.kv_21804", "onFinishReport: process[%s]" + appBrandCloseReasonStruct.mo1006q(), MMApplicationContext.getProcessName());
                appBrandCloseReasonStruct.mo86054n();
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "AppBrandRuntimeContainerWC@%d(%s)", new Object[]{Integer.valueOf(hashCode()), mo120548w()});
    }

    /* renamed from: u0 */
    public final void mo113159u0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 29) {
            configuration.uiMode &= -49;
            if (!C85875k4.m106211z()) {
                configuration.uiMode |= 16;
            } else {
                configuration.uiMode |= 32;
            }
            MMApplicationContext.getContext().getResources().updateConfiguration(configuration, MMApplicationContext.getResources().getDisplayMetrics());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9 A[Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113160v0(com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC.C81084d r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = "stashPersistentRuntimesWhenActivityMayDestroy"
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r13.getActiveRuntime()
            fc.g r1 = (p963fc.C86812g) r1
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList<RUNTIME> r3 = r13.f238205j
            r2.addAll(r3)
            java.util.HashMap<java.lang.String, RUNTIME> r3 = r13.f238206n
            java.util.Collection r3 = r3.values()
            r2.addAll(r3)
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x0027
            return
        L_0x0027:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r13.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r14
            java.lang.String r6 = "MicroMsg.AppBrandRuntimeContainerWC"
            java.lang.String r7 = "stashPersistentRuntimesWhenActivityMayDestroy hash[%d], reason[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r3)
        L_0x0040:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x014d
            java.lang.Object r3 = r2.next()
            fc.g r3 = (p963fc.C86812g) r3
            boolean r7 = com.tencent.p014mm.plugin.appbrand.C83601m.m102633a(r13, r3)
            if (r7 != 0) goto L_0x0053
            goto L_0x0040
        L_0x0053:
            boolean r7 = r3.f238116N
            if (r7 == 0) goto L_0x0040
            boolean r7 = r3.mo113064k0()
            if (r7 != 0) goto L_0x0040
            boolean r7 = r3.f238117P
            if (r7 != 0) goto L_0x0040
            java.lang.Class<?>[] r7 = f238235w
            java.lang.Class r8 = r3.getClass()
            boolean r7 = u24.C90595a.m113498b(r7, r8)
            if (r7 != 0) goto L_0x0040
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$d r7 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC.C81084d.Finish
            if (r14 != r7) goto L_0x00fd
            if (r3 != r1) goto L_0x00fd
            wi0.z r7 = wi0.C91003z.DISABLED     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r8 = r3.mo113036W()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            wi0.z r8 = r8.mo111303p()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            if (r7 == r8) goto L_0x009f
            wi0.a0 r7 = wi0.C90973a0.TRANSPARENT     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r8 = r3.mo113036W()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            wi0.a0 r8 = r8.mo111304q()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            if (r7 == r8) goto L_0x009f
            cc.a r7 = r3.mo113042Z()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            com.tencent.mm.plugin.appbrand.page.i0 r7 = r7.getCurrentPage()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            boolean r7 = r7.f244683H     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            if (r7 != 0) goto L_0x009f
            if (r15 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r7 = 0
            goto L_0x00a0
        L_0x009f:
            r7 = 1
        L_0x00a0:
            if (r7 != 0) goto L_0x00fd
            android.graphics.Bitmap r7 = r3.mo121249e1()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            if (r7 == 0) goto L_0x00fd
            android.widget.FrameLayout r8 = new android.widget.FrameLayout     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.content.Context r9 = r13.f250648d     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            r8.<init>(r9)     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            r9 = 81
            com.tencent.mm.plugin.appbrand.widget.e r10 = r3.f238153r     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            if (r10 == 0) goto L_0x00c3
            com.tencent.mm.plugin.appbrand.widget.e r9 = r3.f238153r     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.widget.FrameLayout$LayoutParams r9 = (android.widget.FrameLayout.LayoutParams) r9     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            int r9 = r9.gravity     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
        L_0x00c3:
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            com.tencent.mm.plugin.appbrand.widget.e r11 = r3.f238153r     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            int r11 = r11.getWidth()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            com.tencent.mm.plugin.appbrand.widget.e r12 = r3.f238153r     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            int r12 = r12.getHeight()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            r10.<init>(r11, r12, r9)     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.graphics.drawable.BitmapDrawable r9 = new android.graphics.drawable.BitmapDrawable     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.content.Context r11 = r13.f250648d     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            r9.<init>(r11, r7)     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            r8.setBackground(r9)     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            r8.setWillNotDraw(r5)     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.widget.FrameLayout r7 = r13.f238204i     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            r7.addView(r8, r10)     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            android.widget.FrameLayout r7 = r13.f238204i     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            r7.bringChildToFront(r8)     // Catch:{ NullPointerException -> 0x00f7, OutOfMemoryError -> 0x00f0 }
            goto L_0x00fd
        L_0x00f0:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r7, r0, r8)
            goto L_0x00fd
        L_0x00f7:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r7, r0, r8)
        L_0x00fd:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r7 = r3.mo113036W()
            boolean r7 = r7 instanceof com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC
            if (r7 == 0) goto L_0x010e
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r7 = r3.mo113036W()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r7
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy r7 = r7.f239392w1
            goto L_0x010f
        L_0x010e:
            r7 = 0
        L_0x010f:
            if (r7 == 0) goto L_0x0113
            r7.f243390h = r4
        L_0x0113:
            boolean r8 = r3.f238122S
            if (r8 == 0) goto L_0x011a
            r3.mo113086w()
        L_0x011a:
            if (r7 == 0) goto L_0x0128
            r7.f243390h = r5
            com.tencent.luggage.sdk.launching.c<com.tencent.mm.ipcinvoker.type.IPCBoolean> r7 = r7.f243387e
            com.tencent.mm.ipcinvoker.type.IPCBoolean r8 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r8.<init>(r4)
            r7.mo111345a(r8)
        L_0x0128:
            com.tencent.mm.plugin.appbrand.widget.e r7 = r3.f238153r
            android.view.ViewParent r8 = r7.getParent()
            boolean r8 = r8 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x013b
            android.view.ViewParent r8 = r7.getParent()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r8.removeView(r7)
        L_0x013b:
            r13.mo113131h0(r3)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r3
            r3.mo113196a2(r5)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$z r7 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC$$z.Stash
            r3.mo113206i2(r7)
            com.tencent.p014mm.plugin.appbrand.C84803v.m104484b(r3)
            goto L_0x0040
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC.mo113160v0(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$d, boolean):void");
    }
}
