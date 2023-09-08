package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.f3 */
public class C68772f3 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineNewMsgUI f197573d;

    public C68772f3(BizTimeLineNewMsgUI bizTimeLineNewMsgUI) {
        this.f197573d = bizTimeLineNewMsgUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f197573d.f50196q = (int) motionEvent.getRawX();
            this.f197573d.f50197r = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
