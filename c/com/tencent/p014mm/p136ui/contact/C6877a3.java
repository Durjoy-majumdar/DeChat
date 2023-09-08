package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.a3 */
public class C6877a3 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C6880b3 f24511d;

    public C6877a3(C6880b3 b3Var) {
        this.f24511d = b3Var;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/OpenIMListViewItem$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Context context = this.f24511d.f24514d;
        if (context instanceof MMActivity) {
            ((MMActivity) context).hideVKB();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/OpenIMListViewItem$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
