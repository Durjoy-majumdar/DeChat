package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import tm0.C14016b0;
import tm0.C14039u;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.j0 */
public final class C4486j0 extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "handleDeviceInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (bVar != null && context != null) {
            JSONObject e = C6013c.m5893e(str);
            if (e == null) {
                bVar.mo6945a("input data is invalidate", (JSONObject) null);
                return;
            }
            String optString = e.optString("action");
            Log.m105925i("handleDeviceInfo", "handleDeviceInfo action=%s", optString);
            if (C87412m.m108589b(C14016b0.NAME, optString)) {
                Log.m105924i("handleDeviceInfo", C14016b0.NAME);
                double optDouble = e.optDouble("data", -1.0d);
                if (optDouble < 0.0d || optDouble > 1.0d) {
                    bVar.mo6945a("volume should in 0.0-1.0", (JSONObject) null);
                } else {
                    C2039g2.m1988b(new C4482i0(context, optDouble, this, bVar));
                }
            }
            if (C87412m.m108589b(C14039u.NAME, optString)) {
                C2039g2.m1988b(new C4476h0(context, bVar, this));
            }
            bVar.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
