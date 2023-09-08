package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.os.Bundle;
import cc0.C92411b;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.y */
public class C115853y implements C92411b.C0447b {

    /* renamed from: d */
    public final /* synthetic */ C43620m2.C5947b f347591d;

    /* renamed from: e */
    public final /* synthetic */ String f347592e;

    /* renamed from: f */
    public final /* synthetic */ C115851a0 f347593f;

    public C115853y(C115851a0 a0Var, C43620m2.C5947b bVar, String str) {
        this.f347593f = a0Var;
        this.f347591d = bVar;
        this.f347592e = str;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        return false;
    }

    /* renamed from: u7 */
    public boolean mo489u7(boolean z, float f, float f2, int i, double d, double d2, double d3, Bundle bundle) {
        C92411b.C0447b bVar;
        Log.m105927v("MicroMsg.JsApiGeoLocation", "doGeoLocation.onGetLocation, fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2));
        if (!z) {
            this.f347593f.mo176387g(this.f347591d, "location_error");
            return true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("longitude", (double) f);
            jSONObject.put("latitude", (double) f2);
            jSONObject.put(TPReportKeys.Common.COMMON_NETWORK_SPEED, d);
            jSONObject.put("accuracy", d2);
            jSONObject.put("type", this.f347592e);
            if (bundle != null) {
                jSONObject.put("indoor_building_id", bundle.getString("indoor_building_id"));
                jSONObject.put("indoor_building_floor", bundle.getString("indoor_building_floor"));
                jSONObject.put("indoor_building_type", bundle.getInt("indoor_building_type"));
            }
        } catch (JSONException unused) {
        }
        C115851a0 a0Var = this.f347593f;
        C43620m2.C5947b bVar2 = this.f347591d;
        synchronized (a0Var) {
            a0Var.f347581e.unregisterReceiver(a0Var.f347589p);
            C92411b bVar3 = a0Var.f347585i;
            if (!(bVar3 == null || (bVar = a0Var.f347586j) == null)) {
                bVar3.mo126408b(bVar);
            }
            MMHandler mMHandler = a0Var.f347587n;
            if (mMHandler != null) {
                mMHandler.removeCallbacksAndMessages((Object) null);
            }
            a0Var.f347586j = null;
            if (!a0Var.f347584h) {
                a0Var.f347584h = true;
                bVar2.mo6945a((String) null, jSONObject);
            }
        }
        return false;
    }
}
