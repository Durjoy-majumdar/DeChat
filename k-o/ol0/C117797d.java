package ol0;

import android.graphics.Color;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import js0.C88020k;
import org.json.JSONArray;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.d */
public class C117797d extends C117793b {
    public static final int CTRL_INDEX = 135;
    public static final String NAME = "addMapCircles";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        String str = "";
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiAddMapCircles", "data is null");
            fVar2.mo109647a(i2, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiAddMapCircles", "data:%s", jSONObject2);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiAddMapCircles", "mapView is null, return");
            fVar2.mo109647a(i2, mo115109j("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject2.has("circles")) {
                y.mo182831a0();
                JSONArray jSONArray = new JSONArray(jSONObject2.optString("circles"));
                int i3 = 0;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i3);
                    double d = Util.getDouble(jSONObject3.optString("latitude"), 0.0d);
                    double d2 = Util.getDouble(jSONObject3.optString("longitude"), 0.0d);
                    String optString = jSONObject3.optString("color", str);
                    int parseColor = Color.parseColor("#000000");
                    try {
                        parseColor = C88020k.m109562m(optString);
                    } catch (Exception unused) {
                    }
                    int i4 = parseColor;
                    String optString2 = jSONObject3.optString("fillColor", str);
                    int parseColor2 = Color.parseColor("#00000000");
                    try {
                        parseColor2 = C88020k.m109562m(optString2);
                    } catch (Exception unused2) {
                    }
                    int i5 = parseColor2;
                    int optInt = jSONObject3.optInt("radius");
                    String str2 = str;
                    float i6 = C88020k.m109558i(jSONObject3, "strokeWidth", 0.0f);
                    C118080q.C118083b bVar = new C118080q.C118083b();
                    bVar.f352985a = d;
                    bVar.f352986b = d2;
                    bVar.f352987c = optInt;
                    bVar.f352988d = i4;
                    bVar.f352989e = (int) i6;
                    bVar.f352990f = i5;
                    bVar.f352991g = jSONObject3.optString(FirebaseAnalytics.C113379b.LEVEL);
                    y.mo182850h0(bVar);
                    i3++;
                    C82381f fVar3 = fVar;
                    str = str2;
                }
            }
            mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiAddMapCircles", "parse circles error, exception : %s", e);
            mo182575w(fVar, i, mo115109j("fail:internal error"), false, y.mo182849h());
        }
    }
}
