package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C72501h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.q1 */
public class C69259q1 extends C69255o1 {

    /* renamed from: h */
    public String f199298h;

    /* renamed from: i */
    public String f199299i;

    /* renamed from: j */
    public int f199300j;

    /* renamed from: n */
    public String f199301n;

    /* renamed from: o */
    public String f199302o;

    /* renamed from: p */
    public long f199303p;

    /* renamed from: q */
    public int f199304q;

    /* renamed from: r */
    public C69249n f199305r;

    /* renamed from: s */
    public String f199306s;

    /* renamed from: t */
    public C69158a0 f199307t = null;

    /* renamed from: u */
    public RealnameGuideHelper f199308u;

    /* renamed from: v */
    public C72501h f199309v;

    public C69259q1(String str, String str2, int i, String str3, String str4) {
        this.f199298h = str;
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str);
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        hashMap.put("way", i + "");
        hashMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, "2");
        hashMap.put("package", str3);
        hashMap.put("sessionUserName", str4);
        setRequestData(hashMap);
    }

    /* renamed from: k1 */
    public int mo95404k1() {
        return 1;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyBusiOpen", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
        this.f199299i = jSONObject.optString("spidName");
        jSONObject.optInt("hbStatus");
        this.f199300j = jSONObject.optInt("receiveStatus");
        this.f199301n = jSONObject.optString("statusMess");
        this.f199302o = jSONObject.optString("hintMess");
        this.f199303p = jSONObject.optLong("amount");
        jSONObject.optInt("recNum");
        this.f199304q = jSONObject.optInt("totalNum");
        this.f199305r = new C69249n();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject2 != null) {
            this.f199305r.f199277d = optJSONObject2.optInt("enable");
            this.f199305r.f199279f = optJSONObject2.optString("fissionContent");
            this.f199305r.f199278e = optJSONObject2.optString("fissionUrl");
        }
        jSONObject.optInt("focusFlag");
        jSONObject.optString("focusWording");
        jSONObject.optString("focusAppidUserName");
        jSONObject.optInt("isFocus");
        this.f199306s = jSONObject.optString("smallHbButtonMess");
        try {
            C69158a0 d = C69232i1.m81580d(jSONObject);
            this.f199307t = d;
            d.f198970j = jSONObject.optString("spidLogo");
            this.f199307t.f198969i = jSONObject.optString("spidName");
            this.f199307t.f198968h = jSONObject.optString("spidWishing");
        } catch (JSONException e) {
            Log.m105928w("MicroMsg.NetSceneLuckyMoneyBusiOpen", "parse luckyMoneyDetail fail: " + e.getLocalizedMessage());
        }
        if (i == 0 && jSONObject.has("real_name_info") && (optJSONObject = jSONObject.optJSONObject("real_name_info")) != null) {
            String optString = optJSONObject.optString("guide_flag");
            String optString2 = optJSONObject.optString("guide_wording");
            String optString3 = optJSONObject.optString("left_button_wording");
            String optString4 = optJSONObject.optString("right_button_wording");
            String optString5 = optJSONObject.optString("upload_credit_url");
            RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
            this.f199308u = realnameGuideHelper;
            realnameGuideHelper.mo99373d(optString, optString2, optString3, optString4, optString5, 1005);
        }
        if (i == 0 && jSONObject.has("intercept_win")) {
            this.f199309v = C72501h.m84833a(jSONObject.optJSONObject("intercept_win"));
        }
    }
}
