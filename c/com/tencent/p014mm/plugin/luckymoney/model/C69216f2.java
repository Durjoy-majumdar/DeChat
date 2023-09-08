package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C72501h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import eb0.C45628s0;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.f2 */
public class C69216f2 extends C69210e2 {
    public C69216f2(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f199150i = str;
        this.f199151j = str2;
        this.f199152n = str5;
        HashMap hashMap = new HashMap();
        hashMap.put("msgType", i + "");
        hashMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i2 + "");
        hashMap.put("sendId", str);
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        if (!Util.isNullOrNil(str3)) {
            hashMap.put("headImg", URLEncoder.encode(str3));
            hashMap.put("nickName", URLEncoder.encode(Util.nullAsNil(str4)));
        }
        hashMap.put("sessionUserName", str5);
        hashMap.put("ver", str6);
        hashMap.put("timingIdentifier", str7);
        hashMap.put("union_source", "0");
        Log.m105924i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "NetSceneOpenLuckyMoneyUnion request");
        setRequestData(hashMap);
    }

    public int getType() {
        return 5148;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/unionhb/openunionhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        Log.m105925i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
        try {
            this.f199149h = C69232i1.m81580d(jSONObject);
            LuckyMoneyEmojiSwitch a = LuckyMoneyEmojiSwitch.m81491a(jSONObject);
            this.f199156r = a;
            Log.m105925i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "luckyMoneyEmojiSwitch:%s", a.toString());
            this.f199157s = jSONObject.optString("expression_md5");
            int optInt = jSONObject.optInt("expression_type");
            this.f199158t = optInt;
            Log.m105925i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "expressionmd5:%s expressiontype:%s", this.f199157s, Integer.valueOf(optInt));
            if (i == 0 && jSONObject.has("real_name_info") && (optJSONObject = jSONObject.optJSONObject("real_name_info")) != null) {
                String optString = optJSONObject.optString("guide_flag");
                String optString2 = optJSONObject.optString("guide_wording");
                String optString3 = optJSONObject.optString("left_button_wording");
                String optString4 = optJSONObject.optString("right_button_wording");
                String optString5 = optJSONObject.optString("upload_credit_url");
                RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
                this.f199154p = realnameGuideHelper;
                realnameGuideHelper.mo99373d(optString, optString2, optString3, optString4, optString5, 1003);
            }
            if (jSONObject.has("intercept_win")) {
                this.f199159u = C72501h.m84833a(jSONObject.optJSONObject("intercept_win"));
            }
            this.f199153o = jSONObject.optString("SystemMsgContext");
            int optInt2 = jSONObject.optInt("showYearExpression");
            this.f199155q = optInt2;
            Log.m105925i("MicroMsg.NetSceneOpenLuckyMoneyUnion", "showYearExpression:%s", Integer.valueOf(optInt2));
            if (i == 0 && !Util.isNullOrNil(this.f199153o) && !C45628s0.m50742G(this.f199152n)) {
                try {
                    C69242l1.m81605k(this.f199153o, this.f199152n);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.NetSceneOpenLuckyMoneyUnion", "insertLocalSysMsgIfNeed error: %s", e.getMessage());
                }
            }
            mo95371m1();
        } catch (JSONException e2) {
            Log.m105928w("MicroMsg.NetSceneOpenLuckyMoneyUnion", "parse luckyMoneyDetail fail: " + e2.getLocalizedMessage());
        }
    }
}
