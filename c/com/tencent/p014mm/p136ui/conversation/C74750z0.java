package com.tencent.p014mm.p136ui.conversation;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.conversation.z0 */
public class C74750z0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ MainUI f219797d;

    public C74750z0(MainUI mainUI) {
        this.f219797d = mainUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/MainUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f219797d.hideVKB();
            this.f219797d.f219465B[0] = (int) motionEvent.getRawX();
            this.f219797d.f219465B[1] = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/MainUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
