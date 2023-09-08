package ju0;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ju0.g */
public final class C21283g extends C21278a {

    /* renamed from: a */
    public float f60130a = -1.0f;

    /* renamed from: b */
    public int f60131b = -1;

    /* renamed from: c */
    public int f60132c = -1;

    /* renamed from: d */
    public int f60133d = -1;

    /* renamed from: e */
    public int f60134e;

    /* renamed from: f */
    public int f60135f;

    /* renamed from: g */
    public int f60136g;

    /* renamed from: h */
    public final String f60137h = "LipStickV2";

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject a = super.mo33258a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alpha", Float.valueOf(this.f60130a));
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(this.f60131b);
        jSONArray2.put(this.f60132c);
        jSONArray2.put(this.f60133d);
        jSONArray.put(jSONArray2);
        jSONObject.put("color", jSONArray);
        jSONObject.put("lipstick_type", this.f60134e);
        jSONObject.put("face_model", this.f60135f);
        jSONObject.put("mouth_shape", this.f60136g);
        a.put("params", jSONObject);
        return a;
    }

    /* renamed from: b */
    public String mo33259b() {
        return this.f60137h;
    }
}
