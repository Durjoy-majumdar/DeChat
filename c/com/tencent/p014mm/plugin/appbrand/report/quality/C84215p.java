package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.content.Context;
import com.google.android.gms.common.Scopes;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.mmdata.rpt.WxaPkgDownloadStruct;
import com.tencent.p014mm.plugin.appbrand.appcache.C81234b4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81300o2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.p014mm.vfs.C86013q1;
import ei0.C86516a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.p */
public final class C84215p {

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.p$a */
    public static final class C84216a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ QualitySession f245977d;

        /* renamed from: e */
        public final /* synthetic */ kv_14609 f245978e;

        /* renamed from: f */
        public final /* synthetic */ C86516a f245979f;

        /* renamed from: g */
        public final /* synthetic */ CdnLogic.WebPageProfile f245980g;

        /* renamed from: h */
        public final /* synthetic */ String f245981h;

        /* renamed from: i */
        public final /* synthetic */ long f245982i;

        /* renamed from: j */
        public final /* synthetic */ long f245983j;

        /* renamed from: n */
        public final /* synthetic */ long f245984n;

        /* renamed from: o */
        public final /* synthetic */ long f245985o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84216a(QualitySession qualitySession, kv_14609 kv_14609, C86516a aVar, CdnLogic.WebPageProfile webPageProfile, String str, long j, long j2, long j3, long j4) {
            super(0);
            this.f245977d = qualitySession;
            this.f245978e = kv_14609;
            this.f245979f = aVar;
            this.f245980g = webPageProfile;
            this.f245981h = str;
            this.f245982i = j;
            this.f245983j = j2;
            this.f245984n = j3;
            this.f245985o = j4;
        }

