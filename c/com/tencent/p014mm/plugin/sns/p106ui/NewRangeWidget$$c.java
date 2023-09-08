package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import ms2.C61578o;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewRangeWidget$$c */
public class NewRangeWidget$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewRangeWidget f277010d;

    public NewRangeWidget$$c(NewRangeWidget newRangeWidget) {
        this.f277010d = newRangeWidget;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewRangeWidget$2");
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        NewRangeWidget newRangeWidget = this.f277010d;
        String str = NewRangeWidget.f276989z;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        C61578o oVar = newRangeWidget.f277000r;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        snsReportHelper.mo131363X(oVar.f175147d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewRangeWidget$2");
    }
}
