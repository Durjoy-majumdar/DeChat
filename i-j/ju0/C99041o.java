package ju0;

import org.json.JSONObject;
import rh3.C101382f;

/* renamed from: ju0.o */
public final class C99041o extends C101382f {

    /* renamed from: g */
    public JSONObject f290340g;

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject jSONObject;
        JSONObject a = super.mo33258a();
        JSONObject optJSONObject = a.optJSONObject("params");
        if (!(optJSONObject == null || (jSONObject = this.f290340g) == null)) {
            try {
                optJSONObject.put("template_trans_set", jSONObject);
            } catch (Exception unused) {
            }
        }
        return a;
    }
}