        public Object invoke() {
            WxaPkgDownloadStruct wxaPkgDownloadStruct = new WxaPkgDownloadStruct();
            QualitySession qualitySession = this.f245977d;
            kv_14609 kv_14609 = this.f245978e;
            C86516a aVar = this.f245979f;
            CdnLogic.WebPageProfile webPageProfile = this.f245980g;
            String str = this.f245981h;
            long j = this.f245982i;
            long j2 = this.f245983j;
            long j3 = this.f245984n;
            long j4 = this.f245985o;
            wxaPkgDownloadStruct.f237430d = wxaPkgDownloadStruct.mo86045b("InstanceId", qualitySession != null ? qualitySession.f245832d : null, true);
            wxaPkgDownloadStruct.f237432e = wxaPkgDownloadStruct.mo86045b("appid", qualitySession != null ? qualitySession.f245833e : null, true);
            wxaPkgDownloadStruct.f237434f = qualitySession != null ? (long) qualitySession.f245837i : 0;
            wxaPkgDownloadStruct.f237436g = qualitySession != null ? (long) qualitySession.f245834f : 0;
            wxaPkgDownloadStruct.f237438h = qualitySession != null ? (long) qualitySession.f245835g : 0;
            wxaPkgDownloadStruct.f237440i = kv_14609.f245673o;
            wxaPkgDownloadStruct.f237442j = qualitySession != null ? (long) qualitySession.f245836h : 0;
            wxaPkgDownloadStruct.f237444k = kv_14609.f245680v;
            wxaPkgDownloadStruct.f237445l = kv_14609.f245681w;
            wxaPkgDownloadStruct.f237446m = wxaPkgDownloadStruct.mo86045b("moduleName", kv_14609.f245670i, true);
            wxaPkgDownloadStruct.f237447n = (long) kv_14609.f245684z;
            wxaPkgDownloadStruct.f237448o = (long) kv_14609.f245671j;
            wxaPkgDownloadStruct.f237449p = (long) kv_14609.f245672n;
            int i = 0;
            wxaPkgDownloadStruct.f237450q = kv_14609.f245678t > 0 ? 1 : 0;
            wxaPkgDownloadStruct.f237451r = kv_14609.f245683y > 0 ? 1 : 0;
            String i2 = aVar instanceof C81234b4 ? ((C81234b4) aVar).mo113488i() : aVar instanceof C81300o2 ? ((C81300o2) aVar).mo113571j() : aVar.f249583c;
            if (i2 != null && C86013q1.m106450k(i2)) {
                i = WxaPkg.m99509d(i2);
            }
            wxaPkgDownloadStruct.f237452s = (long) i;
            wxaPkgDownloadStruct.f237453t = wxaPkgDownloadStruct.mo86045b("downloadUrl", aVar.f249586f, true);
            wxaPkgDownloadStruct.f237455v = wxaPkgDownloadStruct.mo86045b("networktype", C84116i0.m103660c((Context) null, 1, (Object) null), true);
            wxaPkgDownloadStruct.f237456w = webPageProfile.redirectStart;
            wxaPkgDownloadStruct.f237457x = webPageProfile.redirectEnd;
            wxaPkgDownloadStruct.f237458y = webPageProfile.fetchStart;
            wxaPkgDownloadStruct.f237459z = webPageProfile.domainLookUpStart;
            wxaPkgDownloadStruct.f237401A = webPageProfile.domainLookUpEnd;
            wxaPkgDownloadStruct.f237402B = webPageProfile.connectStart;
            wxaPkgDownloadStruct.f237403C = webPageProfile.connectEnd;
            wxaPkgDownloadStruct.f237404D = webPageProfile.SSLconnectionStart;
            wxaPkgDownloadStruct.f237405E = webPageProfile.SSLconnectionEnd;
            wxaPkgDownloadStruct.f237406F = webPageProfile.requestStart;
            wxaPkgDownloadStruct.f237407G = webPageProfile.requestEnd;
            wxaPkgDownloadStruct.f237408H = webPageProfile.responseStart;
            wxaPkgDownloadStruct.f237409I = webPageProfile.responseEnd;
            wxaPkgDownloadStruct.f237410J = wxaPkgDownloadStruct.mo86045b("protocol", webPageProfile.protocol, true);
            wxaPkgDownloadStruct.f237411K = webPageProfile.rtt;
            wxaPkgDownloadStruct.f237412L = webPageProfile.statusCode;
            wxaPkgDownloadStruct.f237413M = webPageProfile.networkTypeEstimate;
            wxaPkgDownloadStruct.f237414N = webPageProfile.httpRttEstimate;
            wxaPkgDownloadStruct.f237415O = webPageProfile.transportRttEstimate;
            wxaPkgDownloadStruct.f237416P = webPageProfile.downstreamThroughputKbpsEstimate;
            wxaPkgDownloadStruct.f237417Q = webPageProfile.throughputKbps;
            wxaPkgDownloadStruct.f237418R = wxaPkgDownloadStruct.mo86045b("peerIP", webPageProfile.peerIP, true);
            wxaPkgDownloadStruct.f237419S = webPageProfile.port;
            wxaPkgDownloadStruct.f237420T = webPageProfile.socketReused ? 1 : 0;
            wxaPkgDownloadStruct.f237421U = webPageProfile.sendBytesCount;
            long j5 = webPageProfile.receivedBytedCount;
            wxaPkgDownloadStruct.f237422V = j5;
            wxaPkgDownloadStruct.f237423W = j5;
            wxaPkgDownloadStruct.f237424X = kv_14609.f245658E;
            switch (kv_14609.f245679u) {
                case 1:
                case 2:
                case 3:
                    wxaPkgDownloadStruct.f237425Y = 1;
                    break;
                case 4:
                case 5:
                    wxaPkgDownloadStruct.f237425Y = 3;
                    break;
                case 6:
                    wxaPkgDownloadStruct.f237425Y = 4;
                    break;
            }
            if (str == null) {
                str = WxaPkgIntegrityChecker.m99520c(aVar instanceof C81234b4 ? ((C81234b4) aVar).mo113488i() : aVar instanceof C81300o2 ? ((C81300o2) aVar).mo113571j() : aVar.f249583c);
            }
            wxaPkgDownloadStruct.f237426Z = wxaPkgDownloadStruct.mo86045b("finalPkgMd5", str, true);
            wxaPkgDownloadStruct.f237427a0 = kv_14609.f245659F ? 1 : 0;
            C90422jy jyVar = aVar.f251361p;
            if (jyVar != null) {
                wxaPkgDownloadStruct.f237428b0 = (long) jyVar.f259641f;
                wxaPkgDownloadStruct.f237429c0 = jyVar.f259640e ? 1 : 0;
                wxaPkgDownloadStruct.f237431d0 = (long) jyVar.f259642g;
            }
            wxaPkgDownloadStruct.f237433e0 = kv_14609.f245663J;
            wxaPkgDownloadStruct.f237435f0 = j;
            wxaPkgDownloadStruct.f237437g0 = j2;
            wxaPkgDownloadStruct.f237439h0 = j3;
            wxaPkgDownloadStruct.f237441i0 = j4;
            wxaPkgDownloadStruct.f237443j0 = (long) kv_14609.f245664K;
            wxaPkgDownloadStruct.mo86054n();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m103811a(QualitySession qualitySession, kv_14609 kv_14609, C86516a aVar, CdnLogic.WebPageProfile webPageProfile, String str, long j, long j2, long j3, long j4) {
        kv_14609 kv_146092 = kv_14609;
        C87412m.m108594g(kv_146092, "kv14609");
        C86516a aVar2 = aVar;
        C87412m.m108594g(aVar2, "downloadRequest");
        CdnLogic.WebPageProfile webPageProfile2 = webPageProfile;
        C87412m.m108594g(webPageProfile2, Scopes.PROFILE);
        C61926c.m72657B("AppBrand.PkgDownloadProfileReportUtils.report", false, new C84216a(qualitySession, kv_146092, aVar2, webPageProfile2, str, j, j2, j3, j4));
    }
}
