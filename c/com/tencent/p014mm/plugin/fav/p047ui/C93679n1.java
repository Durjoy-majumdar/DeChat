package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.n1 */
public class C93679n1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FavTagEditUI f270464d;

    public C93679n1(FavTagEditUI favTagEditUI) {
        this.f270464d = favTagEditUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavTagEditUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f270464d.f269847g.mo101800f();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavTagEditUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
