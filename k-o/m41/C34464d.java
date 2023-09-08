package m41;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import u24.C90599h;

/* renamed from: m41.d */
public class C34464d {

    /* renamed from: m41.d$a */
    public interface C34465a {
        /* renamed from: a */
        boolean mo59598a(Map map);
    }

    /* renamed from: m41.d$b */
    public static class C34466b implements C34465a {
    }

    /* renamed from: a */
    public static Object m40358a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            try {
                JSONArray jSONArray = new JSONArray();
                for (Object a : list) {
                    Object a2 = m40358a(a);
                    if (a2 != null) {
                        jSONArray.put(a2);
                    }
                }
                return jSONArray;
            } catch (Exception e) {
                Log.m105920e("ParamsUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e.getMessage());
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            try {
                JSONObject jSONObject = new JSONObject();
                for (Object next : map.keySet()) {
                    Object obj2 = map.get(next);
                    if (obj2 != null && (next instanceof String)) {
                        if (!(obj2 instanceof String) || !C90599h.m113511d((String) obj2)) {
                            String str = (String) next;
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            if (!C90599h.m113509b(lowerCase, str)) {
                                Log.m105920e("ParamsUtils", "[genJSONObject] key contain upperCase, key : " + next);
                            }
                            Object a3 = m40358a(map.get(next));
                            if (a3 != null) {
                                jSONObject.put(lowerCase, a3);
                            }
                        }
                    }
                }
                return jSONObject;
            } catch (Exception e2) {
                Log.m105920e("ParamsUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e2.getMessage());
            }
        } else if (obj instanceof Set) {
            Set<Object> set = (Set) obj;
            try {
                JSONArray jSONArray2 = new JSONArray();
                for (Object a4 : set) {
                    Object a5 = m40358a(a4);
                    if (a5 != null) {
                        jSONArray2.put(a5);
                    }
                }
                return jSONArray2;
            } catch (Exception e3) {
                Log.m105920e("ParamsUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e3.getMessage());
            }
        } else if ((obj instanceof String) || (obj instanceof StringBuilder) || (obj instanceof StringBuffer)) {
            String obj3 = obj.toString();
            try {
                if (obj3.contains(",")) {
                    if (obj3.contains("|")) {
                        Log.m105920e("ParamsUtils", "[genJSONObject] str contain '|' , str : " + obj3);
                    }
                    return obj3.replace(",", "|");
                }
            } catch (Exception e4) {
                Log.m105920e("ParamsUtils", "[genJSONObject] object : " + obj + ", throw Exception : " + e4.getMessage());
            }
            return obj3;
        } else if (obj instanceof Number) {
            return obj;
        } else {
            Log.m105920e("ParamsUtils", "[genJSONObject] object type is error : " + obj);
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m40359b(Object obj, C34465a aVar) {
        if (!(obj == null || aVar == null)) {
            if (obj instanceof List) {
                for (Object b : (List) obj) {
                    if (m40359b(b, aVar)) {
                        return true;
                    }
                }
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                if (aVar.mo59598a(map)) {
                    return true;
                }
                for (Object b2 : map.values()) {
                    if (m40359b(b2, aVar)) {
                        return true;
                    }
                }
            } else if (obj instanceof Set) {
                for (Object b3 : (Set) obj) {
                    if (m40359b(b3, aVar)) {
                        return true;
                    }
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
            } else if (obj instanceof Number) {
                Number number = (Number) obj;
            }
        }
        return false;
    }
}
