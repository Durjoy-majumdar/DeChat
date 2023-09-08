package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.statistics.t */
public class C95001t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsReportHelper f275624d;

    public C95001t(SnsReportHelper snsReportHelper) {
        this.f275624d = snsReportHelper;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$4");
        SnsReportHelper snsReportHelper = this.f275624d;
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsReportHelper.f275546g0 = false;
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsReportHelper snsReportHelper2 = this.f275624d;
        String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_SNS_EXPOSE_LAST_FEED_STRING, "");
        SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsReportHelper2.f275542e0 = I;
        SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsReportHelper snsReportHelper3 = this.f275624d;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_SYNC_EXPOSE_SNS_N_INT, 0);
        SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsReportHelper3.f275548h0 = j;
        SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsReportHelper snsReportHelper4 = this.f275624d;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        String str = snsReportHelper4.f275542e0;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsReportHelper snsReportHelper5 = this.f275624d;
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        int i = snsReportHelper5.f275548h0;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        Log.m105925i("MicroMsg.SnsReportHelper", "push enter sns timeline event lastExitSnsLastFeedId[%s] finderControllerNFeed[%d]", str, Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$4");
    }
}
