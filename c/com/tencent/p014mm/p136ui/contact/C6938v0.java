package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.v0 */
public class C6938v0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C6939w0 f24633d;

    public C6938v0(C6939w0 w0Var) {
        this.f24633d = w0Var;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/EnterpriseBizViewItem$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Context context = this.f24633d.f24634d;
        if (context instanceof MMActivity) {
            ((MMActivity) context).hideVKB();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/EnterpriseBizViewItem$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
