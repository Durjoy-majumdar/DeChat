package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.g */
public final class C82589g implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82590h f241714a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f241715b;

    /* renamed from: c */
    public final /* synthetic */ int f241716c;

    public C82589g(C82590h hVar, C81925i2 i2Var, int i) {
        this.f241714a = hVar;
        this.f241715b = i2Var;
        this.f241716c = i;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        C82590h hVar = this.f241714a;
        if (i != hVar.f241717g) {
            return false;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                this.f241715b.mo109647a(this.f241716c, hVar.mo115109j("fail"));
                Log.m105920e("MicroMsg.JsApiChoosePOI", "choose failed");
            } else {
                this.f241715b.mo109647a(this.f241716c, hVar.mo115109j("fail cancel"));
                Log.m105924i("MicroMsg.JsApiChoosePOI", "choose canceled");
            }
        } else if (intent == null) {
            this.f241715b.mo109647a(this.f241716c, hVar.mo115109j("fail:internal error"));
            return true;
        } else {
            HashMap hashMap = new HashMap();
            int intExtra = intent.getIntExtra("get_poi_data_type", 0);
            hashMap.put("type", Integer.valueOf(intExtra));
            if (intExtra == 1) {
                String stringExtra = intent.getStringExtra("get_city");
                C87412m.m108591d(stringExtra);
                hashMap.put("city", stringExtra);
            } else if (intExtra == 2) {
                String stringExtra2 = intent.getStringExtra("get_poi_name");
                C87412m.m108591d(stringExtra2);
                hashMap.put("name", stringExtra2);
                String stringExtra3 = intent.getStringExtra("get_poi_address");
                C87412m.m108591d(stringExtra3);
                hashMap.put("address", stringExtra3);
                hashMap.put("latitude", Float.valueOf(intent.getFloatExtra("get_lat", -1.0f)));
                hashMap.put("longitude", Float.valueOf(intent.getFloatExtra("get_lng", -1.0f)));
            }
            this.f241715b.mo109647a(this.f241716c, this.f241714a.mo115112m("ok", hashMap));
        }
        return true;
    }
}
