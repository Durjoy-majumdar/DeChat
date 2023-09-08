package vr2;

import android.content.pm.PackageInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import js0.C9512b;
import org.json.JSONArray;
import org.json.JSONObject;
import rq2.C63505q;

/* renamed from: vr2.d */
public class C102240d extends C63505q.C63507b {

    /* renamed from: A */
    public int f301060A;

    /* renamed from: a */
    public String f301061a = MMApplicationContext.getPackageName();

    /* renamed from: b */
    public int f301062b = C102236a0.m134711F();

    /* renamed from: c */
    public int f301063c = 2;

    /* renamed from: d */
    public int f301064d = 8;

    /* renamed from: e */
    public String f301065e;

    /* renamed from: f */
    public int f301066f;

    /* renamed from: g */
    public float f301067g;

    /* renamed from: h */
    public int f301068h;

    /* renamed from: i */
    public int f301069i;

    /* renamed from: j */
    public String f301070j;

    /* renamed from: k */
    public String f301071k;

    /* renamed from: l */
    public int f301072l;

    /* renamed from: m */
    public String f301073m;

    /* renamed from: n */
    public String f301074n;

    /* renamed from: o */
    public String f301075o;

    /* renamed from: p */
    public String f301076p;

    /* renamed from: q */
    public int f301077q;

    /* renamed from: r */
    public int f301078r;

    /* renamed from: s */
    public int f301079s;

    /* renamed from: t */
    public int f301080t;

    /* renamed from: u */
    public int f301081u;

    /* renamed from: v */
    public int f301082v;

    /* renamed from: w */
    public int f301083w;

    /* renamed from: x */
    public int f301084x;

    /* renamed from: y */
    public int f301085y;

    /* renamed from: z */
    public int f301086z;

    /* renamed from: vr2.d$b */
    public static class C102242b {

        /* renamed from: a */
        public int f301087a;

        /* renamed from: b */
        public String f301088b;

        /* renamed from: c */
        public String f301089c;

        /* renamed from: d */
        public int f301090d;

        /* renamed from: e */
        public String f301091e;

        /* renamed from: f */
        public String f301092f;

        /* renamed from: g */
        public String f301093g;

        /* renamed from: h */
        public String f301094h;

        /* renamed from: i */
        public int f301095i;

        /* renamed from: j */
        public int f301096j;

        /* renamed from: k */
        public int f301097k;

        /* renamed from: l */
        public int f301098l;

        /* renamed from: m */
        public int f301099m;

        /* renamed from: n */
        public int f301100n;

        /* renamed from: o */
        public int f301101o;

        /* renamed from: p */
        public int f301102p;

