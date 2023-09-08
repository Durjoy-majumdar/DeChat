package com.tencent.p014mm.plugin.luckymoney.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import g32.C75846b;
import h81.C32735h;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p740wo.C53193b;
import te3.C77933g43;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.w1 */
public class C69271w1 extends C69196b2 {

    /* renamed from: A */
    public int f199346A;

    /* renamed from: B */
    public int f199347B;

    /* renamed from: C */
    public int f199348C;

    /* renamed from: D */
    public LinkedList<C69228h1> f199349D;

    /* renamed from: E */
    public String f199350E;

    /* renamed from: F */
    public String f199351F;

    /* renamed from: G */
    public boolean f199352G;

    /* renamed from: H */
    public C77933g43 f199353H;

    /* renamed from: h */
    public String f199354h;

    /* renamed from: i */
    public boolean f199355i;

    /* renamed from: j */
    public int f199356j;

    /* renamed from: n */
    public String f199357n;

    /* renamed from: o */
    public String f199358o;

    /* renamed from: p */
    public int f199359p;

    /* renamed from: q */
    public String f199360q;

    /* renamed from: r */
    public String f199361r;

    /* renamed from: s */
    public String f199362s;

    /* renamed from: t */
    public C69248m2 f199363t;

    /* renamed from: u */
    public C69248m2 f199364u;

    /* renamed from: v */
    public C69248m2 f199365v;

    /* renamed from: w */
    public C69248m2 f199366w;

    /* renamed from: x */
    public String f199367x;

    /* renamed from: y */
    public int f199368y;

    /* renamed from: z */
    public int f199369z;

    public C69271w1() {
        this.f199368y = 0;
        this.f199369z = 0;
        this.f199346A = 0;
        this.f199347B = 0;
        this.f199348C = 0;
    }

    public int getType() {
        return 1554;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/operationwxhb";
    }

