package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p0 */
public class C1768p0 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82554k f11508a;

    /* renamed from: b */
    public final /* synthetic */ C1839q0 f11509b;

    public C1768p0(C1839q0 q0Var, C82554k kVar) {
        this.f11509b = q0Var;
        this.f11508a = kVar;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1839q0 q0Var = this.f11509b;
        if (i != q0Var.f11646g) {
            return false;
        }
        if (i2 == -1) {
            if (intent == null) {
                this.f11508a.mo109647a(q0Var.f11647h, q0Var.mo115109j("fail:internal error"));
                Log.m105920e("MicroMsg.JsApiAddCard", "location result is empty!");
                return true;
            }
            HashMap hashMap = new HashMap();
            String stringExtra = intent.getStringExtra("card_list");
            Log.m105919d("MicroMsg.JsApiAddCard", "mmSetOnActivityResultCallback cardList:%s", stringExtra);
            JSONArray jSONArray = null;
            try {
                jSONArray = new JSONArray(stringExtra);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiAddCard", "parse fail result:%s", Util.stackTraceToString(e));
            }
            if (jSONArray != null) {
                hashMap.put("cardList", jSONArray);
                C82554k kVar = this.f11508a;
                C1839q0 q0Var2 = this.f11509b;
                kVar.mo109647a(q0Var2.f11647h, q0Var2.mo115112m("ok", hashMap));
            } else {
                C82554k kVar2 = this.f11508a;
                C1839q0 q0Var3 = this.f11509b;
                kVar2.mo109647a(q0Var3.f11647h, q0Var3.mo115112m("fail: cardList is empty", hashMap));
                Log.m105920e("MicroMsg.JsApiAddCard", "add card result is fail! cardList is empty");
            }
        } else if (i2 == 0) {
            this.f11508a.mo109647a(q0Var.f11647h, q0Var.mo115109j("cancel"));
            Log.m105920e("MicroMsg.JsApiAddCard", "add card result is cancel!");
        } else {
            int intExtra = intent != null ? intent.getIntExtra("result_code", 2) : 2;
            Log.m105925i("MicroMsg.JsApiAddCard", "mmSetOnActivityResultCallback ret_code:%d", Integer.valueOf(intExtra));
            if (intExtra == 2) {
                C82554k kVar3 = this.f11508a;
                C1839q0 q0Var4 = this.f11509b;
                kVar3.mo109647a(q0Var4.f11647h, q0Var4.mo115109j("fail:internal error"));
            } else {
                C82554k kVar4 = this.f11508a;
                C1839q0 q0Var5 = this.f11509b;
                kVar4.mo109647a(q0Var5.f11647h, q0Var5.mo115109j("cancel"));
            }
        }
        return true;
    }
}
