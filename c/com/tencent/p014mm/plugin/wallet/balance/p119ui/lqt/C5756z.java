package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.z */
public class C5756z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104428a f21811d;

    public C5756z(WalletLqtDetailUI walletLqtDetailUI, C104428a aVar) {
        this.f21811d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f21811d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
