package com.tencent.p014mm.plugin.remittance.model;

import ar3.C67104a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.s */
public class C70610s extends C67104a {
    public C70610s(String str, String str2, int i, long j, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("recv_username", str);
        hashMap.put("qrcodeid", str2);
        hashMap.put(FirebaseAnalytics.C113379b.CURRENCY, String.valueOf(i));
        hashMap.put("amount", String.valueOf(j));
        hashMap.put("set_amount", String.valueOf(i2));
        setRequestData(hashMap);
        Log.m105925i("MicroMsg.NetSceneH5F2fTransferCancelPay", "qrcodeId: %s, currency: %s", str2, Integer.valueOf(i));
    }

    public int getType() {
        return 1257;
    }

    /* renamed from: j1 */
    public String mo91201j1() {
        return "/cgi-bin/mmpay-bin/h5f2ftransfercancelpay";
    }

    /* renamed from: k1 */
    public int mo91202k1() {
        return 1257;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.NetSceneH5F2fTransferCancelPay", "json: %s", jSONObject.toString());
        Log.m105925i("MicroMsg.NetSceneH5F2fTransferCancelPay", "errCode: %s, errMsg: %s", Integer.valueOf(i), str);
    }
}
