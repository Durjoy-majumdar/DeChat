package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.a2 */
public final class C2107a2 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f12073d;

    public C2107a2(TextView textView) {
        this.f12073d = textView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$fillSingleMPStyle$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            TextView textView2 = this.f12073d;
            if (textView2 != null) {
                textView2.setAlpha(0.7f);
            }
        } else if ((action == 1 || action == 3) && (textView = this.f12073d) != null) {
            textView.setAlpha(1.0f);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$fillSingleMPStyle$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
