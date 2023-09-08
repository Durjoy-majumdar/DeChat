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
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.x1 */
public class C69272x1 extends C69271w1 {
    public C69272x1(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("ver", str);
        C86709a0.m107528h();
        hashMap.put("walletType", String.valueOf(C86709a0.m107535s().mo121142i().mo119684e(339975, (Object) null)));
        hashMap.put("hasSource", "" + i);
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "20");
        hashMap.put("union_source", "0");
        if (!Util.isNullOrNil(str2) && C72996z1.m85820U5(str2)) {
            int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str2);
            hashMap.put("chatroomUserCnt", p1 + "");
        }
        Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "NetSceneLuckyMoneyGetConfigUnion request");
        setRequestData(hashMap);
    }

    public int getType() {
        return 4605;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/unionhb/operationunionhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
        if (i == 0) {
            this.f199356j = jSONObject.optInt("randomAmount");
            this.f199354h = jSONObject.optString("randomWishing");
            this.f199357n = jSONObject.optString("notice");
            this.f199358o = jSONObject.optString("notice_url");
            this.f199355i = jSONObject.optInt("hasCanShareHongBao") == 1;
            jSONObject.optInt(FirebaseAnalytics.C113379b.CURRENCY);
            this.f199359p = 1;
            this.f199360q = jSONObject.optString("currencyUint");
            this.f199361r = jSONObject.optString("currencyWording");
            this.f199362s = jSONObject.optString("unique_id");
            Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "currency=" + this.f199359p + ";currencyUint=" + this.f199360q + ";currencyWording=" + this.f199361r + ";uniqueId=" + this.f199362s);
            C69273y yVar = new C69273y();
            yVar.f199373f = jSONObject.optString("groupHint");
            yVar.f199374g = jSONObject.optString("personalHint");
            yVar.f199371d = jSONObject.optInt("totalNum", 100);
            yVar.f199372e = C75228t.m90250i(jSONObject.optString("totalAmount", "0"), "100", 2, RoundingMode.HALF_UP);
            yVar.f199375h = C75228t.m90250i(jSONObject.optString("perPersonMaxValue", "0"), "100", 2, RoundingMode.HALF_UP);
            yVar.f199376i = C75228t.m90250i(jSONObject.optString("perGroupMaxValue", "0"), "100", 2, RoundingMode.HALF_UP);
            yVar.f199377j = C75228t.m90250i(jSONObject.optString("perMinValue", "0"), "100", 2, RoundingMode.HALF_UP);
            Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "config.maxTotalAmount: %s, config.perPersonMaxValue: %s，config.perGroupMaxValue：%s , config.perMinValue:%s", Double.valueOf(yVar.f199372e), Double.valueOf(yVar.f199375h), Double.valueOf(yVar.f199376i), Double.valueOf(yVar.f199377j));
            yVar.f199378n = jSONObject.optInt("payShowBGFlag");
            yVar.f199379o = this.f199359p;
            yVar.f199380p = this.f199360q;
            yVar.f199381q = this.f199361r;
            yVar.f199382r = jSONObject.optString("foreignFaqUrl");
            yVar.f199383s = jSONObject.optString("foreignHongBaoName");
            yVar.f199384t = jSONObject.optString("showSourceAndMac");
            yVar.f199385u = jSONObject.optString("coverinfo");
            String optString = jSONObject.optString("cover_jumpaction");
            if (!Util.isNullOrNil(optString)) {
                Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "cover_jumpaction: %s", optString);
                try {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    C69258q qVar = new C69258q();
                    qVar.f199292d = jSONObject2.optBoolean("is_show");
                    qVar.f199293e = jSONObject2.optString("wording");
                    qVar.f199294f = jSONObject2.optString("icon_url");
                    qVar.f199297i = jSONObject2.optString("action_app_username");
                    qVar.f199295g = jSONObject2.optInt("action_type", 0);
                    qVar.f199296h = jSONObject2.optString("action_url");
                    yVar.f199387w = qVar;
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", e, "", new Object[0]);
                }
            }
            Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "foreignFaqUrl: %s, foreignHongBaoName: %s", yVar.f199382r, yVar.f199383s);
            C69239k1 yx02 = C75846b.zx0().yx0();
            yx02.f199260a = yVar;
            yx02.mo95395c();
            Log.m105924i("MicroMsg.LuckyMoneyUnionConfigManager", "setConfig maxTotalAmount:" + yx02.f199260a.f199372e + " maxTotalNum:" + yx02.f199260a.f199371d + " perGroupMaxValue:" + yx02.f199260a.f199376i + " perMinValue:" + yx02.f199260a.f199377j + " perPersonMaxValue:" + yx02.f199260a.f199375h);
            try {
                String str2 = new String(yx02.f199260a.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_UNION_CONFIG_STRING_SYNC, str2);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119681a(true);
            } catch (UnsupportedEncodingException e2) {
                Log.m105928w("MicroMsg.LuckyMoneyUnionConfigManager", "save config exp, " + e2.getLocalizedMessage());
            } catch (IOException e3) {
                Log.m105928w("MicroMsg.LuckyMoneyUnionConfigManager", "save config exp, " + e3.getLocalizedMessage());
            }
            this.f199363t = C69232i1.m81584h(jSONObject.optJSONObject("operationHeader"));
            this.f199364u = C69232i1.m81584h(jSONObject.optJSONObject("operationTail"));
            this.f199365v = C69232i1.m81584h(jSONObject.optJSONObject("operationNext"));
            this.f199366w = C69232i1.m81584h(jSONObject.optJSONObject("operationMiddle"));
            int optInt = jSONObject.optInt("sceneSwitch");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_NEWYEAR_UNION_SWITCH_INT_SYNC, Integer.valueOf(optInt));
            Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "sceneSwitch:" + optInt);
            this.f199368y = jSONObject.optInt("scenePicSwitch");
            Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "scenePicSwitch:" + this.f199368y);
            int optInt2 = jSONObject.optInt("enableYearHbExpression");
            this.f199346A = optInt2;
            Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableYearHbExpression:%s", Integer.valueOf(optInt2));
            this.f199369z = jSONObject.optInt("enableSelfie");
            Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableSelfIe:" + this.f199369z);
            this.f199347B = jSONObject.optInt("enableNormalSelfie");
            this.f199348C = jSONObject.optInt("enableNormalAllExpression");
            Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "enableNormalSelfie:%s enableNormalAllExpression:%s", Integer.valueOf(this.f199347B), Integer.valueOf(this.f199348C));
            int optInt3 = jSONObject.optInt("enableWeishiHb");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_WEISHI_UNION_SWITCH_INT_SYNC, Integer.valueOf(optInt3));
            Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "weishiHbSwitch:" + optInt3);
            String optString2 = jSONObject.optString("wishing");
            this.f199367x = optString2;
            Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "wishing: %s", optString2);
            JSONArray optJSONArray = jSONObject.optJSONArray("yearMess");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "yearMessJson is empty!");
            } else {
                Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "yearMessJson length:" + optJSONArray.length());
                this.f199349D = new LinkedList<>();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    C69228h1 h1Var = new C69228h1();
                    h1Var.f199192a = optJSONObject.optInt("yearAmount", 0);
                    h1Var.f199193b = optJSONObject.optString("yearWish");
                    this.f199349D.add(h1Var);
                }
            }
            mo95411m1();
            return;
        }
        Log.m105920e("MicroMsg.NetSceneLuckyMoneyGetConfigUnion", "hongbao operation fail, errCode:" + i + ", errMsg:" + str);
    }
}
