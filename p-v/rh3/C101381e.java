package rh3;

import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: rh3.e */
public final class C101381e extends C36327a {

    /* renamed from: a */
    public int f296963a;

    /* renamed from: b */
    public int f296964b = -1;

    /* renamed from: c */
    public int f296965c = -1;

    /* renamed from: d */
    public int f296966d;

    /* renamed from: e */
    public boolean f296967e;

    /* renamed from: f */
    public double[] f296968f = new double[0];

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("len", this.f296963a);
        jSONObject.put("active", this.f296964b);
        boolean z = false;
        if (this.f296965c >= 0 || this.f296966d == 2) {
            jSONObject.put("segtype", 0);
        }
        double[] dArr = this.f296968f;
        if (dArr.length == 0) {
            z = true;
        }
        if (!z) {
            jSONObject.put("pos", C101378b.m133023b(dArr));
        }
        int i = this.f296966d;
        if (i == 1 || i == 2) {
            jSONObject.put("adjust", true);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public C36327a mo140862b(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "jsonObj");
        this.f296963a = jSONObject.optInt("len");
        this.f296964b = jSONObject.optInt("active", this.f296964b);
        this.f296965c = jSONObject.optInt("segtype", this.f296965c);
        this.f296966d = jSONObject.optInt("pendant_type", this.f296966d);
        this.f296967e = jSONObject.optBoolean("adjust", this.f296967e);
        JSONArray optJSONArray = jSONObject.optJSONArray("pos");
        this.f296968f = optJSONArray != null ? C101378b.m133022a(optJSONArray) : this.f296968f;
        return this;
    }
}
