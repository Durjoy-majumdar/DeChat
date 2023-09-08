package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pu2.y */
public final class C62554y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100954s f177659d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineBaseAdapter f177660e;

    public C62554y(C100954s sVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        this.f177659d = sVar;
        this.f177660e = snsTimeLineBaseAdapter;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$13");
        view.setTag(this.f177659d.getStruct().f281381h);
        this.f177660e.f278572f.f280352H.onClick(view);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$13");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
