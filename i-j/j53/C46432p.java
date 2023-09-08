package j53;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: j53.p */
public class C46432p extends C75790l {
    public C46432p(String str, String str2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("resetpwd_token", str2);
        hashMap.put("passwd", str);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return 1371;
    }

    public int getTenpayCgicmd() {
        return 1371;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/resetpwdbytoken";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.NetSceneTenpayResetPwdByToken", " json %s", jSONObject.toString());
    }
}
