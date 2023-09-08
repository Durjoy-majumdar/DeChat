package s52;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: s52.d */
public class C77619d {

    /* renamed from: a */
    public String f226283a = "";

    public C77619d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("eu_protocol_url");
            jSONObject.optInt("0");
            this.f226283a = jSONObject.optString("wxpay_protocol_url");
        } catch (Exception e) {
            Log.printErrStackTrace("MciroMsg.EUInfo", e, "", new Object[0]);
        }
    }
}
