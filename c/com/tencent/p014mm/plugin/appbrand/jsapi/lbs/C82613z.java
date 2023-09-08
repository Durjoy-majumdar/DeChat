package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ms0.C88840a;
import org.json.JSONObject;
import p781zt.C39448b;
import p781zt.C39449c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.z */
public class C82613z extends C82576b<C81925i2> {
    public static final int CTRL_INDEX = 902;
    public static final String NAME = "openMapApp";

    /* renamed from: h */
    public Map<String, String> f241748h;

    /* renamed from: i */
    public double f241749i = 0.0d;

    /* renamed from: j */
    public double f241750j = 0.0d;

    /* renamed from: n */
    public final C82572a0 f241751n = new C82572a0();

    /* renamed from: o */
    public LocationInfo f241752o = new LocationInfo(false);

    /* renamed from: p */
    public LocationInfo f241753p = new LocationInfo(false);

    /* renamed from: q */
    public C39449c f241754q;

    /* renamed from: x */
    public void mo114896x(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiOpenMapApp", "data is null");
            i2Var.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiOpenMapApp", "data:%s", jSONObject);
        if (!mo114895w(i2Var)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("errCode", -2);
            i2Var.mo109647a(i, mo115112m("fail:system permission denied", hashMap));
            return;
        }
        try {
            this.f241749i = jSONObject.getDouble("latitude");
            this.f241750j = jSONObject.getDouble("longitude");
            String string = jSONObject.getString(FirebaseAnalytics.C113379b.DESTINATION);
            LocationInfo locationInfo = this.f241752o;
            locationInfo.f271930e = this.f241749i;
            locationInfo.f271931f = this.f241750j;
            locationInfo.f271933h = string;
            locationInfo.f271932g = 15;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiOpenMapApp", e, "", new Object[0]);
        }
        LocationInfo locationInfo2 = this.f241753p;
        LocationInfo locationInfo3 = this.f241752o;
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getDefaultPreference(), i2Var.getContext());
        Log.m105918d("MicroMsg.JsApiOpenMapApp", " initLanguage " + loadApplicationLanguage);
        if (loadApplicationLanguage.equals("language_default")) {
            LocaleUtil.updateApplicationResourceLocale(i2Var.getContext(), Locale.ENGLISH);
            loadApplicationLanguage = "en";
        } else {
            LocaleUtil.updateApplicationResourceLocale(i2Var.getContext(), LocaleUtil.transLanguageToLocale(loadApplicationLanguage));
        }
        locationInfo3.f271934i = loadApplicationLanguage;
        locationInfo2.f271934i = loadApplicationLanguage;
        if (this.f241754q == null) {
            this.f241754q = ((C39448b) C86312j.m106911c(C39448b.class)).mo61962rV(i2Var.getContext());
        }
        this.f241751n.mo114890a(i2Var.getRuntime());
        Bundle bundle = new Bundle();
        C88840a aVar = (C88840a) i2Var.mo109668l(C88840a.class);
        if (aVar != null) {
            aVar.mo123224M9("gcj02", new C82610v(this, i2Var, i), bundle);
        }
    }
}
