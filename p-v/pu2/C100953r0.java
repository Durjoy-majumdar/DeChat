package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pu2.r0 */
public final class C100953r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100934n0 f295623d;

    public C100953r0(C100934n0 n0Var) {
        this.f295623d = n0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure$loadUnreadPostView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadUnreadPostView$3");
        this.f295623d.getAdapter().f278568b.mo132088j();
        SnsReportHelper.f275506m0.mo131345F().f266424q = 1;
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadUnreadPostView$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure$loadUnreadPostView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
