package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.v */
public class C5753v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104428a f21807d;

    public C5753v(WalletLqtDetailUI walletLqtDetailUI, C104428a aVar) {
        this.f21807d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f21807d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
