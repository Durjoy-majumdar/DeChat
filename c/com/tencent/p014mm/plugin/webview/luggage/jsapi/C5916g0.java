package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87203t;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g0 */
public class C5916g0 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "getOpenDeviceId";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiGetOpenDeviceId", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            Log.m105920e("MicroMsg.JsApiGetOpenDeviceId", "data is null");
            bVar.mo6945a("fail", (JSONObject) null);
            return;
        }
        String optString = e.optString("preVerifyAppId");
        String f = C87203t.m108270f(true);
        String i = C87203t.m108273i();
        if (Util.isNullOrNil(f) || Util.isNullOrNil(i) || Util.isNullOrNil(optString)) {
            bVar.mo6945a("fail", (JSONObject) null);
            return;
        }
        String mD5String = MD5Util.getMD5String(MD5Util.getMD5String(optString + f));
        String mD5String2 = MD5Util.getMD5String(MD5Util.getMD5String(optString + i));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceid", mD5String);
            jSONObject.put("newDeviceId", mD5String2);
        } catch (JSONException unused) {
        }
        bVar.mo6945a((String) null, jSONObject);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
