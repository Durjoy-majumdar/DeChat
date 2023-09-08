package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84522d3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84524e3;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import js0.C88024r;
import org.json.JSONArray;
import org.json.JSONObject;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q6 */
public final class C82912q6 extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 215;
    public static final String NAME = "updatePerfData";

    /* renamed from: g */
    public static final SparseArray<Integer> f242394g;

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        f242394g = sparseArray;
        sparseArray.put(1378443347, 301);
        sparseArray.put(-380349418, 302);
        sparseArray.put(-869335772, 402);
        sparseArray.put(117036920, 403);
        sparseArray.put(-1654508303, 404);
        sparseArray.put(834843062, 405);
        sparseArray.put(-659273562, 406);
        sparseArray.put(-364572001, 407);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("dataArray");
        if (!AppBrandPerformanceManager.m103497f((C86812g) gVar.getRuntime()) || optJSONArray == null) {
            gVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("key");
                String optString2 = optJSONObject.optString("value");
                if (!Util.isNullOrNil(optString)) {
                    Integer num = f242394g.get(optString.hashCode());
                    if (num != null) {
                        AppBrandPerformanceManager.m103496e((C86812g) gVar.getRuntime(), num.intValue(), optString2);
                    } else {
                        C86812g gVar2 = (C86812g) gVar.getRuntime();
                        String str = gVar2.f238147j;
                        C84524e3 e3Var = gVar2.f251966d1;
                        if (e3Var == null) {
                            C86493v0 d = C86493v0.m107224d();
                            d.mo120947c(str.hashCode() + "performance_custom_data", true).mo120962i(optString, optString2);
                        } else {
                            C88024r.m109572b(new C84522d3(e3Var, optString, optString2));
                        }
                    }
                }
            }
        }
        gVar.mo109647a(i, mo115109j("ok"));
    }
}
