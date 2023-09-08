package u43;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.tenpay.model.ITenpaySave;
import fr3.C75790l;
import java.math.RoundingMode;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: u43.e */
public class C78129e extends C75790l implements ITenpaySave, C45119n {

    /* renamed from: d */
    public String f228958d = null;

    /* renamed from: e */
    public String f228959e;

    /* renamed from: f */
    public String f228960f;

    /* renamed from: g */
    public String f228961g;

    /* renamed from: h */
    public String f228962h;

    /* renamed from: i */
    public String f228963i;

    /* renamed from: j */
    public ITenpaySave.RetryPayInfo f228964j;

    public C78129e(double d, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("total_fee", C75228t.m90230W("" + d, "100", 0, RoundingMode.HALF_UP).toString());
        hashMap.put("fee_type", str);
        hashMap.put("bind_serial", str2);
        hashMap.put("bank_type", str3);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1502;
    }

    public ITenpaySave.RetryPayInfo getRetryPayInfo() {
        return this.f228964j;
    }

    public int getTenpayCgicmd() {
        return 74;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/genpresave";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayBalanceSave", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            this.f228958d = jSONObject.optString("req_key");
            "1".equals(jSONObject.optString("should_alert"));
            jSONObject.optString("alert_msg");
            if (jSONObject.has("real_name_info")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
                Log.m105925i("Micromsg.NetSceneTenpayBalanceSave", "get real_name_info %s", optJSONObject.toString());
                this.f228959e = optJSONObject.optString("guide_flag");
                this.f228960f = optJSONObject.optString("guide_wording");
                this.f228961g = optJSONObject.optString("left_button_wording");
                this.f228962h = optJSONObject.optString("right_button_wording");
                this.f228963i = optJSONObject.optString("upload_credit_url");
            }
            ITenpaySave.RetryPayInfo retryPayInfo = new ITenpaySave.RetryPayInfo();
            this.f228964j = retryPayInfo;
            retryPayInfo.mo104873a(jSONObject);
        }
    }
}
