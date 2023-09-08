package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewRangeWidget$$b */
public class NewRangeWidget$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewRangeWidget f277009d;

    public NewRangeWidget$$b(NewRangeWidget newRangeWidget) {
        this.f277009d = newRangeWidget;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/NewRangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewRangeWidget$1");
        NewRangeWidget newRangeWidget = this.f277009d;
        String str = NewRangeWidget.f276989z;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        View.OnClickListener onClickListener = newRangeWidget.f277005w;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        if (onClickListener != null) {
            NewRangeWidget newRangeWidget2 = this.f277009d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            View.OnClickListener onClickListener2 = newRangeWidget2.f277005w;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            onClickListener2.onClick(view);
            SnsReportHelper.f275506m0.mo131344E().f266378g = 1;
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewRangeWidget$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/NewRangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
