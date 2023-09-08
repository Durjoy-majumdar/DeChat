package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ks2.m */
public final class C99193m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f290884d;

    /* renamed from: e */
    public final /* synthetic */ int f290885e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99193m(String str, int i) {
        super(0);
        this.f290884d = str;
        this.f290885e = i;
    }

    public Object invoke() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
        Object d = C99181f.m129202d();
        String str3 = this.f290884d;
        int i = this.f290885e;
        synchronized (d) {
            try {
                C99181f fVar = C99181f.f290857a;
                C99178a b = C99181f.m129200b(fVar, str3);
                if (b != null) {
                    C99181f.m129205g(fVar, b, C99179b.ImageLoaderFinished);
                    SnsMethodCalculate.markStartTimeMs("getFinishedImageLoaderQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    C61156c cVar = b.f290834n;
                    SnsMethodCalculate.markEndTimeMs("getFinishedImageLoaderQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    cVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("setLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    cVar.f174106c = i;
                    SnsMethodCalculate.markEndTimeMs("setLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "imageLoaderFinished:" + str3 + ", imageLoaderQueueSize:" + i);
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
                }
            } finally {
                str = "invoke";
                str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1";
                SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        }
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
        return b0Var2;
    }
}
