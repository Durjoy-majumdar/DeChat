package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$s */
public class MobileInputUI$$s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f10744d;

    public MobileInputUI$$s(MobileInputUI mobileInputUI) {
        this.f10744d = mobileInputUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MobileInputUI.m161864H7(this.f10744d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
