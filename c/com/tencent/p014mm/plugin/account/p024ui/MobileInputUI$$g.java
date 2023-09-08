package com.tencent.p014mm.plugin.account.p024ui;

import android.view.KeyEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$g */
public class MobileInputUI$$g implements View.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f10738d;

    public MobileInputUI$$g(MobileInputUI mobileInputUI) {
        this.f10738d = mobileInputUI;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputUI$15", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (66 == i && keyEvent.getAction() == 0) {
            boolean I7 = this.f10738d.mo174700I7();
            C117292a.m165362h(I7, this, "com/tencent/mm/plugin/account/ui/MobileInputUI$15", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return I7;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/MobileInputUI$15", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
