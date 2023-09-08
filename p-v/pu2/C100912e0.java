package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncNormalTextView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pu2.e0 */
public final class C100912e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100954s f295517d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineBaseAdapter f295518e;

    public C100912e0(C100954s sVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        this.f295517d = sVar;
        this.f295518e = snsTimeLineBaseAdapter;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$6");
        BaseTimeLineItem.BaseViewHolder p = this.f295517d.mo140400p();
        AsyncNormalTextView contentText = this.f295517d.getContentText();
        contentText.getClass();
        SnsMethodCalculate.markStartTimeMs("bindOpTvCollapseHolder", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        contentText.f276742h.setTag(p);
        SnsMethodCalculate.markEndTimeMs("bindOpTvCollapseHolder", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f295518e.mo132928w(p);
        this.f295517d.mo140380v();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$6");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
