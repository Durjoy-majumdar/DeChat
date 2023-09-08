package pq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C37817q;

/* renamed from: pq2.b */
public final class C35616b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f95205d;

    /* renamed from: e */
    public final /* synthetic */ int f95206e;

    public C35616b(long j, int i) {
        this.f95205d = j;
        this.f95206e = i;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportAdPullRequestCost$1");
        if (!C35614a.f95198a.mo60337a()) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportAdPullRequestCost$1");
            return;
        }
        try {
            C37817q.m41545a("time_line_async_req_report_cost", "3", (int) this.f95205d, 0, String.valueOf(this.f95206e));
        } catch (Throwable th) {
            Log.m105920e("AdTimelineReporter", "reportTimelineRequestCost exp=" + th);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportAdPullRequestCost$1");
    }
}
