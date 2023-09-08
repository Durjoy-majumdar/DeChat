package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.k1 */
public final class C40689k1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C18253h1 f109308d;

    public C40689k1(C18253h1 h1Var) {
        this.f109308d = h1Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$fillingHeader$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f109308d.mo22867q().setAlpha(0.7f);
        } else if (action == 1 || action == 3) {
            this.f109308d.mo22867q().setAlpha(1.0f);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$fillingHeader$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
