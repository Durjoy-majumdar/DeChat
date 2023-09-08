package y63;

import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: y63.b */
public class C79058b extends C45440a {

    /* renamed from: d */
    public boolean f232156d;

    /* renamed from: e */
    public String f232157e;

    public C79058b(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", str2);
        hashMap.put("answer", str3);
        hashMap.put("payu_reference", str);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 18;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f232156d = jSONObject.optBoolean("verified");
        this.f232157e = jSONObject.optString("payu_reference");
    }
}
