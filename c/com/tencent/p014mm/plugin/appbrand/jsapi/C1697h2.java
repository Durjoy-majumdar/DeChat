package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h2 */
public class C1697h2 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f11394a;

    /* renamed from: b */
    public final /* synthetic */ int f11395b;

    /* renamed from: c */
    public final /* synthetic */ C1701i2 f11396c;

    public C1697h2(C1701i2 i2Var, C81925i2 i2Var2, int i) {
        this.f11396c = i2Var;
        this.f11394a = i2Var2;
        this.f11395b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        if (i != (this.f11396c.hashCode() & 65535)) {
            return false;
        }
        if (i2 == -1 && intent != null) {
            HashMap hashMap = new HashMap();
            String nullAs = Util.nullAs(intent.getStringExtra("choose_invoice_title_info"), "");
            Log.m105924i("MicroMsg.JsApiChooseInvoiceTitle", "choose_invoice_title_info is : " + nullAs);
            hashMap.put("invoiceTitleInfo", nullAs);
            this.f11394a.mo109647a(this.f11395b, this.f11396c.mo115112m("ok", hashMap));
            return true;
        } else if (i2 == 0) {
            this.f11394a.mo109647a(this.f11395b, this.f11396c.mo115109j("cancel"));
            return true;
        } else {
            this.f11394a.mo109647a(this.f11395b, this.f11396c.mo115109j("fail"));
            return true;
        }
    }
}
