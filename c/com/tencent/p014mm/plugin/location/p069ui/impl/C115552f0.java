package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.f0 */
public class C115552f0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346574d;

    public C115552f0(C115538c0 c0Var) {
        this.f346574d = c0Var;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C115538c0 c0Var = this.f346574d;
        if (c0Var.f346514S) {
            c0Var.mo175571C();
        } else if (c0Var.f346510Q) {
            c0Var.mo175583y(C115538c0.C115548i.OPENED);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
