package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pu2.n */
public final class C100933n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100930m f295563d;

    public C100933n(C100930m mVar) {
        this.f295563d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem$registerTouchEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$registerTouchEvent$1");
        C100930m mVar = this.f295563d;
        int i = C100930m.f295554Z0;
        SnsMethodCalculate.markStartTimeMs("access$performVideoClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        mVar.getClass();
        SnsMethodCalculate.markStartTimeMs("performVideoClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        mVar.mo140391H();
        mVar.mo140441m("MicroMsg.Improve.ImproveVideoTimelineItem", "performVideoClick snsLocalId:" + mVar.getStruct().f281381h);
        mVar.getAdapter().f278572f.f280353I.onClick(mVar.f295556U0);
        SnsMethodCalculate.markEndTimeMs("performVideoClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("access$performVideoClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$registerTouchEvent$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem$registerTouchEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
