package lq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;
import rq2.C63505q;
import vr2.C102236a0;

/* renamed from: lq2.b */
public class C61378b extends C63505q.C63507b {

    /* renamed from: a */
    public SnsInfo f174577a;

    /* renamed from: b */
    public int f174578b;

    /* renamed from: c */
    public int f174579c;

    /* renamed from: d */
    public int f174580d;

    /* renamed from: e */
    public boolean f174581e;

    public C61378b(SnsInfo snsInfo, int i, int i2, int i3, boolean z) {
        this.f174577a = snsInfo;
        this.f174578b = i;
        this.f174579c = i2;
        this.f174580d = i3;
        this.f174581e = z;
    }

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
        try {
            jSONObject.putOpt("snsid", C102236a0.m134765q0(this.f174577a.field_snsId));
            jSONObject.putOpt("uxinfo", Util.nullAsNil(this.f174577a.getUxinfo()));
            jSONObject.putOpt("adExtInfo", Util.nullAsNil(this.f174577a.getAdXml().adExtInfo));
            jSONObject.putOpt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f174578b));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
        try {
            jSONObject.put("touchDuraion", this.f174579c);
            jSONObject.put("touchCount", this.f174580d);
            jSONObject.put("hasParticleAnim", this.f174581e ? 1 : 0);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
        return "sns_ad_slider_card_touch_duration_report";
    }
}
