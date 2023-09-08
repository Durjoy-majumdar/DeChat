package com.tencent.p014mm.p136ui.contact;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.f */
public class C74485f implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ AddressUI.AddressUIFragment f219030d;

    public C74485f(AddressUI.AddressUIFragment addressUIFragment) {
        this.f219030d = addressUIFragment;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$14", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f219030d.hideVKB();
            this.f219030d.f218419I = (int) motionEvent.getRawX();
            this.f219030d.f218420J = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$14", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
