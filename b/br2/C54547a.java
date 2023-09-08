package br2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;
import rq2.C63505q;

/* renamed from: br2.a */
public final class C54547a extends C63505q.C63507b {

    /* renamed from: a */
    public String f152907a;

    /* renamed from: b */
    public String f152908b;

    /* renamed from: c */
    public String f152909c;

    /* renamed from: d */
    public int f152910d;

    /* renamed from: e */
    public Long f152911e;

    /* renamed from: f */
    public Integer f152912f;

    /* renamed from: g */
    public Long f152913g;

    /* renamed from: h */
    public Long f152914h;

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f152907a);
            } catch (Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f152908b);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("adExtInfo", this.f152909c);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f152910d));
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("totalPlayTime", this.f152911e);
            } catch (Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveFlag", this.f152912f);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveStartTimestamp", this.f152913g);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveEndTimestamp", this.f152914h);
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        return "sns_ad_finder_live_stream_report";
    }
}
