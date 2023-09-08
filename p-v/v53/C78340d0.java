package v53;

import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.d0 */
public class C78340d0 extends C75790l {

    /* renamed from: d */
    public String f229548d;

    /* renamed from: e */
    public JSONObject f229549e;

    public C78340d0(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, int i, int i2) {
        this.f229548d = str;
        HashMap hashMap = new HashMap();
        hashMap.put(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, str);
        hashMap.put("award_id", str2);
        hashMap.put("send_record_id", str3);
        hashMap.put("user_record_id", str4);
        hashMap.put("activity_mch_id", j + "");
        hashMap.put("activity_type", j2 + "");
        hashMap.put("bank_type", str5 + "");
        hashMap.put("bank_serial", str6 + "");
        hashMap.put("bindbankscene", i + "");
        hashMap.put("realname_scene", i2 + "");
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1773;
    }

    public int getTenpayCgicmd() {
        return 1773;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/querybindcardaward";
    }

    public boolean isBlock() {
        return false;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTenpayQueryBindPayaward", "errcode %s errmsg %s json %s", Integer.valueOf(i), str, jSONObject);
        this.f229549e = jSONObject;
    }
}
