package mo2;

import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingHBCardComponent;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import qs2.C101271i0;
import so2.C101677l;
import vr2.C102260r;

/* renamed from: mo2.a */
public class C99934a {

    /* renamed from: a */
    public HashMap<String, C99935a> f292800a = new HashMap<>();

    /* renamed from: b */
    public int f292801b = 0;

    /* renamed from: c */
    public SnsAdNativeLandingPagesUI f292802c;

    /* renamed from: d */
    public C101677l f292803d;

    /* renamed from: e */
    public AdLandingHBCardComponent f292804e;

    /* renamed from: mo2.a$a */
    public class C99935a {

        /* renamed from: a */
        public int f292805a;

        /* renamed from: b */
        public boolean f292806b;

        /* renamed from: c */
        public int f292807c;

        /* renamed from: d */
        public int f292808d;

        /* renamed from: e */
        public int f292809e;

        /* renamed from: f */
        public String f292810f;

        public C99935a(C99934a aVar) {
        }
    }

    public C99934a(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, AdLandingHBCardComponent adLandingHBCardComponent, C101677l lVar) {
        this.f292802c = snsAdNativeLandingPagesUI;
        this.f292804e = adLandingHBCardComponent;
        this.f292803d = lVar;
    }

    /* renamed from: a */
    public JSONArray mo139270a() {
        SnsMethodCalculate.markStartTimeMs("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        JSONArray jSONArray = new JSONArray();
        JSONObject b = mo139271b(1, false);
        if (b != null) {
            jSONArray.put(b);
        }
        JSONObject b2 = mo139271b(2, false);
        if (b2 != null) {
            jSONArray.put(b2);
        }
        JSONObject b3 = mo139271b(1, true);
        if (b3 != null) {
            jSONArray.put(b3);
        }
        JSONObject b4 = mo139271b(2, true);
        if (b4 != null) {
            jSONArray.put(b4);
        }
        JSONObject b5 = mo139271b(4, false);
        if (b5 != null) {
            jSONArray.put(b5);
        }
        if (jSONArray.length() > 0) {
            SnsMethodCalculate.markEndTimeMs("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
            return jSONArray;
        }
        SnsMethodCalculate.markEndTimeMs("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return null;
    }

    /* renamed from: b */
    public final JSONObject mo139271b(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        C99935a aVar = this.f292800a.get(mo139272c(i, z));
        JSONObject jSONObject = null;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
            try {
                if (aVar.f292807c > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("subType", aVar.f292805a);
                    jSONObject2.put("isDoubleCard", aVar.f292806b ? 1 : 0);
                    int i2 = aVar.f292807c;
                    if (i2 > 0) {
                        jSONObject2.put("expCnt", i2);
                    }
                    int i3 = aVar.f292808d;
                    if (i3 > 0) {
                        jSONObject2.put("btnClkCnt", i3);
                    }
                    int i4 = aVar.f292809e;
                    if (i4 > 0) {
                        jSONObject2.put("linkClkCnt", i4);
                    }
                    if (aVar.f292805a != 1) {
                        jSONObject2.put("giveCardId", Util.nullAsNil(aVar.f292810f));
                    }
                    SnsMethodCalculate.markEndTimeMs("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
                    jSONObject = jSONObject2;
                    SnsMethodCalculate.markEndTimeMs("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
                    return jSONObject;
                }
            } catch (Exception e) {
                Log.m105920e("HBCardStatistics", "toJsonObject exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
            SnsMethodCalculate.markEndTimeMs("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
            return jSONObject;
        }
        SnsMethodCalculate.markEndTimeMs("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return null;
    }

    /* renamed from: c */
    public final String mo139272c(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "3" : "");
        sb.append(i);
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return sb4;
    }

    /* renamed from: d */
    public void mo139273d(int i, boolean z, int i2) {
        SnsMethodCalculate.markStartTimeMs("onCardBtnClick", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        String c = mo139272c(i, z);
        C99935a aVar = this.f292800a.get(c);
        if (aVar == null) {
            aVar = new C99935a(this);
            aVar.f292806b = z;
            aVar.f292805a = i;
            aVar.f292810f = this.f292803d.f297644z;
            this.f292800a.put(c, aVar);
        }
        if (i2 != 3) {
            aVar.f292808d++;
        } else {
            aVar.f292809e++;
        }
        SnsMethodCalculate.markStartTimeMs("adChannelClickReport", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        try {
            C101271i0 n8 = this.f292802c.mo132541n8();
            String g = n8.mo140740g();
            String l = n8.mo140745l();
            int i3 = n8.mo140742i();
            String d = n8.mo140737d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", Util.nullAsNil(g));
            jSONObject.put("uxinfo", Util.nullAsNil(l));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("btnType", i2);
            jSONObject2.put("canvasId", Util.nullAsNil(d));
            AdLandingHBCardComponent adLandingHBCardComponent = this.f292804e;
            adLandingHBCardComponent.getClass();
            SnsMethodCalculate.markStartTimeMs("getTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            String str = adLandingHBCardComponent.f273711x;
            SnsMethodCalculate.markEndTimeMs("getTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            jSONObject2.put("twistCardId", str);
            JSONObject M = this.f292804e.mo130148M();
            if (M != null) {
                jSONObject2.put("hbCard", M);
            }
            jSONObject.put("extInfo", jSONObject2);
            C102260r.m134858a("canvas_hb_card_btn_click", jSONObject.toString());
        } catch (Exception e) {
            Log.m105920e("HBCardStatistics", "reportShakeActionResult, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("adChannelClickReport", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        SnsMethodCalculate.markEndTimeMs("onCardBtnClick", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
    }

    /* renamed from: e */
    public void mo139274e(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onCardExposure", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        String c = mo139272c(i, z);
        C99935a aVar = this.f292800a.get(c);
        if (aVar == null) {
            aVar = new C99935a(this);
            aVar.f292806b = z;
            aVar.f292805a = i;
            aVar.f292810f = this.f292803d.f297644z;
            this.f292800a.put(c, aVar);
        }
        aVar.f292807c++;
        this.f292801b++;
        SnsMethodCalculate.markEndTimeMs("onCardExposure", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
    }
}
