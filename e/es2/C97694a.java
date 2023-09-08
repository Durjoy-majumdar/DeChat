package es2;

import android.os.Vibrator;
import android.util.SparseArray;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;
import zc0.C39339c;

/* renamed from: es2.a */
public class C97694a {

    /* renamed from: a */
    public C101804kv2 f286537a;

    /* renamed from: b */
    public String f286538b;

    /* renamed from: c */
    public String f286539c;

    /* renamed from: d */
    public boolean f286540d;

    /* renamed from: e */
    public boolean f286541e;

    /* renamed from: f */
    public int f286542f;

    /* renamed from: g */
    public String f286543g;

    /* renamed from: h */
    public C102268v f286544h;

    /* renamed from: i */
    public String f286545i;

    /* renamed from: j */
    public String f286546j;

    /* renamed from: k */
    public String f286547k;

    /* renamed from: l */
    public C96983o3 f286548l;

    /* renamed from: m */
    public float f286549m;

    /* renamed from: n */
    public int f286550n;

    /* renamed from: o */
    public String f286551o;

    /* renamed from: p */
    public SparseArray<C101804kv2> f286552p;

    /* renamed from: q */
    public SparseArray<C102268v> f286553q;

    /* renamed from: r */
    public int f286554r;

    /* renamed from: s */
    public String f286555s;

    /* renamed from: t */
    public String f286556t;

    public C97694a(String str) {
        this.f286539c = "";
        this.f286540d = false;
        this.f286541e = false;
        this.f286542f = 0;
        this.f286543g = "";
        this.f286544h = null;
        this.f286545i = "";
        this.f286546j = "";
        this.f286547k = "";
        this.f286549m = 0.0f;
        this.f286550n = 0;
        this.f286538b = str;
    }

    /* renamed from: a */
    public String mo136949a(String str) {
        SnsMethodCalculate.markStartTimeMs("getMediaDownloadPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        String e = C94938q1.m120518e(C94866e1.m120262YO(), str);
        SnsMethodCalculate.markEndTimeMs("getMediaDownloadPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return e;
    }

    /* renamed from: b */
    public String mo136950b(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getMediaFileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        String d0 = C102236a0.m134739d0(kv22);
        SnsMethodCalculate.markEndTimeMs("getMediaFileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return d0;
    }

    /* renamed from: c */
    public String mo136951c() {
        SnsMethodCalculate.markStartTimeMs("getPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        if (!Util.isNullOrNil(this.f286546j)) {
            String str = this.f286546j;
            SnsMethodCalculate.markEndTimeMs("getPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return str;
        }
        if (Util.isNullOrNil(this.f286545i)) {
            mo136955g();
        }
        String str2 = this.f286545i;
        SnsMethodCalculate.markEndTimeMs("getPath", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return str2;
    }

    /* renamed from: d */
    public int mo136952d() {
        SnsMethodCalculate.markStartTimeMs("getReqDownType", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        int i = this.f286542f;
        SnsMethodCalculate.markEndTimeMs("getReqDownType", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return i;
    }

    /* renamed from: e */
    public String mo136953e() {
        SnsMethodCalculate.markStartTimeMs("getReqKey", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        String str = this.f286543g;
        SnsMethodCalculate.markEndTimeMs("getReqKey", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return str;
    }

    /* renamed from: f */
    public String mo136954f() {
        SnsMethodCalculate.markStartTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        int i = this.f286542f;
        if (i == 4) {
            if (Util.isNullOrNil(this.f286538b) || !this.f286538b.contains("SlideFullCardAd_")) {
                String b0 = C102236a0.m134735b0(this.f286537a);
                SnsMethodCalculate.markEndTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                return b0;
            }
            Log.m105924i("ParamsToLocalId", "preload, mediaId = " + this.f286538b);
            C101804kv2 kv22 = this.f286537a;
            Vibrator vibrator = C102236a0.f301037a;
            SnsMethodCalculate.markStartTimeMs("getSlideFullCardAdSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            String str = "sns_slide_full_card_ad_tmps_" + C102236a0.m134768s(kv22.f298689d);
            if (kv22.f298671D == 1) {
                str = C39339c.m42094a(str + C102236a0.m134747h0(kv22), kv22.f298672E);
                SnsMethodCalculate.markEndTimeMs("getSlideFullCardAdSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                SnsMethodCalculate.markEndTimeMs("getSlideFullCardAdSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
            SnsMethodCalculate.markEndTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return str;
        } else if (i == 6) {
            C101804kv2 kv23 = this.f286537a;
            Vibrator vibrator2 = C102236a0.f301037a;
            SnsMethodCalculate.markStartTimeMs("getSnsTmpAdSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            String str2 = "sns_tmpsad_" + C102236a0.m134768s(kv23.f298689d);
            if (kv23.f298671D == 1) {
                str2 = C39339c.m42094a(str2 + C102236a0.m134747h0(kv23), kv23.f298672E);
                SnsMethodCalculate.markEndTimeMs("getSnsTmpAdSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                SnsMethodCalculate.markEndTimeMs("getSnsTmpAdSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
            SnsMethodCalculate.markEndTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return str2;
        } else {
            String d0 = this.f286540d ? C102236a0.m134739d0(this.f286537a) : C102236a0.m134731Z(this.f286537a);
            SnsMethodCalculate.markEndTimeMs("getfileName", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            return d0;
        }
    }

    /* renamed from: g */
    public boolean mo136955g() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f286545i = C94938q1.m120518e(C94866e1.m120262YO(), this.f286538b);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return true;
    }

    /* renamed from: h */
    public C97694a mo136956h(C102268v vVar) {
        SnsMethodCalculate.markStartTimeMs("setDecodeInfo", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f286544h = vVar;
        SnsMethodCalculate.markEndTimeMs("setDecodeInfo", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return this;
    }

    /* renamed from: i */
    public C97694a mo136957i(int i) {
        SnsMethodCalculate.markStartTimeMs("setReqDownype", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f286542f = i;
        SnsMethodCalculate.markEndTimeMs("setReqDownype", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return this;
    }

    /* renamed from: j */
    public C97694a mo136958j(String str) {
        SnsMethodCalculate.markStartTimeMs("setRequestKey", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f286543g = str;
        SnsMethodCalculate.markEndTimeMs("setRequestKey", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return this;
    }

    /* renamed from: k */
    public C97694a mo136959k(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("setSpec", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        this.f286546j = str;
        this.f286547k = str2;
        SnsMethodCalculate.markEndTimeMs("setSpec", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
        return this;
    }

    public C97694a(String str, SparseArray<C101804kv2> sparseArray, SparseArray<C102268v> sparseArray2, int i) {
        this.f286538b = "";
        this.f286539c = "";
        this.f286540d = false;
        this.f286541e = false;
        this.f286542f = 0;
        this.f286543g = "";
        this.f286544h = null;
        this.f286545i = "";
        this.f286546j = "";
        this.f286547k = "";
        this.f286549m = 0.0f;
        this.f286550n = 0;
        this.f286551o = str;
        this.f286552p = sparseArray;
        this.f286553q = sparseArray2;
        this.f286554r = i;
    }
}
