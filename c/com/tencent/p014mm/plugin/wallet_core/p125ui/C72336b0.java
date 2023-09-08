package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.b0 */
public class C72336b0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72371d0 f210350d;

    public C72336b0(C72371d0 d0Var) {
        this.f210350d = d0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72371d0 d0Var = this.f210350d;
        int i = C72371d0.f210508n;
        d0Var.mo99730c();
        this.f210350d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
