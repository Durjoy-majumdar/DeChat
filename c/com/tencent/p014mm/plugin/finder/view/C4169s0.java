package com.tencent.p014mm.plugin.finder.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.s0 */
public class C4169s0 implements View.OnTouchListener {

    /* renamed from: d */
    public boolean f18412d = false;

    /* renamed from: e */
    public final /* synthetic */ ViewParent f18413e;

    /* renamed from: f */
    public final /* synthetic */ C4191v0 f18414f;

    public C4169s0(C4191v0 v0Var, ViewParent viewParent) {
        this.f18414f = v0Var;
        this.f18413e = viewParent;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderBottomSheet$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f18413e.getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18412d = true;
        } else if (action == 1) {
            if (this.f18412d) {
                this.f18414f.mo5072g();
            }
            this.f18412d = false;
        } else if (action == 3) {
            this.f18412d = false;
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/view/FinderBottomSheet$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
