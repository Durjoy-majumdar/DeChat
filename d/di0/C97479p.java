package di0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: di0.p */
public class C97479p implements C86295k {

    /* renamed from: d */
    public float f286114d;

    /* renamed from: e */
    public float f286115e;

    /* renamed from: f */
    public String f286116f;

    /* renamed from: g */
    public String f286117g;

    /* renamed from: h */
    public String f286118h;

    /* renamed from: i */
    public long f286119i;

    /* renamed from: j */
    public String f286120j;

    /* renamed from: a */
    public String mo3693a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("latitude", (double) this.f286114d);
            jSONObject.put("longitude", (double) this.f286115e);
            jSONObject.put("name", this.f286116f);
            jSONObject.put("clickTime", this.f286119i);
            jSONObject.put("cityName", this.f286118h);
            jSONObject.put("cityCode", this.f286117g);
            if (!Util.isNullOrNil(this.f286120j)) {
                jSONObject.put("poiId", this.f286120j);
            }
            return new JSONObject().put(FirebaseAnalytics.C113379b.LOCATION, jSONObject).toString();
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.WeAppOpenPoiNativeExtraData", e, "", new Object[0]);
            return "{}";
        }
    }
}
