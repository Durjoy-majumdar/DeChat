package p822sa;

import org.json.JSONObject;

/* renamed from: sa.m */
public class C48316m extends C48304a {
    public C48316m(JSONObject jSONObject) {
        this.f129355a = C48305b.valueOf(jSONObject.getString("type"));
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        this.f129356b = optJSONObject;
        if (optJSONObject == null) {
            this.f129356b = new JSONObject();
        }
    }
}
