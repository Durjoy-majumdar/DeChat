package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$b */
public final /* synthetic */ class NewSightWidget$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f277076d;

    public /* synthetic */ NewSightWidget$$b(NewSightWidget newSightWidget) {
        this.f277076d = newSightWidget;
    }

    public final void onClick(View view) {
        NewSightWidget newSightWidget = this.f277076d;
        newSightWidget.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/NewSightWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", newSightWidget, array);
        SnsMethodCalculate.markStartTimeMs("lambda$initView$2", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        newSightWidget.mo132262v();
        SnsMethodCalculate.markEndTimeMs("lambda$initView$2", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        C117292a.m165361g(newSightWidget, "com/tencent/mm/plugin/sns/ui/NewSightWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
