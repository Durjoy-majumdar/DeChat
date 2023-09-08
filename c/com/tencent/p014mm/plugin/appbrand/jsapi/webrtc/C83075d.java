package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83081k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.AbstractMap;
import java.util.HashMap;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.d */
public final class C83075d extends C82016a0<C82381f> {
    public static final int CTRL_INDEX = 1204;
    public static final String NAME = "isOpenSR";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        Integer valueOf = jSONObject != null ? Integer.valueOf(jSONObject.optInt("mediaStreamTrackId", 0)) : null;
        C83081k.C83082a aVar = C83081k.f242843u;
        AbstractMap abstractMap = C83081k.f242844v;
        C87412m.m108591d(valueOf);
        int intValue = ((Number) C90364q0.m113145d(abstractMap, valueOf)).intValue();
        if (intValue == -1) {
            HashMap hashMap = new HashMap();
            hashMap.put("isOpen", Boolean.FALSE);
            hashMap.put("errCode", 1001);
            C13598b0 b0Var = C13598b0.f38549a;
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap.put("errno", 0);
            String o = mo115114o("ok", hashMap);
            C87412m.m108593f(o, "makeReturnJson(AppBrandE…tants.SR_EXECUTE_ERROR)})");
            return o;
        } else if (intValue != 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("isOpen", Boolean.TRUE);
            hashMap2.put("errCode", 1002);
            C13598b0 b0Var2 = C13598b0.f38549a;
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            String o2 = mo115114o("ok", hashMap2);
            C87412m.m108593f(o2, "makeReturnJson(AppBrandE…SRConstants.SR_IS_OPEN)})");
            return o2;
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("isOpen", Boolean.FALSE);
            hashMap3.put("errCode", 1000);
            C13598b0 b0Var3 = C13598b0.f38549a;
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap3.put("errno", 0);
            String o3 = mo115114o("ok", hashMap3);
            C87412m.m108593f(o3, "makeReturnJson(AppBrandE…onstants.SR_INIT_ERROR)})");
            return o3;
        }
    }
}
