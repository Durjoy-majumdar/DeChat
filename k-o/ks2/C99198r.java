package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ks2.r */
public final class C99198r extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C99198r f290892d = new C99198r();

    public C99198r() {
        super(0);
    }

    /* JADX INFO: finally extract failed */
    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$reportAll$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$reportAll$1");
        synchronized (C99181f.m129202d()) {
            try {
                C99181f fVar = C99181f.f290857a;
                C99181f.m129199a(fVar, true);
                C99181f.m129201c(fVar);
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (Throwable th) {
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$reportAll$1");
                throw th;
            }
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$reportAll$1");
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$reportAll$1");
        return b0Var2;
    }
}
