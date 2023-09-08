package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.u0 */
public class C94174u0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272048d;

    public C94174u0(C94167s0 s0Var) {
        this.f272048d = s0Var;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f272048d.f272014S.setSelected(false);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
