package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.v1 */
public class C69269v1 extends C69267u1 {
    public C69269v1(String str, int i, int i2, String str2, long j, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i + "");
        hashMap.put("offset", i2 + "");
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        hashMap.put("befortTimestamp", j + "");
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        hashMap.put("union_source", "0");
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyDetailUnion", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, str4);
        setRequestData(hashMap);
    }

    public int getType() {
        return 4395;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/unionhb/qrydetailunionhb";
    }

    public C69269v1(String str, int i, int i2, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i + "");
        hashMap.put("offset", i2 + "");
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        hashMap.put("union_source", "0");
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyDetailUnion", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, str4);
        setRequestData(hashMap);
    }
}
