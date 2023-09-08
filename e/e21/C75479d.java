package e21;

import com.google.android.gms.measurement.AppMeasurement;
import org.json.JSONObject;

/* renamed from: e21.d */
public class C75479d {

    /* renamed from: a */
    public String f221800a;

    /* renamed from: b */
    public String f221801b;

    /* renamed from: c */
    public long f221802c;

    /* renamed from: d */
    public String f221803d;

    /* renamed from: e */
    public int f221804e;

    /* renamed from: a */
    public static C75479d m90510a(JSONObject jSONObject) {
        C75479d dVar = new C75479d();
        dVar.f221800a = jSONObject.optString("bill_id");
        dVar.f221801b = jSONObject.optString("trans_id");
        dVar.f221802c = jSONObject.optLong(AppMeasurement.Param.TIMESTAMP, 0);
        dVar.f221803d = jSONObject.optString("desc");
        dVar.f221804e = jSONObject.optInt("fee", 0);
        return dVar;
    }
}
