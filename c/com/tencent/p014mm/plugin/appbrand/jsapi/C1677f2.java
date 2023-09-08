package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f2 */
public class C1677f2 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f11353a;

    /* renamed from: b */
    public final /* synthetic */ int f11354b;

    /* renamed from: c */
    public final /* synthetic */ C1694g2 f11355c;

    public C1677f2(C1694g2 g2Var, C81925i2 i2Var, int i) {
        this.f11355c = g2Var;
        this.f11353a = i2Var;
        this.f11354b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        if (this.f11355c.f11387g != i) {
            Log.m105921e("MicroMsg.JsApiChooseInvoice", "onActivityResult mismatch requestCode, with appId:%s, callbackId:%d", this.f11353a.getAppId(), Integer.valueOf(this.f11354b));
            this.f11353a.mo109647a(this.f11354b, this.f11355c.mo115109j("fail:internal error"));
            return false;
        }
        Log.m105918d("MicroMsg.JsApiChooseInvoice", "request choose invoice, resultCode = " + i2);
        HashMap hashMap = new HashMap();
        if (i2 == -1) {
            if (intent != null) {
                hashMap.put("invoiceInfo", Util.nullAs(intent.getStringExtra("choose_invoice_info"), ""));
            }
            this.f11353a.mo109647a(this.f11354b, this.f11355c.mo115112m("ok", hashMap));
            Log.m105924i("MicroMsg.JsApiChooseInvoice", "callback ok values = " + hashMap);
        } else if (i2 == 0) {
            this.f11353a.mo109647a(this.f11354b, this.f11355c.mo115109j("cancel"));
            Log.m105924i("MicroMsg.JsApiChooseInvoice", "callback cancel");
        } else {
            this.f11353a.mo109647a(this.f11354b, this.f11355c.mo115109j("fail"));
            Log.m105924i("MicroMsg.JsApiChooseInvoice", "callback fail");
        }
        return true;
    }
}
