package v53;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.t */
public class C78353t extends C75790l {

    /* renamed from: d */
    public Orders.Promotions f229608d;

    /* renamed from: e */
    public String f229609e;

    /* renamed from: f */
    public String f229610f;

    /* renamed from: g */
    public String f229611g;

    public C78353t(Orders.Promotions promotions, String str, String str2, long j) {
        this.f229608d = promotions;
        HashMap hashMap = new HashMap();
        hashMap.put(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, promotions.f209672o + "");
        hashMap.put("award_id", promotions.f209674q + "");
        hashMap.put("send_record_id", promotions.f209675r + "");
        hashMap.put("user_record_id", promotions.f209676s + "");
        hashMap.put("req_key", str);
        hashMap.put(FirebaseAnalytics.C113379b.TRANSACTION_ID, str2);
        hashMap.put("activity_mch_id", j + "");
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1589;
    }

    public int getTenpayCgicmd() {
        return 1589;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sendpayaward";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i(C75790l.TAG, "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", Integer.valueOf(i), str, jSONObject);
        if (jSONObject != null && i == 0) {
            this.f229609e = jSONObject.optString("result_code");
            this.f229610f = jSONObject.optString("result_msg");
            this.f229611g = jSONObject.optString("alert_wording");
        }
    }
}
