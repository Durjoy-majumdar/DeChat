package fm0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: fm0.w */
public final class C8136w extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = 955;
    public static final String NAME = "preloadWebview";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        AppBrandRuntime runtime;
        C83849m0 Z;
        C83780d1 d1Var = (C83780d1) fVar;
        StringBuilder sb = new StringBuilder();
        sb.append("invoke appId:");
        String str = null;
        sb.append(d1Var != null ? d1Var.getAppId() : null);
        sb.append(", webviewId:");
        sb.append(d1Var != null ? d1Var.getComponentId() : 0);
        sb.append(", url:");
        if (d1Var != null) {
            str = d1Var.mo116162Q0();
        }
        sb.append(str);
        Log.m105924i("Luggage.JsApiPreloadNextWebview", sb.toString());
        if (!(d1Var == null || (runtime = d1Var.getRuntime()) == null || (Z = runtime.mo113042Z()) == null)) {
            Z.mo116332Q(NAME);
        }
        if (d1Var != null) {
            d1Var.mo109647a(i, mo115109j("ok"));
        }
    }
}
