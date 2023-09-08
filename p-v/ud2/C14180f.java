package ud2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ud2.f */
public class C14180f {

    /* renamed from: a */
    public static MultiProcessMMKV f39626a = MultiProcessMMKV.getMMKV("pat_user_mmkv");

    /* renamed from: a */
    public static String m13511a(String str) {
        try {
            return (String) m13512b(str, "pat_user_suffix_content");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PatUserMMKV", e, "", new Object[0]);
            return "";
        }
    }

    /* renamed from: b */
    public static Object m13512b(String str, String str2) {
        if (Util.isNullOrNil(str) || !f39626a.containsKey(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(f39626a.getString(str, ""));
        if (jSONObject.has(str2)) {
            return jSONObject.get(str2);
        }
        return null;
    }

    /* renamed from: c */
    public static void m13513c(String str, int i) {
        try {
            m13514d(str, "pat_user_suffix_version", Integer.valueOf(i));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.PatUserMMKV", e, "", new Object[0]);
        }
    }

    /* renamed from: d */
    public static void m13514d(String str, String str2, Object obj) {
        if (!Util.isNullOrNil(str)) {
            JSONObject jSONObject = f39626a.containsKey(str) ? new JSONObject(f39626a.getString(str, "")) : new JSONObject();
            jSONObject.put(str2, obj);
            f39626a.putString(str, jSONObject.toString()).commit();
        }
    }
}
