package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.f0 */
public class C70584f0 extends C75790l {
    public C70584f0(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("receiver_user_name", str);
        hashMap.put("transfer_qrcode_id", str2);
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1535;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/transfersendcancelf2f";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d(C75790l.TAG, "errCode " + i + " errMsg: " + str);
    }

    public C70584f0(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("receiver_user_name", str);
        hashMap.put("transfer_qrcode_id", str2);
        hashMap.put("rcvr_ticket", str3);
        hashMap.put("receiver_openid", str4);
        setRequestData(hashMap);
    }
}
