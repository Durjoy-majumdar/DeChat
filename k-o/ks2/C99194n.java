package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ks2.n */
public final class C99194n extends C87413o implements C32226l<C99178a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C99178a f290886d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99194n(C99178a aVar) {
        super(1);
        this.f290886d = aVar;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1$1$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1$1$1");
        Boolean valueOf = Boolean.valueOf(C87412m.m108589b(((C99178a) obj).mo138544a(), this.f290886d.mo138544a()));
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1$1$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1$1$1");
        return valueOf;
    }
}
