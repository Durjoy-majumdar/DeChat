package com.tencent.p014mm.plugin.appbrand;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import b34.C79664a;
import br0.C79774c;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI$$b;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.task.C84275c0;
import com.tencent.p014mm.plugin.appbrand.widget.C84927e;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import cr0.C86105f;
import cr0.C86127t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.WeakHashMap;
import js0.C88015a;
import p225rc.C89917h;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer */
public class AppBrandRuntimeContainer<RUNTIME extends AppBrandRuntime> extends C86127t implements C81820e3 {

    /* renamed from: i */
    public FrameLayout f238204i;

    /* renamed from: j */
    public final LinkedList<RUNTIME> f238205j;

    /* renamed from: n */
    public final HashMap<String, RUNTIME> f238206n;

    /* renamed from: o */
    public C84275c0 f238207o;

    /* renamed from: p */
    public Class<? extends RUNTIME> f238208p;

    /* renamed from: q */
    public boolean f238209q = false;

    /* renamed from: r */
    public boolean f238210r = false;

    /* renamed from: s */
    public C85004y f238211s;

    /* renamed from: t */
    public Application.ActivityLifecycleCallbacks f238212t;

    /* renamed from: u */
    public final C81974j3 f238213u = new C81071b();

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$a */
    public class C81070a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f238214d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandRuntime f238215e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f238216f;

        public C81070a(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, Runnable runnable) {
            this.f238214d = appBrandRuntime;
            this.f238215e = appBrandRuntime2;
            this.f238216f = runnable;
        }

