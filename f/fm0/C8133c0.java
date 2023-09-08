package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: fm0.c0 */
public final class C8133c0 extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "rewriteRoute";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null) {
            String optString = jSONObject != null ? jSONObject.optString("url") : null;
            if (optString == null || optString.length() == 0) {
                gVar.mo109647a(i, mo115109j("fail:invalid data"));
                return;
            }
            int optInt = jSONObject != null ? jSONObject.optInt("webviewId", 0) : 0;
            Log.m105924i("Luggage.WXA.JsApiRewriteRoute", "invoke rewriteRoute, webviewId:" + optInt + ", url:" + optString);
            gVar.mo109673t(new C8131b0(gVar, optInt, optString, i, this));
        }
    }
}
