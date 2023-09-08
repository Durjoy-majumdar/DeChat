package v53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.y */
public class C78357y extends C75790l {

    /* renamed from: d */
    public String f229617d;

    /* renamed from: e */
    public int f229618e;

    /* renamed from: f */
    public String f229619f;

    /* renamed from: g */
    public String f229620g;

    public C78357y(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str);
        hashMap.put("use_touch", "" + i);
        setRequestData(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("soter_req", str2);
        setWXRequestData(hashMap2);
    }

    public int getFuncId() {
        return 1515;
    }

    public int getTenpayCgicmd() {
        return 100;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/getusertoken";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayCheckPwdByToken", "errCode " + i + " errMsg: " + str);
        this.f229617d = jSONObject.optString("usertoken");
        this.f229618e = jSONObject.optInt("is_free_sms");
        this.f229619f = jSONObject.optString("mobile_no");
        this.f229620g = jSONObject.optString("relation_key");
    }

    public C78357y(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str2);
        setRequestData(hashMap);
        setWXRequestData(new HashMap());
    }

    public C78357y(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str2);
        hashMap.put("resend", z ? "1" : "0");
        setRequestData(hashMap);
        setWXRequestData(new HashMap());
    }
}
