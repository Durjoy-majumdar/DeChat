package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$k */
public class n8$$k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96085n8 f280616d;

    public n8$$k(C96085n8 n8Var) {
        this.f280616d = n8Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$16");
        int a = C96085n8.m123093a();
        C96085n8 n8Var = this.f280616d;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        n8$$g0 n8__g0 = n8Var.f280583a;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        C96085n8.m123098f(view, a, n8__g0);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$16");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
