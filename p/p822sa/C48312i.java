package p822sa;

import org.json.JSONObject;

/* renamed from: sa.i */
public class C48312i {

    /* renamed from: a */
    public String f129365a;

    public C48312i(C48316m mVar) {
        JSONObject jSONObject = mVar.f129356b;
        this.f129365a = jSONObject.getString("event");
        if (jSONObject.optJSONObject("data") == null) {
            new JSONObject();
        }
    }
}