        public void run() {
            AppBrandRuntime appBrandRuntime;
            boolean z = (AppBrandRuntimeContainer.this.f238205j.peekFirst() == this.f238214d) || AppBrandRuntimeContainer.this.mo113119V(this.f238214d);
            AppBrandRuntime appBrandRuntime2 = this.f238215e;
            if (appBrandRuntime2 != null) {
                appBrandRuntime2.mo113002B0(this.f238214d.mo113036W(), (Object) null);
            } else {
                this.f238214d.mo113004D((Object) null);
            }
            this.f238216f.run();
            if (z && (appBrandRuntime = this.f238215e) != null) {
                appBrandRuntime.mo113090y();
                if (AppBrandRuntimeContainer.this.f238209q) {
                    this.f238215e.mo113000A();
                }
            }
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(z);
            AppBrandRuntime appBrandRuntime3 = this.f238215e;
            objArr[1] = appBrandRuntime3 == null ? "null" : appBrandRuntime3.f238147j;
            objArr[2] = Boolean.valueOf(AppBrandRuntimeContainer.this.f238209q);
            Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "removeImpl closeTask.run(), outIsTopOfStackBefore[%b], below.appId[%s], mIsActivityResumed[%b]", objArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$b */
    public class C81071b extends C81974j3 {
        public C81071b() {
        }

        /* renamed from: a */
        public boolean mo107509a(KeyEvent keyEvent) {
            C85004y yVar = AppBrandRuntimeContainer.this.f238211s;
            if (yVar != null) {
                return yVar.mo117930f(keyEvent);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$c */
    public class C81072c implements View.OnSystemUiVisibilityChangeListener {
        public C81072c() {
        }

        public void onSystemUiVisibilityChange(int i) {
            int i2;
            Activity castActivityOrNull;
            if (AppBrandRuntimeContainer.this.f238204i.isShown()) {
                FrameLayout frameLayout = AppBrandRuntimeContainer.this.f238204i;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(frameLayout) && (i2 = Build.VERSION.SDK_INT) >= 26 && (AppBrandRuntimeContainer.this.f238204i.getWindowSystemUiVisibility() & 2) == 0 && (castActivityOrNull = AndroidContextUtil.castActivityOrNull(AppBrandRuntimeContainer.this.f250648d)) != null && castActivityOrNull.getWindow() != null) {
                    boolean g = C74933u4.m89770g(castActivityOrNull.getWindow().getNavigationBarColor());
                    Window window = castActivityOrNull.getWindow();
                    boolean z = !g;
                    if (window != null && window.getDecorView() != null && i2 >= 26) {
                        View decorView = window.getDecorView();
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & -17);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$d */
    public class C81073d extends C88015a {
        public C81073d() {
        }

        public void onActivityDestroyed(Activity activity) {
            if (AppBrandRuntimeContainer.this.mo120548w() == activity) {
                Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "onActivityDestroyed %s", activity.getLocalClassName());
                AppBrandRuntimeContainer.this.mo113126f0();
            }
        }

        public void onActivityPaused(Activity activity) {
            if (AppBrandRuntimeContainer.this.mo120548w() == activity) {
                Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "onActivityPaused %s", activity.getLocalClassName());
                AppBrandRuntimeContainer appBrandRuntimeContainer = AppBrandRuntimeContainer.this;
                appBrandRuntimeContainer.f238209q = false;
                appBrandRuntimeContainer.f238210r = true;
                appBrandRuntimeContainer.getOrientationHandler().onPause();
            }
        }

        public void onActivityResumed(Activity activity) {
            if (AppBrandRuntimeContainer.this.mo120548w() == activity) {
                Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "onActivityResumed %s", activity.getLocalClassName());
                AppBrandRuntimeContainer appBrandRuntimeContainer = AppBrandRuntimeContainer.this;
                appBrandRuntimeContainer.f238209q = true;
                appBrandRuntimeContainer.f238210r = false;
                appBrandRuntimeContainer.getOrientationHandler().onResume();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$e */
    public class C81074e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f238221d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandInitConfig f238222e;

        public C81074e(AppBrandRuntime appBrandRuntime, AppBrandInitConfig appBrandInitConfig) {
            this.f238221d = appBrandRuntime;
            this.f238222e = appBrandInitConfig;
        }

        public void run() {
            Activity w = AppBrandRuntimeContainer.this.mo120548w();
            int i = C85004y.f247715r;
            C85004y yVar = (C85004y) w.findViewById(C0966R.C0970id.f6025v7);
            if (yVar != null) {
                yVar.mo117928c();
            }
            if (this.f238221d == null) {
                AppBrandRuntimeContainer.this.mo113117M(this.f238222e.f239362d);
            }
            AppBrandRuntime S = AppBrandRuntimeContainer.this.mo113118S(this.f238222e.f239362d);
            if (S == null) {
                AppBrandRuntimeContainer.this.mo113122c0(this.f238221d, AppBrandRuntimeContainer.this.mo113116J(this.f238222e), this.f238222e);
                return;
            }
            AppBrandRuntimeContainer.this.mo113120b0(this.f238221d, S, this.f238222e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$f */
    public class C81075f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f238224d;

        /* renamed from: e */
        public final /* synthetic */ Object f238225e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f238226f;

        /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$f$a */
        public class C81076a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntime f238228d;

            public C81076a(AppBrandRuntime appBrandRuntime) {
                this.f238228d = appBrandRuntime;
            }

            public void run() {
                AppBrandRuntime appBrandRuntime;
                C81075f.this.f238224d.f238153r.setVisibility(8);
                C81075f fVar = C81075f.this;
                AppBrandRuntimeContainer.this.f238205j.remove(fVar.f238224d);
                C81075f fVar2 = C81075f.this;
                AppBrandRuntimeContainer.this.f238206n.put(fVar2.f238224d.f238147j, C81075f.this.f238224d);
                AppBrandRuntime appBrandRuntime2 = this.f238228d;
                if (appBrandRuntime2 != null) {
                    AppBrandRuntimeContainer.this.mo113132i0(appBrandRuntime2, false);
                    AppBrandRuntimeContainer.this.mo113133j0(this.f238228d);
                }
                C81075f.this.f238224d.mo113086w();
                if (AppBrandRuntimeContainer.this.f238209q && (appBrandRuntime = this.f238228d) != null) {
                    appBrandRuntime.mo113000A();
                }
                Object[] objArr = new Object[3];
                objArr[0] = C81075f.this.f238224d.f238147j;
                AppBrandRuntime appBrandRuntime3 = this.f238228d;
                objArr[1] = appBrandRuntime3 == null ? "null" : appBrandRuntime3.f238147j;
                objArr[2] = Boolean.valueOf(AppBrandRuntimeContainer.this.f238209q);
                Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "close run(), out.appId[%s], willAppear.appId[%s], mIsActivityResumed[%b]", objArr);
                Runnable runnable = C81075f.this.f238226f;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        public C81075f(AppBrandRuntime appBrandRuntime, Object obj, Runnable runnable) {
            this.f238224d = appBrandRuntime;
            this.f238225e = obj;
            this.f238226f = runnable;
        }

        public void run() {
            if ((AppBrandRuntimeContainer.this.f238205j.peekFirst() == this.f238224d) || AppBrandRuntimeContainer.this.mo113119V(this.f238224d)) {
                AppBrandRuntime o = AppBrandRuntimeContainer.this.mo113136o(this.f238224d);
                if (o != null) {
                    o.mo113002B0(this.f238224d.mo113036W(), this.f238225e);
                } else {
                    this.f238224d.mo113004D(this.f238225e);
                }
                Object[] objArr = new Object[3];
                objArr[0] = this.f238224d.f238147j;
                objArr[1] = o == null ? "null" : o.f238147j;
                objArr[2] = Boolean.valueOf(AppBrandRuntimeContainer.this.f238209q);
                Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "close before run(), out.appId[%s], willAppear.appId[%s], mIsActivityResumed[%b]", objArr);
                AppBrandRuntimeContainer.this.mo113125e0(o, this.f238224d, new C81076a(o));
                return;
            }
            Log.m105921e("MicroMsg.AppBrandRuntimeContainer", "close with appId(%s), not top of stack, ignore", this.f238224d.f238147j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$g */
    public class C81077g implements Runnable {
        public C81077g() {
        }

        public void run() {
            try {
                AppBrandRuntime activeRuntime = AppBrandRuntimeContainer.this.getActiveRuntime();
                if (activeRuntime != null) {
                    AppBrandRuntimeContainer.this.mo113132i0(activeRuntime, true);
                    AppBrandRuntimeContainer.this.mo113133j0(activeRuntime);
                    activeRuntime.mo113000A();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandRuntimeContainer", e, "doOnResume e=%s", e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$h */
    public class C81078h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f238231d;

        public C81078h(AppBrandRuntime appBrandRuntime) {
            this.f238231d = appBrandRuntime;
        }

        public void run() {
            C89917h.m112458a(AppBrandRuntimeContainer.this.f250648d);
            AppBrandRuntimeContainer.this.mo113127g0(this.f238231d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer$i */
    public class C81079i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f238233d;

        public C81079i(AppBrandRuntime appBrandRuntime) {
            this.f238233d = appBrandRuntime;
        }

        public void run() {
            Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "dl: removeImpl, cleanupOut.run(), appId[%s]", this.f238233d.f238147j);
            this.f238233d.mo113016K0(AppBrandRuntimeContainer.this.f238213u);
            this.f238233d.mo113082u();
            AppBrandRuntimeContainer.this.f238204i.removeView(this.f238233d.f238153r);
            AppBrandRuntimeContainer.this.f238206n.remove(this.f238233d.f238147j);
            AppBrandRuntimeContainer.this.f238205j.remove(this.f238233d);
        }
    }

    public AppBrandRuntimeContainer(C84275c0 c0Var, Class<? extends RUNTIME> cls) {
        AppBrandUI$$b appBrandUI$$b = (AppBrandUI$$b) c0Var;
        mo120546A(C84543i2.m104128b(appBrandUI$$b.f246511a));
        this.f238205j = new LinkedList<>();
        this.f238206n = new HashMap<>();
        AppBrandUI appBrandUI = appBrandUI$$b.f246511a;
        boolean z = AppBrandUI.f246480N;
        FrameLayout frameLayout = (FrameLayout) appBrandUI.f247089j;
        this.f238204i = frameLayout;
        this.f238207o = c0Var;
        this.f238208p = cls;
        frameLayout.setOnSystemUiVisibilityChangeListener(new C81072c());
        C86105f c = C86105f.m106605c(mo120548w());
        Log.m105924i("MicroMsg.AppBrandDeviceOrientationHandler", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        synchronized (c) {
            c.f250605d = false;
        }
        C81073d dVar = new C81073d();
        this.f238212t = dVar;
        ((Application) this.f250648d.getApplicationContext()).registerActivityLifecycleCallbacks(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113115C(com.tencent.p014mm.plugin.appbrand.widget.C84927e r6) {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = r5.f238204i
            int r0 = r0.getChildCount()
            com.tencent.mm.plugin.appbrand.widget.input.y r1 = r5.f238211s
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            if (r1 == 0) goto L_0x0027
            android.widget.FrameLayout r1 = r5.f238204i
            int r1 = r1.getChildCount()
            if (r1 > r2) goto L_0x0022
            if (r1 != r2) goto L_0x0020
            com.tencent.mm.plugin.appbrand.widget.input.y r1 = r5.f238211s
            if (r1 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = 0
            goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            if (r1 == 0) goto L_0x0027
            int r0 = r0 - r2
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            java.lang.Object r1 = r6.getTag()
            java.lang.String r1 = (java.lang.String) r1
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r4[r2] = r1
            java.lang.String r1 = "MicroMsg.AppBrandRuntimeContainer"
            java.lang.String r3 = "attachRtViewToTree: name = [%s], index = [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)
            android.view.ViewParent r1 = r6.getParent()
            if (r1 == 0) goto L_0x005d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 != 0) goto L_0x0054
            android.view.ViewParent r1 = r6.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeAllViews()
            goto L_0x005d
        L_0x0054:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "runtimeLayout's parent should be null"
            r6.<init>(r0)
            throw r6
        L_0x005d:
            android.widget.FrameLayout r1 = r5.f238204i
            r1.addView(r6, r0)
            com.tencent.mm.plugin.appbrand.widget.input.y r6 = r5.f238211s
            if (r6 == 0) goto L_0x0095
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0073
            android.widget.FrameLayout r6 = r5.f238204i
            com.tencent.mm.plugin.appbrand.widget.input.y r0 = r5.f238211s
            r6.addView(r0)
        L_0x0073:
            android.widget.FrameLayout r6 = r5.f238204i
            com.tencent.mm.plugin.appbrand.widget.input.y r0 = r5.f238211s
            android.view.ViewParent r0 = r0.getParent()
            if (r6 != r0) goto L_0x0095
            android.widget.FrameLayout r6 = r5.f238204i
            com.tencent.mm.plugin.appbrand.widget.input.y r0 = r5.f238211s
            int r6 = r6.indexOfChild(r0)
            android.widget.FrameLayout r0 = r5.f238204i
            int r0 = r0.getChildCount()
            int r0 = r0 - r2
            if (r6 == r0) goto L_0x0095
            android.widget.FrameLayout r6 = r5.f238204i
            com.tencent.mm.plugin.appbrand.widget.input.y r0 = r5.f238211s
            r6.bringChildToFront(r0)
        L_0x0095:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r5.getActiveRuntime()
            r0 = 4
            com.tencent.mm.plugin.appbrand.j3 r1 = r5.f238213u
            r6.mo113057h(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainer.mo113115C(com.tencent.mm.plugin.appbrand.widget.e):void");
    }

    /* renamed from: J */
    public RUNTIME mo113116J(AppBrandInitConfig appBrandInitConfig) {
        Class<? extends RUNTIME> cls = this.f238208p;
        return (AppBrandRuntime) new C79664a(cls, cls).mo109791d(this).f233575b;
    }

    /* renamed from: M */
    public final void mo113117M(String str) {
        Iterator<RUNTIME> it = this.f238205j.iterator();
        while (it.hasNext()) {
            AppBrandRuntime appBrandRuntime = (AppBrandRuntime) it.next();
            if (str == null || !str.equals(appBrandRuntime.f238147j)) {
                it.remove();
                appBrandRuntime.f238153r.setVisibility(8);
                this.f238206n.put(appBrandRuntime.f238147j, appBrandRuntime);
                appBrandRuntime.mo113083u0();
                if (!appBrandRuntime.f238116N) {
                    Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, rt(%s).initialized()=false, just destroy", appBrandRuntime.f238147j);
                    mo113127g0(appBrandRuntime);
                } else if (appBrandRuntime.f238122S) {
                    Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, rt(%s).isResumed()=true, make it pause", appBrandRuntime.f238147j);
                    appBrandRuntime.mo113086w();
                }
            } else {
                Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "detachCurrentStack, exclude appId(%s)", str);
            }
        }
    }

    /* renamed from: S */
    public RUNTIME mo113118S(String str) {
        Iterator<RUNTIME> it = this.f238205j.iterator();
        while (it.hasNext()) {
            RUNTIME runtime = (AppBrandRuntime) it.next();
            if (runtime.f238147j.equals(str)) {
                return runtime;
            }
        }
        return (AppBrandRuntime) this.f238206n.get(str);
    }

    /* renamed from: TE */
    public void mo109905TE(int i, AppBrandRuntime appBrandRuntime) {
        super.mo109905TE(i, appBrandRuntime);
        View view = (View) appBrandRuntime.f238153r.getParent();
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    /* renamed from: V */
    public boolean mo113119V(RUNTIME runtime) {
        return false;
    }

    /* renamed from: b0 */
    public void mo113120b0(RUNTIME runtime, RUNTIME runtime2, AppBrandInitConfig appBrandInitConfig) {
        mo113132i0(runtime2, false);
        mo113133j0(runtime2);
        runtime2.mo113090y();
        runtime2.f238148n = runtime;
        runtime2.mo113084v(appBrandInitConfig);
        if (runtime != null) {
            runtime.mo113086w();
            runtime2.mo113000A();
        }
    }

    /* renamed from: c */
    public void mo113121c(AppBrandRuntime appBrandRuntime, AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig != null) {
            mo120548w().runOnUiThread(new C81074e(appBrandRuntime, appBrandInitConfig));
        }
    }

    /* renamed from: c0 */
    public void mo113122c0(RUNTIME runtime, RUNTIME runtime2, AppBrandInitConfig appBrandInitConfig) {
        runtime2.f238148n = runtime;
        runtime2.mo113060i0(appBrandInitConfig);
        this.f238205j.push(runtime2);
        mo113115C(runtime2.f238153r);
        if (runtime != null) {
            runtime.mo113086w();
        }
        runtime2.mo113073p0();
    }

    /* renamed from: d0 */
    public void mo113123d0() {
        Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "onResume tid = %d", Long.valueOf(Thread.currentThread().getId()));
        mo113135k0(new C81077g());
    }

    /* renamed from: e */
    public boolean mo113124e(AppBrandRuntime appBrandRuntime) {
        return this.f238205j.contains(appBrandRuntime);
    }

    /* renamed from: e0 */
    public void mo113125e0(AppBrandRuntime appBrandRuntime, AppBrandRuntime appBrandRuntime2, Runnable runnable) {
        Object[] objArr = new Object[2];
        objArr[0] = appBrandRuntime == null ? "null" : appBrandRuntime.f238147j;
        objArr[1] = appBrandRuntime2.f238147j;
        Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "onRuntimeClose entered, in.appId[%s], out.appId[%s]", objArr);
        runnable.run();
    }

    /* renamed from: f0 */
    public final void mo113126f0() {
        if (this.f238212t != null) {
            ((Application) this.f250648d.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f238212t);
            this.f238212t = null;
        }
        getOrientationHandler().release();
        this.f238207o = null;
    }

    /* renamed from: g0 */
    public final void mo113127g0(RUNTIME runtime) {
        Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "removeImpl entered appId[%s]", runtime.f238147j);
        C81079i iVar = new C81079i(runtime);
        if (!mo113124e(runtime)) {
            Log.m105925i("MicroMsg.AppBrandRuntimeContainer", "removeImpl appId[%s], not in runtime stack, just cleanup", runtime.f238147j);
            iVar.run();
            return;
        }
        AppBrandRuntime o = mo113136o(runtime);
        mo113125e0(o, runtime, new C81070a(runtime, o, iVar));
    }

    public RUNTIME getActiveRuntime() {
        return (AppBrandRuntime) this.f238205j.peek();
    }

    public int getStackSize() {
        return this.f238205j.size();
    }

    public final DisplayMetrics getVDisplayMetrics() {
        DisplayMetrics vDisplayMetrics = super.getVDisplayMetrics();
        if (this.f238204i.isLaidOut()) {
            vDisplayMetrics.widthPixels = this.f238204i.getMeasuredWidth();
            vDisplayMetrics.heightPixels = this.f238204i.getMeasuredHeight();
        }
        return vDisplayMetrics;
    }

    public C79774c getWindowAndroid() {
        return this;
    }

    /* renamed from: h0 */
    public final void mo113131h0(RUNTIME runtime) {
        if (runtime != null) {
            runtime.mo113016K0(this.f238213u);
            this.f238205j.remove(runtime);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f238206n.remove(runtime.f238147j, runtime);
            } else {
                this.f238206n.remove(runtime.f238147j);
            }
        }
    }

    /* renamed from: i0 */
    public final void mo113132i0(RUNTIME runtime, boolean z) {
        if (!this.f238205j.contains(runtime) || z) {
            this.f238205j.remove(runtime);
            this.f238205j.push(runtime);
            if (this.f238204i.indexOfChild(runtime.f238153r) == -1) {
                mo113115C(runtime.f238153r);
            }
            this.f238206n.remove(runtime.f238147j);
        }
    }

    /* renamed from: j0 */
    public final void mo113133j0(RUNTIME runtime) {
        this.f238205j.remove(runtime);
        this.f238205j.push(runtime);
        boolean z = false;
        runtime.f238153r.setVisibility(0);
        C84927e eVar = runtime.f238153r;
        if (this.f238204i.indexOfChild(eVar) == -1) {
            Log.m105928w("MicroMsg.AppBrandRuntimeContainer", "bringRtViewToTop: such runtime view does not exist");
            return;
        }
        this.f238204i.bringChildToFront(eVar);
        C85004y yVar = this.f238211s;
        if (yVar != null) {
            z = true;
        }
        if (z) {
            this.f238204i.bringChildToFront(yVar);
        }
    }

    /* renamed from: k */
    public final void mo113134k(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null) {
            mo113135k0(new C81078h(appBrandRuntime));
        }
    }

    /* renamed from: k0 */
    public final void mo113135k0(Runnable runnable) {
        if (runnable != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else if (mo120548w() != null) {
                mo120548w().runOnUiThread(runnable);
            } else {
                Log.m105920e("MicroMsg.AppBrandRuntimeContainer", "runOnUiThread getActivity()==null");
                new MMHandler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    /* renamed from: o */
    public RUNTIME mo113136o(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null) {
            ListIterator<RUNTIME> listIterator = this.f238205j.listIterator();
            boolean z = false;
            while (listIterator.hasNext()) {
                RUNTIME runtime = (AppBrandRuntime) listIterator.next();
                if (runtime == appBrandRuntime) {
                    z = true;
                } else if (z) {
                    return runtime;
                }
            }
            if (z) {
                return null;
            }
            throw new IllegalAccessError(String.format("Runtime not in stack %s", new Object[]{appBrandRuntime.f238147j}));
        }
        throw new NullPointerException("Null runtime");
    }

    /* renamed from: q */
    public final void mo113137q(AppBrandRuntime appBrandRuntime) {
        if (appBrandRuntime != null) {
            this.f238205j.remove(appBrandRuntime);
        }
    }

    /* renamed from: s */
    public void mo113138s(AppBrandRuntime appBrandRuntime, Object obj, Runnable runnable) {
        Activity w;
        if (appBrandRuntime != null && (w = mo120548w()) != null) {
            w.runOnUiThread(new C81075f(appBrandRuntime, obj, runnable));
        }
    }

    /* renamed from: s5 */
    public boolean mo109912s5() {
        return ((AppBrandUI$$b) this.f238207o).f246511a.mo117074l8();
    }

    /* renamed from: u */
    public boolean mo113139u() {
        return true;
    }
}
