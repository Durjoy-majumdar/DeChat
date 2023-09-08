package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$i */
public class s0$$i implements ViewStub.OnInflateListener {

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$i$a */
    public class C42504a implements View.OnTouchListener {
        public C42504a(s0$$i s0__i) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    public s0$$i(C94167s0 s0Var) {
    }

    public void onInflate(ViewStub viewStub, View view) {
        view.findViewById(C0966R.C0970id.g4_).setOnTouchListener(new C42504a(this));
    }
}
