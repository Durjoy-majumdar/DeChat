package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.u1 */
public class C74569u1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ModRemarkNameUI f219200d;

    public C74569u1(ModRemarkNameUI modRemarkNameUI) {
        this.f219200d = modRemarkNameUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ModRemarkNameUI.m88895H7(this.f219200d, 1);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
