package rb3;

import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: rb3.f */
public class C77504f extends C75790l {
    public C77504f(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("bank_type", str);
        hashMap.put("bind_serial", str2);
        hashMap.put("passwd", str3);
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 62;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
