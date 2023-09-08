package wz0;

import org.json.JSONObject;
import te3.C49029co;

/* renamed from: wz0.t */
public class C53269t {
    /* renamed from: a */
    public static C49029co m59711a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C49029co coVar = new C49029co();
        coVar.f131848d = jSONObject.optString("name");
        coVar.f131849e = jSONObject.optString("descriptor");
        coVar.f131850f = jSONObject.optString("phone");
        coVar.f131851g = jSONObject.optString("country");
        coVar.f131852h = jSONObject.optString("province");
        coVar.f131853i = jSONObject.optString("city");
        coVar.f131854j = jSONObject.optString("address");
        coVar.f131855n = (float) jSONObject.optDouble("distance");
        coVar.f131856o = (float) jSONObject.optDouble("longitude");
        coVar.f131857p = (float) jSONObject.optDouble("latitude");
        coVar.f131858q = jSONObject.optString("jump_url");
        coVar.f131859r = jSONObject.optString("app_brand_user_name");
        coVar.f131860s = jSONObject.optString("app_brand_pass");
        return coVar;
    }
}
