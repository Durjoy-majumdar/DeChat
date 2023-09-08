package ql0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84731d0;
import com.tencent.p014mm.plugin.appbrand.utils.C84732d1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86920e;
import op0.C89251a;
import org.json.JSONObject;

/* renamed from: ql0.a */
public class C89698a extends C82016a0<C82381f> {
    public static final int CTRL_INDEX = 1184;
    public static final String NAME = "awaitLoadSubPackageTask";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        String optString = jSONObject.optString("loadTaskId");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiAwaitLoadSubPackageTask", "null or nil loadTaskId");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            return mo115115p("fail:jsapi invalid request data", jSONObject2);
        }
        int optInt = jSONObject.optInt("timeout", 10000);
        Log.m105925i("MicroMsg.JsApiAwaitLoadSubPackageTask", "await taskId: %s, timeout: %d", optString, Integer.valueOf(optInt));
        long currentTicks = Util.currentTicks();
        String y = C89703c.m112169y(optString);
        C84732d1 a = C84731d0.m104389a(fVar);
        boolean H = a.mo117454H(y, (long) optInt);
        C89251a.C89255d dVar = (C89251a.C89255d) a.mo117456f(y);
        Object[] objArr = new Object[4];
        objArr[0] = optString;
        objArr[1] = Long.valueOf(Util.ticksToNow(currentTicks));
        objArr[2] = Boolean.valueOf(H);
        objArr[3] = dVar != null ? dVar.toString() : "null";
        Log.m105925i("MicroMsg.JsApiAwaitLoadSubPackageTask", "await taskId: %s done, using %d ms and is success %b and load result is %s", objArr);
        return mo115111l((String) null, H ? dVar == C89251a.C89255d.OK ? C86920e.f252311a : dVar == C89251a.C89255d.CANCEL ? C86920e.f252312b : C86920e.f252314d : C86920e.f252315e, (JSONObject) null);
    }
}
