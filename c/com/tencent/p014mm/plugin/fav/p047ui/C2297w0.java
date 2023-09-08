package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.w0 */
public class C2297w0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FavSearchUI f12444d;

    public C2297w0(FavSearchUI favSearchUI) {
        this.f12444d = favSearchUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavSearchUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f12444d.hideVKB();
            this.f12444d.f269798J[0] = (int) motionEvent.getRawX();
            this.f12444d.f269798J[1] = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
