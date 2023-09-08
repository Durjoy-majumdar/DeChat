package ap0;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29324f;
import com.tencent.p014mm.plugin.appbrand.launching.C83396o0;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ob0.C89132b;
import rp0.C90077a;
import te3.C50540ng3;
import te3.C64555mg3;

/* renamed from: ap0.f */
public final class C79624f extends C79619a<C89132b.C89134c<C50540ng3>> {

    /* renamed from: f */
    public final String f233477f;

    /* renamed from: g */
    public final String f233478g;

    /* renamed from: h */
    public final String f233479h;

    /* renamed from: i */
    public C89132b.C89134c<C50540ng3> f233480i;

    public C79624f(String str, String str2, String str3) {
        this.f233477f = str;
        this.f233478g = str2;
        this.f233479h = str3;
    }

    /* renamed from: a */
    public Object mo109762a(int i) {
        C89132b.C89134c cVar = (C89132b.C89134c) super.mo109762a(i);
        if (cVar != null) {
            C27992b.m38051a(7);
        }
        return cVar;
    }

    /* renamed from: b */
    public int mo109763b() {
        return 1;
    }

    /* renamed from: c */
    public Object mo109764c() {
        WxaPkgWrappingInfo b;
        C27992b.m38051a(4);
        Log.m105924i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", "preFetch: pkg download info, appId[" + this.f233479h + "] username[" + this.f233478g + "] enterPath[" + this.f233477f + ']');
        this.f252812b = Util.nowMilliSecond();
        C29324f fVar = (C29324f) C81161g2.Bx0(C29324f.class);
        String Lo = fVar != null ? fVar.mo56601Lo(this.f233478g) : null;
        boolean z = true;
        int i = (Util.isNullOrNil(Lo) || (b = C83396o0.m102337b(Lo, 1)) == null) ? 0 : b.pkgVersion;
        Log.m105924i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", "preFetch: appId[" + this.f233479h + "] username[" + this.f233478g + "], localPkgVer=" + i);
        String str = this.f233479h;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.f233477f;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.f233478g;
        if (str4 != null) {
            str2 = str4;
        }
        C64555mg3 mg32 = new C64555mg3();
        mg32.f184318e = str;
        mg32.f184319f = i;
        mg32.f184320g = str3;
        mg32.f184322i = true;
        mg32.f184317d = str2;
        mg32.f184321h = 0;
        this.f233480i = new C79623e(mg32).mo115600n();
        long nowMilliSecond = Util.nowMilliSecond();
        this.f252813c = nowMilliSecond;
        StringBuilder sb = new StringBuilder();
        sb.append("preFetch: appId[");
        sb.append(this.f233479h);
        sb.append("] username[");
        sb.append(this.f233478g);
        sb.append("] cost[");
        sb.append(nowMilliSecond - this.f252812b);
        sb.append(" ms] ret is?=[");
        if (this.f233480i != null) {
            z = false;
        }
        sb.append(z);
        sb.append("], errCode=[");
        C89132b.C89134c<C50540ng3> cVar = this.f233480i;
        int i2 = -1;
        sb.append(cVar != null ? cVar.f256794b : -1);
        sb.append("], errType=[");
        C89132b.C89134c<C50540ng3> cVar2 = this.f233480i;
        if (cVar2 != null) {
            i2 = cVar2.f256793a;
        }
        sb.append(i2);
        sb.append(']');
        Log.m105924i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", sb.toString());
        return this.f233480i;
    }

    /* renamed from: d */
    public void mo109758d(QualitySession qualitySession) {
        C87412m.m108594g(qualitySession, "qualitySession");
        if (this.f233480i != null) {
            long j = this.f252813c - this.f252812b;
            WeAppQualitySystemGetDownloadCGIStruct weAppQualitySystemGetDownloadCGIStruct = new WeAppQualitySystemGetDownloadCGIStruct();
            weAppQualitySystemGetDownloadCGIStruct.f237165d = weAppQualitySystemGetDownloadCGIStruct.mo86045b("InstanceId", qualitySession.f245832d, true);
            String str = weAppQualitySystemGetDownloadCGIStruct.f237166e;
            if (str == null) {
                str = "";
            }
            weAppQualitySystemGetDownloadCGIStruct.f237166e = weAppQualitySystemGetDownloadCGIStruct.mo86045b("AppId", str, true);
            weAppQualitySystemGetDownloadCGIStruct.f237167f = (long) qualitySession.f245837i;
            weAppQualitySystemGetDownloadCGIStruct.f237168g = WeAppQualitySystemGetDownloadCGIStruct.C80779a.m98593a(qualitySession.f245834f);
            weAppQualitySystemGetDownloadCGIStruct.f237169h = (long) qualitySession.f245835g;
            weAppQualitySystemGetDownloadCGIStruct.f237170i = j;
            weAppQualitySystemGetDownloadCGIStruct.mo86046c("CostTimeMs", j);
            weAppQualitySystemGetDownloadCGIStruct.f237171j = (long) qualitySession.f245836h;
            long j2 = weAppQualitySystemGetDownloadCGIStruct.f237172k;
            weAppQualitySystemGetDownloadCGIStruct.f237172k = j2;
            weAppQualitySystemGetDownloadCGIStruct.mo86048e("StartTimeStampMs", j2);
            long j3 = weAppQualitySystemGetDownloadCGIStruct.f237173l;
            weAppQualitySystemGetDownloadCGIStruct.f237173l = j3;
            weAppQualitySystemGetDownloadCGIStruct.mo86048e("EndTimeStampMs", j3);
            weAppQualitySystemGetDownloadCGIStruct.f237174m = C90077a.m112679b(this.f233480i) ? WeAppQualitySystemGetDownloadCGIStruct.C80780b.ok : WeAppQualitySystemGetDownloadCGIStruct.C80780b.common_fail;
            weAppQualitySystemGetDownloadCGIStruct.f237175n = (long) C84201i.m103806c();
            weAppQualitySystemGetDownloadCGIStruct.f237179r = weAppQualitySystemGetDownloadCGIStruct.mo86045b("NetworkTypeStr", C84116i0.m103659b(MMApplicationContext.getContext()), true);
            weAppQualitySystemGetDownloadCGIStruct.f237176o = weAppQualitySystemGetDownloadCGIStruct.mo86045b("username", this.f233478g, true);
            long j4 = 1;
            weAppQualitySystemGetDownloadCGIStruct.f237177p = 1;
            if (!this.f252814d) {
                j4 = 0;
            }
            weAppQualitySystemGetDownloadCGIStruct.f237178q = j4;
            weAppQualitySystemGetDownloadCGIStruct.mo86054n();
        }
    }
}
