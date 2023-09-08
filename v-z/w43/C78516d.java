package w43;

import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;
import rm0.C90034g;

/* renamed from: w43.d */
public class C78516d extends C75790l {
    public C78516d(String str, String str2, String str3, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("bank_type", str);
        hashMap.put("bind_serial", str2);
        hashMap.put("passwd", str3);
        if (z) {
            hashMap.put("unbind_scene", "1");
        }
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return C90034g.CTRL_INDEX;
    }

    public int getTenpayCgicmd() {
        return 14;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/unbind";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }

    public C78516d(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("bank_type", str);
        hashMap.put("bind_serial", str2);
        hashMap.put("expired_flag", "1");
        if (z) {
            hashMap.put("unbind_scene", "1");
        }
        setRequestData(hashMap);
    }
}
