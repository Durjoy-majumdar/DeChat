package com.tencent.p014mm.plugin.account.p024ui;

import android.view.KeyEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$k */
public class LoginUI$$k implements View.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f10705d;

    public LoginUI$$k(LoginUI loginUI) {
        this.f10705d = loginUI;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginUI$19", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (66 == i && keyEvent.getAction() == 0) {
            LoginUI loginUI = this.f10705d;
            int i2 = LoginUI.f344598K;
            loginUI.mo174670J7();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/account/ui/LoginUI$19", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/account/ui/LoginUI$19", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
