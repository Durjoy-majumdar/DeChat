package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog;
import j20.C117292a;
import java.util.ArrayList;
import os2.C100417r0;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$$a */
public final /* synthetic */ class TimelineClickListener$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280399d;

    public /* synthetic */ TimelineClickListener$$a(TimelineClickListener timelineClickListener) {
        this.f280399d = timelineClickListener;
    }

    public final void onClick(View view) {
        TimelineClickListener timelineClickListener = this.f280399d;
        timelineClickListener.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", timelineClickListener, array);
        SnsMethodCalculate.markStartTimeMs("lambda$init$1", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        int m = C100417r0.m131424m((String) view.getTag());
        timelineClickListener.f280379i = null;
        SnsGroupDialog snsGroupDialog = new SnsGroupDialog(timelineClickListener.f280372b, m, 1, 2);
        timelineClickListener.f280379i = snsGroupDialog;
        snsGroupDialog.show();
        timelineClickListener.f280379i.f126908o = new TimelineClickListener$$b();
        SnsMethodCalculate.markEndTimeMs("lambda$init$1", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C117292a.m165361g(timelineClickListener, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
