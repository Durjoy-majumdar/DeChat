package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.content.Intent;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.e */
public class C115248e implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f345358a;

    /* renamed from: b */
    public final /* synthetic */ int f345359b;

    /* renamed from: c */
    public final /* synthetic */ C1714f f345360c;

    public C115248e(C1714f fVar, C81925i2 i2Var, int i) {
        this.f345360c = fVar;
        this.f345358a = i2Var;
        this.f345359b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        C1714f fVar = this.f345360c;
        if (i != fVar.f11411g) {
            return false;
        }
        if (i2 == -1) {
            if (intent == null) {
                this.f345358a.mo109647a(this.f345359b, fVar.mo115109j("fail"));
                Log.m105920e("MicroMsg.JsApiChooseLocation", "location result is empty!");
                return true;
            }
            Addr addr = (Addr) intent.getParcelableExtra("key_pick_addr");
            HashMap hashMap = new HashMap();
            if (addr != null) {
                Log.m105924i("MicroMsg.JsApiChooseLocation", "addr: " + addr.toString());
                StringBuilder sb = new StringBuilder();
                String str = "";
                sb.append(Util.nullAs(addr.f343957e, str));
                sb.append(Util.nullAs(addr.f343958f, str));
                sb.append(addr.mo174342a());
                Log.m105919d("MicroMsg.Addr", "detail addr res: [%s].", sb);
                hashMap.put("address", sb.toString());
                if (!Util.isNullOrNil(addr.f343967r)) {
                    str = addr.f343967r;
                } else if (!Util.isNullOrNil(addr.f343956d)) {
                    str = addr.f343956d;
                } else if (!Util.isNullOrNil(addr.f343966q)) {
                    str = addr.f343966q;
                } else {
                    Log.m105920e("MicroMsg.Addr", "wtf!!! all invalid!!!");
                }
                hashMap.put("name", str);
                hashMap.put("latitude", Float.valueOf(addr.f343969t));
                hashMap.put("longitude", Float.valueOf(addr.f343970u));
                Log.m105919d("MicroMsg.JsApiChooseLocation", "res: %s, %s.", hashMap.get("address"), hashMap.get("name"));
                this.f345358a.mo109647a(this.f345359b, this.f345360c.mo115112m("ok", hashMap));
            } else {
                this.f345358a.mo109647a(this.f345359b, this.f345360c.mo115109j("fail"));
                Log.m105920e("MicroMsg.JsApiChooseLocation", "location result is empty!");
            }
        } else if (i2 == 0) {
            this.f345358a.mo109647a(this.f345359b, fVar.mo115109j("fail:cancel"));
            Log.m105920e("MicroMsg.JsApiChooseLocation", "location result is cancel!");
        } else {
            this.f345358a.mo109647a(this.f345359b, fVar.mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiChooseLocation", "location result is fail!");
        }
        return true;
    }
}
