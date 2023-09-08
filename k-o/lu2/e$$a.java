package lu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ht1.C60216z4;
import ks2.C99181f;
import te3.C64682rk1;

public final /* synthetic */ class e$$a implements C60216z4.C8821a {

    /* renamed from: a */
    public final /* synthetic */ C64682rk1 f174653a;

    public /* synthetic */ e$$a(C64682rk1 rk12) {
        this.f174653a = rk12;
    }

    /* renamed from: a */
    public final void mo6382a(Object obj) {
        C64682rk1 rk12 = this.f174653a;
        SnsMethodCalculate.markStartTimeMs("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
        String str = rk12.f185183d;
        int intValue = ((Integer) obj).intValue();
        SnsMethodCalculate.markStartTimeMs("loadFinish", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
        C99181f.m129207j(str == null ? "" : str, intValue);
        C99181f.m129206h(str == null ? "" : str, -1, -1);
        if (str == null) {
            str = "";
        }
        C99181f.m129209o(str);
        SnsMethodCalculate.markEndTimeMs("loadFinish", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
        SnsMethodCalculate.markEndTimeMs("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.FinderMediaTimeLineItem");
    }
}
