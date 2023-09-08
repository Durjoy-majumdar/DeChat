package p211oc;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: oc.c */
public final class C11388c extends C82016a0<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "getSkylineInfoSync";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        HashMap<String, Object> a = C89152a.f256872a.mo123488a((C81879g) fVar);
        Log.m105924i("JsApiGetSkylineInfoSync", "getSkylineInfoSync: " + a);
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        a.put("errno", 0);
        String o = mo115114o("ok", a);
        C87412m.m108593f(o, "makeReturnJson(AppBrandErrors.General.OK, jMap)");
        return o;
    }
}
