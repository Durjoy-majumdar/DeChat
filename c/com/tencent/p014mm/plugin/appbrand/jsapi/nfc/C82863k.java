package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86918c;
import gy3.C87412m;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.k */
public final class C82863k {
    /* renamed from: a */
    public static final String m101618a(C82870p pVar, int i, String str, Map<String, ? extends Object> map) {
        C87412m.m108594g(pVar, "<this>");
        C87412m.m108594g(str, "errMsg");
        Map<Integer, C86918c> map2 = C82862j.f242301a;
        C86918c cVar = C82862j.f242301a.get(Integer.valueOf(i));
        if (cVar == null) {
            Log.m105920e("MicroMsg.AppBrand.NFCErrnoMigrationLogic", "makeReturnJson, errCode: " + i + ", errInfo is null");
            String m = pVar.mo115112m(str, map);
            C87412m.m108593f(m, "makeReturnJson(errMsg, errInfoMap)");
            return m;
        }
        String k = pVar.mo115110k(str, cVar, map);
        C87412m.m108593f(k, "makeReturnJson(errMsg, errInfo, errInfoMap)");
        return k;
    }
}
