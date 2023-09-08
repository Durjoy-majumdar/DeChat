package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C8480h;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: ks2.a */
public final class C99178a {

    /* renamed from: a */
    public final String f290821a;

    /* renamed from: b */
    public final int f290822b;

    /* renamed from: c */
    public final String f290823c;

    /* renamed from: d */
    public final boolean f290824d;

    /* renamed from: e */
    public C99179b f290825e;

    /* renamed from: f */
    public final String f290826f;

    /* renamed from: g */
    public int f290827g = -1;

    /* renamed from: h */
    public JSONObject f290828h = new JSONObject();

    /* renamed from: i */
    public boolean f290829i;

    /* renamed from: j */
    public final C61156c f290830j = new C61156c(0, 0, 0, 7, (C8480h) null);

    /* renamed from: k */
    public final C61156c f290831k = new C61156c(0, 0, 0, 7, (C8480h) null);

    /* renamed from: l */
    public final C61156c f290832l = new C61156c(0, 0, 0, 7, (C8480h) null);

    /* renamed from: m */
    public final C61156c f290833m = new C61156c(0, 0, 0, 7, (C8480h) null);

    /* renamed from: n */
    public final C61156c f290834n = new C61156c(0, 0, 0, 7, (C8480h) null);

    /* renamed from: o */
    public long f290835o;

    /* renamed from: p */
    public String f290836p = "";

    public C99178a(String str, int i, String str2, boolean z, C99179b bVar, String str3) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "fromScene");
        C87412m.m108594g(bVar, IXWebBroadcastListener.STAGE_TAG);
        this.f290821a = str;
        this.f290822b = i;
        this.f290823c = str2;
        this.f290824d = z;
        this.f290825e = bVar;
        this.f290826f = str3;
    }

    /* renamed from: a */
    public final String mo138544a() {
        SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.report.Data");
        String str = this.f290821a;
        SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.report.Data");
        return str;
    }

    /* renamed from: b */
    public final C99179b mo138545b() {
        SnsMethodCalculate.markStartTimeMs("getStage", "com.tencent.mm.plugin.sns.report.Data");
        C99179b bVar = this.f290825e;
        SnsMethodCalculate.markEndTimeMs("getStage", "com.tencent.mm.plugin.sns.report.Data");
        return bVar;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.report.Data");
        if (obj instanceof C99178a) {
            boolean b = C87412m.m108589b(((C99178a) obj).f290821a, this.f290821a);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.Data");
            return b;
        }
        SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.report.Data");
        return false;
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.Data");
        int hashCode = ((((this.f290821a.hashCode() * 31) + this.f290822b) * 31) + this.f290823c.hashCode()) * 31;
        boolean z = this.f290824d;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f290825e.hashCode()) * 31;
        String str = this.f290826f;
        int hashCode3 = hashCode2 + (str == null ? 0 : str.hashCode());
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.report.Data");
        return hashCode3;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.report.Data");
        String str = "mediaId:" + this.f290821a + ", requestType:" + this.f290822b + ", from:" + this.f290823c + ", batchDownload:" + this.f290824d + ", stage:" + this.f290825e + ", stageCost:" + this.f290828h + ", startImageLoaderQueueSize:" + this.f290833m.mo86097a() + ", finishedImageLoaderQueueSize:" + this.f290834n.mo86097a() + ", enqueueQueueSize:" + this.f290830j + ", startDownloadQueueSize:" + this.f290831k + ", callbackUIQueueSize:" + this.f290832l + ", cdnRet:" + this.f290827g + ", isAd:" + this.f290829i + ", session:" + this.f290836p + " snsId:" + this.f290826f;
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.report.Data");
        return str;
    }
}
