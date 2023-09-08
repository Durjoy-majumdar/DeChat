package com.tencent.p014mm.p136ui.tools;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.e1 */
public class C97242e1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ PressImageView f285339d;

    public C97242e1(PressImageView pressImageView) {
        this.f285339d = pressImageView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/PressImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            PressImageView pressImageView = this.f285339d;
            pressImageView.f285327d.removeCallbacks(pressImageView.f285328e);
        } else if (action == 1 || action == 3) {
            PressImageView pressImageView2 = this.f285339d;
            pressImageView2.f285327d.post(pressImageView2.f285328e);
        }
        if (this.f285339d.isClickable() || this.f285339d.isLongClickable()) {
            z = false;
        }
        C117292a.m165362h(z, this, "com/tencent/mm/ui/tools/PressImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
