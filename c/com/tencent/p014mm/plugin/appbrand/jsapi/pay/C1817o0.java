package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.o0 */
public class C1817o0 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f11615d;

    /* renamed from: e */
    public final /* synthetic */ int f11616e;

    /* renamed from: f */
    public final /* synthetic */ C1821q0 f11617f;

    public C1817o0(C1821q0 q0Var, C81925i2 i2Var, int i) {
        this.f11617f = q0Var;
        this.f11615d = i2Var;
        this.f11616e = i;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == (this.f11617f.hashCode() & 65535)) {
            this.f11617f.f11619g = false;
            int intExtra = intent != null ? intent.getIntExtra("key_err_code", 1) : 1;
            Log.m105925i("MicroMsg.JsApiRequestVirtualPayment", "resultCode:%d,result:%d", Integer.valueOf(i2), Integer.valueOf(intExtra));
            if (i2 != -1) {
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(intExtra));
                this.f11615d.mo109647a(this.f11616e, this.f11617f.mo115112m("cancel", hashMap));
            } else if (intExtra == 0) {
                Log.m105924i("MicroMsg.JsApiRequestVirtualPayment", "requestIAP ok");
                this.f11615d.mo109647a(this.f11616e, this.f11617f.mo115109j("ok"));
            } else {
                HashMap hashMap2 = new HashMap();
                String nullAsNil = Util.nullAsNil(intent.getStringExtra("key_err_msg"));
                hashMap2.put("errCode", Integer.valueOf(intExtra));
                Log.m105925i("MicroMsg.JsApiRequestVirtualPayment", "requestVirtualPayment errCode: %d, errMsg: %s", Integer.valueOf(intExtra), nullAsNil);
                C81925i2 i2Var = this.f11615d;
                int i3 = this.f11616e;
                C1821q0 q0Var = this.f11617f;
                i2Var.mo109647a(i3, q0Var.mo115112m("fail " + nullAsNil, hashMap2));
            }
        }
    }
}
