package th2;

import gy3.C87412m;
import org.json.JSONArray;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: th2.a */
public final class C37111a {

    /* renamed from: a */
    public JSONArray f98296a = new JSONArray();

    /* renamed from: b */
    public final Object f98297b = new Object();

    /* renamed from: a */
    public final void mo60974a(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", i);
        boolean z = true;
        jSONObject.put("td", this.f98296a.length() + 1);
        if (this.f98296a.toString().length() + jSONObject.toString().length() > 1000) {
            z = false;
        }
        if (z) {
            synchronized (this.f98297b) {
                this.f98296a.put(jSONObject);
            }
        }
    }

    /* renamed from: b */
    public final String mo60975b() {
        String n;
        synchronized (this.f98297b) {
            String jSONArray = this.f98296a.toString();
            C87412m.m108593f(jSONArray, "traceJsonArray.toString()");
            n = C112551y.m153814n(jSONArray, ",", ";", false);
        }
        return n;
    }
}
