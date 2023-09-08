package ix3;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ix3.f */
public final class C76377f {
    /* renamed from: a */
    public static Object m91806a(JSONArray jSONArray, int i) {
        if (jSONArray != null && i < jSONArray.length() && i >= 0) {
            try {
                return jSONArray.get(i);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m91807b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Exception unused) {
                C76377f.class.toString();
            }
        }
        return "";
    }
}
