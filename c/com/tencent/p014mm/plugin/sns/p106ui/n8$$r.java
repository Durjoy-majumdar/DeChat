package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$r */
public class n8$$r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96085n8 f21246d;

    public n8$$r(C96085n8 n8Var) {
        this.f21246d = n8Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$23");
        Log.m105924i("MicroMsg.TimeLineClickEvent", "noteLinkRedirectListener");
        if (view.getTag() instanceof C95787g0) {
            C96085n8.m123084C(C96085n8.m123094b(this.f21246d), (C95787g0) view.getTag());
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$23");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
