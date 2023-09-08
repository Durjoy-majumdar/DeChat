package wh3;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wh3.z */
public class C102452z {

    /* renamed from: a */
    public String f301705a;

    /* renamed from: b */
    public int f301706b;

    /* renamed from: c */
    public long f301707c;

    /* renamed from: a */
    public JSONObject mo142068a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f301705a);
            jSONObject.put("use_count", this.f301706b);
            jSONObject.put("last_time", this.f301707c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
