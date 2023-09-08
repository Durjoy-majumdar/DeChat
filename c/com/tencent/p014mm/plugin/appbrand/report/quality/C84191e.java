package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.eclipsesource.mmv8.C80135V8;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAndroidMagicBrushCreateCostStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAppServiceInitStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityRuntimeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWebviewInitStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.appcache.AbsReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.performance.C83997d;
import com.tencent.p014mm.plugin.appbrand.report.C84106b0;
import com.tencent.p014mm.plugin.appbrand.report.C84136m;
import com.tencent.p014mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84237z;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gm0.C87270a;
import kr0.C88267e;
import u24.C90595a;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.e */
public class C84191e extends C84193f {

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.e$a */
    public class C84192a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f245929d;

        /* renamed from: e */
        public final /* synthetic */ AppStartupPerformanceReportBundle f245930e;

        public C84192a(C84191e eVar, String str, AppStartupPerformanceReportBundle appStartupPerformanceReportBundle) {
            this.f245929d = str;
            this.f245930e = appStartupPerformanceReportBundle;
        }

        public void run() {
            QualitySessionRuntime c = C84185b.m103770c(this.f245929d, true);
            if (c != null) {
                for (kv_14609 next : this.f245930e.f243289f) {
                    C87270a aVar = new C87270a();
                    aVar.f252991a = "loadPackage";
                    long j = next.f245680v;
                    aVar.f252992b = j;
                    aVar.f252993c = j + next.f245673o;
                    aVar.mo121669b("packageName", Util.nullAsNil(next.f245670i));
                    int i = next.f245678t;
                    if (i > 0) {
                        aVar.mo121669b("size", Integer.valueOf(i));
                    } else {
                        aVar.mo121669b("size", Integer.valueOf(next.f245677s));
                    }
                    try {
                        aVar.mo121668a((C88267e) c.f245854o.f238150p);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo116887f(WeAppQualityLibInjectStruct weAppQualityLibInjectStruct, C83165i iVar) {
        int i;
        if (iVar != null) {
            C84136m a = C84136m.m103674a(iVar);
            switch (a.ordinal()) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 102;
                    break;
                case 7:
                    i = 103;
                    break;
                case 8:
                    i = 104;
                    break;
                default:
                    i = 0;
                    break;
            }
            weAppQualityLibInjectStruct.f236931q = (long) i;
            if (iVar instanceof C83797e3) {
                weAppQualityLibInjectStruct.f236935u = weAppQualityLibInjectStruct.mo86045b("engineVersion", mo116900d() + "", true);
            } else if (C90595a.m113498b(C84136m.f245619j, a)) {
                weAppQualityLibInjectStruct.f236935u = weAppQualityLibInjectStruct.mo86045b("engineVersion", C80135V8.getV8Version(), true);
            }
        }
    }

    /* renamed from: g */
    public WeAppQualityLibInjectStruct mo116888g(C81879g gVar) {
        WeAppQualityLibInjectStruct h = mo116889h(gVar.mo114335b0(), gVar.getRuntime(), gVar.getJsRuntime());
        if (h == null) {
            return null;
        }
        h.f236929o = h.mo86045b("libVersion", gVar.mo114272k().mo113377i(), true);
        if (gVar.mo114272k() instanceof AbsReader) {
            h.f236937w = h.mo86045b("expt", Util.nullAsNil(((AbsReader) gVar.mo114272k()).mo113370Z().mo13713a()), true);
        }
        return h;
    }

    /* renamed from: h */
    public final WeAppQualityLibInjectStruct mo116889h(boolean z, AppBrandRuntime appBrandRuntime, C83165i iVar) {
        WeAppQualityLibInjectStruct weAppQualityLibInjectStruct = new WeAppQualityLibInjectStruct();
        if (!z) {
            QualitySessionRuntime a = C84185b.m103768a(appBrandRuntime);
            if (a == null) {
                return null;
            }
            weAppQualityLibInjectStruct.f236919e = weAppQualityLibInjectStruct.mo86045b("AppId", a.f245833e, true);
            weAppQualityLibInjectStruct.f236918d = weAppQualityLibInjectStruct.mo86045b("InstanceId", a.f245832d, true);
            weAppQualityLibInjectStruct.f236921g = (long) a.f245834f;
            weAppQualityLibInjectStruct.f236922h = (long) a.f245835g;
            weAppQualityLibInjectStruct.f236920f = (long) a.f245837i;
            weAppQualityLibInjectStruct.f236924j = (long) a.f245836h;
            weAppQualityLibInjectStruct.f236927m = a.mo116871a();
        } else {
            weAppQualityLibInjectStruct.f236927m = 1;
        }
        mo116887f(weAppQualityLibInjectStruct, iVar);
        return weAppQualityLibInjectStruct;
    }

    /* renamed from: i */
    public void mo116890i(boolean z, String str, long j) {
        WeAppQualityAndroidMagicBrushCreateCostStruct weAppQualityAndroidMagicBrushCreateCostStruct = new WeAppQualityAndroidMagicBrushCreateCostStruct();
        if (!z) {
            QualitySessionRuntime c = C84185b.m103770c(str, true);
            if (c != null) {
                weAppQualityAndroidMagicBrushCreateCostStruct.f236672e = weAppQualityAndroidMagicBrushCreateCostStruct.mo86045b("AppId", c.f245833e, true);
                weAppQualityAndroidMagicBrushCreateCostStruct.f236671d = weAppQualityAndroidMagicBrushCreateCostStruct.mo86045b("InstanceId", c.f245832d, true);
                int i = c.f245834f;
                weAppQualityAndroidMagicBrushCreateCostStruct.f236673f = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityAndroidMagicBrushCreateCostStruct.C80758a.demo : WeAppQualityAndroidMagicBrushCreateCostStruct.C80758a.debug : WeAppQualityAndroidMagicBrushCreateCostStruct.C80758a.release;
                weAppQualityAndroidMagicBrushCreateCostStruct.f236674g = (long) c.f245835g;
                weAppQualityAndroidMagicBrushCreateCostStruct.f236676i = (long) c.f245836h;
            } else {
                return;
            }
        }
        weAppQualityAndroidMagicBrushCreateCostStruct.f236677j = j;
        weAppQualityAndroidMagicBrushCreateCostStruct.mo86048e("StartTimeStampMs", j);
        long nowMilliSecond = Util.nowMilliSecond();
        weAppQualityAndroidMagicBrushCreateCostStruct.f236678k = nowMilliSecond;
        weAppQualityAndroidMagicBrushCreateCostStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
        long j2 = weAppQualityAndroidMagicBrushCreateCostStruct.f236678k - weAppQualityAndroidMagicBrushCreateCostStruct.f236677j;
        weAppQualityAndroidMagicBrushCreateCostStruct.f236675h = j2;
        weAppQualityAndroidMagicBrushCreateCostStruct.mo86046c("CostTimeMs", j2);
        weAppQualityAndroidMagicBrushCreateCostStruct.f236679l = z ? 1 : 0;
        weAppQualityAndroidMagicBrushCreateCostStruct.mo86054n();
    }

    /* renamed from: j */
    public void mo116891j(String str, C84182a0 a0Var) {
        QualitySessionRuntime c = C84185b.m103770c(str, true);
        if (c != null) {
            WeAppQualityRuntimeStruct weAppQualityRuntimeStruct = new WeAppQualityRuntimeStruct();
            weAppQualityRuntimeStruct.f237049e = weAppQualityRuntimeStruct.mo86045b("AppId", c.f245833e, true);
            weAppQualityRuntimeStruct.f237048d = weAppQualityRuntimeStruct.mo86045b("InstanceId", c.f245832d, true);
            int i = c.f245834f;
            weAppQualityRuntimeStruct.f237051g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityRuntimeStruct.C80773a.demo : WeAppQualityRuntimeStruct.C80773a.debug : WeAppQualityRuntimeStruct.C80773a.release;
            weAppQualityRuntimeStruct.f237052h = (long) c.f245835g;
            weAppQualityRuntimeStruct.f237050f = (long) c.f245837i;
            weAppQualityRuntimeStruct.f237054j = (long) c.f245836h;
            weAppQualityRuntimeStruct.f237038A = (long) c.f245840A.get();
            weAppQualityRuntimeStruct.f237055k = 0;
            weAppQualityRuntimeStruct.mo86048e("StartTimeStampMs", 0);
            weAppQualityRuntimeStruct.f237056l = 0;
            weAppQualityRuntimeStruct.mo86048e("EndTimeStampMs", 0);
            weAppQualityRuntimeStruct.f237053i = 0;
            weAppQualityRuntimeStruct.mo86046c("CostTimeMs", 0);
            weAppQualityRuntimeStruct.f237057m = (long) a0Var.f245868a;
            weAppQualityRuntimeStruct.f237058n = (long) Math.round(a0Var.f245869b);
            C84237z.C84238a aVar = a0Var.f245870c;
            if (aVar != null) {
                weAppQualityRuntimeStruct.f237066v = (long) aVar.ordinal();
            } else {
                weAppQualityRuntimeStruct.f237066v = 0;
            }
            weAppQualityRuntimeStruct.f237067w = (long) a0Var.f245871d;
            weAppQualityRuntimeStruct.f237068x = (long) a0Var.f245872e;
            weAppQualityRuntimeStruct.f237069y = (long) a0Var.f245873f;
            weAppQualityRuntimeStruct.f237062r = (long) a0Var.f245874g;
            weAppQualityRuntimeStruct.f237063s = (long) a0Var.f245875h;
            weAppQualityRuntimeStruct.f237060p = (long) a0Var.f245876i;
            weAppQualityRuntimeStruct.f237061q = (long) a0Var.f245877j;
            weAppQualityRuntimeStruct.f237064t = (long) (a0Var.f245878k / 1000);
            weAppQualityRuntimeStruct.f237065u = (long) a0Var.f245879l;
            weAppQualityRuntimeStruct.f237059o = (long) a0Var.f245880m;
            weAppQualityRuntimeStruct.f237070z = (long) a0Var.f245881n;
            weAppQualityRuntimeStruct.f237039B = (long) a0Var.f245882o;
            weAppQualityRuntimeStruct.f237040C = (long) a0Var.f245883p;
            weAppQualityRuntimeStruct.f237041D = (long) a0Var.f245884q;
            weAppQualityRuntimeStruct.f237042E = (long) a0Var.f245885r;
            weAppQualityRuntimeStruct.f237043F = (long) a0Var.f245886s;
            weAppQualityRuntimeStruct.f237044G = (long) a0Var.f245887t;
            weAppQualityRuntimeStruct.f237045H = (long) a0Var.f245888u;
            weAppQualityRuntimeStruct.f237046I = (long) a0Var.f245889v;
            ICommLibReader O1 = c.f245854o.mo113184O1(false);
            weAppQualityRuntimeStruct.f237047J = weAppQualityRuntimeStruct.mo86045b("libVersion", O1 == null ? "" : O1.mo113377i(), true);
            weAppQualityRuntimeStruct.mo86054n();
        }
    }

    /* renamed from: k */
    public void mo116892k(C81879g gVar, String str, long j, long j2, boolean z, long j3) {
        if (gVar.isRunning()) {
            WeAppQualityLibInjectStruct weAppQualityLibInjectStruct = new WeAppQualityLibInjectStruct();
            QualitySessionRuntime c = C84185b.m103770c(gVar.getAppId(), true);
            if (c != null) {
                weAppQualityLibInjectStruct.f236919e = weAppQualityLibInjectStruct.mo86045b("AppId", c.f245833e, true);
                weAppQualityLibInjectStruct.f236918d = weAppQualityLibInjectStruct.mo86045b("InstanceId", c.f245832d, true);
                weAppQualityLibInjectStruct.f236921g = (long) c.f245834f;
                weAppQualityLibInjectStruct.f236922h = (long) c.f245835g;
                weAppQualityLibInjectStruct.f236920f = (long) c.f245837i;
                weAppQualityLibInjectStruct.f236924j = (long) c.f245836h;
                mo116887f(weAppQualityLibInjectStruct, gVar.getJsRuntime());
                weAppQualityLibInjectStruct.mo112531s(gVar instanceof C83780d1 ? "WebView-wxConfigReady" : ((AppBrandRuntimeWC) gVar.getRuntime()).mo121254q1() ? "GameMainContext-wxConfigReady" : "MainContext-wxConfigReady");
                weAppQualityLibInjectStruct.f236930p = (long) Util.nullAsNil(str).length();
                weAppQualityLibInjectStruct.f236929o = weAppQualityLibInjectStruct.mo86045b("libVersion", gVar.mo114272k().mo113377i(), true);
                weAppQualityLibInjectStruct.f236933s = z ? 1 : 0;
                weAppQualityLibInjectStruct.f236925k = j;
                weAppQualityLibInjectStruct.mo86048e("StartTimeStampMs", j);
                weAppQualityLibInjectStruct.f236926l = j2;
                weAppQualityLibInjectStruct.mo86048e("EndTimeStampMs", j2);
                long j4 = weAppQualityLibInjectStruct.f236926l - weAppQualityLibInjectStruct.f236925k;
                weAppQualityLibInjectStruct.f236923i = j4;
                weAppQualityLibInjectStruct.mo86046c("CostTimeMs", j4);
                weAppQualityLibInjectStruct.f236934t = j3;
                if (gVar.mo114272k() instanceof AbsReader) {
                    weAppQualityLibInjectStruct.f236937w = weAppQualityLibInjectStruct.mo86045b("expt", Util.nullAsNil(((AbsReader) gVar.mo114272k()).mo113370Z().mo13713a()), true);
                }
                weAppQualityLibInjectStruct.mo86054n();
            }
        }
    }

    /* renamed from: l */
    public void mo116893l(C84343y yVar, String str, long j, C84136m mVar) {
        C84343y yVar2 = yVar;
        long j2 = j;
        WeAppQualityAppServiceInitStruct weAppQualityAppServiceInitStruct = new WeAppQualityAppServiceInitStruct();
        long j3 = 0;
        if (!(yVar2 != null)) {
            QualitySessionRuntime c = C84185b.m103770c(str, true);
            if (c != null) {
                weAppQualityAppServiceInitStruct.f236731e = weAppQualityAppServiceInitStruct.mo86045b("AppId", c.f245833e, true);
                weAppQualityAppServiceInitStruct.f236730d = weAppQualityAppServiceInitStruct.mo86045b("InstanceId", c.f245832d, true);
                int i = c.f245834f;
                weAppQualityAppServiceInitStruct.f236733g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityAppServiceInitStruct.C80762a.demo : WeAppQualityAppServiceInitStruct.C80762a.debug : WeAppQualityAppServiceInitStruct.C80762a.release;
                weAppQualityAppServiceInitStruct.f236734h = (long) c.f245835g;
                weAppQualityAppServiceInitStruct.f236732f = (long) c.f245837i;
                weAppQualityAppServiceInitStruct.f236736j = (long) c.f245836h;
                weAppQualityAppServiceInitStruct.f236739m = c.mo116871a();
                if (c.f245865z) {
                    j3 = 1;
                }
                weAppQualityAppServiceInitStruct.f236741o = j3;
            } else {
                return;
            }
        } else {
            weAppQualityAppServiceInitStruct.f236739m = 1;
            if (yVar2 == C84343y.WAGAME) {
                j3 = 1;
            }
            weAppQualityAppServiceInitStruct.f236741o = j3;
        }
        weAppQualityAppServiceInitStruct.f236737k = j2;
        weAppQualityAppServiceInitStruct.mo86048e("StartTimeStampMs", j2);
        long nowMilliSecond = Util.nowMilliSecond();
        weAppQualityAppServiceInitStruct.f236738l = nowMilliSecond;
        weAppQualityAppServiceInitStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
        long j4 = weAppQualityAppServiceInitStruct.f236738l - j2;
        weAppQualityAppServiceInitStruct.f236735i = j4;
        weAppQualityAppServiceInitStruct.mo86046c("CostTimeMs", j4);
        int ordinal = mVar.ordinal();
        if (ordinal == 0) {
            weAppQualityAppServiceInitStruct.f236740n = 1;
        } else if (ordinal == 1) {
            weAppQualityAppServiceInitStruct.f236740n = 2;
        } else if (ordinal == 2) {
            weAppQualityAppServiceInitStruct.f236740n = 3;
        } else if (ordinal == 3) {
            weAppQualityAppServiceInitStruct.f236740n = 4;
        } else if (ordinal == 4) {
            weAppQualityAppServiceInitStruct.f236740n = 6;
        } else if (ordinal != 5) {
            weAppQualityAppServiceInitStruct.f236740n = 2147483647L;
        } else {
            weAppQualityAppServiceInitStruct.f236740n = 5;
        }
        weAppQualityAppServiceInitStruct.f236742p = weAppQualityAppServiceInitStruct.mo86045b("engineVersion", C80135V8.getV8Version(), true);
        weAppQualityAppServiceInitStruct.mo86054n();
    }

    /* renamed from: m */
    public void mo116894m(String str, AppStartupPerformanceReportBundle appStartupPerformanceReportBundle) {
        String str2 = str;
        AppStartupPerformanceReportBundle appStartupPerformanceReportBundle2 = appStartupPerformanceReportBundle;
        if (appStartupPerformanceReportBundle2 == null) {
            Log.m105924i("MicroMsg.AppBrandQualitySystem", "reportAppStartupPerformanceReportBundle, but bundle == null");
            return;
        }
        QualitySessionRuntime c = C84185b.m103770c(str2, true);
        if (c != null) {
            if (appStartupPerformanceReportBundle2.f243301u) {
                c.f245849J = true;
            }
            if (appStartupPerformanceReportBundle2.f243302v) {
                c.f245851L = true;
            }
            if (appStartupPerformanceReportBundle2.f243303w) {
                c.f245852M = true;
            }
            for (kv_14609 next : appStartupPerformanceReportBundle2.f243289f) {
                next.getClass();
                next.f245654A = c.f245832d;
                next.f245655B = c.f245835g;
                next.f245656C = c.f245836h;
                if (DebuggerShell.f239772d) {
                    String format = String.format("{ \"moduleName\": \"%s\",\"pkgType\":%d, \"size\": %d }", new Object[]{next.f245670i, Integer.valueOf(next.f245684z), Integer.valueOf(next.f245677s)});
                    C83997d.m103518a(c.f245833e, "Native", "DownloadPkg", next.f245680v, next.f245681w, format);
                }
                next.f245654A = c.f245832d;
                Log.m105925i("MicroMsg.AppBrandQualitySystem", "reportKv14609 %s", next.toString());
                next.mo116820c();
            }
            for (WeAppQualitySystemGetDownloadCGIStruct next2 : appStartupPerformanceReportBundle2.f243288e) {
                next2.f237166e = next2.mo86045b("AppId", c.f245833e, true);
                next2.f237165d = next2.mo86045b("InstanceId", c.f245832d, true);
                next2.f237168g = WeAppQualitySystemGetDownloadCGIStruct.C80779a.m98593a(c.f245834f);
                next2.f237169h = (long) c.f245835g;
                next2.f237171j = (long) c.f245836h;
                next2.f237167f = (long) c.f245837i;
                next2.mo86054n();
            }
            c.f245854o.mo113020N0(new C84192a(this, str2, appStartupPerformanceReportBundle2));
        }
    }

    /* renamed from: n */
    public final void mo116895n(boolean z, String str, long j, C84106b0 b0Var) {
        WeAppQualityWebviewInitStruct weAppQualityWebviewInitStruct = new WeAppQualityWebviewInitStruct();
        if (!z) {
            QualitySessionRuntime c = C84185b.m103770c(str, true);
            if (c != null) {
                weAppQualityWebviewInitStruct.f237318e = weAppQualityWebviewInitStruct.mo86045b("AppId", c.f245833e, true);
                weAppQualityWebviewInitStruct.f237317d = weAppQualityWebviewInitStruct.mo86045b("InstanceId", c.f245832d, true);
                int i = c.f245834f;
                weAppQualityWebviewInitStruct.f237320g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityWebviewInitStruct.C80792a.demo : WeAppQualityWebviewInitStruct.C80792a.debug : WeAppQualityWebviewInitStruct.C80792a.release;
                weAppQualityWebviewInitStruct.f237321h = (long) c.f245835g;
                weAppQualityWebviewInitStruct.f237319f = (long) c.f245837i;
                weAppQualityWebviewInitStruct.f237323j = (long) c.f245836h;
                weAppQualityWebviewInitStruct.f237326m = c.mo116871a();
            } else {
                return;
            }
        } else {
            weAppQualityWebviewInitStruct.f237326m = 1;
        }
        weAppQualityWebviewInitStruct.f237324k = j;
        weAppQualityWebviewInitStruct.mo86048e("StartTimeStampMs", j);
        long nowMilliSecond = Util.nowMilliSecond();
        weAppQualityWebviewInitStruct.f237325l = nowMilliSecond;
        weAppQualityWebviewInitStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
        long j2 = weAppQualityWebviewInitStruct.f237325l - j;
        weAppQualityWebviewInitStruct.f237322i = j2;
        weAppQualityWebviewInitStruct.mo86046c("CostTimeMs", j2);
        int ordinal = b0Var.ordinal();
        if (ordinal == 0) {
            weAppQualityWebviewInitStruct.f237327n = 2;
        } else if (ordinal == 1) {
            weAppQualityWebviewInitStruct.f237327n = 4;
        } else if (ordinal == 2) {
            weAppQualityWebviewInitStruct.f237327n = 3;
        } else if (ordinal != 3) {
            weAppQualityWebviewInitStruct.f237327n = 2147483647L;
        } else {
            weAppQualityWebviewInitStruct.f237327n = 5;
        }
        weAppQualityWebviewInitStruct.f237328o = mo116900d();
        weAppQualityWebviewInitStruct.f237329p = weAppQualityWebviewInitStruct.mo86045b("engineVersionStr", mo116900d() + "", true);
        weAppQualityWebviewInitStruct.mo86054n();
    }
}
