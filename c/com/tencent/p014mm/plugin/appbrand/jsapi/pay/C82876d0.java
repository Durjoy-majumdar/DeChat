package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.d0 */
public final class C82876d0 extends C82878f0 {
    public static final int CTRL_INDEX = 691;
    public static final String NAME = "requestJointPayment";

    /* renamed from: w */
    public void mo1505u(C82554k kVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            kVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        try {
            jSONObject.put("key_joint_pay", true);
            super.mo1505u(kVar, jSONObject, i);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiRequestJointPayment", e.getMessage());
            kVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
