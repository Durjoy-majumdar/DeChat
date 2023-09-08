package pq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import rx3.C13598b0;
import vr2.C37817q;

/* renamed from: pq2.d */
public final class C35618d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f95210d;

    /* renamed from: e */
    public final /* synthetic */ long f95211e;

    /* renamed from: f */
    public final /* synthetic */ int f95212f;

    public C35618d(String str, long j, int i) {
        this.f95210d = str;
        this.f95211e = j;
        this.f95212f = i;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
        try {
            SnsMethodCalculate.markStartTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            Map<String, Long> map = C35614a.f95199b;
            SnsMethodCalculate.markEndTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            String str = this.f95210d;
            long j = this.f95211e;
            int i = this.f95212f;
            synchronized (map) {
                SnsMethodCalculate.markStartTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                SnsMethodCalculate.markEndTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                if (map.containsKey(str)) {
                    SnsMethodCalculate.markStartTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                    SnsMethodCalculate.markEndTimeMs("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                    Long remove = map.remove(str);
                    long longValue = j - (remove != null ? remove.longValue() : 0);
                    if (!C35614a.f95198a.mo60337a()) {
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
                        return;
                    }
                    int i2 = (int) longValue;
                    C37817q.m41546b("time_line_async_req_report_cost", "2", i2, i, "" + str);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        } catch (Throwable th) {
            Log.m105920e("AdTimelineReporter", "tryReportTimelineExposeCost exp=" + th);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
    }
}
