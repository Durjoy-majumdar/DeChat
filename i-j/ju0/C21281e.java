package ju0;

import org.json.JSONObject;

/* renamed from: ju0.e */
public final class C21281e extends C21278a {

    /* renamed from: a */
    public float f60121a = -1.0f;

    /* renamed from: b */
    public int f60122b = -1;

    /* renamed from: c */
    public String f60123c = "";

    /* renamed from: d */
    public String f60124d;

    /* renamed from: e */
    public final String f60125e = "EyeShadowV2";

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject a = super.mo33258a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alpha", Float.valueOf(this.f60121a));
        jSONObject.put("blend_mode", this.f60122b);
        jSONObject.put("path", this.f60123c);
        String str = this.f60124d;
        if (str != null) {
            jSONObject.put("shimmer_position", str);
        }
        jSONObject.put("eyeshadow_type", this.f60124d != null ? 1 : 0);
        a.put("params", jSONObject);
        return a;
    }

    /* renamed from: b */
    public String mo33259b() {
        return this.f60125e;
    }
}
