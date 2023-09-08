package t83;

import android.os.Bundle;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p823sg.C48379o;

/* renamed from: t83.h1 */
public class C13851h1 extends C13841a {

    /* renamed from: b */
    public String f38989b;

    /* renamed from: c */
    public String f38990c;

    /* renamed from: d */
    public JSONObject f38991d;

    /* renamed from: e */
    public Bundle f38992e;

    /* renamed from: f */
    public JsapiPermissionWrapper f38993f;

    /* renamed from: g */
    public C13848e f38994g;

    /* renamed from: h */
    public Map<String, Object> f38995h = new HashMap();

    /* renamed from: i */
    public String f38996i;

    /* renamed from: t83.h1$a */
    public static class C13852a {
        /* renamed from: a */
        public static String m13141a(String str, Map<String, Object> map, boolean z, String str2) {
            return m13145e("callback", str, map, (JSONObject) null, z, str2);
        }

        /* renamed from: b */
        public static JSONObject m13142b(Map<String, Object> map) {
            if (map == null || map.size() == 0) {
                return new JSONObject();
            }
            try {
                String str = (String) map.get("jsapi_callback_json_special_key");
                JSONObject jSONObject = new JSONObject();
                for (String next : map.keySet()) {
                    if (next != null) {
                        if (!next.equals("jsapi_callback_json_special_key")) {
                            if (str == null || !next.equals(str)) {
                                jSONObject.put(next, map.get(next));
                            } else {
                                jSONObject.put(str, new JSONArray((String) map.get(str)));
                            }
                        }
                    }
                }
                return jSONObject;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MsgWrapper", "convertMapToJSON fail, exception = " + e.getMessage());
                return null;
            }
        }

        /* renamed from: c */
        public static String m13143c(String str, Map<String, Object> map, boolean z, String str2) {
            return m13145e("event", str, map, (JSONObject) null, z, str2);
        }

        /* renamed from: d */
        public static String m13144d(String str, JSONObject jSONObject, boolean z, String str2) {
            return m13145e("event", str, (Map<String, Object>) null, jSONObject, z, str2);
        }

        /* renamed from: e */
        public static String m13145e(String str, String str2, Map<String, Object> map, JSONObject jSONObject, boolean z, String str3) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("__msg_type", str);
                if (str.equals("callback")) {
                    jSONObject2.put("__callback_id", str2);
                } else if (str.equals("event")) {
                    jSONObject2.put("__event_id", str2);
                }
                if (jSONObject == null) {
                    jSONObject2.put("__params", m13142b(map));
                } else {
                    jSONObject2.put("__params", jSONObject);
                }
                if (!z) {
                    return jSONObject2.toString();
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("__json_message", jSONObject2);
                    String replaceAll = jSONObject2.toString().replaceAll("\\\\/", "/");
                    Log.m105925i("MicroMsg.MsgWrapper", "js digest verification contentStr = %s", replaceAll);
                    String b = C48379o.m53725b(replaceAll + str3);
                    Log.m105925i("MicroMsg.MsgWrapper", "js digest verification shaStr = %s", b);
                    jSONObject3.put("__sha_key", b);
                    return jSONObject3.toString();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.MsgWrapper", "build fail, exception = " + e.getMessage());
                    return null;
                }
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.MsgWrapper", "build fail, exception = " + e2.getMessage());
                return null;
            }
        }
    }

    /* renamed from: b */
    public static Bundle m13139b(Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj instanceof String[]) {
                bundle.putStringArray(next, (String[]) obj);
            } else if (obj instanceof Bundle) {
                bundle.putBundle(next, (Bundle) obj);
            } else {
                bundle.putString(next, String.valueOf(obj));
            }
        }
        return bundle;
    }

    /* renamed from: c */
    public Map<String, Object> mo13180c() {
        return this.f38995h;
    }
}
