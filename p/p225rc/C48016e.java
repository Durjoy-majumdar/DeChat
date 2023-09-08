package p225rc;

import android.os.PersistableBundle;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: rc.e */
public final class C48016e {
    /* renamed from: a */
    public static JSONObject m53375a(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String next : persistableBundle.keySet()) {
            Object obj = persistableBundle.get(next);
            if (obj instanceof PersistableBundle) {
                jSONObject.put(next, m53375a((PersistableBundle) obj));
            } else {
                jSONObject.put(next, obj);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static JSONArray m53376b(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(list.get(i));
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static Boolean m53377c(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if ("true".equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: d */
    public static void m53378d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((key instanceof String) && (value instanceof Map)) {
                Map map2 = (Map) value;
                m53378d(map2);
                map.put(key, new JSONObject(map2));
            }
        }
    }
}
