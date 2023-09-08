package p747xb;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83966x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import li0.C88508b;
import p1065yb.C91390a;
import p170ic.C87692f;
import rq0.C90087f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: xb.g */
public final class C91151g {

    /* renamed from: a */
    public final C83849m0 f261370a;

    /* renamed from: b */
    public final String f261371b;

    /* renamed from: c */
    public int f261372c = 2;

    /* renamed from: d */
    public boolean f261373d = true;

    /* renamed from: e */
    public boolean f261374e = true;

    /* renamed from: f */
    public int f261375f = 1;

    /* renamed from: g */
    public final C13601g f261376g = C36568h.m40985a(new C91153b(this));

    /* renamed from: h */
    public final C13601g f261377h = C36568h.m40985a(new C91154c(this));

    /* renamed from: xb.g$a */
    public static final class C91152a extends C87413o implements C32226l<C87692f, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91151g f261378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91152a(C91151g gVar) {
            super(1);
            this.f261378d = gVar;
        }

        public Object invoke(Object obj) {
            C87692f fVar = (C87692f) obj;
            C87412m.m108594g(fVar, "$this$lifecycle");
            C91147c cVar = new C91147c(this.f261378d);
            fVar.f253969d.put(C88508b.BACKGROUND, cVar);
            C91148d dVar = new C91148d(this.f261378d);
            fVar.f253969d.put(C88508b.SUSPEND, dVar);
            C91149e eVar = new C91149e(this.f261378d);
            fVar.f253969d.put(C88508b.FOREGROUND, eVar);
            fVar.mo122119a(new C91150f(this.f261378d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xb.g$b */
    public static final class C91153b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C91151g f261379d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91153b(C91151g gVar) {
            super(0);
            this.f261379d = gVar;
        }

        public Object invoke() {
            return Long.valueOf((((long) this.f261379d.f261370a.getRuntime().mo113051d0().f261070p) * 1000) + 100);
        }
    }

    /* renamed from: xb.g$c */
    public static final class C91154c extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public final /* synthetic */ C91151g f261380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91154c(C91151g gVar) {
            super(0);
            this.f261380d = gVar;
        }

        public Object invoke() {
            return new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C91155h(this.f261380d), false);
        }
    }

    public C91151g(C83849m0 m0Var) {
        C87412m.m108594g(m0Var, "pageContainer");
        this.f261370a = m0Var;
        AppBrandRuntime runtime = m0Var.getRuntime();
        C87412m.m108593f(runtime, "pageContainer.runtime");
        C91152a aVar = new C91152a(this);
        C87692f fVar = new C87692f();
        aVar.invoke(fVar);
        runtime.f238113K.mo122978a(fVar);
        this.f261371b = m0Var.getAppId();
    }

    /* renamed from: a */
    public static final void m114371a(C91151g gVar, C83820i0 i0Var) {
        C90087f fVar;
        C90087f fVar2;
        gVar.getClass();
        Class cls = C90087f.class;
        if (i0Var instanceof C83966x) {
            C83966x xVar = (C83966x) i0Var;
            xVar.getClass();
            for (C83780d1 d1Var : ((HashMap) xVar.f245126T).values()) {
                if (!(d1Var == null || (fVar2 = (C90087f) d1Var.mo116150E0(cls)) == null)) {
                    fVar2.mo63305V0();
                }
            }
            return;
        }
        C83780d1 currentPageView = i0Var.getCurrentPageView();
        if (currentPageView != null && (fVar = (C90087f) currentPageView.mo116150E0(cls)) != null) {
            fVar.mo63305V0();
        }
    }

    /* renamed from: b */
    public static final void m114372b(C91151g gVar, C83817h4 h4Var) {
        gVar.getClass();
        try {
            C83849m0 m0Var = gVar.f261370a;
            C83820i0 t = m0Var.mo116377t(m0Var.getCurrentPage());
            if (t != null) {
                C91390a aVar = (C91390a) t.getCurrentPageView().mo116150E0(C91390a.class);
                if (aVar != null) {
                    boolean i = aVar.mo72056i();
                    Log.m105924i("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", "[wxa_reload]tryReloadNearestInvisiblePage appId[" + gVar.f261371b + "] reload[" + i + "] type[" + h4Var + ']');
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th, "[wxa_reload]tryReloadNearestInvisiblePage appId[" + gVar.f261371b + "] type[" + h4Var + ']', new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo125217c(C83820i0 i0Var) {
        C90087f fVar;
        C90087f fVar2;
        Class cls = C90087f.class;
        if (i0Var instanceof C83966x) {
            C83966x xVar = (C83966x) i0Var;
            xVar.getClass();
            for (C83780d1 d1Var : ((HashMap) xVar.f245126T).values()) {
                if (!(d1Var == null || (fVar2 = (C90087f) d1Var.mo116150E0(cls)) == null)) {
                    fVar2.mo63313f0();
                }
            }
            return;
        }
        C83780d1 currentPageView = i0Var.getCurrentPageView();
        if (currentPageView != null && (fVar = (C90087f) currentPageView.mo116150E0(cls)) != null) {
            fVar.mo63313f0();
        }
    }

    /* renamed from: d */
    public final void mo125218d(C83817h4 h4Var) {
        try {
            C83849m0 m0Var = this.f261370a;
            C83820i0 t = m0Var.mo116377t(m0Var.getCurrentPage());
            if (t != null) {
                mo125217c(t);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th, "[wxa_reload]tryRestoreRenderingOfNearestInvisiblePage appId[" + this.f261371b + "] type[" + h4Var + ']', new Object[0]);
        }
    }
}
