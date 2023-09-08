package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C72501h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.e2 */
public class C69210e2 extends C69196b2 {

    /* renamed from: A */
    public long f199148A;

    /* renamed from: h */
    public C69158a0 f199149h;

    /* renamed from: i */
    public String f199150i;

    /* renamed from: j */
    public String f199151j;

    /* renamed from: n */
    public String f199152n;

    /* renamed from: o */
    public String f199153o;

    /* renamed from: p */
    public RealnameGuideHelper f199154p;

    /* renamed from: q */
    public int f199155q;

    /* renamed from: r */
    public LuckyMoneyEmojiSwitch f199156r;

    /* renamed from: s */
    public String f199157s;

    /* renamed from: t */
    public int f199158t;

    /* renamed from: u */
    public C72501h f199159u;

    /* renamed from: v */
    public String f199160v;

    /* renamed from: w */
    public String f199161w;

    /* renamed from: x */
    public C69209e1 f199162x;

    /* renamed from: y */
    public String f199163y;

    /* renamed from: z */
    public boolean f199164z;

    public C69210e2(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(i, i2, str, str2, str3, str4, str5, str6, str7, "");
    }

    public int getType() {
        return 1685;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/openwxhb";
    }

    /* renamed from: m1 */
    public void mo95371m1() {
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HONGBAO_LOCAL_SWITCH_INT, 0)).intValue();
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_emoji_all_switch, 0);
        if (Util.isEqual(intValue, 1) || Util.isEqual(Qe, 1)) {
            if (this.f199156r == null) {
                this.f199156r = new LuckyMoneyEmojiSwitch();
            }
            LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = this.f199156r;
            luckyMoneyEmojiSwitch.f198929d = 1;
            luckyMoneyEmojiSwitch.f198930e = 1;
            luckyMoneyEmojiSwitch.f198931f = 1;
            luckyMoneyEmojiSwitch.f198932g = 1;
            this.f199155q = 1;
        }
        Log.m105925i("MicroMsg.NetSceneOpenLuckyMoney", "localSwitch() luckyMoneyEmojiSwitch:%s ", this.f199156r.toString());
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject jSONObject2 = jSONObject;
        Log.m105925i("MicroMsg.NetSceneOpenLuckyMoney", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
        try {
            this.f199149h = C69232i1.m81580d(jSONObject);
            this.f199162x = C69232i1.m81583g(jSONObject2.optJSONObject("new_year_cover_config"));
            LuckyMoneyEmojiSwitch a = LuckyMoneyEmojiSwitch.m81491a(jSONObject);
            this.f199156r = a;
            Log.m105925i("MicroMsg.NetSceneOpenLuckyMoney", "luckyMoneyEmojiSwitch:%s", a.toString());
            this.f199157s = jSONObject2.optString("expression_md5");
            this.f199158t = jSONObject2.optInt("expression_type");
            this.f199164z = jSONObject2.optBoolean("enable_set_status", false);
            Log.m105925i("MicroMsg.NetSceneOpenLuckyMoney", "expressionmd5:%s expressiontype:%s enableSetStatus:%s", this.f199157s, Integer.valueOf(this.f199158t), Boolean.valueOf(this.f199164z));
            if (i == 0 && jSONObject2.has("real_name_info") && (optJSONObject = jSONObject2.optJSONObject("real_name_info")) != null) {
                String optString = optJSONObject.optString("guide_flag");
                String optString2 = optJSONObject.optString("guide_wording");
                String optString3 = optJSONObject.optString("left_button_wording");
                String optString4 = optJSONObject.optString("right_button_wording");
                String optString5 = optJSONObject.optString("upload_credit_url");
                RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
                this.f199154p = realnameGuideHelper;
                realnameGuideHelper.mo99373d(optString, optString2, optString3, optString4, optString5, 1003);
            }
            if (jSONObject2.has("intercept_win")) {
                this.f199159u = C72501h.m84833a(jSONObject2.optJSONObject("intercept_win"));
            }
            if (jSONObject2.has("intercept_win_after")) {
                this.f199160v = jSONObject2.optJSONObject("intercept_win_after").toString();
            }
            if (jSONObject2.has("left_button_continue")) {
                this.f199161w = jSONObject2.optString("left_button_continue");
            }
            if (jSONObject2.has("half_page_info")) {
                this.f199163y = jSONObject2.optString("half_page_info");
            }
            this.f199153o = jSONObject2.optString("SystemMsgContext");
            int optInt = jSONObject2.optInt("showYearExpression");
            this.f199155q = optInt;
            Log.m105925i("MicroMsg.NetSceneOpenLuckyMoney", "showYearExpression:%s", Integer.valueOf(optInt));
            if (i == 0 && !Util.isNullOrNil(this.f199153o) && !Util.isNullOrNil(this.f199149h.f198954Q) && !C45628s0.m50742G(this.f199152n)) {
                try {
                    String string = C75592q0.m90789s().equals(this.f199149h.f198954Q) ? MMApplicationContext.getContext().getString(C0966R.string.gji) : ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f199149h.f198954Q);
                    String str2 = this.f199153o;
                    String replace = str2.replace("$" + this.f199149h.f198954Q + "$", string);
                    this.f199153o = replace;
                    C69242l1.m81605k(replace, this.f199152n);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.NetSceneOpenLuckyMoney", "insertLocalSysMsgIfNeed error: %s", e.getMessage());
                }
            }
            mo95371m1();
        } catch (JSONException e2) {
            Log.m105928w("MicroMsg.NetSceneOpenLuckyMoney", "parse luckyMoneyDetail fail: " + e2.getLocalizedMessage());
        }
    }

    public C69210e2(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f199149h = null;
        this.f199155q = 0;
        this.f199160v = "";
        this.f199161w = "";
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
        hashMap.put("left_button_continue", str8);
        Log.m105924i("MicroMsg.NetSceneOpenLuckyMoney", "NetSceneOpenLuckyMoney request");
        setRequestData(hashMap);
    }

    public C69210e2() {
        this.f199149h = null;
        this.f199155q = 0;
        this.f199160v = "";
        this.f199161w = "";
    }
}
