package y53;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C117627q;

/* renamed from: y53.a */
public class C79056a extends C75790l {

    /* renamed from: d */
    public int f232153d;

    /* renamed from: e */
    public Orders f232154e;

    public C79056a(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
        Log.m105924i("MicroMsg.NetSceneGetPaidOrderDetail", "do NetSceneGetPaidOrderDetail");
        this.f232153d = i;
        HashMap hashMap = new HashMap();
        hashMap.put("appId", !Util.isNullOrNil(str) ? C117627q.m165908a(str) : str);
        hashMap.put("timeStamp", !Util.isNullOrNil(str2) ? C117627q.m165908a(str2) : str2);
        hashMap.put("nonceStr", !Util.isNullOrNil(str3) ? C117627q.m165908a(str3) : str3);
        hashMap.put("package", !Util.isNullOrNil(str4) ? C117627q.m165908a(str4) : str4);
        hashMap.put("reqKey", !Util.isNullOrNil(str5) ? C117627q.m165908a(str5) : str5);
        hashMap.put("payScene", C117627q.m165908a(i + ""));
        hashMap.put("signType", !Util.isNullOrNil(str6) ? C117627q.m165908a(str6) : str6);
        hashMap.put("paySign", !Util.isNullOrNil(str7) ? C117627q.m165908a(str7) : str7);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return this.f232153d == 2 ? 2516 : 2570;
    }

    public int getTenpayCgicmd() {
        return this.f232153d == 2 ? 2516 : 2570;
    }

    public String getUri() {
        return this.f232153d == 2 ? "/cgi-bin/mmpay-bin/tenpay/offlinegetpaidorderdetail" : "/cgi-bin/mmpay-bin/tenpay/getpaidorderdetail";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.NetSceneGetPaidOrderDetail", "errCode: " + i + " errMsg: " + str);
        if (jSONObject != null && isPayEnd()) {
            if (this.f232154e == null) {
                this.f232154e = new Orders();
            }
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("payresult");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    Orders.Commodity commodity = new Orders.Commodity();
                    commodity.f209606r = jSONObject2.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                    commodity.f209598g = jSONObject2.optString("sp_name");
                    if (Util.isNullOrNil(this.f232154e.f209568j)) {
                        this.f232154e.f209568j = jSONObject2.optString("fee_type");
                    }
                    this.f232154e.f209542M.add(commodity);
                }
            } catch (JSONException unused) {
            }
            Orders orders = this.f232154e;
            this.f232154e = orders;
            Orders.m84565g(jSONObject, orders);
            this.f232154e = orders;
        }
    }
}
