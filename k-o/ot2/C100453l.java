package ot2;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95005x;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import ft3.C116895f;
import gy3.C87412m;
import p166hy.C98568t0;

@C86522b
/* renamed from: ot2.l */
public final class C100453l extends C86301e implements C98568t0 {

    /* renamed from: d */
    public final String f294280d = "MicroMsg.SnsFakeVideoPublishReportApi";

    /* renamed from: Do */
    public void mo137942Do(long j) {
        SnsMethodCalculate.markStartTimeMs("updateEditPlayTime", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApi");
        String str = this.f294280d;
        C116895f.m164891c(str, "updateEditTime >> time: " + j);
        C95005x xVar = C95005x.f275632a;
        SnsMethodCalculate.markStartTimeMs("updateMediaEditPageCnt", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsVideoPublishLogStruct snsVideoPublishLogStruct = C95005x.f275634c;
        long j2 = snsVideoPublishLogStruct.f266240g;
        snsVideoPublishLogStruct.f266240g = 1 + j2;
        Log.m105924i("MicroMsg.SnsVideoPublishReporter", "updateMediaEditPageCnt >> sessionId: " + C95005x.f275634c.f266237d + ", lastCnt: " + j2 + ", currentCnt: " + C95005x.f275634c.f266240g);
        SnsMethodCalculate.markEndTimeMs("updateMediaEditPageCnt", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsMethodCalculate.markStartTimeMs("updateMediaEditPlayTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsVideoPublishLogStruct snsVideoPublishLogStruct2 = C95005x.f275634c;
        long j3 = snsVideoPublishLogStruct2.f266241h;
        snsVideoPublishLogStruct2.f266241h = j3 + j;
        Log.m105924i("MicroMsg.SnsVideoPublishReporter", "updateMediaEditPlayTime >>  sessionId: " + C95005x.f275634c.f266237d + ", time: " + j + ", lastPlayTime: " + j3 + ", currentTime: " + C95005x.f275634c.f266241h);
        SnsMethodCalculate.markEndTimeMs("updateMediaEditPlayTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsMethodCalculate.markStartTimeMs("setFromMediaEdit", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        StringBuilder sb = new StringBuilder();
        sb.append("setFromMediaEdit >> sessionId: ");
        sb.append(C95005x.f275633b);
        Log.m105924i("MicroMsg.SnsVideoPublishReporter", sb.toString());
        C95005x.f275635d = true;
        SnsMethodCalculate.markEndTimeMs("setFromMediaEdit", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsMethodCalculate.markEndTimeMs("updateEditPlayTime", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApi");
    }

    public void r00(int i, String str, long j, long j2) {
        int i2 = i;
        String str2 = str;
        long j3 = j;
        long j4 = j2;
        SnsMethodCalculate.markStartTimeMs("reportFakeVideoResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApi");
        C87412m.m108594g(str2, "sessionId");
        String str3 = this.f294280d;
        C116895f.m164891c(str3, "reportFakeVideoResult >> action: " + i2 + ", sessionId: " + str2 + ", fakePublishTime: " + j3 + ", muxTime: " + j4);
        C95005x xVar = C95005x.f275632a;
        SnsMethodCalculate.markStartTimeMs("reportFakeVideoResultAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsVideoPublishLogStruct snsVideoPublishLogStruct = C95005x.f275637f.get(str2);
        StringBuilder sb = new StringBuilder();
        String str4 = "reportFakeVideoResult";
        sb.append("reportFakeVideoResultAction >> action: ");
        sb.append(i2);
        sb.append(", sessionId: ");
        sb.append(str2);
        sb.append(", fakePublishTime: ");
        sb.append(j3);
        sb.append(", muxTime: ");
        sb.append(j4);
        sb.append(", isContainStruct: ");
        sb.append(snsVideoPublishLogStruct != null);
        Log.m105924i("MicroMsg.SnsVideoPublishReporter", sb.toString());
        if (snsVideoPublishLogStruct != null) {
            snsVideoPublishLogStruct.f266238e = i2;
            snsVideoPublishLogStruct.f266245l = j3;
            snsVideoPublishLogStruct.f266244k = j4;
            snsVideoPublishLogStruct.f266239f = xVar.mo131406a();
            snsVideoPublishLogStruct.mo86054n();
            SnsVideoPublishLogStruct remove = C95005x.f275637f.remove(str2);
        }
        xVar.mo131408c();
        SnsMethodCalculate.markEndTimeMs("reportFakeVideoResultAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApi");
    }
}
