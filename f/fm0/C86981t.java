package fm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: fm0.t */
public final class C86981t extends C82016a0<C83780d1> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "initReadyAfterRenderingCache";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C83780d1 d1Var = (C83780d1) fVar;
        if (d1Var != null) {
            d1Var.mo116176e1(NAME);
        }
        String j = mo115109j("ok");
        C87412m.m108593f(j, "makeReturnJson(\"ok\")");
        return j;
    }
}
