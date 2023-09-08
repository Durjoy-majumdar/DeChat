package com.tencent.p014mm.p136ui.chatting.component;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.component.r4 */
public class C44839r4 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C73534m4 f121672d;

    public C44839r4(C73534m4 m4Var) {
        this.f121672d = m4Var;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/SearchComponent$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f121672d.f215752d.mo91578s();
        C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/component/SearchComponent$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
