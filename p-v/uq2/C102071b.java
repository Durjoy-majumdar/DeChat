package uq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import org.json.JSONObject;
import rq2.C63505q;

/* renamed from: uq2.b */
public class C102071b extends C63505q.C63507b {

    /* renamed from: a */
    public String f300580a;

    /* renamed from: b */
    public String f300581b;

    /* renamed from: c */
    public int f300582c;

    /* renamed from: d */
    public int f300583d;

    /* renamed from: e */
    public int f300584e;

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        try {
            jSONObject.putOpt("snsid", this.f300580a);
            jSONObject.putOpt("uxinfo", this.f300581b);
            jSONObject.putOpt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f300582c == 0 ? 1 : 2));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        try {
            jSONObject.putOpt("playCount", Integer.valueOf(this.f300583d));
            jSONObject.putOpt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, Integer.valueOf(this.f300584e));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    /* renamed from: c */
    public void mo141566c(String str, String str2, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        this.f300580a = Util.nullAsNil(str);
        this.f300581b = Util.nullAsNil(str2);
        this.f300582c = i;
        this.f300583d = i2;
        this.f300584e = i3;
        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        return "sns_ad_card_like_attracting_animation_played";
    }
}
