package sk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import ky3.C88336d;

/* renamed from: sk0.a */
public final class C90215a {
    /* renamed from: a */
    public static void m112929a(C82268c cVar, int i, C82381f fVar, int i2, String str, HashMap hashMap, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            hashMap = null;
        }
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(str, "errMsg");
        Log.m105919d("MicroMsg.BLE.BleHelpExt", "callbackFail: api = %s, reason = %s", cVar.getClass().getSimpleName(), str);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        hashMap.put("errCode", Integer.valueOf(i2));
        fVar.mo109647a(i, cVar.mo115112m(str, hashMap));
    }

    /* renamed from: b */
    public static final void m112930b(C82268c<C82381f> cVar, int i, C82381f fVar, HashMap<String, Object> hashMap) {
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(fVar, "env");
        Log.m105918d("MicroMsg.BLE.BleHelpExt", "callbackSuccess: api = " + cVar.getClass().getSimpleName());
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("errCode", 0);
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap.put("errno", 0);
        fVar.mo109647a(i, cVar.mo115114o("ok", hashMap));
    }

    /* renamed from: c */
    public static final int m112931c() {
        return C88336d.m110136a(System.currentTimeMillis()).mo122723h(1, Integer.MAX_VALUE);
    }
}
