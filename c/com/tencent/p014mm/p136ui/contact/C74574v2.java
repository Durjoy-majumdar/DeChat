package com.tencent.p014mm.p136ui.contact;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.contact.OpenIMAddressUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.v2 */
public class C74574v2 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ OpenIMAddressUI.OpenIMAddressUIFragment f219221d;

    public C74574v2(OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f219221d = openIMAddressUIFragment;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f219221d.hideVKB();
            this.f219221d.f218700j = (int) motionEvent.getRawX();
            this.f219221d.f218701n = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
