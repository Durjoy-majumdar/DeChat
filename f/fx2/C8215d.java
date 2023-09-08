package fx2;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import kr0.C88273g1;
import kr0.C88274h0;
import org.json.JSONObject;

/* renamed from: fx2.d */
public final class C8215d extends C82016a0<C82381f> {
    public static final int CTRL_INDEX = 644;
    public static final String NAME = "preloadMiniProgramEnv";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.SurfaceApp.JsApiPreloadMiniProgramEnv", "preloadEnv");
        ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113305TH(C88273g1.FINDER_LIVING);
        Object[] objArr = new Object[0];
        String str = "ok";
        HashMap hashMap = new HashMap();
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        hashMap.putAll(new HashMap());
        String m = mo115112m(str, hashMap);
        C87412m.m108593f(m, "makeReturnJson(ret.errMsg, ret.values)");
        return m;
    }
}
