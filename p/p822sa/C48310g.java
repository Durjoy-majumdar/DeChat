package p822sa;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* renamed from: sa.g */
public class C48310g {

    /* renamed from: a */
    public int f129363a;

    /* renamed from: b */
    public boolean f129364b;

    public C48310g(C48316m mVar) {
        JSONObject jSONObject = mVar.f129356b;
        jSONObject.getString(FirebaseAnalytics.C113379b.METHOD);
        if (jSONObject.optJSONObject("data") == null) {
            new JSONObject();
        }
        this.f129363a = jSONObject.optInt("callbackId", 0);
        this.f129364b = jSONObject.optBoolean("keepCallback", false);
    }
}
