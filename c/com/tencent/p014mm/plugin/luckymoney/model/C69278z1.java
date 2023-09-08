package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.z1 */
public class C69278z1 extends C69196b2 {

    /* renamed from: h */
    public C69195b1 f199397h;

    /* renamed from: i */
    public List<String> f199398i;

    /* renamed from: j */
    public String f199399j;

    /* renamed from: n */
    public String f199400n;

    /* renamed from: o */
    public String f199401o = null;

    public C69278z1(int i, int i2, int i3, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("limit", i + "");
        hashMap.put("offset", i2 + "");
        hashMap.put("type", i3 + "");
        hashMap.put("year", str);
        hashMap.put("ver", str2);
        hashMap.put("processContent", str3);
        setRequestData(hashMap);
    }

    public int getType() {
        return 1514;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/qrylistwxhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        String[] split;
        try {
            this.f199397h = C69232i1.m81582f(jSONObject);
            this.f199398i = new ArrayList();
            String optString = jSONObject.optString("years");
            if (!Util.isNullOrNil(optString) && (split = optString.split("\\|")) != null) {
                for (String add : split) {
                    this.f199398i.add(add);
                }
            }
            this.f199399j = jSONObject.optString("recordYear");
            this.f199401o = jSONObject.optString("clickedUrl");
            this.f199400n = jSONObject.optString("processContent");
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyNormalBase", e, "", new Object[0]);
        }
    }
}
