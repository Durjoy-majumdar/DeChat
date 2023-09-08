package v53;

import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.u */
public class C37678u extends C75790l {
    public C37678u() {
        setRequestData(new HashMap());
    }

    public int getFuncId() {
        return 2791;
    }

    public int getTenpayCgicmd() {
        return 2791;
    }

    public int getType() {
        return 2791;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/setpayuserduty";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
