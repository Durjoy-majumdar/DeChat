package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k53.C76492a;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.a0 */
public class C71699a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceSaveUI f207881d;

    public C71699a0(WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f207881d = walletBalanceSaveUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76492a aVar = this.f207881d.f207845t;
        if (aVar != null) {
            aVar.mo106728c();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
