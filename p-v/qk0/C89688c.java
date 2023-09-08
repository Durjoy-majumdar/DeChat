package qk0;

import org.json.JSONObject;

/* renamed from: qk0.c */
public class C89688c {

    /* renamed from: a */
    public String f257949a;

    /* renamed from: b */
    public boolean f257950b;

    /* renamed from: c */
    public boolean f257951c;

    /* renamed from: d */
    public boolean f257952d;

    /* renamed from: e */
    public boolean f257953e;

    /* renamed from: f */
    public boolean f257954f;

    /* renamed from: g */
    public int f257955g;

    /* renamed from: h */
    public JSONObject f257956h;

    /* renamed from: a */
    public JSONObject mo124014a() {
        if (this.f257956h == null) {
            JSONObject jSONObject = new JSONObject();
            this.f257956h = jSONObject;
            jSONObject.put("uuid", this.f257949a);
            this.f257956h.put("handle", this.f257955g);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("read", this.f257950b);
            jSONObject2.put("write", this.f257951c || this.f257952d);
            jSONObject2.put("notify", this.f257953e);
            jSONObject2.put("indicate", this.f257954f);
            jSONObject2.put("writeNoResponse", this.f257952d);
            jSONObject2.put("writeDefault", this.f257951c);
            this.f257956h.put("properties", jSONObject2);
        }
        return this.f257956h;
    }
}
