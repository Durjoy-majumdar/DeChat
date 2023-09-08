package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.os.Bundle;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.HashMap;
import li0.C88508b;
import ms0.C88840a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.q */
public class C82604q<CONTEXT extends C82381f> extends C82576b<CONTEXT> {
    public static final int CTRL_INDEX = 1138;
    public static final String NAME = "getFuzzyLocation";

    /* renamed from: i */
    public static final BigDecimal f241726i = new BigDecimal(100);

    /* renamed from: j */
    public static final BigDecimal f241727j = new BigDecimal("0.01");

    /* renamed from: n */
    public static final BigDecimal f241728n = new BigDecimal("0.01");

    /* renamed from: h */
    public SecureRandom f241729h = new SecureRandom();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.q$a */
    public class C82605a implements C88840a.C88842b {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241730d;

        /* renamed from: e */
        public final /* synthetic */ String f241731e;

        /* renamed from: f */
        public final /* synthetic */ int f241732f;

        public C82605a(C82381f fVar, String str, int i) {
            this.f241730d = fVar;
            this.f241731e = str;
            this.f241732f = i;
        }

        /* renamed from: f */
        public void mo114898f(int i, String str, C88840a.C88841a aVar) {
            Integer num;
            String str2 = str;
            C88840a.C88841a aVar2 = aVar;
            Log.m105925i("MicroMsg.JsApiGetFuzzyLocation", "errCode:%d, errStr:%s, location:%s", Integer.valueOf(i), str2, aVar2);
            C82604q qVar = C82604q.this;
            C82381f fVar = this.f241730d;
            C82606r rVar = (C82606r) qVar;
            rVar.getClass();
            rVar.f241734o.mo114891b(((C81925i2) fVar).getRuntime());
            if (i == 0) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("type", this.f241731e);
                C82604q qVar2 = C82604q.this;
                double d = aVar2.f256263a;
                qVar2.getClass();
                BigDecimal bigDecimal = new BigDecimal(d + "");
                BigDecimal add = C82604q.f241728n.add(C82604q.f241727j.multiply(new BigDecimal(qVar2.f241729h.nextInt(100))).divide(C82604q.f241726i));
                double doubleValue = qVar2.f241729h.nextBoolean() ? bigDecimal.add(add).doubleValue() : bigDecimal.subtract(add).doubleValue();
                hashMap.put("latitude", Double.valueOf(doubleValue));
                double y = C82604q.m101403y(C82604q.this, aVar2.f256264b);
                String str3 = "MicroMsg.JsApiGetFuzzyLocation";
                hashMap.put("longitude", Double.valueOf(C82604q.m101403y(C82604q.this, aVar2.f256264b)));
                if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                    double d2 = aVar2.f256263a;
                    num = 0;
                    double d3 = aVar2.f256264b;
                    double z = C82604q.m101404z(d2);
                    double z2 = C82604q.m101404z(doubleValue);
                    Log.m105925i(str3, "distance:%f", Double.valueOf((((double) Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((z - z2) / 2.0d), 2.0d) + ((Math.cos(z) * Math.cos(z2)) * Math.pow(Math.sin((C82604q.m101404z(d3) - C82604q.m101404z(y)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d)) / 10000.0d) * 1000.0d));
                } else {
                    num = 0;
                }
                C82381f fVar2 = this.f241730d;
                int i2 = this.f241732f;
                C82604q qVar3 = C82604q.this;
                qVar3.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", num, "ok");
                }
                hashMap.put("errno", num);
                fVar2.mo109647a(i2, qVar3.mo115114o("ok", hashMap));
                return;
            }
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("errCode", Integer.valueOf(i));
            C82381f fVar3 = this.f241730d;
            int i3 = this.f241732f;
            C82604q qVar4 = C82604q.this;
            String str4 = "fail:" + str2;
            qVar4.getClass();
            if (str4 == null) {
                str4 = "fail:unknown location error";
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1200000, str4);
            }
            hashMap2.put("errno", 1200000);
            fVar3.mo109647a(i3, qVar4.mo115114o(str4, hashMap2));
        }
    }

    /* renamed from: y */
    public static double m101403y(C82604q qVar, double d) {
        qVar.getClass();
        BigDecimal bigDecimal = new BigDecimal(d + "");
        BigDecimal add = f241728n.add(f241727j.multiply(new BigDecimal(qVar.f241729h.nextInt(100))).divide(f241726i));
        return qVar.f241729h.nextBoolean() ? bigDecimal.add(add).doubleValue() : bigDecimal.subtract(add).doubleValue();
    }

    /* renamed from: z */
    public static double m101404z(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: x */
    public void mo114896x(CONTEXT context, JSONObject jSONObject, int i) {
        String trim = Util.nullAsNil(jSONObject.optString("type", "wgs84")).trim();
        if (Util.isNullOrNil(trim)) {
            trim = "wgs84";
        }
        Log.m105925i("MicroMsg.JsApiGetFuzzyLocation", "getFuzzyLocation data:%s", jSONObject);
        if (!"wgs84".equals(trim) && !"gcj02".equals(trim)) {
            Log.m105921e("MicroMsg.JsApiGetFuzzyLocation", "doGeoLocation fail, unsupported type = %s", trim);
            HashMap hashMap = new HashMap(1);
            hashMap.put("errCode", -1);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            }
            hashMap.put("errno", 101);
            context.mo109647a(i, mo115114o("fail:invalid data", hashMap));
        } else if (!mo114895w(context)) {
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("errCode", -2);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 3, "fail:system permission denied");
            }
            hashMap2.put("errno", 3);
            context.mo109647a(i, mo115114o("fail:system permission denied", hashMap2));
        } else {
            C81925i2 i2Var = (C81925i2) context;
            ((C82606r) this).f241734o.mo114890a(i2Var.getRuntime());
            Bundle bundle = new Bundle();
            bundle.putBoolean("useCache", i2Var.getAppState() != C88508b.FOREGROUND);
            String optString = jSONObject.optString("subKey", "");
            String appId = i2Var.getAppId();
            if (!Util.isNullOrNil(optString)) {
                bundle.putString("smallAppKey", optString + "#" + appId + ";");
            }
            if (!(i2Var.getRuntime() == null || i2Var.getRuntime().mo113051d0() == null)) {
                bundle.putString("openId", ((AppBrandSysConfigLU) i2Var.getRuntime().mo113051d0()).f234882V0);
            }
            Log.m105927v("MicroMsg.JsApiGetLocation", "getFuzzyLocation %s", jSONObject);
            C88840a aVar = (C88840a) context.mo109668l(C88840a.class);
            if (aVar != null) {
                C82605a aVar2 = new C82605a(context, trim, i);
                AppBrandRuntime runtime = i2Var.getRuntime();
                C87412m.m108593f(runtime, "env.runtime");
                aVar.mo123224M9(trim, new C82579c0(runtime, aVar2), bundle);
            }
        }
    }
}
