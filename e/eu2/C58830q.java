package eu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: eu2.q */
public final class C58830q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97736r f168428d;

    public C58830q(C97736r rVar) {
        this.f168428d = rVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure$loadItemErrorTipView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadItemErrorTipView$3");
        C97736r.m126045p(this.f168428d);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadItemErrorTipView$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure$loadItemErrorTipView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
