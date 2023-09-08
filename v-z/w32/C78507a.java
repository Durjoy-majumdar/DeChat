package w32;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.plugin.luckymoney.model.C69228h1;
import com.tencent.p014mm.plugin.luckymoney.model.C69232i1;
import com.tencent.p014mm.plugin.luckymoney.model.C69271w1;
import com.tencent.p014mm.plugin.luckymoney.model.C69273y;
import com.tencent.p014mm.plugin.luckymoney.model.C69277z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import g32.C75846b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w32.a */
public class C78507a extends C69271w1 {
    public C78507a(int i, String str, int i2) {
        super(i, str, i2);
    }

    public int getType() {
        return 4878;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/ftfhb/channelliveoperationwxhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
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
            Log.m105924i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "currency=" + this.f199359p + ";currencyUint=" + this.f199360q + ";currencyWording=" + this.f199361r + ";uniqueId=" + this.f199362s);
            C69273y yVar = new C69273y();
            yVar.f199373f = jSONObject.optString("groupHint");
            yVar.f199374g = jSONObject.optString("personalHint");
            yVar.f199371d = jSONObject.optInt("totalNum", 100);
            yVar.f199372e = C75228t.m90250i(jSONObject.optString("totalAmount", "0"), "100", 2, RoundingMode.HALF_UP);
            yVar.f199375h = C75228t.m90250i(jSONObject.optString("perPersonMaxValue", "0"), "100", 2, RoundingMode.HALF_UP);
            yVar.f199376i = C75228t.m90250i(jSONObject.optString("perGroupMaxValue", "0"), "100", 2, RoundingMode.HALF_UP);
            yVar.f199377j = C75228t.m90250i(jSONObject.optString("perMinValue", "0"), "100", 2, RoundingMode.HALF_UP);
            Log.m105925i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "config.maxTotalAmount: %s, config.perPersonMaxValue: %s，config.perGroupMaxValue：%s , config.perMinValue:%s", Double.valueOf(yVar.f199372e), Double.valueOf(yVar.f199375h), Double.valueOf(yVar.f199376i), Double.valueOf(yVar.f199377j));
            yVar.f199378n = jSONObject.optInt("payShowBGFlag");
            yVar.f199379o = this.f199359p;
            yVar.f199380p = this.f199360q;
            yVar.f199381q = this.f199361r;
            yVar.f199382r = jSONObject.optString("foreignFaqUrl");
            yVar.f199383s = jSONObject.optString("foreignHongBaoName");
            yVar.f199384t = jSONObject.optString("showSourceAndMac");
            yVar.f199385u = jSONObject.optString("coverinfo");
            Log.m105925i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "foreignFaqUrl: %s, foreignHongBaoName: %s", yVar.f199382r, yVar.f199383s);
            C69277z0 xx02 = C75846b.zx0().xx0();
            xx02.f199395a = yVar;
            xx02.mo95417b();
            Log.m105924i("MicroMsg.LuckyMoneyConfigManager", "setConfig maxTotalAmount:" + xx02.f199395a.f199372e + " maxTotalNum:" + xx02.f199395a.f199371d + " perGroupMaxValue:" + xx02.f199395a.f199376i + " perMinValue:" + xx02.f199395a.f199377j + " perPersonMaxValue:" + xx02.f199395a.f199375h);
            try {
                String str2 = new String(xx02.f199395a.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_LIVECONFIG_STRING_SYNC, str2);
            } catch (UnsupportedEncodingException e) {
                Log.m105928w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + e.getLocalizedMessage());
            } catch (IOException e2) {
                Log.m105928w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + e2.getLocalizedMessage());
            }
            this.f199363t = C69232i1.m81584h(jSONObject.optJSONObject("operationHeader"));
            this.f199364u = C69232i1.m81584h(jSONObject.optJSONObject("operationTail"));
            this.f199365v = C69232i1.m81584h(jSONObject.optJSONObject("operationNext"));
            this.f199366w = C69232i1.m81584h(jSONObject.optJSONObject("operationMiddle"));
            int optInt = jSONObject.optInt("sceneSwitch");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_NEWYEAR_SWITCH_INT_SYNC, Integer.valueOf(optInt));
            Log.m105924i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "sceneSwitch:" + optInt);
            this.f199368y = jSONObject.optInt("scenePicSwitch");
            Log.m105924i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "scenePicSwitch:" + this.f199368y);
            int optInt2 = jSONObject.optInt("enableYearHbExpression");
            this.f199346A = optInt2;
            Log.m105925i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "enableYearHbExpression:%s", Integer.valueOf(optInt2));
            this.f199369z = jSONObject.optInt("enableSelfie");
            Log.m105924i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "enableSelfIe:" + this.f199369z);
            this.f199347B = jSONObject.optInt("enableNormalSelfie");
            this.f199348C = jSONObject.optInt("enableNormalAllExpression");
            Log.m105925i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "enableNormalSelfie:%s enableNormalAllExpression:%s", Integer.valueOf(this.f199347B), Integer.valueOf(this.f199348C));
            int optInt3 = jSONObject.optInt("enableWeishiHb");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_WEISHI_SWITCH_INT_SYNC, Integer.valueOf(optInt3));
            Log.m105924i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "weishiHbSwitch:" + optInt3);
            String optString = jSONObject.optString("wishing");
            this.f199367x = optString;
            Log.m105925i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "wishing: %s", optString);
            JSONArray optJSONArray = jSONObject.optJSONArray("yearMess");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                Log.m105924i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "yearMessJson is empty!");
            } else {
                Log.m105924i("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "yearMessJson length:" + optJSONArray.length());
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
        Log.m105920e("MicroMsg.NetSceneLiveLuckyMoneyGetConfig", "hongbao operation fail, errCode:" + i + ", errMsg:" + str);
    }
}
