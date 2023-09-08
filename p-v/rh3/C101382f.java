package rh3;

import com.google.android.gms.dynamite.ProviderConstants;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: rh3.f */
public class C101382f extends C36327a {

    /* renamed from: a */
    public String f296969a = "";

    /* renamed from: b */
    public double f296970b;

    /* renamed from: c */
    public String f296971c = "Sticker2D";

    /* renamed from: d */
    public String f296972d = "";

    /* renamed from: e */
    public C101387h f296973e = new C101387h();

    /* renamed from: f */
    public HashMap<String, C101381e> f296974f = new HashMap<>();

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f296969a);
        jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.f296970b);
        jSONObject.put("type", this.f296971c);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry next : this.f296974f.entrySet()) {
            jSONArray.put(next.getKey());
            jSONObject2.put((String) next.getKey(), ((C101381e) next.getValue()).mo33258a());
        }
        jSONObject2.put("elements", jSONArray);
        C101387h hVar = this.f296973e;
        boolean z = false;
        if (hVar.f296989a.length == 0) {
            if (hVar.f296990b.length == 0) {
                if (hVar.f296991c.length == 0) {
                    if (hVar.f296992d.length == 0) {
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            jSONObject2.put("template_trans_set", hVar.mo33258a());
        }
        jSONObject.put("params", jSONObject2);
        return jSONObject;
    }

    /* renamed from: b */
    public C36327a mo140863b(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "jsonObj");
        String optString = jSONObject.optString("id", "");
        C87412m.m108593f(optString, "jsonObj.optString(\"id\", \"\")");
        this.f296969a = optString;
        this.f296970b = jSONObject.optDouble(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.f296970b);
        String optString2 = jSONObject.optString("type", this.f296971c);
        C87412m.m108593f(optString2, "jsonObj.optString(\"type\", type)");
        this.f296971c = optString2;
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("elements") : null;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = optJSONArray.getString(i);
                JSONObject jSONObject2 = optJSONObject.getJSONObject(string);
                C101381e eVar = new C101381e();
                C87412m.m108593f(string, "name");
                C87412m.m108593f(jSONObject2, "elementObj");
                eVar.mo140862b(jSONObject2);
                this.f296974f.put(string, eVar);
            }
        }
        return this;
    }
}
