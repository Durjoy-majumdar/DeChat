package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import os2.C100417r0;
import te3.C101789j00;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$$d */
public class TimelineClickListener$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280401d;

    public TimelineClickListener$$d(TimelineClickListener timelineClickListener) {
        this.f280401d = timelineClickListener;
    }

    public void onClick(View view) {
        boolean z;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
        if (view.getTag() == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        SnsInfo a = TimelineClickListener.m122979a(this.f280401d, view2);
        if (a == null || !a.isAd()) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z2 = false;
        if (a.getAdSnsInfo().getAdXml().hasVoteInfo()) {
            int b = C100417r0.m131413b(a.getAdSnsInfo().getAdXml().getAdVoteComponentUrl(), a.getUxinfo());
            if (b > 0) {
                z2 = true;
            }
            C100417r0.m131423l(a.getAdSnsInfo().getAdXml().getAdVoteComponentUrl(), a.getUxinfo(), C86709a0.m107523b().mo121111i(), z2 ? b : 2, z2 ^ true ? 1 : 0, "");
            z = !z2;
        } else {
            z = false;
        }
        TimeLineObject timeLine = a.getTimeLine();
        C101789j00 j002 = timeLine.ContentObj;
        int i = j002.f298424e;
        if (i == 15 && timeLine.sightFolded != 1) {
            TimelineClickListener.m122980b(this.f280401d, view, a, 1002, a.getAdSnsInfo().getAdXml().getRightCanvasInfo(), z);
        } else if ((i == 1 && j002.f298427h.size() == 1) || timeLine.ContentObj.f298424e == 7) {
            TimelineClickListener.m122986h(this.f280401d, view, a, 1002, a.getAdSnsInfo().getAdXml().getRightCanvasInfo(), z);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
