package ju0;

import org.json.JSONObject;

/* renamed from: ju0.d */
public final class C21280d extends C21278a {

    /* renamed from: a */
    public float f60115a = -1.0f;

    /* renamed from: b */
    public int f60116b;

    /* renamed from: c */
    public int f60117c = -1;

    /* renamed from: d */
    public String f60118d = "";

    /* renamed from: e */
    public float f60119e = -1.0f;

    /* renamed from: f */
    public final String f60120f = "EyeBrow";

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject a = super.mo33258a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alpha", Float.valueOf(this.f60115a));
        jSONObject.put("face_model", this.f60116b);
        jSONObject.put("blend_mode", this.f60117c);
        jSONObject.put("path", this.f60118d);
        jSONObject.put("shrink_rate", Float.valueOf(this.f60119e));
        a.put("params", jSONObject);
        return a;
    }

    /* renamed from: b */
    public String mo33259b() {
        return this.f60120f;
    }
}
