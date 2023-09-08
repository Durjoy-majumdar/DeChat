package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.a2 */
public class C69159a2 extends C69196b2 {
    public C69159a2(String str, String str2, int i, int i2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str + "");
        hashMap.put("offset", i2 + "");
        hashMap.put("type", i + "");
        hashMap.put("receiveId", str2);
        hashMap.put("ver", str3);
        setRequestData(hashMap);
    }

    public int getType() {
        return 1612;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/deletelistwxhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("NetSceneLuckyMoneyMyRecordDelete", "onGYNetEnd");
    }
}
