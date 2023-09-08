package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime$$z;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC$$d;
import com.tencent.p014mm.plugin.appbrand.C84091r2;
import com.tencent.p014mm.plugin.appbrand.performance.C83992a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import p170ic.C87688b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.d0 */
public final class C83303d0 {

    /* renamed from: a */
    public final AppBrandRuntimeWC f243454a;

    /* renamed from: b */
    public final AppBrandRuntime$$z f243455b;

    /* renamed from: c */
    public final LinkedList<C32226l<C32224a<C13598b0>, C13598b0>> f243456c;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.d0$a */
    public static final class C83304a extends C87413o implements C32226l<C32224a<? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public static final C83304a f243457d = new C83304a();

        public C83304a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C32224a aVar = (C32224a) obj;
            C87412m.m108594g(aVar, "cb");
            C84091r2.m103628f(new C83298c0(aVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.d0$b */
    public static final class C83305b extends C87413o implements C32226l<C32224a<? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83303d0 f243458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83305b(C83303d0 d0Var) {
            super(1);
            this.f243458d = d0Var;
        }

        public Object invoke(Object obj) {
            C32224a aVar = (C32224a) obj;
            C87412m.m108594g(aVar, "cb");
            AppBrandRuntimeWC appBrandRuntimeWC = this.f243458d.f243454a;
            C29568e0 e0Var = new C29568e0(aVar);
            appBrandRuntimeWC.mo113052e("startPrepareOrientation", new Object[0]);
            new AppBrandRuntimeWC$$d(appBrandRuntimeWC, e0Var).run();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.d0$c */
    public static final class C83306c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87688b f243459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83306c(C87688b bVar) {
            super(0);
            this.f243459d = bVar;
        }

        public Object invoke() {
            this.f243459d.mo122118a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.d0$d */
    public static final class C83307d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83303d0 f243460d;

        public C83307d(C83303d0 d0Var) {
            this.f243460d = d0Var;
        }

        public final void run() {
            this.f243460d.f243455b.mo113114c();
        }
    }

    public C83303d0(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandRuntime$$z appBrandRuntime$$z) {
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        C87412m.m108594g(appBrandRuntime$$z, "process");
        this.f243454a = appBrandRuntimeWC;
        this.f243455b = appBrandRuntime$$z;
        LinkedList<C32226l<C32224a<C13598b0>, C13598b0>> linkedList = new LinkedList<>();
        this.f243456c = linkedList;
        if (appBrandRuntimeWC.mo121254q1() && ((C83992a) appBrandRuntimeWC.mo113018M(C83992a.class)).f245223f) {
            linkedList.add(C83304a.f243457d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("app(");
        sb.append(appBrandRuntimeWC.f238147j);
        sb.append(") mayShowSplashAdWhenLaunch:");
        sb.append(appBrandRuntimeWC.mo113038X());
        sb.append(", isCheckShowAdPrepareProcessReady:");
        boolean z = true;
        sb.append(appBrandRuntimeWC.f238294v1 != null);
        Log.m105924i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", sb.toString());
        if (appBrandRuntimeWC.mo113038X()) {
            if (!(appBrandRuntimeWC.f238294v1 == null ? false : z)) {
                Log.m105924i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", "app(" + appBrandRuntimeWC.f238147j + ") do not add prepare orientation action");
                return;
            }
        }
        Log.m105924i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", "app(" + appBrandRuntimeWC.f238147j + ") add prepare orientation action");
        linkedList.add(new C83305b(this));
    }

    /* renamed from: a */
    public final void mo115604a() {
        if (this.f243456c.size() <= 0) {
            this.f243455b.mo113114c();
            return;
        }
        C87688b bVar = new C87688b(new C83307d(this), this.f243456c.size());
        Iterator<C32226l<C32224a<C13598b0>, C13598b0>> it = this.f243456c.iterator();
        while (it.hasNext()) {
            it.next().invoke(new C83306c(bVar));
        }
    }
}
