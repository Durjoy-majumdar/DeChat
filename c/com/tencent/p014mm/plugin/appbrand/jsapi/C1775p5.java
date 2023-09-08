package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p5 */
public final class C1775p5 extends C87413o implements C32226l<JSONObject, C13598b0> {

    /* renamed from: d */
    public static final C1775p5 f11532d = new C1775p5();

    public C1775p5() {
        super(1);
    }

    public Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C87412m.m108594g(jSONObject, LocaleUtil.ITALIAN);
        C5139t.m5183e(jSONObject.getInt("businesstype"), jSONObject.getInt("datatype"));
        return C13598b0.f38549a;
    }
}
