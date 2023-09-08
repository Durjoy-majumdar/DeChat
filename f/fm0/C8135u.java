package fm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: fm0.u */
public final class C8135u extends C82016a0<C83780d1> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "initReadyForPrerender";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C83780d1 d1Var = (C83780d1) fVar;
        StringBuilder sb = new StringBuilder();
        sb.append("invoke appId:");
        String str = null;
        sb.append(d1Var != null ? d1Var.getAppId() : null);
        sb.append(" webviewId:");
        sb.append(d1Var != null ? d1Var.getComponentId() : 0);
        sb.append(", url:");
        if (d1Var != null) {
            str = d1Var.mo116162Q0();
        }
        sb.append(str);
        Log.m105924i("Luggage.JsApiPageInitReadyForPreRender", sb.toString());
        String j = mo115109j("ok");
        C87412m.m108593f(j, "makeReturnJson(\"ok\")");
        return j;
    }
}
