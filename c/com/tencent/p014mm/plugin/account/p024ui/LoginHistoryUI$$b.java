package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$b */
public class LoginHistoryUI$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f10685d;

    /* renamed from: e */
    public final /* synthetic */ LoginHistoryUI f10686e;

    public LoginHistoryUI$$b(LoginHistoryUI loginHistoryUI, C77407n nVar) {
        this.f10686e = loginHistoryUI;
        this.f10685d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f10686e.hideVKB();
        this.f10685d.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
