package pq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C37817q;

/* renamed from: pq2.c */
public final class C35617c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f95207d;

    /* renamed from: e */
    public final /* synthetic */ long f95208e;

    /* renamed from: f */
    public final /* synthetic */ int f95209f;

    public C35617c(long j, long j2, int i) {
        this.f95207d = j;
        this.f95208e = j2;
        this.f95209f = i;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
        if (!C35614a.f95198a.mo60337a()) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
            return;
        }
        try {
            C37817q.m41545a("time_line_async_req_report_cost", "1", (int) this.f95207d, (int) this.f95208e, String.valueOf(this.f95209f));
        } catch (Throwable th) {
            Log.m105920e("AdTimelineReporter", "reportTimelineRequestCost exp=" + th);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
    }
}
