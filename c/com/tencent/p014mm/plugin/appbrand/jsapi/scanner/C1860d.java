package com.tencent.p014mm.plugin.appbrand.jsapi.scanner;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import kr0.C88267e;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.d */
public final class C1860d implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ JsApiScanItem f11687a;

    /* renamed from: b */
    public final /* synthetic */ C88267e f11688b;

    /* renamed from: c */
    public final /* synthetic */ int f11689c;

    public C1860d(JsApiScanItem jsApiScanItem, C88267e eVar, int i) {
        this.f11687a = jsApiScanItem;
        this.f11688b = eVar;
        this.f11689c = i;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        if (i != (this.f11687a.hashCode() & 65535)) {
            return false;
        }
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent != null);
        Log.m105925i("MicroMsg.JsApiScanItem", "alvinluo scanItem onResult requestCode: %d, resultCode: %d, data != null: %b", objArr);
        if (i2 != -1) {
            if (i2 != 0) {
                this.f11688b.mo109647a(this.f11689c, this.f11687a.mo115109j("fail"));
            } else {
                this.f11688b.mo109647a(this.f11689c, this.f11687a.mo115109j("cancel"));
            }
        } else if (intent != null) {
            HashMap hashMap = new HashMap();
            String stringExtra = intent.getStringExtra("key_scan_goods_result_req_key");
            Log.m105925i("MicroMsg.JsApiScanItem", "alvinluo scanItem onResult reqKey: %s", stringExtra);
            C87412m.m108591d(stringExtra);
            hashMap.put("reqKey", stringExtra);
            this.f11688b.mo109647a(this.f11689c, this.f11687a.mo115112m("ok", hashMap));
        } else {
            this.f11688b.mo109647a(this.f11689c, this.f11687a.mo115109j("fail"));
        }
        return true;
    }
}
