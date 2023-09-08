package com.tencent.p014mm.plugin.appbrand;

import ai0.C79562l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import jk0.C87985i;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.u2 */
public class C84348u2 implements C87985i {
    /* renamed from: pG */
    public C82520h mo116941pG(C82381f fVar, JSONObject jSONObject) {
        boolean z = false;
        if (fVar instanceof C83780d1) {
            if (jSONObject != null && jSONObject.optInt("dest", 0) == 2) {
                return ((C83780d1) fVar).mo116161P0();
            }
        }
        if (fVar instanceof C82520h) {
            return (C82520h) fVar;
        }
        if (!(fVar instanceof C81925i2)) {
            return null;
        }
        C88267e eVar = (C88267e) fVar;
        if (jSONObject != null && jSONObject.optInt("dest", 0) == 1) {
            z = true;
        }
        if (!z) {
            return eVar.mo114341l0();
        }
        C79562l lVar = eVar.f255133S;
        if (lVar != null) {
            return lVar;
        }
        C79562l lVar2 = new C79562l(eVar, eVar.getRuntime().f238295w1);
        eVar.f255133S = lVar2;
        return lVar2;
    }
}
