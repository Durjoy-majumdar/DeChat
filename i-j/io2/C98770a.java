package io2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import rq2.C63505q;

/* renamed from: io2.a */
public class C98770a extends C63505q.C63507b {

    /* renamed from: a */
    public String f289578a;

    /* renamed from: b */
    public String f289579b;

    /* renamed from: c */
    public String f289580c;

    /* renamed from: d */
    public String f289581d;

    /* renamed from: e */
    public String f289582e;

    /* renamed from: f */
    public int f289583f;

    /* renamed from: g */
    public int f289584g;

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        try {
            jSONObject.putOpt("snsid", this.f289578a);
            jSONObject.putOpt("uxinfo", this.f289579b);
            jSONObject.putOpt("adExtInfo", this.f289580c);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        try {
            jSONObject.putOpt("finderUsername", this.f289581d);
            jSONObject.putOpt("finderLiveNoticeId", this.f289582e);
            jSONObject.putOpt("result", Integer.valueOf(this.f289583f));
            jSONObject.putOpt(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.f289584g));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    /* renamed from: c */
    public void mo138150c(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        this.f289578a = Util.nullAsNil(str);
        this.f289579b = Util.nullAsNil(str2);
        this.f289580c = Util.nullAsNil(str3);
        this.f289581d = Util.nullAsNil(str4);
        this.f289582e = Util.nullAsNil(str5);
        this.f289583f = i;
        this.f289584g = i2;
        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        return "sns_ad_finder_live_notice_reserve";
    }
}
