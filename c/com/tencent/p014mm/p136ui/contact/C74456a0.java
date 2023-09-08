package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.a0 */
public class C74456a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactRemarkInfoModUI f218925d;

    public C74456a0(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f218925d = contactRemarkInfoModUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ContactRemarkInfoModUI.m88832J7(this.f218925d, 0);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
