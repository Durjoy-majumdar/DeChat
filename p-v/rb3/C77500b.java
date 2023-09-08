package rb3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: rb3.b */
public class C77500b extends C75790l {

    /* renamed from: d */
    public String f225980d;

    /* renamed from: e */
    public String f225981e;

    /* renamed from: f */
    public String f225982f;

    /* renamed from: g */
    public boolean f225983g = true;

    public C77500b(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put("bank_type", str2);
        hashMap.put("check_pwd_scene", i + "");
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("check_pwd_scene", i + "");
        setWXRequestData(hashMap2);
    }

    public int getTenpayCgicmd() {
        return 63;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            this.f225980d = jSONObject.optString("session_key");
            if ("1".equals(jSONObject.optString("all_info"))) {
                this.f225983g = false;
                return;
            }
            this.f225983g = true;
            this.f225981e = jSONObject.optString("name");
            this.f225982f = jSONObject.optString("cre_id");
        }
    }
}
