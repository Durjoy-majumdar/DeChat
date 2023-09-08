package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76875f0;
import p206nj.C11171e;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.account.ui.i0 */
public class C104719i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f310969d;

    public C104719i0(LoginHistoryUI loginHistoryUI) {
        this.f310969d = loginHistoryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f310969d.hideVKB();
        if (!C11171e.m11046c(31) || !C107207u.m145164e(this.f310969d.getWindow().getDecorView()).f320766a.mo157647o(8)) {
            LoginHistoryUI loginHistoryUI = this.f310969d;
            loginHistoryUI.mo174617N7(((C76875f0) ((ArrayList) loginHistoryUI.f344515T).get(0)).f224715g);
        } else {
            this.f310969d.f344514S = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
