package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.sns.statistics.u */
public class C95002u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsReportHelper f275625d;

    public C95002u(SnsReportHelper snsReportHelper) {
        this.f275625d = snsReportHelper;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$5");
        SnsReportHelper snsReportHelper = this.f275625d;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        HashSet<String> hashSet = snsReportHelper.f275552j0;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        synchronized (hashSet) {
            try {
                SnsReportHelper snsReportHelper2 = this.f275625d;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                HashSet<String> hashSet2 = snsReportHelper2.f275552j0;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                hashSet2.clear();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$5");
                    throw th;
                }
            }
        }
        SnsReportHelper snsReportHelper3 = this.f275625d;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        String str = snsReportHelper3.f275544f0;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsReportHelper3.f275542e0 = str;
        SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsReportHelper snsReportHelper4 = this.f275625d;
        SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsReportHelper4.f275550i0 = 0;
        SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_EXPOSE_LAST_FEED_STRING;
        SnsReportHelper snsReportHelper5 = this.f275625d;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        String str2 = snsReportHelper5.f275542e0;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        i.mo119677K(aVar, str2);
        SnsReportHelper snsReportHelper6 = this.f275625d;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        String str3 = snsReportHelper6.f275542e0;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsReportHelper snsReportHelper7 = this.f275625d;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        String str4 = snsReportHelper7.f275544f0;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        Log.m105925i("MicroMsg.SnsReportHelper", "push exit sns timeline event lastExitSnsLastFeedId[%s] currExposeFeedId[%s]", str3, str4);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$5");
    }
}
