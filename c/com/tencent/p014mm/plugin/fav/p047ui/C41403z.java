package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.z */
public class C41403z implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FavFilterUI f111486d;

    public C41403z(FavFilterUI favFilterUI) {
        this.f111486d = favFilterUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavFilterUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f111486d.hideVKB();
            this.f111486d.f269682B[0] = (int) motionEvent.getRawX();
            this.f111486d.f269682B[1] = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
