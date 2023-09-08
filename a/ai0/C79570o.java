package ai0;

import android.os.Build;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import p170ic.C87692f;
import rx3.C13598b0;

/* renamed from: ai0.o */
public final class C79570o {

    /* renamed from: c */
    public static final C79571a f233322c = new C79571a((C8480h) null);

    /* renamed from: d */
    public static final ConcurrentHashMap<AppBrandRuntime, C79570o> f233323d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final ConcurrentHashMap<String, AppBrandRuntime> f233324e = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final C79551d f233325a = new C79551d();

    /* renamed from: b */
    public AppBrandSplashAdWorkerReportStruct f233326b;

    /* renamed from: ai0.o$a */
    public static final class C79571a {

        /* renamed from: ai0.o$a$a */
        public static final class C79572a<T, R> implements Function {

            /* renamed from: a */
            public final /* synthetic */ AppBrandRuntime f233327a;

            public C79572a(AppBrandRuntime appBrandRuntime) {
                this.f233327a = appBrandRuntime;
            }

            public Object apply(Object obj) {
                C87412m.m108594g((AppBrandRuntime) obj, LocaleUtil.ITALIAN);
                C79570o oVar = new C79570o();
                AppBrandRuntime appBrandRuntime = this.f233327a;
                C79569n nVar = new C79569n(appBrandRuntime, oVar);
                C87412m.m108594g(appBrandRuntime, "<this>");
                C87692f fVar = new C87692f();
                nVar.invoke(fVar);
                appBrandRuntime.f238113K.mo122978a(fVar);
                AppBrandRuntime appBrandRuntime2 = this.f233327a;
                ConcurrentHashMap<String, AppBrandRuntime> concurrentHashMap = C79570o.f233324e;
                String str = appBrandRuntime2.f238147j;
                C87412m.m108593f(str, "runtime.appId");
                concurrentHashMap.put(str, appBrandRuntime2);
                return oVar;
            }
        }

        /* renamed from: ai0.o$a$b */
        public static final class C79573b extends C87413o implements C32226l<C87692f, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntime f233328d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C79573b(AppBrandRuntime appBrandRuntime) {
                super(1);
                this.f233328d = appBrandRuntime;
            }

            public Object invoke(Object obj) {
                C87692f fVar = (C87692f) obj;
                C87412m.m108594g(fVar, "$this$lifecycle");
                fVar.mo122119a(new C79574p(this.f233328d));
                return C13598b0.f38549a;
            }
        }

        public C79571a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C79570o mo109681a(AppBrandRuntime appBrandRuntime) {
            C79570o oVar;
            C87412m.m108594g(appBrandRuntime, "runtime");
            if (Build.VERSION.SDK_INT >= 24) {
                oVar = C79570o.f233323d.computeIfAbsent(appBrandRuntime, new C79572a(appBrandRuntime));
            } else {
                ConcurrentHashMap<AppBrandRuntime, C79570o> concurrentHashMap = C79570o.f233323d;
                C79570o oVar2 = concurrentHashMap.get(appBrandRuntime);
                if (oVar2 == null) {
                    oVar2 = new C79570o();
                    C79573b bVar = new C79573b(appBrandRuntime);
                    C87692f fVar = new C87692f();
                    bVar.invoke(fVar);
                    appBrandRuntime.f238113K.mo122978a(fVar);
                    ConcurrentHashMap<String, AppBrandRuntime> concurrentHashMap2 = C79570o.f233324e;
                    String str = appBrandRuntime.f238147j;
                    C87412m.m108593f(str, "runtime.appId");
                    concurrentHashMap2.put(str, appBrandRuntime);
                    C79570o putIfAbsent = concurrentHashMap.putIfAbsent(appBrandRuntime, oVar2);
                    if (putIfAbsent != null) {
                        oVar2 = putIfAbsent;
                    }
                }
                oVar = oVar2;
            }
            C87412m.m108593f(oVar, "context");
            return oVar;
        }
    }

    /* renamed from: a */
    public static final C79551d m96621a(AppBrandRuntime appBrandRuntime) {
        C79571a aVar = f233322c;
        if (appBrandRuntime == null) {
            return null;
        }
        return aVar.mo109681a(appBrandRuntime).f233325a;
    }

    /* renamed from: b */
    public static final C79551d m96622b(String str) {
        AppBrandRuntime appBrandRuntime;
        C79571a aVar = f233322c;
        if (!(str == null || str.length() == 0) && (appBrandRuntime = f233324e.get(str)) != null) {
            return aVar.mo109681a(appBrandRuntime).f233325a;
        }
        return null;
    }

    /* renamed from: c */
    public static final AppBrandSplashAdWorkerReportStruct m96623c(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C79570o oVar = f233323d.get(appBrandRuntime);
        if (oVar != null) {
            return oVar.f233326b;
        }
        return null;
    }
}
