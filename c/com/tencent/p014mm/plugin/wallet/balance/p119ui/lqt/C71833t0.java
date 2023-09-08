package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k53.C76492a;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.t0 */
public class C71833t0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtPlanAddUI f208384d;

    public C71833t0(WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f208384d = walletLqtPlanAddUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76492a aVar = this.f208384d.f208019Z;
        if (aVar != null) {
            aVar.mo106728c();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
