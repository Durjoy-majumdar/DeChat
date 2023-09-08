package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$c */
public class LoginUI$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f10701d;

    public LoginUI$$c(LoginUI loginUI) {
        this.f10701d = loginUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LoginUI.m161847I7(this.f10701d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
