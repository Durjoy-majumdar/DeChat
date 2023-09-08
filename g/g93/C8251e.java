package g93;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import t83.C13851h1;

/* renamed from: g93.e */
public class C8251e {

    /* renamed from: a */
    public static List<String> f27183a;

    /* renamed from: g93.e$a */
    public interface C8252a {
        /* renamed from: a */
        void mo7434a(C13851h1 h1Var, String str, Map<String, Object> map);
    }

    static {
        ArrayList arrayList = new ArrayList();
        f27183a = arrayList;
        arrayList.add("updatePageAuth");
        new ArrayList();
    }

    /* renamed from: a */
    public static void m8321a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((key instanceof String) && (value instanceof Map)) {
                Map map2 = (Map) value;
                m8321a(map2);
                map.put(key, new JSONObject(map2));
            }
        }
    }
}
