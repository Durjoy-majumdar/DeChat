package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.n6 */
public class C96083n6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f280572d;

    public C96083n6(SnsTimeLineUI snsTimeLineUI) {
        this.f280572d = snsTimeLineUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$59");
        SnsTimeLineUI.m122284L7(this.f280572d).mo132088j();
        SnsReportHelper.f275506m0.mo131345F().f266424q = 2;
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$59");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$59", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
