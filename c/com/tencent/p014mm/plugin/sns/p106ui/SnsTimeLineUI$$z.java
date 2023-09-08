package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$z */
public class SnsTimeLineUI$$z implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f116641d;

    public SnsTimeLineUI$$z(SnsTimeLineUI snsTimeLineUI) {
        this.f116641d = snsTimeLineUI;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$44", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$44");
        SnsTimeLineUI.m122300b8(this.f116641d);
        SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$44");
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$44", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
