package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.app.Activity;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.f */
public final class C1714f extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 103;
    public static final String NAME = "chooseLocation";

    /* renamed from: g */
    public final int f11411g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105925i("MicroMsg.JsApiChooseLocation", "chooseLocation data:%s", jSONObject);
        Intent intent = new Intent();
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", 4);
        if (jSONObject != null && jSONObject.has("latitude") && jSONObject.has("longitude")) {
            double d = Util.getDouble(jSONObject.optString("latitude"), 0.0d);
            double d2 = Util.getDouble(jSONObject.optString("longitude"), 0.0d);
            intent.putExtra("KPickPoiLat", d);
            intent.putExtra("KPickPoiLong", d2);
        }
        Activity o0 = i2Var.mo114344o0();
        if (o0 == null) {
            i2Var.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e("MicroMsg.JsApiChooseLocation", "mmActivity is null, invoke fail!");
            return;
        }
        C89916g.m112446a(o0).mo124232f(new C115248e(this, i2Var, i));
        C88144b.m109795m(o0, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, this.f11411g);
    }
}
