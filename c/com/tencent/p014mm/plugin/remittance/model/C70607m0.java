package com.tencent.p014mm.plugin.remittance.model;

import ar3.C67104a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.m0 */
public class C70607m0 extends C67104a {

    /* renamed from: f */
    public String f204276f = "";

    /* renamed from: g */
    public String f204277g = "";

    /* renamed from: h */
    public int f204278h;

    /* renamed from: i */
    public int f204279i;

    public C70607m0(double d, String str, String str2, String str3, String str4, int i) {
        Log.m105924i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay create");
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("transfer_amount", Math.round(d * 100.0d) + "");
            hashMap.put("pay_nickname", URLEncoder.encode(str, "utf-8") + "");
            hashMap.put("rcvd_username", str2 + "");
            hashMap.put("rcvd_nickname", URLEncoder.encode(str3, "utf-8") + "");
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_REASON, URLEncoder.encode(Util.nullAs(str4, ""), "utf-8") + "");
            hashMap.put(FirebaseAnalytics.C113379b.CURRENCY, i + "");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneTenpayh5Pay", "error " + e.getMessage());
        }
        setRequestData(hashMap);
    }

    public int getType() {
        return 1622;
    }

    /* renamed from: j1 */
    public String mo91201j1() {
        return "/cgi-bin/mmpay-bin/h5requesttransfer";
    }

    /* renamed from: k1 */
    public int mo91202k1() {
        return 1;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.NetSceneTenpayh5Pay", "errCode " + i + " errMsg: " + str);
        if (i != 0) {
            Log.m105924i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay request error");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        this.f204276f = jSONObject.optString("payurl");
        this.f204277g = jSONObject.optString("tradeurl");
        this.f204278h = jSONObject.optInt("transfering_num");
        this.f204279i = jSONObject.optInt("transfering_type");
        stringBuffer.append("payurl:" + this.f204276f);
        stringBuffer.append(" tradeurl:" + this.f204277g);
        stringBuffer.append(" transfering_num:" + this.f204278h);
        stringBuffer.append(" transfering_type:" + this.f204279i);
        Log.m105924i("MicroMsg.NetSceneTenpayh5Pay", "resp " + stringBuffer.toString());
    }
}
