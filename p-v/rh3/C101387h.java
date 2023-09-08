package rh3;

import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: rh3.h */
public final class C101387h extends C36327a {

    /* renamed from: a */
    public double[] f296989a = new double[0];

    /* renamed from: b */
    public double[] f296990b = new double[0];

    /* renamed from: c */
    public double[] f296991c = new double[0];

    /* renamed from: d */
    public double[] f296992d = new double[0];

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trans_0", C101378b.m133023b(this.f296989a));
        jSONObject.put("trans_1", C101378b.m133023b(this.f296990b));
        jSONObject.put("trans_2", C101378b.m133023b(this.f296991c));
        jSONObject.put("trans_3", C101378b.m133023b(this.f296992d));
        return jSONObject;
    }

    /* renamed from: b */
    public C36327a mo140868b(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "jsonObj");
        JSONArray optJSONArray = jSONObject.optJSONArray("trans_0");
        this.f296989a = optJSONArray != null ? C101378b.m133022a(optJSONArray) : this.f296989a;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("trans_1");
        this.f296990b = optJSONArray2 != null ? C101378b.m133022a(optJSONArray2) : this.f296990b;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("trans_2");
        this.f296991c = optJSONArray3 != null ? C101378b.m133022a(optJSONArray3) : this.f296991c;
        JSONArray optJSONArray4 = jSONObject.optJSONArray("trans_3");
        this.f296992d = optJSONArray4 != null ? C101378b.m133022a(optJSONArray4) : this.f296992d;
        return this;
    }
}
