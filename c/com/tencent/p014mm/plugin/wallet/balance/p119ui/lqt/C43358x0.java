package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import android.widget.Button;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.x0 */
public class C43358x0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Button f117237d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanAddUI f117238e;

    public C43358x0(WalletLqtPlanAddUI walletLqtPlanAddUI, Button button) {
        this.f117238e = walletLqtPlanAddUI;
        this.f117237d = button;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f117238e.f208025j.setText(this.f117237d.getText().toString().substring(1));
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
