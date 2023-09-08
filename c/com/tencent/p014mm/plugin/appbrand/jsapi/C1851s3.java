package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.s3 */
public class C1851s3 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 102;
    public static final String NAME = "makePhoneCall";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        String optString = jSONObject.optString("phoneNumber");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        Activity o0 = i2Var.mo114344o0();
        if (o0 == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + Uri.encode(optString)));
            C89916g.m112446a(o0).mo124236j(intent, new C1848r3(this, i2Var, i));
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.JsApiMakePhoneCall", "startActivity failed");
            i2Var.mo109647a(i, mo115109j("fail"));
        }
    }
}
