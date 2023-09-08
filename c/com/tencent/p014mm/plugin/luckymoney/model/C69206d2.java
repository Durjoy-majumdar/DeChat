package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.d2 */
public class C69206d2 extends C69196b2 {

    /* renamed from: h */
    public String f199132h;

    /* renamed from: i */
    public String f199133i;

    public C69206d2(String str, String str2, String str3, String str4) {
        this.f199132h = str3;
        this.f199133i = str2;
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str);
        hashMap.put("receiveId", str3);
        hashMap.put("wishing", URLEncoder.encode(Util.nullAsNil(str2)));
        hashMap.put("ver", str4);
        setRequestData(hashMap);
    }

    public int getType() {
        return 1682;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/wishwxhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
    }
}
