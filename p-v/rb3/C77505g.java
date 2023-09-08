package rb3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: rb3.g */
public class C77505g extends C75790l {

    /* renamed from: d */
    public String f225989d = null;

    public C77505g(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put("verify_code", str);
        hashMap.put("session_key", str2);
        hashMap.put("passwd", str3);
        hashMap.put("bind_serialno", str4);
        hashMap.put("bank_type", str5);
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("banktype", str5);
        setWXRequestData(hashMap2);
    }

    public int getTenpayCgicmd() {
        return 65;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            this.f225989d = jSONObject.optString("app_username");
        }
    }
}
