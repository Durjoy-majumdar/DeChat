package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.t1 */
public class C74565t1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ModRemarkNameUI f219178d;

    public C74565t1(ModRemarkNameUI modRemarkNameUI) {
        this.f219178d = modRemarkNameUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ModRemarkNameUI.m88895H7(this.f219178d, 0);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
