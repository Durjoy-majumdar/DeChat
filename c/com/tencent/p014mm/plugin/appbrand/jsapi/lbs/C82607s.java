package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.os.Bundle;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.HashMap;
import li0.C88508b;
import ms0.C88840a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.s */
public class C82607s<CONTEXT extends C82381f> extends C82576b<CONTEXT> {
    public static final int CTRL_INDEX = 37;
    public static final String NAME = "getLocation";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.s$a */
    public class C82608a implements C88840a.C88842b {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241735d;

        /* renamed from: e */
        public final /* synthetic */ String f241736e;

        /* renamed from: f */
        public final /* synthetic */ boolean f241737f;

        /* renamed from: g */
        public final /* synthetic */ int f241738g;

        public C82608a(C82381f fVar, String str, boolean z, int i) {
            this.f241735d = fVar;
            this.f241736e = str;
            this.f241737f = z;
            this.f241738g = i;
        }

        /* renamed from: f */
        public void mo114898f(int i, String str, C88840a.C88841a aVar) {
            Log.m105925i("MicroMsg.JsApiGetLocation", "errCode:%d, errStr:%s, location:%s", Integer.valueOf(i), str, aVar);
            C82607s sVar = C82607s.this;
            C82381f fVar = this.f241735d;
            C82609t tVar = (C82609t) sVar;
            tVar.getClass();
            tVar.f241740h.mo114891b(((C81925i2) fVar).getRuntime());
            if (i == 0) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("type", this.f241736e);
                hashMap.put("latitude", Double.valueOf(aVar.f256263a));
                hashMap.put("longitude", Double.valueOf(aVar.f256264b));
                hashMap.put(TPReportKeys.Common.COMMON_NETWORK_SPEED, Double.valueOf(aVar.f256266d));
                hashMap.put("accuracy", Double.valueOf(aVar.f256267e));
                if (this.f241737f) {
                    hashMap.put("altitude", Double.valueOf(aVar.f256268f));
                }
                hashMap.put("provider", aVar.f256265c);
                hashMap.put("verticalAccuracy", 0);
                hashMap.put("horizontalAccuracy", Double.valueOf(aVar.f256267e));
                if (!Util.isNullOrNil(aVar.f256269g)) {
                    hashMap.put("buildingId", aVar.f256269g);
                    hashMap.put("floorName", aVar.f256270h);
                }
                hashMap.put("indoorLocationType", Integer.valueOf(aVar.f256271i));
                hashMap.put(TencentLocation.EXTRA_DIRECTION, Float.valueOf(aVar.f256272j));
                hashMap.put("steps", Double.valueOf(aVar.f256273k));
                this.f241735d.mo109647a(this.f241738g, C82607s.this.mo115112m("ok", hashMap));
                return;
            }
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("errCode", Integer.valueOf(i));
            C82381f fVar2 = this.f241735d;
            int i2 = this.f241738g;
            C82607s sVar2 = C82607s.this;
            fVar2.mo109647a(i2, sVar2.mo115112m("fail:" + str, hashMap2));
        }
    }

    /* renamed from: x */
    public void mo114896x(CONTEXT context, JSONObject jSONObject, int i) {
        String trim = Util.nullAsNil(jSONObject.optString("type", "wgs84")).trim();
        if (Util.isNullOrNil(trim)) {
            trim = "wgs84";
        }
        boolean optBoolean = jSONObject.optBoolean("altitude", false);
        Log.m105925i("MicroMsg.JsApiGetLocation", "getLocation data:%s", jSONObject);
        if (!"wgs84".equals(trim) && !"gcj02".equals(trim)) {
            Log.m105921e("MicroMsg.JsApiGetLocation", "doGeoLocation fail, unsupported type = %s", trim);
            HashMap hashMap = new HashMap(1);
            hashMap.put("errCode", -1);
            context.mo109647a(i, mo115112m("fail:invalid data", hashMap));
        } else if (!mo114895w(context)) {
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("errCode", -2);
            context.mo109647a(i, mo115112m("fail:system permission denied", hashMap2));
        } else {
            C81925i2 i2Var = (C81925i2) context;
            ((C82609t) this).f241740h.mo114890a(i2Var.getRuntime());
            Bundle bundle = new Bundle();
            boolean optBoolean2 = jSONObject.optBoolean("isHighAccuracy", false);
            int optInt = jSONObject.optInt("highAccuracyExpireTime", 3000);
            bundle.putBoolean("isHighAccuracy", optBoolean2);
            bundle.putInt("highAccuracyExpireTime", optInt);
            bundle.putBoolean("useCache", i2Var.getAppState() != C88508b.FOREGROUND);
            String optString = jSONObject.optString("subKey", "");
            String appId = i2Var.getAppId();
            if (!Util.isNullOrNil(optString)) {
                bundle.putString("smallAppKey", optString + "#" + appId + ";");
            }
            bundle.putBoolean("enableIndoor", jSONObject.optBoolean("enableIndoor", false));
            if (!(i2Var.getRuntime() == null || i2Var.getRuntime().mo113051d0() == null)) {
                bundle.putString("openId", ((AppBrandSysConfigLU) i2Var.getRuntime().mo113051d0()).f234882V0);
            }
            Log.m105927v("MicroMsg.JsApiGetLocation", "getLocation %s", jSONObject);
            C88840a aVar = (C88840a) context.mo109668l(C88840a.class);
            if (aVar != null) {
                C82608a aVar2 = new C82608a(context, trim, optBoolean, i);
                AppBrandRuntime runtime = i2Var.getRuntime();
                C87412m.m108593f(runtime, "env.runtime");
                aVar.mo123224M9(trim, new C82579c0(runtime, aVar2), bundle);
            }
        }
    }
}
