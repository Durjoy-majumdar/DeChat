package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$f */
public class n8$$f implements View.OnClickListener {
    public n8$$f(C96085n8 n8Var) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$11");
        if (!(view.getTag() instanceof C95787g0)) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$11");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C96085n8.m123086E((C95787g0) view.getTag(), view.getContext(), C96085n8.f280582z);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$11");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
