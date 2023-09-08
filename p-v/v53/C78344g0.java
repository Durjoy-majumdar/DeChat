package v53;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.g0 */
public class C78344g0 extends C75790l {

    /* renamed from: d */
    public String f229578d;

    /* renamed from: e */
    public JSONObject f229579e;

    public C78344g0(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        this.f229578d = str;
        HashMap hashMap = new HashMap();
        hashMap.put(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, str);
        hashMap.put("award_id", str2);
        hashMap.put("send_record_id", str3);
        hashMap.put("user_record_id", str4);
        hashMap.put("req_key", str5);
        hashMap.put(FirebaseAnalytics.C113379b.TRANSACTION_ID, str6);
        hashMap.put("activity_mch_id", j + "");
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1979;
    }

    public int getTenpayCgicmd() {
        return 1979;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/querypayaward";
    }

    public boolean isBlock() {
        return false;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneTenpayQueryPayaward", "errcode %s errmsg %s json %s", Integer.valueOf(i), str, jSONObject);
        this.f229579e = jSONObject;
    }
}
