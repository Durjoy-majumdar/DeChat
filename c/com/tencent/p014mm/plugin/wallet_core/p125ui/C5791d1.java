package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.d1 */
public class C5791d1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72338c1 f21925d;

    public C5791d1(C72338c1 c1Var) {
        this.f21925d = c1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f21925d.mo99672d();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
