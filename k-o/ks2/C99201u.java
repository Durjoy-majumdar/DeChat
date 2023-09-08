package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ks2.u */
public final class C99201u extends C87413o implements C32226l<C99178a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C99178a f290895d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99201u(C99178a aVar) {
        super(1);
        this.f290895d = aVar;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2$1$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2$1$1");
        Boolean valueOf = Boolean.valueOf(C87412m.m108589b(((C99178a) obj).mo138544a(), this.f290895d.mo138544a()));
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2$1$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$showBitmapSuccess$2$1$1");
        return valueOf;
    }
}
