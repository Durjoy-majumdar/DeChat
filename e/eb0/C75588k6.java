package eb0;

import eb0.C116734h6;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: eb0.k6 */
public class C75588k6 implements C116734h6.C116736d.C116740e {
    /* renamed from: a */
    public void mo105935a(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(jSONObject.optString(next), next);
        }
        C116734h6.C75585e.f222060a = hashMap;
    }
}
