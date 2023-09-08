package ku2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ku2.c */
public final class C99244c implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImproveContentView f290986d;

    public C99244c(ImproveContentView improveContentView) {
        this.f290986d = improveContentView;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$showNormal$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$3");
        this.f290986d.getContentTv().performLongClick();
        SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$3");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveContentView$showNormal$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
