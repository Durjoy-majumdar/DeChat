package com.tencent.p014mm.plugin.remittance.model;

import ar3.C67104a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.l0 */
public class C70606l0 extends C67104a {

    /* renamed from: f */
    public int f204271f = 0;

    /* renamed from: g */
    public String f204272g = "";

    /* renamed from: h */
    public String f204273h = "";

    /* renamed from: i */
    public String f204274i;

    /* renamed from: j */
    public String f204275j;

    public C70606l0(int i) {
        Log.m105924i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTenpayh5Index create");
        HashMap hashMap = new HashMap();
        hashMap.put("wallet_type", i + "");
        setRequestData(hashMap);
    }

    public int getType() {
        return 1574;
    }

    /* renamed from: j1 */
    public String mo91201j1() {
        return "/cgi-bin/mmpay-bin/h5transferoperate";
    }

    /* renamed from: k1 */
    public int mo91202k1() {
        return 0;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.NetSceneTenpayh5Index", "errCode " + i + " errMsg: " + str);
        if (i != 0) {
            Log.m105924i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTransferChargeQuery request error");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        this.f204271f = jSONObject.optInt(FirebaseAnalytics.C113379b.CURRENCY);
        this.f204272g = jSONObject.optString("currencyUint");
        this.f204273h = jSONObject.optString("currencyWording");
        this.f204274i = jSONObject.optString("notice");
        this.f204275j = jSONObject.optString("notice_url");
        stringBuffer.append("currency:" + this.f204271f);
        stringBuffer.append(" currencyuint:" + this.f204272g);
        stringBuffer.append(" currencywording:" + this.f204273h);
        stringBuffer.append(" notice:" + this.f204274i);
        stringBuffer.append(" notice_url:" + this.f204275j);
        Log.m105924i("MicroMsg.NetSceneTenpayh5Index", "resp " + stringBuffer.toString());
    }
}