    /* renamed from: m1 */
    public void mo95411m1() {
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HONGBAO_LOCAL_SWITCH_INT, 0)).intValue();
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_hongbao_emoji_all_switch, 0);
        if (Util.isEqual(intValue, 1) || Util.isEqual(Qe, 1)) {
            this.f199347B = 1;
            this.f199348C = 1;
            this.f199369z = 1;
            this.f199346A = 1;
        }
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfig", "localSwitch() enableNormalSelfie:%s enableNormalAllExpression:%s enableSelfie:%s enableYearHbExpression:%s", Integer.valueOf(this.f199347B), Integer.valueOf(this.f199348C), Integer.valueOf(this.f199369z), Integer.valueOf(this.f199346A));
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        String str2;
        char c;
        int i2 = i;
        String str3 = str;
        JSONObject jSONObject2 = jSONObject;
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfig", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str3, jSONObject.toString());
        if (i2 == 0) {
            this.f199356j = jSONObject2.optInt("randomAmount");
            this.f199354h = jSONObject2.optString("randomWishing");
            this.f199357n = jSONObject2.optString("notice");
            this.f199358o = jSONObject2.optString("notice_url");
            JSONObject optJSONObject = jSONObject2.optJSONObject("notice_item");
            if (optJSONObject != null) {
                C77933g43 g432 = new C77933g43();
                this.f199353H = g432;
                g432.f227431d = optJSONObject.optInt("is_show_notice", 0);
                this.f199353H.f227432e = optJSONObject.optString("wording");
                this.f199353H.f227434g = optJSONObject.optString("jump_url");
                this.f199353H.f227433f = optJSONObject.optString("left_icon");
                this.f199353H.f227435h = optJSONObject.optString("notice_id");
            }
            this.f199355i = jSONObject2.optInt("hasCanShareHongBao") == 1;
            this.f199359p = jSONObject2.optInt(FirebaseAnalytics.C113379b.CURRENCY);
            this.f199360q = jSONObject2.optString("currencyUint");
            this.f199361r = jSONObject2.optString("currencyWording");
            this.f199362s = jSONObject2.optString("unique_id");
            Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfig", "currency=" + this.f199359p + ";currencyUint=" + this.f199360q + ";currencyWording=" + this.f199361r + ";uniqueId=" + this.f199362s);
            C69273y yVar = new C69273y();
            yVar.f199373f = jSONObject2.optString("groupHint");
            yVar.f199374g = jSONObject2.optString("personalHint");
            yVar.f199372e = ((double) jSONObject2.optLong("totalAmount", 200000)) / 100.0d;
            yVar.f199371d = jSONObject2.optInt("totalNum", 100);
            String str4 = "MicroMsg.NetSceneLuckyMoneyGetConfig";
            yVar.f199375h = ((double) jSONObject2.optLong("perPersonMaxValue", 20000)) / 100.0d;
            yVar.f199376i = ((double) jSONObject2.optLong("perGroupMaxValue", 20000)) / 100.0d;
            yVar.f199377j = ((double) jSONObject2.optLong("perMinValue", 1)) / 100.0d;
            yVar.f199378n = jSONObject2.optInt("payShowBGFlag");
            yVar.f199386v = jSONObject2.optBoolean("enableExclusiveHb");
            yVar.f199379o = this.f199359p;
            yVar.f199380p = this.f199360q;
            yVar.f199381q = this.f199361r;
            yVar.f199382r = jSONObject2.optString("foreignFaqUrl");
            yVar.f199383s = jSONObject2.optString("foreignHongBaoName");
            yVar.f199384t = jSONObject2.optString("showSourceAndMac");
            yVar.f199385u = jSONObject2.optString("coverinfo");
            yVar.f199388x = jSONObject2.optInt("f2f_total_num", 100);
            yVar.f199370A = C75228t.m90250i(jSONObject2.optString("f2f_pay_max_amount", "200000"), "100", 2, RoundingMode.HALF_UP);
            yVar.f199389y = C75228t.m90250i(jSONObject2.optString("f2f_person_max_amount", "20000"), "100", 2, RoundingMode.HALF_UP);
            yVar.f199390z = C75228t.m90250i(jSONObject2.optString("f2f_person_min_amount", "1"), "100", 2, RoundingMode.HALF_UP);
            String optString = jSONObject2.optString("cover_jumpaction");
            if (!Util.isNullOrNil(optString)) {
                str2 = str4;
                Log.m105925i(str2, "cover_jumpaction: %s", optString);
                try {
                    JSONObject jSONObject3 = new JSONObject(optString);
                    C69258q qVar = new C69258q();
                    qVar.f199292d = jSONObject3.optBoolean("is_show");
                    qVar.f199293e = jSONObject3.optString("wording");
                    qVar.f199294f = jSONObject3.optString("icon_url");
                    qVar.f199297i = jSONObject3.optString("action_app_username");
                    qVar.f199295g = jSONObject3.optInt("action_type", 0);
                    qVar.f199296h = jSONObject3.optString("action_url");
                    yVar.f199387w = qVar;
                } catch (JSONException e) {
                    c = 0;
                    Log.printErrStackTrace(str2, e, "", new Object[0]);
                }
            } else {
                str2 = str4;
            }
            c = 0;
            Object[] objArr = new Object[3];
            objArr[c] = yVar.f199382r;
            objArr[1] = yVar.f199383s;
            objArr[2] = Boolean.valueOf(yVar.f199386v);
            Log.m105925i(str2, "foreignFaqUrl: %s, foreignHongBaoName: %s, enableExclusiveHb: %s", objArr);
            C69276z vx02 = C75846b.zx0().vx0();
            vx02.f199393a = yVar;
            vx02.mo95415c();
            Log.m105924i("MicroMsg.LuckyMoneyConfigManager", "setConfig maxTotalAmount:" + vx02.f199393a.f199372e + " maxTotalNum:" + vx02.f199393a.f199371d + " perGroupMaxValue:" + vx02.f199393a.f199376i + " perMinValue:" + vx02.f199393a.f199377j + " perPersonMaxValue:" + vx02.f199393a.f199375h);
            try {
                String str5 = new String(vx02.f199393a.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(356355, str5);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119681a(true);
            } catch (UnsupportedEncodingException e2) {
                Log.m105928w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + e2.getLocalizedMessage());
            } catch (IOException e3) {
                Log.m105928w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + e3.getLocalizedMessage());
            }
            this.f199363t = C69232i1.m81584h(jSONObject2.optJSONObject("operationHeader"));
            this.f199364u = C69232i1.m81584h(jSONObject2.optJSONObject("operationTail"));
            this.f199365v = C69232i1.m81584h(jSONObject2.optJSONObject("operationNext"));
            this.f199366w = C69232i1.m81584h(jSONObject2.optJSONObject("operationMiddle"));
            int optInt = jSONObject2.optInt("sceneSwitch");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_NEWYEAR_SWITCH_INT_SYNC, Integer.valueOf(optInt));
            Log.m105924i(str2, "sceneSwitch:" + optInt);
            this.f199368y = jSONObject2.optInt("scenePicSwitch");
            Log.m105924i(str2, "scenePicSwitch:" + this.f199368y);
            int optInt2 = jSONObject2.optInt("enableYearHbExpression");
            this.f199346A = optInt2;
            Log.m105925i(str2, "enableYearHbExpression:%s", Integer.valueOf(optInt2));
            this.f199369z = jSONObject2.optInt("enableSelfie");
            Log.m105924i(str2, "enableSelfIe:" + this.f199369z);
            this.f199347B = jSONObject2.optInt("enableNormalSelfie");
            this.f199348C = jSONObject2.optInt("enableNormalAllExpression");
            Log.m105925i(str2, "enableNormalSelfie:%s enableNormalAllExpression:%s", Integer.valueOf(this.f199347B), Integer.valueOf(this.f199348C));
            int optInt3 = jSONObject2.optInt("enableWeishiHb");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_WEISHI_SWITCH_INT_SYNC, Integer.valueOf(optInt3));
            int optInt4 = jSONObject2.optInt("enableLiveHb");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_LIVE_SWITCH_INT_SYNC, Integer.valueOf(optInt4));
            Log.m105925i(str2, "weishiHbSwitch: %s, liveHbSwitch: %s", Integer.valueOf(optInt3), Integer.valueOf(optInt4));
            String optString2 = jSONObject2.optString("wishing");
            this.f199367x = optString2;
            Log.m105925i(str2, "wishing: %s", optString2);
            JSONArray optJSONArray = jSONObject2.optJSONArray("yearMess");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                Log.m105924i(str2, "yearMessJson is empty!");
            } else {
                Log.m105924i(str2, "yearMessJson length:" + optJSONArray.length());
                this.f199349D = new LinkedList<>();
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                    C69228h1 h1Var = new C69228h1();
                    h1Var.f199192a = optJSONObject2.optInt("yearAmount", 0);
                    h1Var.f199193b = optJSONObject2.optString("yearWish");
                    h1Var.f199194c = optJSONObject2.optString("wishKeyWord");
                    h1Var.f199195d = optJSONObject2.optString("pagName");
                    h1Var.f199196e = optJSONObject2.optString("maskPagName");
                    this.f199349D.add(h1Var);
                }
            }
            this.f199350E = jSONObject2.optString("cdnFileId");
            this.f199351F = jSONObject2.optString("cdnAesKey");
            this.f199352G = jSONObject2.optBoolean("enable_year_voice", false);
            mo95411m1();
            return;
        }
        Log.m105920e("MicroMsg.NetSceneLuckyMoneyGetConfig", "hongbao operation fail, errCode:" + i2 + ", errMsg:" + str3);
    }

    public C69271w1(int i, String str, int i2) {
        this(i, str, i2, "");
    }

    public C69271w1(int i, String str, int i2, String str2) {
        int i3;
        this.f199368y = 0;
        this.f199369z = 0;
        this.f199346A = 0;
        this.f199347B = 0;
        this.f199348C = 0;
        HashMap hashMap = new HashMap();
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i + "");
        hashMap.put("ver", str);
        C86709a0.m107528h();
        hashMap.put("walletType", String.valueOf(C86709a0.m107535s().mo121142i().mo119684e(339975, (Object) null)));
        hashMap.put("hasSource", "" + i2);
        if (Util.isNullOrNil(str2) || !C72996z1.m85820U5(str2)) {
            i3 = 0;
        } else {
            i3 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str2);
            hashMap.put("chatroomUserCnt", i3 + "");
        }
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfig", "NetSceneLuckyMoneyGetConfig request，scene：%s chatroomUserCnt：%s", Integer.valueOf(i), Integer.valueOf(i3));
        setRequestData(hashMap);
    }
}
