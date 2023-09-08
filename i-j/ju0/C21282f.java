package ju0;

import org.json.JSONObject;

/* renamed from: ju0.f */
public final class C21282f extends C21278a {

    /* renamed from: a */
    public int f60126a;

    /* renamed from: b */
    public float f60127b = -1.0f;

    /* renamed from: c */
    public String f60128c = "";

    /* renamed from: d */
    public final String f60129d = "FaceContour";

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject a = super.mo33258a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("face_model", this.f60126a);
        jSONObject.put("alpha", Float.valueOf(this.f60127b));
        jSONObject.put("path", this.f60128c);
        a.put("params", jSONObject);
        return a;
    }

    /* renamed from: b */
    public String mo33259b() {
        return this.f60129d;
    }
}
