package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$q */
public class n8$$q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96085n8 f280622d;

    public n8$$q(C96085n8 n8Var) {
        this.f280622d = n8Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$22");
        Log.m105924i("MicroMsg.TimeLineClickEvent", "cardRediretListener");
        if (!(view.getTag() instanceof C95787g0)) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$22");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C96085n8.m123096d(C96085n8.m123094b(this.f280622d), (C95787g0) view.getTag(), C96085n8.f280582z);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$22");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
