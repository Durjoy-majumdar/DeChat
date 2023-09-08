package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.e1 */
public class C2294e1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FavSearchUI f12441d;

    public C2294e1(FavSearchUI favSearchUI) {
        this.f12441d = favSearchUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f12441d.hideVKB();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
