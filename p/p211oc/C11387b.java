package p211oc;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: oc.b */
public final class C11387b extends C82268c<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "getSkylineInfo";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        HashMap<String, Object> a = C89152a.f256872a.mo123488a(gVar);
        Log.m105924i("JsApiGetSkylineInfo", "getSkylineInfo: " + a);
        if (gVar != null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            a.put("errno", 0);
            gVar.mo109647a(i, mo115114o("ok", a));
        }
    }
}
