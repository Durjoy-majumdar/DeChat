package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.model.AdReportCgiHelper;
import org.json.JSONObject;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o0 */
public class C1762o0 extends C82268c {
    public static final int CTRL_INDEX = 435;
    public static final String NAME = "adDataReport";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o0$a */
    public class C1763a implements AdReportCgiHelper.C1964b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f11499a;

        /* renamed from: b */
        public final /* synthetic */ int f11500b;

        public C1763a(C82381f fVar, int i) {
            this.f11499a = fVar;
            this.f11500b = i;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        AppBrandStatObject d = C81682d.m100224d(fVar.getAppId());
        if (d != null) {
            str = d.f245533f + "," + d.f245534g + "," + d.f245531d + "," + d.f245532e + "," + jSONObject.optString("adInfo");
        } else {
            str = jSONObject.optString("adInfo");
        }
        AdReportCgiHelper.m1949a(15175, str + "," + C87203t.m108270f(false), new C1763a(fVar, i));
    }
}
