package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pu2.o0 */
public final class C100938o0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100934n0 f295572d;

    public C100938o0(C100934n0 n0Var) {
        this.f295572d = n0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure$loadRetryPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadRetryPostView$1");
        C94866e1.cy0().mo131278b(this.f295572d.getContext());
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadRetryPostView$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure$loadRetryPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
