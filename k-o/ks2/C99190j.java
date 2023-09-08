package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import sx3.C64175a0;

/* renamed from: ks2.j */
public final class C99190j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f290879d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99190j(String str) {
        super(0);
        this.f290879d = str;
    }

    public Object invoke() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFail$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFail$1");
        Object d = C99181f.m129202d();
        String str3 = this.f290879d;
        synchronized (d) {
            try {
                C99181f fVar = C99181f.f290857a;
                C99178a b = C99181f.m129200b(fVar, str3);
                if (b != null) {
                    C99181f.m129205g(fVar, b, C99179b.DownloadFail);
                    C99181f.m129204f(fVar, b);
                    C64175a0.m75511s(C99181f.m129203e(), new C99189i(b));
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFail$1");
                }
            } finally {
                str = "invoke";
                str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFail$1";
                SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        }
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$downloadFail$1");
        return b0Var2;
    }
}
