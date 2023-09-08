package v53;

import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: v53.s */
public class C78352s extends C75790l {

    /* renamed from: d */
    public String f229604d;

    /* renamed from: e */
    public String f229605e;

    /* renamed from: f */
    public String f229606f;

    /* renamed from: g */
    public BindCardOrder f229607g;

    public C78352s(BindCardOrder bindCardOrder, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, int i, int i2) {
        this.f229607g = bindCardOrder;
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
        return 1786;
    }

    public int getTenpayCgicmd() {
        return 1786;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sendbindcardaward";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null && i == 0) {
            this.f229604d = jSONObject.optString("result_code");
            this.f229605e = jSONObject.optString("result_msg");
            this.f229606f = jSONObject.optString("alert_wording");
        }
    }
}
