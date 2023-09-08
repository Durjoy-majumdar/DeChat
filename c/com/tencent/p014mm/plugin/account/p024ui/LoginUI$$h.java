package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import p206nj.C11171e;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$h */
public class LoginUI$$h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f310962d;

    public LoginUI$$h(LoginUI loginUI) {
        this.f310962d = loginUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!C11171e.m11046c(31) || !C107207u.m145164e(this.f310962d.getWindow().getDecorView()).f320766a.mo157647o(8)) {
            LoginUI loginUI = this.f310962d;
            int i = LoginUI.f344598K;
            loginUI.mo174671K7();
        } else {
            this.f310962d.hideVKB();
            this.f310962d.f344602D = Boolean.TRUE;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
