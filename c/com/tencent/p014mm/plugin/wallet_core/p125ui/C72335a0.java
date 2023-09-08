package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.a0 */
public class C72335a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletConfirmCardIDUI f210349d;

    public C72335a0(WalletConfirmCardIDUI walletConfirmCardIDUI) {
        this.f210349d = walletConfirmCardIDUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f210349d.hideTenpayKB();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
