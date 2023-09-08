package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import c30.C104288c;
import c30.C104289g;
import c30.C26827e;
import c30.C79922d;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import p170ic.C87689c;
import p828wa.C53095a;
import p828wa.C53096b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.g1 */
public final class C4473g1 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.g1$a */
    public static final class C4474a extends C87413o implements C32226l<C79922d, C13598b0> {

        /* renamed from: d */
        public static final C4474a f19239d = new C4474a();

        public C4474a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C79922d dVar = (C79922d) obj;
            C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
            C104289g gVar = new C104289g((C104288c) dVar);
            C5139t.m5183e(gVar.getInt("businesstype"), gVar.getInt("datatype"));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "recordOperateUserData";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            C87412m.m108591d(bVar);
            bVar.mo6945a("fail", (JSONObject) null);
            return;
        }
        Log.m105924i("MicroMsg.JsApiRecordOperateUserData", "data: " + e);
        String optString = e.optString("datalist");
        if (optString != null) {
            C87689c.m109089b(new C26827e(optString), C4474a.f19239d);
        }
        C87412m.m108591d(bVar);
        bVar.mo6945a((String) null, (JSONObject) null);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
