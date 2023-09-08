package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import sx3.C64175a0;

/* renamed from: ks2.q */
public final class C99197q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f290891d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99197q(String str) {
        super(0);
        this.f290891d = str;
    }

    public Object invoke() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$processFail$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$processFail$1");
        Object d = C99181f.m129202d();
        String str3 = this.f290891d;
        synchronized (d) {
            try {
                C99181f fVar = C99181f.f290857a;
                C99178a b = C99181f.m129200b(fVar, str3);
                if (b != null) {
                    C99181f.m129205g(fVar, b, C99179b.ProcessFail);
                    C99181f.m129204f(fVar, b);
                    C64175a0.m75511s(C99181f.m129203e(), new C99196p(b));
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$processFail$1");
                }
            } finally {
                str = "invoke";
                str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$processFail$1";
                SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        }
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$processFail$1");
        return b0Var2;
    }
}
