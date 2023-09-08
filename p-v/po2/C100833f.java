package po2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;
import rq2.C63505q;

/* renamed from: po2.f */
public class C100833f extends C63505q.C63507b {

    /* renamed from: a */
    public String f295341a;

    /* renamed from: b */
    public String f295342b;

    /* renamed from: c */
    public int f295343c;

    /* renamed from: d */
    public int f295344d;

    /* renamed from: e */
    public int f295345e;

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        try {
            jSONObject.put("snsid", Util.nullAsNil(this.f295341a));
            jSONObject.put("uxinfo", Util.nullAsNil(this.f295342b));
            jSONObject.put("adExtInfo", Util.nullAsNil((String) null));
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        try {
            jSONObject.put("reportType", this.f295343c);
            jSONObject.put("shareScene", this.f295344d);
            jSONObject.put("canvasType", this.f295345e);
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageShareReportData");
        return "sns_ad_canvas_share_report";
    }
}
