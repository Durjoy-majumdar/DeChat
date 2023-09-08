package com.tencent.p014mm.plugin.appbrand.task;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.appbrand.C84091r2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84106b0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import java.util.Objects;
import java.util.Queue;
import kr0.C88273g1;
import p170ic.C87688b;
import p564iq.C87790d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.task.q$$b */
public class q$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84343y f246228d;

    /* renamed from: e */
    public final /* synthetic */ C88273g1 f246229e;

    /* renamed from: f */
    public final /* synthetic */ int f246230f;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.q$$b$a */
    public class C84332a implements Runnable {
        public C84332a() {
        }

        public void run() {
            q$$b q__b = q$$b.this;
            C84331q.m103948c(q__b.f246230f, q__b.f246228d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.q$$b$b */
    public class C84333b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87688b f246232d;

        public C84333b(C87688b bVar) {
            this.f246232d = bVar;
        }

        public void run() {
            MMHandlerThread.setCurrentPriority(-8);
            q$$b q__b = q$$b.this;
            C84343y yVar = q__b.f246228d;
            C88273g1 g1Var = q__b.f246229e;
            q$$f q__f = C84331q.f246221a;
            if (XWebSdk.isSysWebView()) {
                Log.m105920e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView tried but kernel incompatible");
            } else {
                Queue queue = C84331q.f246223c.get(yVar);
                Objects.requireNonNull(queue);
                if (!queue.isEmpty()) {
                    Log.m105920e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView skipped cause already cached");
                } else if (yVar == C84343y.WAGAME) {
                    Log.m105921e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView skipped in request[%s]", yVar);
                } else {
                    C83928t1 t1Var = new C83928t1();
                    t1Var.mo114269d0(WxaCommLibRuntimeReader.m99498b());
                    t1Var.mo124768F1(C84217q.PreloadOnProcessCreated);
                    t1Var.f245018b1 = g1Var;
                    queue.add(t1Var);
                    Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadPageView done");
                }
            }
            this.f246232d.mo122118a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.q$$b$c */
    public class C84334c implements C84091r2.C84093b {

        /* renamed from: a */
        public final /* synthetic */ long f246234a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f246235b;

        public C84334c(q$$b q__b, long j, Runnable runnable) {
            this.f246234a = j;
            this.f246235b = runnable;
        }

        /* renamed from: a */
        public void mo115595a() {
            C84185b.f245912a.mo116895n(true, (String) null, this.f246234a, C84106b0.m103652a((C83928t1) null));
            MMHandlerThread.postToMainThread(this.f246235b);
        }

        /* renamed from: b */
        public void mo115596b() {
            Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "XWebPreloader onPreloadFailed, trigger preloadAppBrandRuntime");
            MMHandlerThread.postToMainThread(this.f246235b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.q$$b$d */
    public class C84335d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87688b f246236d;

        public C84335d(C87688b bVar) {
            this.f246236d = bVar;
        }

        public void run() {
            q$$b q__b = q$$b.this;
            C84331q.m103954i(q__b.f246228d, q__b.f246229e);
            this.f246236d.mo122118a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.q$$b$e */
    public class C84336e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Throwable f246238d;

        public C84336e(q$$b q__b, Throwable th) {
            this.f246238d = th;
        }

        public void run() {
            throw this.f246238d;
        }
    }

    public q$$b(C84343y yVar, C88273g1 g1Var, int i) {
        this.f246228d = yVar;
        this.f246229e = g1Var;
        this.f246230f = i;
    }

    public void run() {
        try {
            Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preInit start");
            AppBrandPreloadProfiler appBrandPreloadProfiler = C84331q.f246225e.get(this.f246228d);
            appBrandPreloadProfiler.getClass();
            appBrandPreloadProfiler.f246128i = SystemClock.elapsedRealtime();
            ((C87790d) C86312j.m106911c(C87790d.class)).mo122033Ka(true);
            MMHandlerThread.setCurrentPriority(-2);
            WxaCommLibRuntimeReader.m99499c(true);
            C29552h0.m38798a();
            C86013q1.m106461v(C29552h0.m38800c());
            if (this.f246228d == C84343y.WAGAME) {
                C84331q.m103946a(this.f246229e);
                Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[wagame] misc preload done");
            } else {
                C87688b bVar = new C87688b(new C84332a(), 2);
                if (this.f246230f >= 2) {
                    C84333b bVar2 = new C84333b(bVar);
                    if (C84091r2.m103627e()) {
                        Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "XWebPreloader preloaded, trigger preloadAppBrandRuntime");
                        MMHandlerThread.postToMainThread(bVar2);
                    } else {
                        C84091r2.m103628f(new C84334c(this, System.currentTimeMillis(), bVar2));
                    }
                } else {
                    Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "run: skip preload webView");
                    bVar.mo122118a();
                }
                ((C119157j) C119157j.f356862d).mo183876g(new C84335d(bVar), "MicroMsg.AppBrandProcessPreloader[applaunch][preload]_AppBrandServicePreloadWorker");
            }
        } catch (Throwable th) {
            try {
                C84331q.m103958m(this.f246228d);
                if (!BuildInfo.DEBUG) {
                    if (!WeChatEnvironment.hasDebugger()) {
                        Log.printErrStackTrace("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", th, "[NOT CRASH]", new Object[0]);
                    }
                }
                MMHandlerThread.postToMainThread(new C84336e(this, th));
            } catch (Throwable th4) {
                Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "misc preload done");
                MMHandlerThread.setCurrentPriority(10);
                throw th4;
            }
        }
        Log.m105924i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "misc preload done");
        MMHandlerThread.setCurrentPriority(10);
    }
}
