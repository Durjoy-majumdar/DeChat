package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.t */
public class C1826t implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C88267e f11628a;

    /* renamed from: b */
    public final /* synthetic */ int f11629b;

    /* renamed from: c */
    public final /* synthetic */ C1828u f11630c;

    public C1826t(C1828u uVar, C88267e eVar, int i) {
        this.f11630c = uVar;
        this.f11628a = eVar;
        this.f11629b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "mmOnActivityResult, resultCode = " + i2);
        if (i2 != -1) {
            this.f11628a.mo109647a(this.f11629b, this.f11630c.mo115109j("fail"));
            return false;
        } else if (intent == null || !intent.getBooleanExtra("cancel", false)) {
            this.f11628a.mo109647a(this.f11629b, this.f11630c.mo115109j("ok"));
            return true;
        } else {
            this.f11628a.mo109647a(this.f11629b, this.f11630c.mo115109j("cancel"));
            return true;
        }
    }
}
