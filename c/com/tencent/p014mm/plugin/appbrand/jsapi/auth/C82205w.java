package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import az0.C79640g;
import bz0.C79889p;
import bz0.C79896s;
import com.tencent.p014mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82185m0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.w */
public final class C82205w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f241077d;

    /* renamed from: e */
    public final /* synthetic */ int f241078e;

    /* renamed from: f */
    public final /* synthetic */ C82207x f241079f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.w$a */
    public static final class C82206a implements C82185m0.C82186a {

        /* renamed from: a */
        public final /* synthetic */ C81879g f241080a;

        /* renamed from: b */
        public final /* synthetic */ int f241081b;

        /* renamed from: c */
        public final /* synthetic */ C82207x f241082c;

        public C82206a(C81879g gVar, int i, C82207x xVar) {
            this.f241080a = gVar;
            this.f241081b = i;
            this.f241082c = xVar;
        }

        /* renamed from: a */
        public void mo114597a(String str) {
            C87412m.m108594g(str, "plateNo");
            Log.m105924i("MicroMsg.AppBrand.JsApiChooseLicensePlate", "onPlateNoChosen plateNo:" + str + ", appId:" + this.f241080a.getAppId() + ", callbackId:" + this.f241081b);
            C81879g gVar = this.f241080a;
            int i = this.f241081b;
            C82207x xVar = this.f241082c;
            HashMap hashMap = new HashMap();
            hashMap.put("plateNumber", str);
            C13598b0 b0Var = C13598b0.f38549a;
            gVar.mo109647a(i, xVar.mo115112m("ok", hashMap));
        }

        public void onUserCancel() {
            Log.m105924i("MicroMsg.AppBrand.JsApiChooseLicensePlate", "onUserCancel appId:" + this.f241080a.getAppId() + ", callbackId:" + this.f241081b);
            this.f241080a.mo109647a(this.f241081b, this.f241082c.mo115109j("fail cancel"));
        }
    }

    public C82205w(C81879g gVar, int i, C82207x xVar) {
        this.f241077d = gVar;
        this.f241078e = i;
        this.f241079f = xVar;
    }

    public final void run() {
        C81879g gVar = this.f241077d;
        C82185m0 m0Var = new C82185m0(gVar, new C82206a(gVar, this.f241078e, this.f241079f));
        C79896s sVar = new C79896s(C79640g.C79641a.ReqScene_HalfPage);
        m0Var.f241039d = sVar;
        sVar.f234075b = m0Var;
        sVar.mo110059b();
        C81879g gVar2 = m0Var.f241036a;
        C87412m.m108591d(gVar2);
        WACarLicensePlateAuthLogStruct wACarLicensePlateAuthLogStruct = m0Var.f241043h;
        wACarLicensePlateAuthLogStruct.f236454d = wACarLicensePlateAuthLogStruct.mo86045b("AppId", gVar2.getAppId(), true);
        QualitySessionRuntime c = C84185b.m103770c(gVar2.getAppId(), true);
        if (c != null) {
            WACarLicensePlateAuthLogStruct wACarLicensePlateAuthLogStruct2 = m0Var.f241043h;
            wACarLicensePlateAuthLogStruct2.f236455e = (long) c.f245837i;
            wACarLicensePlateAuthLogStruct2.f236456f = (long) c.f245834f;
            wACarLicensePlateAuthLogStruct2.f236457g = (long) c.f245835g;
        }
        C79889p pVar = m0Var.f241039d;
        C83780d1 d1Var = null;
        if (pVar != null) {
            ((C79896s) pVar).getViewModel().f248033f = gVar2.getAppId();
            gVar2.getRuntime().f238113K.mo122978a(m0Var.f241045j);
            if (gVar2 instanceof C83780d1) {
                d1Var = (C83780d1) gVar2;
            }
            if (d1Var != null) {
                d1Var.mo114865m(m0Var.f241045j);
            }
            gVar2.getRuntime().f238108F.add(m0Var);
            return;
        }
        C87412m.m108603p("viewPresenter");
        throw null;
    }
}
