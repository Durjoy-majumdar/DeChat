package x63;

import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: x63.d */
public class C53293d extends C45440a {
    public C53293d(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("payu_reference", str);
        hashMap.put("new_pin", str2);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 19;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        jSONObject.optString("payu_reference");
    }
}
