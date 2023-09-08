package com.tencent.p014mm.plugin.luckymoney.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.y1 */
public class C69275y1 extends C69196b2 {

    /* renamed from: h */
    public String f199392h;

    public C69275y1(int i, long j, long j2, int i2, String str, String str2, String str3, String str4, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("totalNum", i + "");
        hashMap.put("totalAmount", j + "");
        hashMap.put("perValue", j2 + "");
        hashMap.put("hbType", i2 + "");
        hashMap.put("wishing", URLEncoder.encode(Util.nullAsNil(str)));
        hashMap.put(FirebaseAnalytics.C113379b.CURRENCY, i3 + "");
        if (!Util.isNullOrNil(str3)) {
            hashMap.put("headImg", URLEncoder.encode(str3));
        }
        hashMap.put("nickName", URLEncoder.encode(Util.nullAsNil(str4)));
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("username", URLEncoder.encode(str2));
            if (C72996z1.m85820U5(str2)) {
                int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str2);
                hashMap.put("chatroomUserCnt", p1 + "");
            }
        }
        setRequestData(hashMap);
    }

    public int getType() {
        return 1647;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/h5requestwxhb";
    }

    /* renamed from: k1 */
    public int mo95404k1() {
        return 0;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.NetSceneLuckyMoneyH5Request", "NetSceneLuckyMoneyH5Request response errCode=" + i + " content:" + jSONObject.toString());
        if (i == 0) {
            this.f199392h = jSONObject.optString("payUrl");
        }
    }
}