        /* renamed from: a */
        public C102240d mo141793a() {
            SnsMethodCalculate.markStartTimeMs("buildInstance", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            C102240d dVar = new C102240d(this.f301087a, 1, this.f301088b, this.f301089c, this.f301090d, this.f301091e, this.f301092f, this.f301093g, this.f301094h, this.f301095i, this.f301096j, this.f301097k, this.f301098l, this.f301099m, this.f301100n, this.f301101o, this.f301102p, 0, 0, 0, (C102241a) null);
            SnsMethodCalculate.markEndTimeMs("buildInstance", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return dVar;
        }

        /* renamed from: b */
        public C102242b mo141794b(int i) {
            SnsMethodCalculate.markStartTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301097k = i;
            SnsMethodCalculate.markEndTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: c */
        public C102242b mo141795c(String str) {
            SnsMethodCalculate.markStartTimeMs("setAdExtInfo", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301091e = str;
            SnsMethodCalculate.markEndTimeMs("setAdExtInfo", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: d */
        public C102242b mo141796d(int i) {
            SnsMethodCalculate.markStartTimeMs("setAutoDownload", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301099m = i;
            SnsMethodCalculate.markEndTimeMs("setAutoDownload", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: e */
        public C102242b mo141797e(String str) {
            SnsMethodCalculate.markStartTimeMs("setCanvasId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301089c = str;
            SnsMethodCalculate.markEndTimeMs("setCanvasId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: f */
        public C102242b mo141798f(int i) {
            SnsMethodCalculate.markStartTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301095i = i;
            SnsMethodCalculate.markEndTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: g */
        public C102242b mo141799g(int i) {
            SnsMethodCalculate.markStartTimeMs("setDeeplinkScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301101o = i;
            SnsMethodCalculate.markEndTimeMs("setDeeplinkScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: h */
        public C102242b mo141800h(int i) {
            SnsMethodCalculate.markStartTimeMs("setDeeplinkType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301102p = i;
            SnsMethodCalculate.markEndTimeMs("setDeeplinkType", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: i */
        public C102242b mo141801i(int i) {
            SnsMethodCalculate.markStartTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301096j = i;
            SnsMethodCalculate.markEndTimeMs("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: j */
        public C102242b mo141802j(int i) {
            SnsMethodCalculate.markStartTimeMs("setEnterScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301090d = i;
            SnsMethodCalculate.markEndTimeMs("setEnterScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: k */
        public C102242b mo141803k(int i) {
            SnsMethodCalculate.markStartTimeMs("setEventId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301087a = i;
            SnsMethodCalculate.markEndTimeMs("setEventId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: l */
        public C102242b mo141804l(String str) {
            SnsMethodCalculate.markStartTimeMs("setTraceId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301093g = str;
            SnsMethodCalculate.markEndTimeMs("setTraceId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: m */
        public C102242b mo141805m(String str) {
            SnsMethodCalculate.markStartTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301088b = str;
            SnsMethodCalculate.markEndTimeMs("setUxInfo", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: n */
        public C102242b mo141806n(String str) {
            SnsMethodCalculate.markStartTimeMs("setaId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301092f = str;
            SnsMethodCalculate.markEndTimeMs("setaId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }

        /* renamed from: o */
        public C102242b mo141807o(String str) {
            SnsMethodCalculate.markStartTimeMs("setpId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            this.f301094h = str;
            SnsMethodCalculate.markEndTimeMs("setpId", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
            return this;
        }
    }

    public C102240d(int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17, int i18, int i19, C102241a aVar) {
        PackageInfo a = C9512b.m9207a(MMApplicationContext.getContext(), this.f301061a);
        this.f301065e = a != null ? a.versionName : "";
        this.f301066f = 1;
        this.f301067g = (float) System.currentTimeMillis();
        this.f301068h = i;
        this.f301069i = i2;
        this.f301070j = str;
        this.f301071k = str2;
        this.f301072l = i3;
        this.f301073m = str3;
        this.f301074n = str4;
        this.f301075o = str5;
        this.f301076p = str6;
        this.f301077q = i4;
        this.f301078r = i5;
        this.f301079s = i6;
        this.f301080t = i7;
        this.f301081u = i8;
        this.f301082v = i9;
        this.f301083w = i15;
        this.f301084x = i16;
        this.f301085y = i17;
        this.f301086z = i18;
        this.f301060A = i19;
    }

    /* renamed from: a */
    public void mo75423a(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            jSONObject.putOpt("pkg", this.f301061a);
            jSONObject.putOpt("ct", Integer.valueOf(this.f301062b));
            jSONObject.putOpt("os", Integer.valueOf(this.f301063c));
            jSONObject.putOpt("sdk_st", Integer.valueOf(this.f301064d));
            jSONObject.putOpt("av", this.f301065e);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    /* renamed from: b */
    public void mo75424b(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            jSONObject.putOpt("uxinfo", this.f301070j);
            jSONObject.putOpt("canvasId", this.f301071k);
            jSONObject.putOpt("enterScene", Integer.valueOf(this.f301072l));
            jSONObject.putOpt("adExtInfo", this.f301073m);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    /* renamed from: c */
    public final void mo141792c(JSONArray jSONArray) {
        JSONObject jSONObject;
        SnsMethodCalculate.markStartTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        SnsMethodCalculate.markStartTimeMs("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            jSONObject = new JSONObject();
            jSONObject.putOpt(TPReportKeys.Common.COMMON_SEQ, Integer.valueOf(this.f301066f));
            jSONObject.putOpt("ts", Float.valueOf(this.f301067g));
            jSONObject.putOpt("ei", Integer.valueOf(this.f301068h));
            jSONObject.putOpt("vl", Integer.valueOf(this.f301069i));
            JSONObject jSONObject2 = new JSONObject();
            mo75424b(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("aid", this.f301074n);
            jSONObject3.putOpt("traceid", this.f301075o);
            jSONObject3.putOpt("pid", this.f301076p);
            jSONObject3.putOpt("cost_time", Integer.valueOf(this.f301077q));
            jSONObject3.putOpt("download_scene", Integer.valueOf(this.f301078r));
            jSONObject3.putOpt("actor", Integer.valueOf(this.f301079s));
            jSONObject3.putOpt("act_code", Integer.valueOf(this.f301080t));
            jSONObject3.putOpt("autodownload", Integer.valueOf(this.f301081u));
            jSONObject3.putOpt("dialog_type", Integer.valueOf(this.f301082v));
            jSONObject3.putOpt("deeplink_scene", Integer.valueOf(this.f301083w));
            jSONObject3.putOpt("deeplink_type", Integer.valueOf(this.f301084x));
            jSONObject3.putOpt("wv_progress", Integer.valueOf(this.f301085y));
            jSONObject3.putOpt("lp_type", Integer.valueOf(this.f301086z));
            jSONObject3.putOpt("click_req_type", Integer.valueOf(this.f301060A));
            jSONObject.putOpt("ext", jSONObject2);
            jSONObject.putOpt("biz", jSONObject3);
            SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        } catch (Throwable unused) {
            jSONObject = null;
            SnsMethodCalculate.markEndTimeMs("toJson", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        }
        if (jSONObject != null) {
            jSONArray.put(jSONObject);
        }
        SnsMethodCalculate.markEndTimeMs("fillExtJsonArray", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
    }

    public String getChannel() {
        SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        return "sns_ad_conversion_online_report";
    }

    public String getContent() {
        JSONObject jSONObject;
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        try {
            SnsMethodCalculate.markStartTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
            jSONObject = new JSONObject();
            mo75423a(jSONObject);
            SnsMethodCalculate.markEndTimeMs("baseJsonObject", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter$StandardAdChannelReportData");
        } catch (Throwable unused) {
        }
        if (jSONObject != null) {
            JSONArray jSONArray = new JSONArray();
            mo141792c(jSONArray);
            jSONObject.putOpt("events", jSONArray);
            String jSONObject2 = jSONObject.toString();
            SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
            return jSONObject2;
        }
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData");
        return "";
    }
}
