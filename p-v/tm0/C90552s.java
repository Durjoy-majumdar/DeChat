package tm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82374e;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: tm0.s */
public final class C90552s extends C82016a0<C82381f> {
    @Deprecated
    private static final int CTRL_INDEX = 918;
    @Deprecated
    private static final String NAME = "getSystemInfoSync";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C90549p pVar = null;
        C82374e v = fVar != null ? fVar.mo109675v("getSystemInfo") : null;
        if (v instanceof C90549p) {
            pVar = (C90549p) v;
        }
        if (pVar == null) {
            String j = mo115109j("fail:not supported");
            C87412m.m108593f(j, "makeReturnJson(Constants…ApiMsg.API_NOT_SUPPORTED)");
            return j;
        }
        String m = mo115112m("ok", pVar.mo121609v(fVar));
        C87412m.m108593f(m, "makeReturnJson(\"ok\", legacyImpl.getInfo(env))");
        return m;
    }
}
