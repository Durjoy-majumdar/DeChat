package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.i1 */
public class C93662i1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FavTagEditUI f270441d;

    public C93662i1(FavTagEditUI favTagEditUI) {
        this.f270441d = favTagEditUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavTagEditUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f270441d.f269847g.mo101800f();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavTagEditUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
