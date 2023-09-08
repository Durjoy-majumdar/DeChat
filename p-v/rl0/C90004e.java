package rl0;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;
import wq0.C91062d;

/* renamed from: rl0.e */
public final class C90004e extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 646;
    @Deprecated
    public static final String NAME = "navigateBackNative";

    public C90004e() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null && gVar.getRuntime() != null && jSONObject != null) {
            String optString = jSONObject.optString("extraData");
            AppBrandInitConfig W = gVar.getRuntime().mo113036W();
            AppBrandInitConfigLU appBrandInitConfigLU = W instanceof AppBrandInitConfigLU ? (AppBrandInitConfigLU) W : null;
            C80242c<?> cVar = appBrandInitConfigLU != null ? appBrandInitConfigLU.f234820U : null;
            gVar.getRuntime().f238113K.mo122978a(new C90002d(gVar, i, jSONObject, cVar instanceof C80242c ? cVar : null, optString, this));
            gVar.getRuntime().mo113063k();
        }
    }
}
