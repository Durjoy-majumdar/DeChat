package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.u1 */
public class C69267u1 extends C69196b2 {

    /* renamed from: h */
    public C69158a0 f199337h;

    /* renamed from: i */
    public String f199338i;

    /* renamed from: j */
    public String f199339j;

    /* renamed from: n */
    public int f199340n;

    /* renamed from: o */
    public LuckyMoneyEmojiSwitch f199341o;

    /* renamed from: p */
    public long f199342p;

    /* renamed from: q */
    public String f199343q;

    public C69267u1() {
        this.f199337h = null;
    }

    public int getType() {
        return 1585;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/qrydetailwxhb";
    }

    /* renamed from: m1 */
    public void mo95410m1() {
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HONGBAO_LOCAL_SWITCH_INT, 0)).intValue();
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_emoji_all_switch, 0);
        if (Util.isEqual(intValue, 1) || Util.isEqual(Qe, 1)) {
            if (this.f199341o == null) {
                this.f199341o = new LuckyMoneyEmojiSwitch();
            }
            LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = this.f199341o;
            luckyMoneyEmojiSwitch.f198929d = 1;
            luckyMoneyEmojiSwitch.f198930e = 1;
            luckyMoneyEmojiSwitch.f198931f = 1;
            luckyMoneyEmojiSwitch.f198932g = 1;
        }
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyDetail", "localSwitch() luckyMoneyEmojiSwitch:%s ", this.f199341o.toString());
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyDetail", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
        try {
            this.f199337h = C69232i1.m81580d(jSONObject);
            this.f199338i = jSONObject.optString("processContent");
            LuckyMoneyEmojiSwitch a = LuckyMoneyEmojiSwitch.m81491a(jSONObject);
            this.f199341o = a;
            Log.m105925i("MicroMsg.NetSceneLuckyMoneyDetail", "luckyMoneyEmojiSwitch:%s", a.toString());
            this.f199339j = jSONObject.optString("expression_md5");
            int optInt = jSONObject.optInt("expression_type");
            this.f199340n = optInt;
            Log.m105925i("MicroMsg.NetSceneLuckyMoneyDetail", "expressionmd5:%s expressiontype:%s", this.f199339j, Integer.valueOf(optInt));
            mo95410m1();
        } catch (JSONException e) {
            Log.m105928w("MicroMsg.NetSceneLuckyMoneyDetail", "parse luckyMoneyDetail fail: " + e.getLocalizedMessage());
        }
    }

    public C69267u1(String str, int i, int i2, String str2, String str3) {
        this(str, i, i2, str2, str3, "");
    }

    public C69267u1(String str, int i, int i2, String str2, long j, String str3, String str4) {
        this.f199337h = null;
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
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, str4);
        setRequestData(hashMap);
    }

    public C69267u1(String str, int i, int i2, String str2, String str3, String str4) {
        this.f199337h = null;
        HashMap hashMap = new HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i + "");
        hashMap.put("offset", i2 + "");
        if (!Util.isNullOrNil(str2)) {
            hashMap.put("nativeUrl", URLEncoder.encode(str2));
        }
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2, str4);
        setRequestData(hashMap);
    }
}
