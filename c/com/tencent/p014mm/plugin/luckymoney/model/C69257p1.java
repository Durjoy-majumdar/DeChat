package com.tencent.p014mm.plugin.luckymoney.model;

import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.p1 */
public class C69257p1 extends C69255o1 {
    public C69257p1(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("appId", str);
        hashMap.put("timeStamp", str2);
        hashMap.put("nonceStr", str3);
        if (str4 != null) {
            hashMap.put("package", URLEncoder.encode(str4));
        }
        hashMap.put("signType", str5);
        if (str6 != null) {
            hashMap.put("paySign", URLEncoder.encode(str6));
        }
        hashMap.put("way", i + "");
        if (str7 != null) {
            hashMap.put("jsapiH5Url", URLEncoder.encode(str7) + "");
        }
        setRequestData(hashMap);
    }

    /* renamed from: k1 */
    public int mo95404k1() {
        return 2;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }

    public C69257p1(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8) {
        HashMap hashMap = new HashMap();
        hashMap.put("appId", str);
        hashMap.put("timeStamp", str2);
        hashMap.put("nonceStr", str3);
        if (str4 != null) {
            hashMap.put("package", URLEncoder.encode(str4));
        }
        hashMap.put("signType", str5);
        if (str6 != null) {
            hashMap.put("paySign", URLEncoder.encode(str6));
        }
        hashMap.put("way", i + "");
        if (str7 != null) {
            hashMap.put("androidSign", URLEncoder.encode(str7));
        }
        if (str8 != null) {
            hashMap.put("androidPackage", URLEncoder.encode(str8));
        }
        setRequestData(hashMap);
    }
}
