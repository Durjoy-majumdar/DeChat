package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$d */
public class LoginHistoryUI$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f10688d;

    public LoginHistoryUI$$d(LoginHistoryUI loginHistoryUI) {
        this.f10688d = loginHistoryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LoginHistoryUI.m161828H7(this.f10688d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
