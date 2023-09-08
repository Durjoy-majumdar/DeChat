package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONObject;
import p275xz.C15919f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.q */
public class C1820q extends C82268c {
    public static final int CTRL_INDEX = 680;
    public static final String NAME = "openWCPayOverseaPaymentReceive";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiOpenWCPayOverseaPaymentReceive", "invoke JsApiOpenWCPayOverseaPaymentReceive!");
        if (fVar == null) {
            Log.m105920e("MicroMsg.JsApiOpenWCPayOverseaPaymentReceive", "fail:component is null");
            return;
        }
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiOpenWCPayOverseaPaymentReceive", "fail:context is null");
            fVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        ((C15919f) C86312j.m106911c(C15919f.class)).Mv0(context, 7);
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
