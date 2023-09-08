package v53;

import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.v */
public class C78354v extends C75790l {
    public C78354v(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("wallet_tpa_country", str);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1663;
    }

    public int getTenpayCgicmd() {
        return 1663;
    }

    public int getType() {
        return super.getType();
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/setuserwallet";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
