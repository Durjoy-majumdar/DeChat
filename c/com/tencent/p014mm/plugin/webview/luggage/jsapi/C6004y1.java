package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.graphics.Color;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C5874e0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fm0.C8134n0;
import org.json.JSONObject;
import p385u2.C111105a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.y1 */
public class C6004y1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return C8134n0.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        String str;
        Log.m105924i("MicroMsg.JsApiSetNavigationBarColor", "invoke");
        boolean z = aVar.f148190b.f129368c.optInt("actionCode") == 1;
        float f = -1.0f;
        try {
            JSONObject optJSONObject = aVar.f148190b.f129368c.optJSONObject("wxcolor");
            str = optJSONObject != null ? C85875k4.m106211z() ? optJSONObject.optString("dark") : optJSONObject.optString("light") : aVar.f148190b.f129368c.optString("color");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiSetNavigationBarColor", e.getMessage());
            str = "";
            z = true;
        }
        try {
            f = (float) aVar.f148190b.f129368c.optDouble("alpha", -1.0d);
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.JsApiSetNavigationBarColor", e2.getMessage());
        }
        int optInt = aVar.f148190b.f129368c.optInt("iconDark", -1);
        if (z) {
            C43658n nVar = (C43658n) aVar.f148189a;
            nVar.f117936V = C111105a.m151500b(nVar.f148196d, C0966R.color.f3008c5);
            nVar.f117951u.f118010z = -1;
            nVar.mo67934O();
        } else {
            C43658n nVar2 = (C43658n) aVar.f148189a;
            nVar2.getClass();
            if (!Util.isNullOrNil(str)) {
                try {
                    int parseColor = Color.parseColor(str) | -16777216;
                    nVar2.f117934U = true;
                    nVar2.f117936V = parseColor;
                    nVar2.f117951u.setActionBarColorValue(parseColor);
                } catch (Exception unused) {
                }
            }
            nVar2.f117951u.setIconDark(optInt);
            if (f < 0.0f || f > 1.0f) {
                nVar2.mo67934O();
            } else {
                nVar2.f117925P.post(new C5874e0(nVar2, f));
            }
        }
        Log.m105919d("MicroMsg.JsApiSetNavigationBarColor", "colorStr:%s, alpha:%f, iconDark:%d", str, Float.valueOf(f), Integer.valueOf(optInt));
        aVar.mo73776a();
    }
}
