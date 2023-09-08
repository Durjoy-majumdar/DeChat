package p160gy;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverActionStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import di3.C86301e;
import ei3.C86522b;
import p166hy.C60227q0;

@C86522b
/* renamed from: gy.a1 */
public class C98280a1 extends C86301e implements C60227q0 {
    public void Al0(String str) {
        SnsMethodCalculate.markStartTimeMs("setFinderFeedID", "com.tencent.mm.feature.sns.SnsReportHelperService");
        SnsCoverActionStruct C = SnsReportHelper.f275506m0.mo131342C();
        C.f265982h = C.mo86045b("FinderFeedID", str, true);
        SnsMethodCalculate.markEndTimeMs("setFinderFeedID", "com.tencent.mm.feature.sns.SnsReportHelperService");
    }

    /* renamed from: oJ */
    public void mo85220oJ(int i) {
        SnsMethodCalculate.markStartTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.feature.sns.SnsReportHelperService");
        SnsReportHelper.f275506m0.mo131376i(i);
        SnsMethodCalculate.markEndTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.feature.sns.SnsReportHelperService");
    }
}
