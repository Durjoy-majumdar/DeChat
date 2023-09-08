package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.aa.ui.v */
public class C68345v implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ AARemittanceUI f196368d;

    public C68345v(AARemittanceUI aARemittanceUI) {
        this.f196368d = aARemittanceUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/aa/ui/AARemittanceUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f196368d.handleKeyboardTouchEvent(motionEvent);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/aa/ui/AARemittanceUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
