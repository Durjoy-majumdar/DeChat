package q63;

import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: q63.a */
public class C77305a extends C45440a {

    /* renamed from: d */
    public String f225432d;

    public C77305a(double d, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("total_fee", "" + Math.round(d * 100.0d));
        hashMap.put("fee_type", str);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 20;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        this.f225432d = jSONObject.optString("prepayid");
    }
}
