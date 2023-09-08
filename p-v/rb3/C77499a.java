package rb3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rb3.a */
public class C77499a extends C75790l {

    /* renamed from: d */
    public Map<String, String> f225975d;

    /* renamed from: e */
    public String f225976e;

    /* renamed from: f */
    public boolean f225977f = true;

    /* renamed from: g */
    public boolean f225978g = false;

    /* renamed from: h */
    public String f225979h;

    public C77499a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        this.f225975d = hashMap;
        hashMap.put("session_key", str3);
        this.f225975d.put("bank_type", str4);
        this.f225975d.put("name", str);
        this.f225975d.put("cre_id", str2);
        setRequestData(this.f225975d);
    }

    public int getTenpayCgicmd() {
        return 64;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            try {
                this.f225976e = jSONObject.optString("session_key");
                this.f225977f = "1".equals(jSONObject.getString("need_bind"));
                this.f225978g = "1".equals(jSONObject.getString("bank_user"));
                this.f225979h = jSONObject.optString("mobile_no");
            } catch (JSONException e) {
                Log.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", e, "", new Object[0]);
            }
        }
    }

    public boolean resend() {
        super.resend();
        ((HashMap) this.f225975d).put("retry", "1");
        setRequestData(this.f225975d);
        return true;
    }
}
