package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$b */
public final /* synthetic */ class SnsOnlineVideoActivity$$b implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f116616d;

    public /* synthetic */ SnsOnlineVideoActivity$$b(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f116616d = snsOnlineVideoActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f116616d;
        int i = SnsOnlineVideoActivity.f278370y0;
        snsOnlineVideoActivity.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", snsOnlineVideoActivity, array);
        SnsMethodCalculate.markStartTimeMs("lambda$initUIView$2", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.mo132875W7();
        SnsMethodCalculate.markEndTimeMs("lambda$initUIView$2", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        C117292a.m165362h(true, snsOnlineVideoActivity, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
