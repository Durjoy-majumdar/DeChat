package w32;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.plugin.luckymoney.model.C69196b2;
import com.tencent.p014mm.plugin.luckymoney.model.C69228h1;
import com.tencent.p014mm.plugin.luckymoney.model.C69273y;
import com.tencent.p014mm.plugin.luckymoney.model.C69274y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import g32.C75846b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import p740wo.C53193b;

/* renamed from: w32.f */
public class C78512f extends C69196b2 {

    /* renamed from: h */
    public int f229960h;

    /* renamed from: i */
    public String f229961i;

    /* renamed from: j */
    public int f229962j;

    /* renamed from: n */
    public String f229963n;

    /* renamed from: o */
    public String f229964o;

    /* renamed from: p */
    public int f229965p;

    /* renamed from: q */
    public LinkedList<C69228h1> f229966q;

    public C78512f() {
        this("");
    }

    public int getType() {
        return 2832;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/h5operationwxhb";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105925i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "errCode: %s, errMsg: %s ，json：%s", Integer.valueOf(i), str, jSONObject.toString());
        if (i == 0) {
            this.f229962j = jSONObject.optInt("randomAmount");
            this.f229963n = jSONObject.optString("randomWishing");
            this.f229964o = jSONObject.optString("sceneName");
            jSONObject.optString("sceneBackgroup");
            this.f229965p = jSONObject.optInt("sceneSwitch");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HK_NEWYEAR_SWITCH_INT_SYNC, Integer.valueOf(this.f229965p));
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HK_NEWYEAR_NAME_STRING_SYNC, this.f229964o);
            JSONArray optJSONArray = jSONObject.optJSONArray("yearMess");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "yearMessJson is empty!");
            } else {
                this.f229966q = new LinkedList<>();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    C69228h1 h1Var = new C69228h1();
                    h1Var.f199192a = optJSONObject.optInt("yearAmount", 0);
                    h1Var.f199193b = optJSONObject.optString("yearWish");
                    this.f229966q.add(h1Var);
                }
            }
            C69273y yVar = new C69273y();
            yVar.f199373f = jSONObject.optString("groupHint");
            yVar.f199374g = jSONObject.optString("personalHint");
            yVar.f199372e = ((double) jSONObject.optLong("totalAmount", 200000)) / 100.0d;
            yVar.f199371d = jSONObject.optInt("totalNum", 100);
            yVar.f199375h = ((double) jSONObject.optLong("perPersonMaxValue", 20000)) / 100.0d;
            yVar.f199376i = ((double) jSONObject.optLong("perGroupMaxValue", 20000)) / 100.0d;
            yVar.f199377j = ((double) jSONObject.optLong("perMinValue", 1)) / 100.0d;
            yVar.f199386v = jSONObject.optBoolean("enableExclusiveHb");
            yVar.f199379o = jSONObject.optInt(FirebaseAnalytics.C113379b.CURRENCY);
            yVar.f199380p = jSONObject.optString("currencyUint");
            yVar.f199381q = jSONObject.optString("currencyWording");
            yVar.f199382r = jSONObject.optString("foreignFaqUrl");
            yVar.f199383s = jSONObject.optString("foreignHongBaoName");
            C69274y0 wx02 = C75846b.zx0().wx0();
            wx02.f199391a = yVar;
            Log.m105924i("MicroMsg.LuckyMoneyHKConfigManager", "setConfig maxTotalAmount:" + wx02.f199391a.f199372e + " maxTotalNum:" + wx02.f199391a.f199371d + " perGroupMaxValue:" + wx02.f199391a.f199376i + " perMinValue:" + wx02.f199391a.f199377j + " perPersonMaxValue:" + wx02.f199391a.f199375h);
            try {
                String str2 = new String(wx02.f199391a.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_HK_CONFIG_STRING_SYNC, str2);
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119681a(true);
            } catch (UnsupportedEncodingException e) {
                Log.m105928w("MicroMsg.LuckyMoneyHKConfigManager", "save config exp, " + e.getLocalizedMessage());
            } catch (IOException e2) {
                Log.m105928w("MicroMsg.LuckyMoneyHKConfigManager", "save config exp, " + e2.getLocalizedMessage());
            }
            this.f229961i = yVar.f199380p;
        }
    }

    public C78512f(String str) {
        this.f229960h = 2;
        Log.m105924i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "request " + this.f229960h);
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.C113379b.CURRENCY, this.f229960h + "");
        if (!Util.isNullOrNil(str) && C72996z1.m85820U5(str)) {
            int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str);
            hashMap.put("chatroomUserCnt", p1 + "");
        }
        setRequestData(hashMap);
    }
}
