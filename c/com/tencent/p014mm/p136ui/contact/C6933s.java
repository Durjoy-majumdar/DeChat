package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.s */
public class C6933s implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C6935t f24621d;

    public C6933s(C6935t tVar) {
        this.f24621d = tVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Context context = this.f24621d.f24623d;
        if (context instanceof MMActivity) {
            ((MMActivity) context).hideVKB();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
