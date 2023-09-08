package fm0;

import bt0.C79815i;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: fm0.h0 */
public class C86943h0 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 388;
    public static final String NAME = "setMenuStyle";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105918d("MicroMsg.JsApiSetMenuStyle", "JsApiSetMenuStyle!");
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.JsApiSetMenuStyle", "data is null");
            return;
        }
        String optString = jSONObject.optString("style");
        C83780d1 pageView = i2Var.getRuntime().mo113042Z().getPageView();
        if (pageView == null) {
            i2Var.mo109647a(i, mo115109j("fail view is null"));
            return;
        }
        if (optString.equalsIgnoreCase("dark")) {
            pageView.f244564Q = C79815i.C79816a.BLACK;
        } else if (optString.equalsIgnoreCase("light")) {
            pageView.f244564Q = C79815i.C79816a.WHITE;
        } else {
            i2Var.mo109647a(i, mo115109j("fail invalid style " + optString));
            Log.m105921e("MicroMsg.JsApiSetMenuStyle", "fail invalid style %s", optString);
            return;
        }
        i2Var.mo109647a(i, mo115109j("ok"));
    }
}
