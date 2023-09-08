package r63;

import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: r63.b */
public class C47927b extends C45440a {
    public C47927b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("bind_serial", str);
        hashMap.put("payu_reference", "" + str2);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 6;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
