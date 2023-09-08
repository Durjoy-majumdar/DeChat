package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import ms0.C88840a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.c */
public final class C82578c extends C82919r2 implements C88840a.C88842b {
    private static final int CTRL_INDEX = 341;
    private static final String NAME = "onLocationChange";

    /* renamed from: i */
    public final C82381f f241691i;

    public C82578c(C82381f fVar) {
        this.f241691i = fVar;
    }

    /* renamed from: f */
    public void mo114898f(int i, String str, C88840a.C88841a aVar) {
        if (i != 0) {
            Log.m105921e("MicroMsg.AppBrand.EventOnLocationChange", "errCode:%d, errStr:%s", Integer.valueOf(i), str);
            return;
        }
        HashMap hashMap = new HashMap(7);
        hashMap.put("longitude", Double.valueOf(aVar.f256264b));
        hashMap.put("latitude", Double.valueOf(aVar.f256263a));
        hashMap.put(TPReportKeys.Common.COMMON_NETWORK_SPEED, Double.valueOf(aVar.f256266d));
        hashMap.put("accuracy", Double.valueOf(aVar.f256267e));
        hashMap.put("altitude", Double.valueOf(aVar.f256268f));
        hashMap.put("verticalAccuracy", Float.valueOf(0.0f));
        hashMap.put("horizontalAccuracy", Double.valueOf(aVar.f256267e));
        if (!Util.isNullOrNil(aVar.f256269g)) {
            hashMap.put("buildingId", aVar.f256269g);
            hashMap.put("floorName", aVar.f256270h);
        }
        hashMap.put("provider", aVar.f256265c);
        hashMap.put("indoorLocationType", Integer.valueOf(aVar.f256271i));
        hashMap.put(TencentLocation.EXTRA_DIRECTION, Float.valueOf(aVar.f256272j));
        hashMap.put("steps", Double.valueOf(aVar.f256273k));
        hashMap.put("type", aVar.f256274l);
        String jSONObject = new JSONObject(hashMap).toString();
        Log.m105927v("MicroMsg.AppBrand.EventOnLocationChange", "onLocationChanged %s, %s, %s", this.f241691i.getAppId(), aVar.f256265c, jSONObject);
        synchronized (this) {
            mo115161k(this.f241691i);
            mo115163m(jSONObject);
            mo115158h();
        }
    }
}
