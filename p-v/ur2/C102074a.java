package ur2;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import os2.C100422y;
import pr2.C100846e;
import z04.C112551y;

/* renamed from: ur2.a */
public final class C102074a implements C100846e {

    /* renamed from: a */
    public SnsCoverReportStruct f300585a;

    /* renamed from: b */
    public boolean f300586b;

    /* renamed from: a */
    public void mo140314a(String str) {
        SnsMethodCalculate.markStartTimeMs("addImageInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        C87412m.m108594g(str, "info");
        SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f265993j = snsCoverReportStruct.mo86045b("ImageInfo", C112551y.m153814n(str, ",", ";", false), true);
        }
        SnsMethodCalculate.markEndTimeMs("addImageInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: b */
    public void mo140315b(boolean z) {
        SnsMethodCalculate.markStartTimeMs("markIsLocal", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f265996m = z ? 1 : -1;
        }
        SnsMethodCalculate.markEndTimeMs("markIsLocal", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: c */
    public void mo140316c(String str) {
        SnsMethodCalculate.markStartTimeMs("addFinderInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        C87412m.m108594g(str, "info");
        SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f265995l = snsCoverReportStruct.mo86045b("FinderInfo", C112551y.m153814n(str, ",", ";", false), true);
        }
        SnsMethodCalculate.markEndTimeMs("addFinderInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: d */
    public void mo140317d() {
        SnsMethodCalculate.markStartTimeMs("markFirstFrameLoad", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
        if ((snsCoverReportStruct != null ? snsCoverReportStruct.f266004u : 0) <= 0 && snsCoverReportStruct != null) {
            snsCoverReportStruct.f266004u = System.currentTimeMillis();
        }
        SnsMethodCalculate.markEndTimeMs("markFirstFrameLoad", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: e */
    public void mo140318e() {
        SnsMethodCalculate.markStartTimeMs("markFirstPlay", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
        if ((snsCoverReportStruct != null ? snsCoverReportStruct.f266006w : 0) <= 0 && snsCoverReportStruct != null) {
            snsCoverReportStruct.f266006w = System.currentTimeMillis();
        }
        SnsMethodCalculate.markEndTimeMs("markFirstPlay", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: f */
    public void mo140319f(String str) {
        SnsMethodCalculate.markStartTimeMs("addVideoInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        C87412m.m108594g(str, "info");
        SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f265994k = snsCoverReportStruct.mo86045b("VideoInfo", C112551y.m153814n(str, ",", ";", false), true);
        }
        SnsMethodCalculate.markEndTimeMs("addVideoInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: g */
    public final void mo141567g(String str) {
        SnsMethodCalculate.markStartTimeMs("addCoverInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        C87412m.m108594g(str, "info");
        SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.mo126629s(C112551y.m153814n(str, ",", ";", false));
        }
        SnsMethodCalculate.markEndTimeMs("addCoverInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: h */
    public final void mo141568h() {
        SnsMethodCalculate.markStartTimeMs("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
        int i = 1;
        if ((snsCoverReportStruct != null ? snsCoverReportStruct.f265999p : 0) <= 0) {
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f265999p = 1;
            }
            SnsMethodCalculate.markEndTimeMs("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
            return;
        }
        if (snsCoverReportStruct != null) {
            if (snsCoverReportStruct != null) {
                i = snsCoverReportStruct.f265999p;
            }
            snsCoverReportStruct.f265999p = i;
        }
        SnsMethodCalculate.markEndTimeMs("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: i */
    public final void mo141569i(Boolean bool) {
        SnsMethodCalculate.markStartTimeMs("markLikeClick", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f266000q = bool.booleanValue() ? 1 : 0;
            }
            SnsCoverReportStruct snsCoverReportStruct2 = this.f300585a;
            if (snsCoverReportStruct2 != null) {
                snsCoverReportStruct2.f266001r = this.f300586b != booleanValue ? 1 : 0;
            }
        }
        SnsMethodCalculate.markEndTimeMs("markLikeClick", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: j */
    public final void mo141570j(C100422y yVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        C87412m.m108594g(yVar, "coverInfo");
        if (this.f300585a != null) {
            mo141571k(z);
        }
        this.f300586b = yVar.field_isLike;
        SnsCoverReportStruct snsCoverReportStruct = new SnsCoverReportStruct();
        this.f300585a = snsCoverReportStruct;
        snsCoverReportStruct.f265987d = 2;
        snsCoverReportStruct.f265989f = snsCoverReportStruct.mo86045b("UserName", yVar.getUserName(), true);
        SnsCoverReportStruct snsCoverReportStruct2 = this.f300585a;
        if (snsCoverReportStruct2 != null) {
            snsCoverReportStruct2.f265990g = C87412m.m108589b(yVar.getUserName(), C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null)) ? 1 : 0;
        }
        SnsCoverReportStruct snsCoverReportStruct3 = this.f300585a;
        if (snsCoverReportStruct3 != null) {
            snsCoverReportStruct3.f265991h = yVar.field_type;
        }
        if (snsCoverReportStruct3 != null) {
            Long u = yVar.mo139906u();
            C87412m.m108593f(u, "coverInfo.snsObjId");
            snsCoverReportStruct3.f265992i = u.longValue();
        }
        SnsCoverReportStruct snsCoverReportStruct4 = this.f300585a;
        if (snsCoverReportStruct4 != null) {
            snsCoverReportStruct4.f266002s = System.currentTimeMillis();
        }
        SnsMethodCalculate.markEndTimeMs("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    /* renamed from: k */
    public final void mo141571k(boolean z) {
        SnsMethodCalculate.markStartTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        SnsMethodCalculate.markStartTimeMs("enableCoverPreviewReport", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        int i = 1;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_cover_preview_report_enable, true);
        Log.m105924i("MicroMsg.SnsCoverConfig", "enableUserPageReport:" + wf);
        SnsMethodCalculate.markEndTimeMs("enableCoverPreviewReport", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        if (wf) {
            SnsCoverReportStruct snsCoverReportStruct = this.f300585a;
            if (snsCoverReportStruct != null) {
                if (!z) {
                    i = 2;
                }
                snsCoverReportStruct.f265988e = i;
            }
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f266003t = System.currentTimeMillis();
            }
            SnsCoverReportStruct snsCoverReportStruct2 = this.f300585a;
            if (snsCoverReportStruct2 != null) {
                snsCoverReportStruct2.mo86054n();
            }
        }
        SnsMethodCalculate.markEndTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }
}
