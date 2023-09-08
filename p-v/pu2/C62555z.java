package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pu2.z */
public final class C62555z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100954s f177661d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineBaseAdapter f177662e;

    public C62555z(C100954s sVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        this.f177661d = sVar;
        this.f177662e = snsTimeLineBaseAdapter;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$14");
        view.setTag(this.f177661d.getStruct().f281381h);
        this.f177662e.f278572f.f280387q.onClick(view);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$14");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
