package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$c */
public final /* synthetic */ class n8$$c implements View.OnClickListener {
    public final void onClick(View view) {
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        SnsMethodCalculate.markStartTimeMs("lambda$new$2", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (!(view.getTag() instanceof C95787g0)) {
            SnsMethodCalculate.markEndTimeMs("lambda$new$2", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            C117292a.m165361g(new Object(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C96085n8.m123102j((C95787g0) view.getTag(), view.getContext(), C96085n8.f280582z);
        SnsMethodCalculate.markEndTimeMs("lambda$new$2", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        C117292a.m165361g(new Object(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
