package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.content.Context;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.appbrand.commonjni.CheckBitmapIsBlankResultDetails;
import com.tencent.p014mm.autogen.mmdata.rpt.WAQualityReportStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C55548a;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84213o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import o40.C61926c;
import p206nj.C117627q;
import sx3.C110818d0;
import u24.C90599h;
import yi0.C91456b;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.v */
public final class C84228v implements C91456b.C91457a {

    /* renamed from: a */
    public final AppBrandRuntime f246038a;

    /* renamed from: b */
    public String f246039b;

    /* renamed from: c */
    public String f246040c;

    /* renamed from: d */
    public final C84223s f246041d = new C84223s(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.v$a */
    public static final class C84229a extends C87413o implements C32226l<String, CharSequence> {

        /* renamed from: d */
        public static final C84229a f246042d = new C84229a();

        public C84229a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            String a = C117627q.m165908a(str);
            C87412m.m108593f(a, "encode(it)");
            return a;
        }
    }

    public C84228v(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f246038a = appBrandRuntime;
        C91456b bVar = C91456b.f262190a;
        C91456b.f262191b.add(this);
    }

    /* renamed from: e */
    public static void m103823e(C84228v vVar, C83780d1 d1Var, C84213o.C84214a aVar, boolean z, C84213o oVar, CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails, int i, Object obj) {
        boolean z2 = (i & 4) != 0 ? true : z;
        int i2 = i & 16;
        AppBrandInitConfig appBrandInitConfig = null;
        CheckBitmapIsBlankResultDetails checkBitmapIsBlankResultDetails2 = i2 != 0 ? null : checkBitmapIsBlankResultDetails;
        vVar.getClass();
        C87412m.m108594g(d1Var, "page");
        C87412m.m108594g(aVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (d1Var.f244578Y && z2) {
            AppBrandRuntime runtime = d1Var.getRuntime();
            if (runtime != null) {
                appBrandInitConfig = runtime.mo113036W();
            }
            C87412m.m108592e(appBrandInitConfig, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC");
            C83606m1.m102638b(52, (AppBrandInitConfigWC) appBrandInitConfig);
        }
        C61926c.m72668M(new C84231x(vVar, aVar, z2, d1Var, oVar, checkBitmapIsBlankResultDetails2));
    }

    /* renamed from: a */
    public void mo116912a() {
        WAQualityReportStruct c = mo116914c();
        long j = 1;
        c.f236546m = 1;
        if (MMApplicationContext.isMainProcess()) {
            j = 2;
        }
        c.f236547n = j;
        mo116915d(c, mo116913b());
        C83849m0 Z = this.f246038a.mo113042Z();
        String currentUrl = Z != null ? Z.getCurrentUrl() : null;
        if (currentUrl == null) {
            currentUrl = "";
        }
        c.f236554u = c.mo86045b("QualityIssueHappenPagePath", C90599h.m113522o(C117627q.m165908a(currentUrl), 0, 1024), true);
        Log.m105924i("MicroMsg.AppBrand.QualityRuntimeErrorContextReporter", "report " + 25465 + ' ' + c.mo1006q());
        if (MMApplicationContext.isMainProcess()) {
            C115669n.INSTANCE.mo160134j(25465, c.mo1005p(), true, true, true);
            return;
        }
        C55548a aVar = C55548a.f158170a;
        String p = c.mo1005p();
        C87412m.m108593f(p, "this.toRptValue()");
        aVar.mo77079c(25465, 1, true, true, true, p);
        C55548a.m63179d(true);
    }

    /* renamed from: b */
    public final List<String> mo116913b() {
        LinkedList linkedList = new LinkedList();
        C83849m0 Z = this.f246038a.mo113042Z();
        if (Z != null) {
            ListIterator<C83820i0> listIterator = Z.f244745p.listIterator();
            while (listIterator.hasNext()) {
                linkedList.addLast(listIterator.next().getCurrentUrl());
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public final WAQualityReportStruct mo116914c() {
        ICommLibReader O1;
        WAQualityReportStruct wAQualityReportStruct = new WAQualityReportStruct();
        wAQualityReportStruct.f236538e = wAQualityReportStruct.mo86045b("Appid", this.f246038a.f238147j, true);
        AppBrandInitConfig W = this.f246038a.mo113036W();
        AppBrandInitConfigLU appBrandInitConfigLU = W instanceof AppBrandInitConfigLU ? (AppBrandInitConfigLU) W : null;
        if (appBrandInitConfigLU != null) {
            wAQualityReportStruct.f236537d = wAQualityReportStruct.mo86045b("InstanceId", appBrandInitConfigLU.f234838r, true);
            wAQualityReportStruct.f236539f = wAQualityReportStruct.mo86045b("Username", appBrandInitConfigLU.f234839s, true);
            wAQualityReportStruct.f236540g = ((long) appBrandInitConfigLU.f234841u) + 1000;
            AppBrandStatObject appBrandStatObject = appBrandInitConfigLU.f234834c1;
            wAQualityReportStruct.f236541h = (long) appBrandStatObject.f245533f;
            wAQualityReportStruct.f236542i = wAQualityReportStruct.mo86045b("SceneNote", appBrandStatObject.f245534g, true);
            wAQualityReportStruct.f236543j = (long) appBrandInitConfigLU.f234802F;
        }
        AppBrandRuntime appBrandRuntime = this.f246038a;
        AppBrandRuntimeWC appBrandRuntimeWC = appBrandRuntime instanceof AppBrandRuntimeWC ? (AppBrandRuntimeWC) appBrandRuntime : null;
        wAQualityReportStruct.f236544k = wAQualityReportStruct.mo86045b("PublibVersionStr", (appBrandRuntimeWC == null || (O1 = appBrandRuntimeWC.mo113184O1(false)) == null) ? null : O1.mo113377i(), true);
        wAQualityReportStruct.f236545l = wAQualityReportStruct.mo86045b("NetWorkType", C84116i0.m103660c((Context) null, 1, (Object) null), true);
        wAQualityReportStruct.f236548o = Util.nowMilliSecond();
        wAQualityReportStruct.f236551r = wAQualityReportStruct.mo86045b("QualityIssuePageLastError", (String) null, true);
        wAQualityReportStruct.f236552s = wAQualityReportStruct.mo86045b("QualityIssueServiceLastError", this.f246040c, true);
        wAQualityReportStruct.f236553t = wAQualityReportStruct.mo86045b("ServiceRuntimeContext", this.f246039b, true);
        String str = this.f246038a.mo113036W().f239363e;
        if (str == null) {
            str = "";
        }
        wAQualityReportStruct.f236529B = wAQualityReportStruct.mo86045b("NickName", C117627q.m165908a(str), true);
        return wAQualityReportStruct;
    }

    /* renamed from: d */
    public final void mo116915d(WAQualityReportStruct wAQualityReportStruct, List<String> list) {
        wAQualityReportStruct.f236549p = (long) list.size();
        wAQualityReportStruct.f236550q = wAQualityReportStruct.mo86045b("LastNPagePath", C90599h.m113522o(C110818d0.m150921S(list, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C84229a.f246042d, 30, (Object) null), 0, 1024), true);
    }
}
