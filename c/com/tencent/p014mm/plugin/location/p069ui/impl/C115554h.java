package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.h */
public class C115554h implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C115560k f346576d;

    public C115554h(C115560k kVar) {
        this.f346576d = kVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/MMBaseMapUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f346576d.f346585g = motionEvent.getX();
            this.f346576d.f346586h = motionEvent.getY();
            ((C115538c0) this.f346576d).mo175583y(C115538c0.C115548i.COLLAPSED);
        } else if (action == 1 && (Math.abs(motionEvent.getX() - this.f346576d.f346585g) > 10.0f || Math.abs(motionEvent.getY() - this.f346576d.f346586h) > 10.0f)) {
            this.f346576d.mo175574m();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/location/ui/impl/MMBaseMapUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
