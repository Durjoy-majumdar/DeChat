package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.v1 */
public class C74573v1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ModRemarkNameUI f219220d;

    public C74573v1(ModRemarkNameUI modRemarkNameUI) {
        this.f219220d = modRemarkNameUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ModRemarkNameUI.m88895H7(this.f219220d, 2);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
