package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.remittance.model.k0 */
public class C42844k0 extends C75790l {
    public C42844k0(String str, String str2, String str3, int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("trans_id", str);
        hashMap.put("transfer_id", str2);
        hashMap.put("receiver_name", str3);
        hashMap.put("from", i2 + "");
        hashMap.put("invalid_time", i + "");
        setRequestData(hashMap);
    }

    public int getFuncId() {
        return 1545;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/transferresendmsg";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayRemittanceResendMsg", "errCode " + i + " errMsg: " + str);
    }
}
