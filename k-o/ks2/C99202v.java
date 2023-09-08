package ks2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ks2.v */
public final class C99202v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f290896d;

    /* renamed from: e */
    public final /* synthetic */ int f290897e;

    /* renamed from: f */
    public final /* synthetic */ int f290898f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99202v(String str, int i, int i2) {
        super(0);
        this.f290896d = str;
        this.f290897e = i;
        this.f290898f = i2;
    }

    public Object invoke() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
        Object d = C99181f.m129202d();
        String str3 = this.f290896d;
        int i = this.f290897e;
        int i2 = this.f290898f;
        synchronized (d) {
            try {
                C99181f fVar = C99181f.f290857a;
                C99178a b = C99181f.m129200b(fVar, str3);
                if (b != null) {
                    C99181f.m129205g(fVar, b, C99179b.StartDownload);
                    SnsMethodCalculate.markStartTimeMs("getStartDownloadQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    C61156c cVar = b.f290831k;
                    SnsMethodCalculate.markEndTimeMs("getStartDownloadQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    cVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("setPendingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    cVar.f174104a = i;
                    SnsMethodCalculate.markEndTimeMs("setPendingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    SnsMethodCalculate.markStartTimeMs("getStartDownloadQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    C61156c cVar2 = b.f290831k;
                    SnsMethodCalculate.markEndTimeMs("getStartDownloadQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    cVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("setDownloadingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    cVar2.f174105b = i2;
                    SnsMethodCalculate.markEndTimeMs("setDownloadingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    Log.m105924i("MicroMsg.Image.SnsImageLoadReporter", "startDownload:" + str3 + ", pendingListSize:" + i + ", downloadingQueueSize:" + i2);
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
                }
            } finally {
                str = "invoke";
                str2 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1";
                SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        }
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
        return b0Var2;
    }
}
