package r63;

import dr3.C45440a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: r63.a */
public class C77487a extends C45440a {
    public C77487a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        HashMap hashMap = new HashMap();
        hashMap.put("bank_type", str);
        hashMap.put("information", str2);
        hashMap.put("name_on_card", str3);
        hashMap.put("card_number", str4);
        hashMap.put("card_expiry", str5);
        hashMap.put("description", str6);
        hashMap.put("cvv", str7);
        hashMap.put("pin", str8);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public int mo70937j1() {
        return 0;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
