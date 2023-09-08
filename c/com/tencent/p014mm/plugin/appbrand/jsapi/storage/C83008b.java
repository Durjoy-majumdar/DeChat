package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.b */
public class C83008b extends C82268c<C82554k> {
    private static final int CTRL_INDEX = 1133;
    private static final String NAME = "batchGetStorage";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar != null) {
            kVar.mo109647a(i, C83002a.f242693a.mo115263a(this, kVar, jSONObject));
        }
    }
}
