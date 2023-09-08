package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import vr2.C52988j;

/* renamed from: pu2.v */
public final class C100961v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100954s f295632d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineBaseAdapter f295633e;

    public C100961v(C100954s sVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        this.f295632d = sVar;
        this.f295633e = snsTimeLineBaseAdapter;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$10");
        view.setTag(new C52988j(view, this.f295632d.getStruct().f281381h));
        this.f295633e.f278572f.f280358N.onClick(view);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$10");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
