package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p166hy.C8830s0;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$e0 */
public class n8$$e0 implements View.OnClickListener {
    public n8$$e0(C96085n8 n8Var) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$8");
        if (view.getTag() != null && (view.getTag() instanceof TimeLineObject)) {
            ((C8830s0) C86312j.m106911c(C8830s0.class)).mo9665Xm(view.getContext(), (TimeLineObject) view.getTag());
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$8");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
