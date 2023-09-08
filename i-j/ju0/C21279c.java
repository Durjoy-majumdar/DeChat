package ju0;

import org.json.JSONObject;

/* renamed from: ju0.c */
public final class C21279c extends C21278a {

    /* renamed from: a */
    public float f60110a = -1.0f;

    /* renamed from: b */
    public int f60111b;

    /* renamed from: c */
    public int f60112c = -1;

    /* renamed from: d */
    public String f60113d = "";

    /* renamed from: e */
    public final String f60114e = "BlusherStick";

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject a = super.mo33258a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alpha", Float.valueOf(this.f60110a));
        jSONObject.put("face_model", this.f60111b);
        jSONObject.put("blend_mode", this.f60112c);
        jSONObject.put("path", this.f60113d);
        a.put("params", jSONObject);
        return a;
    }

    /* renamed from: b */
    public String mo33259b() {
        return this.f60114e;
    }
}
