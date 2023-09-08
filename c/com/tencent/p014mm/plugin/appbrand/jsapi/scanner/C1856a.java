package com.tencent.p014mm.plugin.appbrand.jsapi.scanner;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.a */
public class C1856a implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f11677a;

    /* renamed from: b */
    public final /* synthetic */ int f11678b;

    /* renamed from: c */
    public final /* synthetic */ C1857b f11679c;

    public C1856a(C1857b bVar, C81925i2 i2Var, int i) {
        this.f11679c = bVar;
        this.f11677a = i2Var;
        this.f11678b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1857b.f11680g = false;
        if (i != (this.f11679c.hashCode() & 65535)) {
            return false;
        }
        Log.m105925i("MicroMsg.JsApiOpenQRCode", "onActivityResult requestCode:%d  resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != -1) {
            if (i2 != 0) {
                this.f11677a.mo109647a(this.f11678b, this.f11679c.mo115109j("fail"));
            } else {
                this.f11677a.mo109647a(this.f11678b, this.f11679c.mo115109j("cancel"));
            }
        } else if (intent == null) {
            Log.m105920e("MicroMsg.JsApiOpenQRCode", "data is null, err");
            this.f11677a.mo109647a(this.f11678b, this.f11679c.mo115109j("fail:unknown err"));
            return true;
        } else {
            HashMap hashMap = new HashMap();
            String stringExtra = intent.getStringExtra("key_scan_result");
            String stringExtra2 = intent.getStringExtra("key_scan_result_code_name");
            Log.m105919d("MicroMsg.JsApiOpenQRCode", "result:%s, codeName:%s", stringExtra, stringExtra2);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("scan_type", C5177x.m5206c(stringExtra2) ? "qrcode" : "barcode");
                jSONObject.put("scan_result", stringExtra);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenQRCode", e, "", new Object[0]);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("scan_code", jSONObject);
            } catch (JSONException e2) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenQRCode", e2, "", new Object[0]);
            }
            hashMap.put("resultStr", jSONObject2.toString());
            Log.m105919d("MicroMsg.JsApiOpenQRCode", "ret:%s", hashMap);
            this.f11677a.mo109647a(this.f11678b, this.f11679c.mo115112m("ok", hashMap));
        }
        return true;
    }
}
