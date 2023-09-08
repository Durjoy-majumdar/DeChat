package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import rq0.C90086e;

@Deprecated
/* renamed from: fm0.s */
public abstract class C86978s<CONTEXT extends C82381f, EXTENSION> extends C82016a0<CONTEXT> {

    /* renamed from: g */
    public final Class<EXTENSION> f252437g;

    public C86978s(Class<EXTENSION> cls) {
        this.f252437g = cls;
    }

    /* renamed from: t */
    public final String mo1731t(CONTEXT context, JSONObject jSONObject) {
        C83780d1 a = C82644m7.m101430a(context);
        if (a == null) {
            return mo115109j("fail:page don't exist");
        }
        if (jSONObject == null) {
            return mo115109j("fail:invalid data");
        }
        EXTENSION E0 = a.mo116150E0(this.f252437g);
        if (E0 != null) {
            C86974q1 q1Var = (C86974q1) this;
            C90086e eVar = (C90086e) E0;
            C87412m.m108594g((C81879g) context, "env");
            C87412m.m108594g(jSONObject, "data");
            C87412m.m108594g(eVar, "ext");
            int optInt = jSONObject.optInt("orientation", 0);
            String str = optInt != -90 ? optInt != 90 ? "portrait" : "landscape" : "landscapeLeft";
            Log.m105925i("MicroMsg.AppBrand.PrivateJsApiSetDisplayOrientation", "set display orientation:%s", str);
            eVar.mo116462e(str);
            String j = q1Var.mo115109j("ok");
            C87412m.m108593f(j, "makeReturnJson(\"ok\")");
            return j;
        } else if (!a.isRunning()) {
            return mo115109j("fail:interrupted");
        } else {
            if (!a.f241593r) {
                return mo115109j("fail:not supported");
            }
            throw new IllegalAccessError(String.format("%s Not Found", new Object[]{this.f252437g.getName()}));
        }
    }
}
