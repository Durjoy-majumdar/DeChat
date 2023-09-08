package com.tencent.p014mm.plugin.remittance.model;

import ar3.C67104a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.t */
public class C70612t extends C67104a implements C45119n {

    /* renamed from: f */
    public String f204286f;

    public C70612t(long j, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("amount", String.valueOf(j));
        hashMap.put("recv_username", str);
        hashMap.put("recv_nickname", str2);
        hashMap.put("qrcodeid", str5);
        try {
            if (!Util.isNullOrNil(str3)) {
                hashMap.put("desc", URLEncoder.encode(str3, "UTF-8"));
            }
            if (!Util.isNullOrNil(str4)) {
                hashMap.put(StateEvent.Name.MESSAGE, URLEncoder.encode(str4, "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferPay", e, "", new Object[0]);
        }
        hashMap.put(FirebaseAnalytics.C113379b.CURRENCY, String.valueOf(i));
        hashMap.put("set_amount", String.valueOf(i2));
        setRequestData(hashMap);
        Log.m105925i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", str, str2, Long.valueOf(j), str3, str4, Integer.valueOf(i));
    }

    public int getType() {
        return 1529;
    }

    /* renamed from: j1 */
    public String mo91201j1() {
        return "/cgi-bin/mmpay-bin/h5f2ftransferpay";
    }

    /* renamed from: k1 */
    public int mo91202k1() {
        return 1529;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        String optString = jSONObject.optString("payurl", "");
        this.f204286f = optString;
        Log.m105925i("MicroMsg.NetSceneH5F2fTransferPay", "payurl: %s", optString);
    }
}
