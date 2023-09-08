package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.q */
public class C43128q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f116696d;

    public C43128q(TimelineClickListener timelineClickListener) {
        this.f116696d = timelineClickListener;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$24");
        this.f116696d.mo132097r(view);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$24");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
