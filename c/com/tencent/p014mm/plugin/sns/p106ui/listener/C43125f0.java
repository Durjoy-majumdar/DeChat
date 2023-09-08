package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.f0 */
public class C43125f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f116693d;

    public C43125f0(TimelineClickListener timelineClickListener) {
        this.f116693d = timelineClickListener;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$39");
        this.f116693d.mo132099t(view);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$39");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
