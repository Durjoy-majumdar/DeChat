package xz2;

import di0.C86295k;
import eb0.C31543z5;
import gy3.C87412m;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: xz2.y */
public final class C15920y implements C86295k {

    /* renamed from: d */
    public final /* synthetic */ String f42788d;

    /* renamed from: e */
    public final /* synthetic */ String f42789e;

    public C15920y(String str, String str2) {
        this.f42788d = str;
        this.f42789e = str2;
    }

    /* renamed from: a */
    public final String mo3693a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("textStateModelInfo", this.f42788d);
        String str = this.f42789e;
        if (!(str == null || C112551y.m153811k(str))) {
            jSONObject.put("clickTagName", this.f42789e);
        }
        jSONObject.put("clickTagTime", C31543z5.m39453c());
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "jsonObj.toString()");
        return jSONObject2;
    }
}
