package x63;

import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: x63.b */
public class C53292b extends C45440a {
    public C53292b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("old_pin", str);
        hashMap.put("new_pin", "" + str2);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 2;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
